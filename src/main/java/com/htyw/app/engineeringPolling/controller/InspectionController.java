package com.htyw.app.engineeringPolling.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.engineeringPolling.mapper.InspectionMapper;
import com.htyw.app.engineeringPolling.pojo.Inspection.BuildingInspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.DecorateInspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.DeviceInspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.Inspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.InspectionReport;
import com.htyw.app.engineeringPolling.pojo.Inspection.KongguanInspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.PublicReport;
import com.htyw.app.engineeringPolling.pojo.Inspection.RepairInspection;
import com.htyw.app.engineeringPolling.service.InspectionService;
import com.htyw.app.utils.IDUtis;

@RestController
@RequestMapping("/InspectionController")
public class InspectionController {
	@Autowired
	private InspectionService inspectionService;
	@Autowired
	private InspectionMapper inspectionDao;
	

	// 巡检列表
	@RequestMapping("listInspection")
	public Map<String, Object> listInspection(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		ArrayList<Inspection> reList = new ArrayList<Inspection>();
		try {
			String tenantId = request.getParameter("tenantId");
			String inspectionPerson = request.getParameter("staffId");
			String state = request.getParameter("state");//是否已完成的
			String dimState = request.getParameter("dimState");//模糊查询的
			String title = request.getParameter("title");//主题
			List<Inspection> listInspection = inspectionService.listInspection(tenantId, inspectionPerson,state,dimState,title);
			for (Inspection inspection : listInspection) {
				if ("0".equals(inspection.getInspection())) {
					inspection.setInspection("设备巡检");
				}
				if ("1".equals(inspection.getInspection())) {
					inspection.setInspection("装修巡检");
				}
				if ("2".equals(inspection.getInspection())) {
					inspection.setInspection("空关巡检");
				}
				if ("3".equals(inspection.getInspection())) {
					inspection.setInspection("园区楼宇巡检");
				}
				if (inspection.getRemark() == null) {
					inspection.setRemark("暂无");
				}
				reList.add(inspection);
			}
			result.put("listInspection", reList);
			result.put("code", "200");
			result.put("message", "成功");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "失败");
		}
		return result;
	}
	
	// 获取巡检对象
	@RequestMapping("getContentAll")
	public Map<String, Object> getContentAll(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			 String id = request.getParameter("id");
			String contentAll = inspectionService.getContentAll(id);
			result.put("code", "200");
			result.put("contentAll", contentAll);
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "失败");
		}
		return result;
	}

	// 获取单个设备详情
	@RequestMapping("singleInspection")
    public Map<String, Object> singleInspection( HttpServletRequest request, HttpServletResponse response) {
    	Map<String, Object> result = new HashMap<String, Object>();
    	try {
    		Inspection inspection = inspectionService.singleInspection(Long.parseLong(request.getParameter("id")));
    		if(null != inspection){
	    		if ("0".equals(inspection.getInspection())) {
					inspection.setInspection("设备巡检");
				}
				if ("1".equals(inspection.getInspection())) {
					inspection.setInspection("装修巡检");
				}
				if ("2".equals(inspection.getInspection())) {
					inspection.setInspection("空关巡检");
				}
				if ("3".equals(inspection.getInspection())) {
					inspection.setInspection("园区楼宇巡检");
				}
				if (inspection.getRemark() == null) {
					inspection.setRemark("暂无");
				}
				result.put("inspection", inspection);
				result.put("code", "200");
			}else{
				result.put("code", "203");
				result.put("message", "未获取到信息");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "系统开小差了请稍后重试");
		}
    	return result;
    }

	// 设备巡检信息
	@RequestMapping("deviceInfo")
	public Map<String, Object> deviceInfo(DeviceInspection deviceInspection, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			System.out.println(deviceInspection);
			List<DeviceInspection> deviceInfo = inspectionService.deviceInfo(deviceInspection);
			result.put("deviceInfo", deviceInfo);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "fail");
		}
		return result;
	}

	// 装修巡检信息
	@RequestMapping("decorateInfo")
	public Map<String, Object> decorateInfo(DecorateInspection decorateInspection, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			System.out.println(decorateInspection);
			List<DecorateInspection> decorateInfo = inspectionService.decorateInfo(decorateInspection);
			result.put("decorateInfo", decorateInfo);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "fail");
		}
		return result;
	}

	// 空关巡检信息
	@RequestMapping("kongguanInfo")
	public Map<String, Object> kongguanInfo(KongguanInspection kongguanInspection, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			System.out.println(kongguanInspection);
			List<KongguanInspection> kongguanInfo = inspectionService.kongguanInfo(kongguanInspection);
			result.put("kongguanInfo", kongguanInfo);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "fail");
		}
		return result;
	}

	// 田区楼宇计划
	@RequestMapping("buildingInfo")
	public Map<String, Object> buildingInfo(BuildingInspection buildingInspection, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			System.out.println(buildingInspection);
			List<BuildingInspection> buildingInfo = inspectionService.buildingInfo(buildingInspection);
			result.put("buildingInfo", buildingInfo);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "fail");
		}
		return result;
	}

	// 设备维保计划
	@RequestMapping("repairInfo")
	public Map<String, Object> repairInfo(RepairInspection repairInspection, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			System.out.println(repairInspection);
			List<RepairInspection> repairInfo = inspectionService.repairInfo(repairInspection);
			result.put("repairInfo", repairInfo);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "fail");
		}
		return result;
	}

	// 巡检情况上报
	@RequestMapping(value = "save")
	public Map<String, Object> save( HttpServletRequest request,HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			int effectStatus = Integer.valueOf(request.getParameter("effectStatus"));
			InspectionReport inspectionReport = new InspectionReport();
			inspectionReport.setParentId(Long.parseLong(request.getParameter("id")));
			inspectionReport.setId(Long.parseLong(IDUtis.getUUID()));
			inspectionReport.setReportTime(getDate(request.getParameter("time")));
			inspectionReport.setNormal(request.getParameter("normal"));
			inspectionReport.setInspectionPerson(request.getParameter("name"));
			inspectionReport.setReportContent(request.getParameter("remark"));
			inspectionReport.setTenantId(Long.parseLong(request.getParameter("tenantId")));
			//inspectionReport.setId(Long.parseLong(request.getParameter("id")));
			inspectionReport.setInspection(request.getParameter("inspection"));
			inspectionService.save(inspectionReport);
			inspectionDao.updataFinishNumber(String.valueOf(effectStatus+1), Long.parseLong(request.getParameter("id")));
			result.put("code", "200");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "系统开小差了请稍后再看");
		}
		return result;
	}
	
	//修改巡检单状态
	// 公共报事
		@RequestMapping(value = "changeState")
		public void changeState(HttpServletRequest request,HttpServletResponse response) {
			String id = request.getParameter("id");
			inspectionService.changeState(id);
		}

	// 公共报事
	@RequestMapping(value = "savePublic")
	public Map<String, Object> savePublic(@RequestBody PublicReport publicReport) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			inspectionService.savePublic(publicReport);
			result.put("code", 200);
			result.put("message", "success!");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed");
		}
		return result;
	}

	
	// String 转为date
		public Date getDate(String str) throws ParseException {
			DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
			return format.parse(str);
		}
}
