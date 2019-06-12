package com.htyw.app.order.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.order.pojo.OrderBusinessDraft;
import com.htyw.app.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	// 获取代办
	@RequestMapping(value = "getbacklog", method = RequestMethod.POST)
	public Map<String, Object> getBacklog(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		String singleId = request.getParameter("singleId");
		String tenantId = request.getParameter("tenantId");
		try {
			result = orderService.getBacklog(singleId, tenantId);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 模糊查询获取
	@RequestMapping(value = "obscure", method = RequestMethod.POST)
	public Map<String, Object> obscure(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		String singleId = request.getParameter("singleId");
		String tenantId = request.getParameter("tenantId");
		String orderContent = request.getParameter("orderContent");
		String state = request.getParameter("state");
		try {
			result = orderService.obscure(singleId, tenantId, orderContent ,state);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 转单
	@RequestMapping(value = "redeploy", method = RequestMethod.POST)
	public Map<String, Object> redeploy(@RequestParam(value = "id") Long id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String state = orderService.redeploy(id);
			result.put("state", state);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 接单
	@RequestMapping(value = "takeorders", method = RequestMethod.POST)
	public Map<String, Object> takeOrders(@RequestParam(value = "id") Long id) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String state = orderService.takeOrders(id);
			result.put("state", state);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 获取已接单列表
	@RequestMapping(value = "gettakeorders", method = RequestMethod.POST)
	public Map<String, Object> getTakeOrders(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String singleId = request.getParameter("singleId");
			String tenantId = request.getParameter("tenantId");
			result = orderService.getTakeOrders(singleId, tenantId);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 处理完成提交
	@RequestMapping(value = "disposeachieve", method = RequestMethod.POST)
	public Map<String, Object> disposeAchieve(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String id = request.getParameter("id");
			// String isAccomplish = request.getParameter("isAccomplish");
			String workFlow = request.getParameter("workFlow");
			String state = orderService.disposeAchieve(id, workFlow);
			result.put("state", state);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 查询已完成
	@RequestMapping(value = "getaccomplish", method = RequestMethod.POST)
	public Map<String, Object> geTaccomplish(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String singleId = request.getParameter("singleId");
			String tenantId = request.getParameter("tenantId");
			result = orderService.getAccomplish(singleId, tenantId);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 查询单个工单详情
	@RequestMapping(value = "selectOrder", method = RequestMethod.POST)
	public Map<String, Object> selectOrder(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String id = request.getParameter("id");
			OrderBusinessDraft orderBusinessDraft = orderService.selectOrder(id);
			result.put("orderBusinessDraft", orderBusinessDraft);
			result.put("state", "200");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 获取已完成列表
	@RequestMapping(value = "haveFinished", method = RequestMethod.POST)
	public Map<String, Object> haveFinished(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String singleId = request.getParameter("singleId");
			String tenantId = request.getParameter("tenantId");
			result = orderService.haveFinished(singleId, tenantId);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}
	
	// 获取拒接列表
	@RequestMapping(value = "getRefusing", method = RequestMethod.POST)
	public Map<String, Object> getRefusing(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String singleId = request.getParameter("singleId");
			String tenantId = request.getParameter("tenantId");
			result = orderService.getRefusing(singleId, tenantId);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}






}
