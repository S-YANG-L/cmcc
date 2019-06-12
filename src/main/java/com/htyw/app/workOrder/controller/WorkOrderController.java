package com.htyw.app.workOrder.controller;

/*
 * 工单管理模块
 * 
 * 
 * */
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.htyw.app.contact.pojo.Contact;
import com.htyw.app.contact.service.ContactService;
import com.htyw.app.utils.Page;
import com.htyw.app.workOrder.pojo.WorkOrder;
import com.htyw.app.workOrder.service.WorkOrderService;

// 告诉spring mvc这是个控制器
@RestController
@RequestMapping("workOrder")
public class WorkOrderController {
	@Autowired
	private WorkOrderService workOrderService;
	@Autowired
	private ContactService contactService;

	// 工单列表接口
	@RequestMapping("listOrder")
	public Map<String, Object> listOrder(WorkOrder workOrder, Page page, HttpServletRequest request, HttpServletResponse response)
			throws Exception, ServletException, IOException {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			PageHelper.offsetPage(page.getStart(), 10);
			List<WorkOrder> listOrder = workOrderService.listOrder(workOrder);
			for (WorkOrder workOrder2 : listOrder) {
				if ("0".equals(workOrder2.getOrderType())) {
					workOrder2.setOrderType("投诉、咨询类");
				} else if ("1".equals(workOrder2.getOrderType())) {
					workOrder2.setOrderType("报修类");
				} else if ("2".equals(workOrder2.getOrderType())) {
					workOrder2.setOrderType("预约类");
				}
			}
			int total = (int) new PageInfo<>(listOrder).getTotal();
			page.caculateLast(total);
			result.put("listOrder", listOrder);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 工单派发接口
	@RequestMapping("saveOrder")
	public Map<String, Object> saveOrder(WorkOrder workOrder) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String name = workOrderService.getName(workOrder.getSingleId());
			workOrder.setSinglePerson(name);
			workOrderService.save(workOrder);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "fail");
		}
		return result;
	}

	// 接单人接口
	// listexecutor
	@RequestMapping("listexecutor")
	public Map<String, Object> listStaff(Contact contact, HttpServletRequest request, HttpServletResponse response)
			throws Exception, ServletException, IOException {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<Contact> listStaff = contactService.listStaff(contact);
			result.put("listStaff", listStaff);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "账户不存在！！！");
		}
		return result;
	}

	// 工单记录接口
	@RequestMapping("listOrderRcd")
	public Map<String, Object> listOrderRcd(WorkOrder workOrder, Page page, HttpServletRequest request,
			HttpServletResponse response) throws Exception, ServletException, IOException {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			PageHelper.offsetPage(page.getStart(), 10);
			List<WorkOrder> listOrderRcd = workOrderService.listOrderRcd(workOrder);
			for (WorkOrder workOrder2 : listOrderRcd) {
				if ("1".equals(workOrder2.getOrderStatus())) {
					workOrder2.setOrderStatus("已接单");
				} else if ("3".equals(workOrder2.getOrderStatus())) {
					workOrder2.setOrderStatus("待评价");
				} else if ("5".equals(workOrder2.getOrderStatus())) {
					workOrder2.setOrderStatus("已完成");
				} else if ("7".equals(workOrder2.getOrderStatus())) {
					workOrder2.setOrderStatus("待接单");
				} else if ("8".equals(workOrder2.getOrderStatus())) {
					workOrder2.setOrderStatus("作废");
				} else if ("9".equals(workOrder2.getOrderStatus())) {
					workOrder2.setOrderStatus("待回访");
				}
			}
			for (WorkOrder workOrder3 : listOrderRcd) {
				if ("0".equals(workOrder3.getOrderType())) {
					workOrder3.setOrderType("投诉、咨询类");
				} else if ("1".equals(workOrder3.getOrderType())) {
					workOrder3.setOrderType("报修类");
				} else if ("2".equals(workOrder3.getOrderType())) {
					workOrder3.setOrderType("预约类");
				}
			}
			int total = (int) new PageInfo<>(listOrderRcd).getTotal();
			page.caculateLast(total);
			result.put("listOrderRcd", listOrderRcd);
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
