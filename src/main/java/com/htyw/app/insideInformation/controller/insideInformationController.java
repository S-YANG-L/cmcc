package com.htyw.app.insideInformation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.insideInformation.pojo.PrgInternalNotification;
import com.htyw.app.insideInformation.service.insideInformationService;

@RestController
@RequestMapping("/insideInformation")
public class insideInformationController {
	
	@Autowired
	private insideInformationService insideService;
	// 获取服务消息
	@RequestMapping(value = "serveDetails", method = RequestMethod.POST)
	public Map<String, Object> serveDetails(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String rmUserId = request.getParameter("rmUserId");
			String tenantId = request.getParameter("tenantId");
			String state = request.getParameter("state");
			String headline = request.getParameter("headline");
			 List<PrgInternalNotification> PrgInternalNotificationList= insideService.serveDetails(rmUserId,tenantId ,state,headline);
			 result.put("code", "200");
			 result.put("PrgInternalNotificationList",PrgInternalNotificationList);
			 return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "300");
			result.put("message", "系统开小差了请稍后再试");
			return result;
		}
		
	}
	
	// 获取服务消息
		@RequestMapping(value = "serveMessageDetails", method = RequestMethod.POST)
		public Map<String, Object> serveMessageDetails(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			try {
				String id = request.getParameter("id");
				PrgInternalNotification PrgInternalNotification = insideService.serveMessageDetails(id);
				result.put("code", "200");
				 result.put("PrgInternalNotification",PrgInternalNotification);
				 return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("code", "300");
				result.put("message", "系统开小差了请稍后再试");
				return result;
			}
		}
	
	//获取服务类未读消息
		@RequestMapping(value = "getserveNumber", method = RequestMethod.POST)
		public Map<String, Object> getserveNumber(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			String rmUserId = request.getParameter("rmUserId");
			String tenantId = request.getParameter("tenantId");
			try {
				String total= insideService.getserveNumber(rmUserId,tenantId);
				result.put("code", "200");
				 result.put("total",total);
				 return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("code", "300");
				result.put("message", "未获取到消息");
				return result;
			}
		}
		
		//获取消息类未读消息
		@RequestMapping(value = "getmessageNumber", method = RequestMethod.POST)
		public Map<String, Object> getmessageNumber(HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			String rmUserId = request.getParameter("rmUserId");
			String tenantId = request.getParameter("tenantId");
			try {
				String total= insideService.getmessageNumber(rmUserId,tenantId);
				result.put("code", "200");
				result.put("total",total);
				return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("code", "300");
				result.put("message", "未获取到消息");
				return result;
			}
		}
	
	
	
	
}
