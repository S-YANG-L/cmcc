package com.htyw.app.engineering.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.htyw.app.engineering.pojo.DecorationReg;
import com.htyw.app.engineering.pojo.DeviceInspectionE;
import com.htyw.app.engineering.pojo.DeviceTain;
import com.htyw.app.engineering.pojo.InspectionMana;
import com.htyw.app.engineering.pojo.InspectionPlan;
import com.htyw.app.engineering.pojo.InspectionReportE;
import com.htyw.app.engineering.pojo.PrgHouse;
import com.htyw.app.engineering.service.InspectionPlanService;
import com.htyw.app.utils.Page;
import com.htyw.app.workOrder.service.WorkOrderService;

/*
 * 工程管理模块
 * 
 * */
// 告诉spring mvc这是个控制器
@RestController
@RequestMapping("inspectionPlan")
public class InspectionPlanController {
	@Autowired
	private InspectionPlanService inspectionPlanService;
	@Autowired
	private WorkOrderService workOrderService;

	// 巡检计划
	@RequestMapping("listInspectionPlan")
	public Map<String, Object> listInspectionPlan(InspectionPlan InspectionPlan, Page page, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			PageHelper.offsetPage(page.getStart(), 10);
			List<InspectionPlan> listInspectionPlan = inspectionPlanService.listInspectionPlan(InspectionPlan);
			for (InspectionPlan inspectionPlan2 : listInspectionPlan) {
				if ("0".equals(inspectionPlan2.getInspection())) {
					inspectionPlan2.setInspection("设备巡检");
				} else if ("1".equals(inspectionPlan2.getInspection())) {
					inspectionPlan2.setInspection("装修巡检");
				} else if ("2".equals(inspectionPlan2.getInspection())) {
					inspectionPlan2.setInspection("空关巡检");
				} else if ("3".equals(inspectionPlan2.getInspection())) {
					inspectionPlan2.setInspection("园区楼宇巡检");
				}
			}
			int total = (int) new PageInfo<>(listInspectionPlan).getTotal();
			page.caculateLast(total);
			result.put("listInspectionPlan", listInspectionPlan);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fails");
		}
		return result;
	}

	// 设备巡检
	@RequestMapping(value = "listDeviceInspection", method = RequestMethod.POST)
	public Map<String, Object> listDeviceInspection(DeviceInspectionE deviceInspectionE, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<DeviceInspectionE> listDeviceInspection = inspectionPlanService
					.listDeviceInspection(deviceInspectionE);
			result.put("listDeviceInspection", listDeviceInspection);
			result.put("code", "200");
			result.put("message", "success");

		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fails");
		}
		return result;
	}

	// 装修巡检
	@RequestMapping(value = "listDecorationReg", method = RequestMethod.POST)
	public Map<String, Object> listDecorationReg(DecorationReg decorationReg, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<DecorationReg> listDecorationReg = inspectionPlanService.listDecorationReg(decorationReg);
			result.put("listDecorationReg", listDecorationReg);
			result.put("code", "200");
			result.put("message", "success");

		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fails");
		}
		return result;
	}

	// 空关巡检
	@RequestMapping(value = "listPrgHouse", method = RequestMethod.POST)
	public Map<String, Object> listPrgHouse(PrgHouse prgHouse, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<PrgHouse> listPrgHouse = inspectionPlanService.listPrgHouse(prgHouse);
			result.put("listPrgHouse", listPrgHouse);
			result.put("code", "200");
			result.put("message", "success");

		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fails");
		}
		return result;
	}

	// 园区巡检
	@RequestMapping(value = "listInspectionMana", method = RequestMethod.POST)
	public Map<String, Object> listInspectionMana(InspectionMana inspectionMana, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<InspectionMana> listInspectionMana = inspectionPlanService.listInspectionMana(inspectionMana);
			result.put("listInspectionMana", listInspectionMana);
			result.put("code", "200");
			result.put("message", "success");

		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fails");
		}
		return result;
	}

	// 设备维保计划
	@RequestMapping("listDeviceTain")
	public Map<String, Object> listDeviceTain(DeviceTain deviceTain, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<DeviceTain> listDeviceTain = inspectionPlanService.listDeviceTain(deviceTain);
			result.put("listDeviceTain", listDeviceTain);
			result.put("code", "200");
			result.put("message", "success");

		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fails");
		}
		return result;
	}

	// 巡检记录
	@RequestMapping("listInspectionRecord")
	public Map<String, Object> listInspectionPlanRecord(InspectionPlan InspectionPlan, Page page, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			PageHelper.offsetPage(page.getStart(), 10);
			List<InspectionPlan> listInspectionPlanRecord = inspectionPlanService
					.listInspectionPlanRecord(InspectionPlan);
			for (InspectionPlan inspectionPlan2 : listInspectionPlanRecord) {
				if ("0".equals(inspectionPlan2.getInspection())) {
					String id = inspectionPlan2.getId();
					DeviceInspectionE deviceInspection = new DeviceInspectionE();
					deviceInspection.setParentId(id);
					deviceInspection.setTenantId("1");
					List<DeviceInspectionE> listDeviceInspection = inspectionPlanService
							.listDeviceInspection(deviceInspection);
					double num = 0;
					double count = listDeviceInspection.size();
					double cishu = 0;
					double sum = 0;
					double process = 0.0;
					for (DeviceInspectionE dInspection : listDeviceInspection) {
						num += dInspection.getFinishNumber();
					}
					cishu = inspectionPlan2.getFrequency();
					sum = cishu * count;
					inspectionPlan2.setFinishNumber(num);
					inspectionPlan2.setSum(sum);
					process = (num / sum) * 100;
					System.out.println(process);
					inspectionPlan2.setProcess((new Double(process)).intValue());
					inspectionPlan2.setInspection("设备巡检");
				} else if ("1".equals(inspectionPlan2.getInspection())) {
					String id = inspectionPlan2.getId();
					DecorationReg decorationReg = new DecorationReg();
					decorationReg.setParentId(id);
					decorationReg.setTenantId("1");
					List<DecorationReg> listDecorationReg = inspectionPlanService.listDecorationReg(decorationReg);
					double num = 0;
					double count = 0;
					double cishu = 0;
					double sum = 0;
					double process = 0;
					for (DecorationReg decorationReg2 : listDecorationReg) {
						count += 1;
						num += decorationReg2.getFinishNumber();
					}
					cishu = inspectionPlan2.getFrequency();
					sum = cishu * count;
					inspectionPlan2.setFinishNumber(num);
					inspectionPlan2.setSum(sum);
					process = (num / sum) * 100;
					inspectionPlan2.setProcess(process);
					inspectionPlan2.setInspection("装修巡检");
				} else if ("2".equals(inspectionPlan2.getInspection())) {
					String id = inspectionPlan2.getId();
					PrgHouse prgHouse = new PrgHouse();
					prgHouse.setParentId(id);
					prgHouse.setTenantId("1");
					List<PrgHouse> listPrgHouse = inspectionPlanService.listPrgHouse(prgHouse);
					double num = 0;
					double count = 0;
					double cishu = 0;
					double sum = 0;
					double process = 0;
					for (PrgHouse prgHouse2 : listPrgHouse) {
						count += 1;
						num += prgHouse2.getFinishNumber();
					}
					cishu = inspectionPlan2.getFrequency();
					sum = cishu * count;
					inspectionPlan2.setFinishNumber(num);
					inspectionPlan2.setSum(sum);
					process = (num / sum) * 100;
					inspectionPlan2.setProcess(process);
					inspectionPlan2.setInspection("空关巡检");
				} else if ("3".equals(inspectionPlan2.getInspection())) {
					String id = inspectionPlan2.getId();
					InspectionMana inspectionMana = new InspectionMana();
					inspectionMana.setParentId(id);
					inspectionMana.setTenantId("1");
					List<InspectionMana> listInspectionMana = inspectionPlanService.listInspectionMana(inspectionMana);
					double num = 0;
					double count = 0;
					double cishu = 0;
					double sum = 0;
					double process = 0;
					for (InspectionMana inspectionMana2 : listInspectionMana) {
						count += 1;
						num += inspectionMana2.getFinishNumber();
					}
					cishu = inspectionPlan2.getFrequency();
					sum = cishu * count;
					inspectionPlan2.setFinishNumber(num);
					inspectionPlan2.setSum(sum);
					process = (num / sum) * 100;
					inspectionPlan2.setProcess(process);
					inspectionPlan2.setInspection("园区楼宇巡检");
				}
			}
			int total = (int) new PageInfo<>(listInspectionPlanRecord).getTotal();
			page.caculateLast(total);
			result.put("listInspectionPlanRecord", listInspectionPlanRecord);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fails");
		}
		return result;
	}

	// 工单派发接口
	@RequestMapping("saveInspectionPlan")
	public Map<String, Object> saveInspectionPlan(InspectionPlan inspectionPlan, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String name = workOrderService.getName(inspectionPlan.getInspectionPersonId());
			inspectionPlan.setInspectionPerson(name);
			inspectionPlan.setEffectStatus("1");
			inspectionPlanService.saveInspectionPlan(inspectionPlan);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "fail");
		}
		return result;
	}

	// 情况上报
	@RequestMapping(value = "listReport")
	public Map<String, Object> listReport(InspectionReportE InspectionReportE, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<InspectionReportE> listReport = inspectionPlanService.lInspectionReportEs(InspectionReportE);
			result.put("listReport", listReport);
			result.put("code", "200");
			result.put("message", "success");

		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fails");
		}
		return result;
	}
}
