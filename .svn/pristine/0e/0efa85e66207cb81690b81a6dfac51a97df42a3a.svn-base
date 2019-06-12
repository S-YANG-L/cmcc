package com.htyw.app.lease.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.lease.pojo.Lease;
import com.htyw.app.lease.service.LeaseService;
/*
 * 租赁管理模块
 * 
 * 
 * */
// 告诉spring mvc这是个控制器
@RestController
@RequestMapping("lease")
public class LeaseController {
	@Autowired
	private LeaseService leasetService;

	// 房源信息列表接口
	@RequestMapping("listLease")
	public Map<String, Object> listLease(Lease Lease, HttpServletRequest request, HttpServletResponse response)
			{
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<Lease> listLease = leasetService.listLease(Lease);
			result.put("listLease", listLease);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 房源信息修改接口
	@RequestMapping("saveLease")
	public Map<String, Object> saveLease(Lease lease) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			leasetService.saveLease(lease);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "fail");
		}
		return result;
	}
}
