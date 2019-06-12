package com.htyw.app.propertyPayment.controller;
/*
 * 物业缴费模块
 * 
 * */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.propertyPayment.pojo.PropertyPayment;
import com.htyw.app.propertyPayment.pojo.PropertyPaymentDtl;
import com.htyw.app.propertyPayment.service.PropertyPaymentService;

@RestController
@RequestMapping("propertyPayment")
public class PropertyPaymentController {

	@Autowired
	private PropertyPaymentService PropertyPaymentService;

	@RequestMapping(value = "listPropertyPayment")
	public Map<String, Object> listPropertyPayment(PropertyPayment propertyPayment, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<PropertyPayment> listPropertyPayment = PropertyPaymentService.listPropertyPayment(propertyPayment);
			for (PropertyPayment propertyPayment2 : listPropertyPayment) {
				PropertyPaymentDtl propertyPaymentDtl = new PropertyPaymentDtl();
				propertyPaymentDtl.setBillId(propertyPayment2.getId());
				List<PropertyPaymentDtl> page = PropertyPaymentService.listPropertyPaymentDtl(propertyPaymentDtl);
				propertyPayment2.setPropertyPaymentDtl(page);
			}
			result.put("listPropertyPayment", listPropertyPayment);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "fail");
		}
		return result;
	}
	@RequestMapping(value = "listPropertyPaymentRecord")
	public Map<String, Object> listPropertyPaymentRecord(PropertyPayment propertyPayment, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<PropertyPayment> listPropertyPayment = PropertyPaymentService.listPropertyPayment(propertyPayment);
			for (PropertyPayment propertyPayment2 : listPropertyPayment) {
				PropertyPaymentDtl propertyPaymentDtl = new PropertyPaymentDtl();
				propertyPaymentDtl.setBillId(propertyPayment2.getId());
				List<PropertyPaymentDtl> page = PropertyPaymentService.listPropertyPaymentDtl(propertyPaymentDtl);
				propertyPayment2.setPropertyPaymentDtl(page);
			}
			List<PropertyPayment> listPayment=new ArrayList<>();
			List<PropertyPayment> payments=listPropertyPayment;
			for (PropertyPayment propertyPayment2 : payments) {
				if(propertyPayment2.getUnpaidAmount()>0){
					listPayment.add(propertyPayment2);
				}
			}
			result.put("listPayment", listPayment);
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
