package com.htyw.app.pollingDetails.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.engineeringPolling.pojo.PrgInspectionReport;
import com.htyw.app.pollingDetails.pojo.PollingDetails;
import com.htyw.app.pollingDetails.pojo.PrgDecorationRegMiddle;
import com.htyw.app.pollingDetails.pojo.PrgDeviceManagementMiddle;
import com.htyw.app.pollingDetails.pojo.PrgHouseMiddle;
import com.htyw.app.pollingDetails.pojo.PrgInspectionManaMiddle;
import com.htyw.app.pollingDetails.service.pollingDetailsService;

@RestController
@RequestMapping("/pollingDetails")
public class pollingDetailsController {

	@Autowired
	private pollingDetailsService PDService;
	
	   //获取详情设备
		@RequestMapping(value = "devicemanagement", method = RequestMethod.POST)
		public Map<String, Object> getBacklog(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			try {
				String parentId = request.getParameter("id");
				List<PrgDeviceManagementMiddle>  PrgDeviceManagementMiddleList = PDService.getByparentId(parentId);
				ArrayList<PrgDeviceManagementMiddle> reList = new ArrayList<PrgDeviceManagementMiddle>();
				for (PrgDeviceManagementMiddle PDMM : PrgDeviceManagementMiddleList) {
					if ("0".equals(PDMM.getStatus())) {
						PDMM.setStatus("未完成");
					}
					if ("1".equals(PDMM.getStatus())) {
						PDMM.setStatus("已完成");
					}
					reList.add(PDMM);
				}
				result.put("code", "200");
				result.put("PrgDeviceManagementMiddleList", reList);
				return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("state", "系统开小差请联系管理员");
				return result;
			}
			
		}
		
		//获取详情空关
		@RequestMapping(value = "houseOff", method = RequestMethod.POST)
		public Map<String, Object> houseOff(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			try {
				String parentId = request.getParameter("id");
				List<PrgHouseMiddle>  PrgHouseMiddleList = PDService.houseOff(parentId);
				ArrayList<PrgHouseMiddle> reList = new ArrayList<PrgHouseMiddle>();
				for (PrgHouseMiddle prgHouseMiddle : PrgHouseMiddleList) {
					if ("0".equals(prgHouseMiddle.getStatus())) {
						prgHouseMiddle.setStatus("未完成");
					}
					if ("1".equals(prgHouseMiddle.getStatus())) {
						prgHouseMiddle.setStatus("已完成");
					}
					reList.add(prgHouseMiddle);
				}
				result.put("code", "200");
				result.put("PrgHouseMiddleList", reList);
				return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("state", "系统开小差请联系管理员");
				return result;
			}
			
		}
		//获取详情装修
		@RequestMapping(value = "decorationReg", method = RequestMethod.POST)
		public Map<String, Object> decorationReg(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			try {
				String parentId = request.getParameter("id");
				List<PrgDecorationRegMiddle>  PrgDecorationRegMiddleList = PDService.decorationReg(parentId);
				ArrayList<PrgDecorationRegMiddle> reList = new ArrayList<PrgDecorationRegMiddle>();
				for (PrgDecorationRegMiddle PDRM : PrgDecorationRegMiddleList) {
					if ("0".equals(PDRM.getStatus())) {
						PDRM.setStatus("未完成");
					}
					if ("1".equals(PDRM.getStatus())) {
						PDRM.setStatus("已完成");
					}
					reList.add(PDRM);
				}
				result.put("code", "200");
				result.put("PrgDecorationRegMiddleList", reList);
				return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("state", "系统开小差请联系管理员");
				return result;
			}
			
		}
		
		//园区
		@RequestMapping(value = "inspectionMana", method = RequestMethod.POST)
		public Map<String, Object> inspectionMana(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			try {
				String parentId = request.getParameter("id");
				List<PrgInspectionManaMiddle>  PrgInspectionManaMiddleList = PDService.inspectionMana(parentId);
				ArrayList<PrgInspectionManaMiddle> reList = new ArrayList<PrgInspectionManaMiddle>();
				for (PrgInspectionManaMiddle PIMM : PrgInspectionManaMiddleList) {
					if ("0".equals(PIMM.getStatus())) {
						PIMM.setStatus("未完成");
					}
					if ("1".equals(PIMM.getStatus())) {
						PIMM.setStatus("已完成");
					}
					reList.add(PIMM);
				}
				result.put("code", "200");
				result.put("PrgInspectionManaMiddleList", reList);
				return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("state", "系统开小差请联系管理员");
				return result;
			}
			
		}
		
