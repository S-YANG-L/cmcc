package com.htyw.app.customers.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.customers.pojo.Contract;
import com.htyw.app.customers.pojo.Customers;
import com.htyw.app.customers.pojo.RentLeaseBillC;
import com.htyw.app.customers.pojo.RentLeaseBillDtl;
import com.htyw.app.customers.service.CustomersService;

/*
 * 客户信息
 * 
 * */
// 告诉spring mvc这是个控制器
@RestController
@RequestMapping("customers")
public class CustomersController {
	@Autowired
	private CustomersService customersService;

	// 客户信息列表
	@RequestMapping("listCustomers")
	public Map<String, Object> listCustomers(Customers customers, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<Customers> listCustomers = customersService.listCustomers(customers);
			for (Customers customers2 : listCustomers) {
				String photo = customersService.getPhoto(customers2.getCustomerId());
				customers2.setHeadImageUrl(photo);
			}
			result.put("listCustomers", listCustomers);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 合同列表
	@RequestMapping("listContract")
	public Map<String, Object> listContract(Contract contract, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<Contract> listContract = customersService.listContract(contract);
			result.put("listContract", listContract);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 账单列表
	@RequestMapping("listBill")
	public Map<String, Object> listBill(RentLeaseBillC rentLeaseBill, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<RentLeaseBillC> listBill = customersService.listBill(rentLeaseBill);
			List<RentLeaseBillC> listBills = new ArrayList<RentLeaseBillC>();
			for (RentLeaseBillC rentLeaseBill2 : listBill) {
				if (rentLeaseBill2.getPlannedReceiptAmount() > 0) {
					listBills.add(rentLeaseBill2);
				}
			}
			result.put("listBills", listBills);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 账单子表
	@RequestMapping("listBillDtl")
	public Map<String, Object> listBillDtl(RentLeaseBillDtl RentLeaseBillDtl, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<RentLeaseBillDtl> listBillDtl = customersService.listBillDtl(RentLeaseBillDtl);
			result.put("listBillDtl", listBillDtl);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 账单
	@RequestMapping(value = "getRentLeaseBill")
	public Map<String, Object> getRentLeaseBill(RentLeaseBillC rentLeaseBill, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<RentLeaseBillC> rentLeaseBills = customersService.listBill(rentLeaseBill);
			for (RentLeaseBillC rentLeaseBill2 : rentLeaseBills) {
				RentLeaseBillDtl rLeaseBillDtl = new RentLeaseBillDtl();
				rLeaseBillDtl.setBillId(rentLeaseBill2.getId());
				List<RentLeaseBillDtl> page = customersService.listBillDtl(rLeaseBillDtl);
				rentLeaseBill2.setRentLeaseBillDtl(page);
			}
			result.put("rentLeaseBills", rentLeaseBills);
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
