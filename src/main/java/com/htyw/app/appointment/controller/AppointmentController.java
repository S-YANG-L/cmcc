package com.htyw.app.appointment.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.htyw.app.appointment.pojo.Appointment;
import com.htyw.app.appointment.service.AppointmentService;
import com.htyw.app.utils.Page;
import com.htyw.app.workOrder.service.WorkOrderService;

/*
 * 租赁管理模块
 * 
 * 
 * */
// 告诉spring mvc这是个控制器
@RestController
@RequestMapping("appointment")
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	@Autowired
	private WorkOrderService workOrderService;

	// 预约信息列表接口
	@RequestMapping("listAppointment")
	public Map<String, Object> listAppointment(Appointment appointment, Page page, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			PageHelper.offsetPage(page.getStart(), 10);
			List<Appointment> listAppointment = appointmentService.listAppointment(appointment);
			for (Appointment appointment2 : listAppointment) {
				if ("0".equals(appointment2.getBillStatus())) {
					appointment2.setBillStatus("待审批");
				} else if ("1".equals(appointment2.getBillStatus())) {
					appointment2.setBillStatus("已审批");
				} else if ("2".equals(appointment2.getBillStatus())) {
					appointment2.setBillStatus("已拒绝");
				}
			}
			int total = (int) new PageInfo<>(listAppointment).getTotal();
			page.caculateLast(total);
			result.put("listAppointment", listAppointment);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 预约记录列表接口
	@RequestMapping("listAppointmentRec")
	public Map<String, Object> listAppointmentRec(Appointment appointment, Page page, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			PageHelper.offsetPage(page.getStart(), 10);
			List<Appointment> listAppointmentRec = appointmentService.listAppointmentRec(appointment);
			for (Appointment appointment2 : listAppointmentRec) {
				if ("0".equals(appointment2.getBillStatus())) {
					appointment2.setBillStatus("待审批");
				} else if ("1".equals(appointment2.getBillStatus())) {
					appointment2.setBillStatus("已审批");
				} else if ("2".equals(appointment2.getBillStatus())) {
					appointment2.setBillStatus("已拒绝");
				}
			}
			int total = (int) new PageInfo<>(listAppointmentRec).getTotal();
			page.caculateLast(total);
			result.put("listAppointmentRec", listAppointmentRec);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 预约同意接口
	@RequestMapping("agree")
	public Map<String, Object> agree(Appointment appointment, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String name = workOrderService.getName(appointment.getReceiverId());
			appointment.setReceiverName(name);
			appointmentService.agree(appointment);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 预约同意接口
	@RequestMapping("refuse")
	public Map<String, Object> refuse(Appointment appointment, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			appointmentService.refuse(appointment);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 预约同意接口
	@RequestMapping("save")
	public Map<String, Object> save(Appointment appointment, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			appointmentService.save(appointment);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}
}