		//设备巡检上报
		@RequestMapping(value = "facilitySave", method = RequestMethod.POST)
		public Map<String, Object> facilitySave(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			try {
				String PERSON_NAME = request.getParameter("PERSON_NAME");//巡检人姓名
				String PERSON_ID = request.getParameter("PERSON_ID");//巡检人id
				String REPORT_DATE = request.getParameter("REPORT_DATE");//上报时间
				String IS_NORMAL = request.getParameter("IS_NORMAL");//是否正常
				String remark = request.getParameter("remark");//备注
				String tenantId = request.getParameter("tenantId");//租户id
				String PRG_INSPECTION_ALL_ID = request.getParameter("PRG_INSPECTION_ALL_ID");//主表id
				String INSPECTION_ID = request.getParameter("INSPECTION_ID");//设备id
				String PICTURE = request.getParameter("PICTURE");//图片
				//String IS_FINISH = request.getParameter("IS_FINISH");//是否完成
				String INSPECTION_NUM = request.getParameter("INSPECTION_NUM");//巡检次数
				String SURPLUS_NUM = request.getParameter("SURPLUS_NUM");//完成次数
				
				PrgInspectionReport PIR = new PrgInspectionReport();//上报对象
				PIR.setPersonName(PERSON_NAME);//
				PIR.setPersonId(PERSON_ID);//
				PIR.setReportDate(REPORT_DATE);//
				PIR.setIsNormal(IS_NORMAL);//
				PIR.setRemark(remark);//
				PIR.setTenantid(tenantId);//
				PIR.setPrgInspectionAllId(PRG_INSPECTION_ALL_ID);//
				PIR.setInspectionId(INSPECTION_ID);//
				PIR.setPicture(PICTURE);//
				//PIR.setIsFinish(IS_FINISH);//
				PIR.setInspectionNum(INSPECTION_NUM);//
				PIR.setSurplusNum(SURPLUS_NUM);//
				String code = PDService.facilitySave(PIR);
				result.put("code", code);
				return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("state", "请重试");
				return result;
			}
		}
		
		//空关巡检上报
		@RequestMapping(value = "houseReportSave", method = RequestMethod.POST)
		public Map<String, Object> houseReportSave(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			try {
				String PERSON_NAME = request.getParameter("PERSON_NAME");//巡检人姓名
				String PERSON_ID = request.getParameter("PERSON_ID");//巡检人id
				String REPORT_DATE = request.getParameter("REPORT_DATE");//上报时间
				String IS_NORMAL = request.getParameter("IS_NORMAL");//是否正常
				String remark = request.getParameter("remark");//备注
				String tenantId = request.getParameter("tenantId");//租户id
				String PRG_INSPECTION_ALL_ID = request.getParameter("PRG_INSPECTION_ALL_ID");//主表id
				String INSPECTION_ID = request.getParameter("INSPECTION_ID");//设备id
				String PICTURE = request.getParameter("PICTURE");//图片
				//String IS_FINISH = request.getParameter("IS_FINISH");//是否完成
				String INSPECTION_NUM = request.getParameter("INSPECTION_NUM");//巡检次数
				String SURPLUS_NUM = request.getParameter("SURPLUS_NUM");//完成次数
				
				PrgInspectionReport PIR = new PrgInspectionReport();//上报对象
				PIR.setPersonName(PERSON_NAME);//
				PIR.setPersonId(PERSON_ID);//
				PIR.setReportDate(REPORT_DATE);//
				PIR.setIsNormal(IS_NORMAL);//
				PIR.setRemark(remark);//
				PIR.setTenantid(tenantId);//
				PIR.setPrgInspectionAllId(PRG_INSPECTION_ALL_ID);//
				PIR.setInspectionId(INSPECTION_ID);//
				PIR.setPicture(PICTURE);//
				//PIR.setIsFinish(IS_FINISH);//
				PIR.setInspectionNum(INSPECTION_NUM);//
				PIR.setSurplusNum(SURPLUS_NUM);//
				String code = PDService.houseReportSave(PIR);
				result.put("code", code);
				return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("state", "请重试");
				return result;
			}
		}
		
