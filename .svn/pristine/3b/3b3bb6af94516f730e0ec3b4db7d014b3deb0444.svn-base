package com.htyw.app.waitingCenter.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.waitingCenter.pojo.WaitingCenter;
import com.htyw.app.waitingCenter.service.WaitingCenterService;
import com.htyw.app.workOrder.pojo.WorkOrder;

// 告诉spring mvc这是个控制器
@RestController
@RequestMapping("waitingCenter")
public class WaitingCenterController {
	@Autowired
	private WaitingCenterService waitingCenterService;

	// 待办列表接口
	@RequestMapping("listTodo")
	public Map<String, Object> listTodo(WaitingCenter waitingCenter, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<WaitingCenter> listTodo = waitingCenterService.listTodo(waitingCenter);
			result.put("listTodo", listTodo);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 待办列表接口
	@RequestMapping("listTodoDtl")
	public Map<String, Object> listTodoDtl(WorkOrder workOrder, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<WorkOrder> listTodoDtl = waitingCenterService.listTodoDtl(workOrder);
			result.put("listTodoDtl", listTodoDtl);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 已办列表接口
	@RequestMapping("listDone")
	public Map<String, Object> listDone(WaitingCenter waitingCenter, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<WaitingCenter> listDone = waitingCenterService.listDone(waitingCenter);
			result.put("listDone", listDone);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 已办详情
	@RequestMapping("listDoneDtl")
	public Map<String, Object> listDoneDtl(WorkOrder wOrder, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<WorkOrder> listDoneDtl = waitingCenterService.listDoneDtl(wOrder);
			result.put("listDoneDtl", listDoneDtl);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 待办办理
	@RequestMapping("saveToDo")
	public Map<String, Object> saveToDo(WaitingCenter waitingCenter, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			waitingCenterService.saveToDo(waitingCenter);
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