		//装修巡检上报
		@RequestMapping(value = "decorationRegSave", method = RequestMethod.POST)
		public Map<String, Object> decorationRegSave(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			try {
				String PERSON_NAME = request.getParameter("PERSON_NAME");//巡检人姓名
				String PERSON_ID = request.getParameter("PERSON_ID");//巡检人id
				String REPORT_DATE = request.getParameter("REPORT_DATE");//上报时间
				String IS_NORMAL = request.getParameter("IS_NORMAL");//是否正常
				String remark = request.getParameter("remark");//备注
				String tenantId = request.getParameter("tenantId");//租户id
				String PRG_INSPECTION_ALL_ID = request.getParameter("PRG_INSPECTION_ALL_ID");//主表id
				String INSPECTION_ID = request.getParameter("INSPECTION_ID");//设备id
				String PICTURE = request.getParameter("PICTURE");//图片
				//String IS_FINISH = request.getParameter("IS_FINISH");//是否完成
				String INSPECTION_NUM = request.getParameter("INSPECTION_NUM");//巡检次数
				String SURPLUS_NUM = request.getParameter("SURPLUS_NUM");//完成次数
				
				PrgInspectionReport PIR = new PrgInspectionReport();//上报对象
				PIR.setPersonName(PERSON_NAME);//
				PIR.setPersonId(PERSON_ID);//
				PIR.setReportDate(REPORT_DATE);//
				PIR.setIsNormal(IS_NORMAL);//
				PIR.setRemark(remark);//
				PIR.setTenantid(tenantId);//
				PIR.setPrgInspectionAllId(PRG_INSPECTION_ALL_ID);//
				PIR.setInspectionId(INSPECTION_ID);//
				PIR.setPicture(PICTURE);//
				//PIR.setIsFinish(IS_FINISH);//
				PIR.setInspectionNum(INSPECTION_NUM);//
				PIR.setSurplusNum(SURPLUS_NUM);//
				String code = PDService.decorationRegSave(PIR);
				result.put("code", code);
				return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("state", "请重试");
				return result;
			}
		}
		//园区巡检上报
		@RequestMapping(value = "inspectionManaReportSave", method = RequestMethod.POST)
		public Map<String, Object> inspectionManaReportSave(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			try {
				String PERSON_NAME = request.getParameter("PERSON_NAME");//巡检人姓名
				String PERSON_ID = request.getParameter("PERSON_ID");//巡检人id
				String REPORT_DATE = request.getParameter("REPORT_DATE");//上报时间
				String IS_NORMAL = request.getParameter("IS_NORMAL");//是否正常
				String remark = request.getParameter("remark");//备注
				String tenantId = request.getParameter("tenantId");//租户id
				String PRG_INSPECTION_ALL_ID = request.getParameter("PRG_INSPECTION_ALL_ID");//主表id
				String INSPECTION_ID = request.getParameter("INSPECTION_ID");//设备id
				String PICTURE = request.getParameter("PICTURE");//图片
				//String IS_FINISH = request.getParameter("IS_FINISH");//是否完成
				String INSPECTION_NUM = request.getParameter("INSPECTION_NUM");//巡检次数
				String SURPLUS_NUM = request.getParameter("SURPLUS_NUM");//完成次数
				
				PrgInspectionReport PIR = new PrgInspectionReport();//上报对象
				PIR.setPersonName(PERSON_NAME);//
				PIR.setPersonId(PERSON_ID);//
				PIR.setReportDate(REPORT_DATE);//
				PIR.setIsNormal(IS_NORMAL);//
				PIR.setRemark(remark);//
				PIR.setTenantid(tenantId);//
				PIR.setPrgInspectionAllId(PRG_INSPECTION_ALL_ID);//
				PIR.setInspectionId(INSPECTION_ID);//
				PIR.setPicture(PICTURE);//
				//PIR.setIsFinish(IS_FINISH);//
				PIR.setInspectionNum(INSPECTION_NUM);//
				PIR.setSurplusNum(SURPLUS_NUM);//
				String code = PDService.inspectionManaReportSave(PIR);
				result.put("code", code);
				return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("state", "请重试");
				return result;
			}
		}
					

		//获取设备的详细巡检信息
		@RequestMapping(value = "getReportDetail", method = RequestMethod.POST)
		public Map<String, Object> getReportDetail(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			try {
				String objectId = request.getParameter("objectId");//巡检对象id
				String inspectionID = request.getParameter("inspectionID");//巡检单id
				String userId = request.getParameter("userId");//巡检人id
				List<PrgInspectionReport> PIRList = PDService.getReportDetail(objectId,inspectionID,userId);
				result.put("PIRList", PIRList);
				result.put("code", "200");
				return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("state", "请重试");
				return result;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
