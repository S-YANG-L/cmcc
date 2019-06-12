package com.htyw.app.serviceCenter.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.htyw.app.houseLeasing.pojo.Repair;
import com.htyw.app.houseLeasing.service.RepairService;
import com.htyw.app.serviceCenter.pojo.OrderBusinessDraft;
import com.htyw.app.serviceCenter.pojo.ServiceCenter;
import com.htyw.app.serviceCenter.service.ServiceCenterService;
import com.htyw.app.utils.Page;
import com.htyw.app.utils.RepairNumber;

@RestController
@RequestMapping("serviceCenterController")
public class ServiceCenterController {

	@Autowired
	private ServiceCenterService serviceCenterService;
	
	@Autowired
	private RepairService repairService;
	/**
	 * @param serviceCenter
	 * @author lshao
	 * 查询服务中心
	 */
	@RequestMapping(value = "list")
	public Map<String, Object> list(ServiceCenter serviceCenter, Page page, HttpServletRequest request,HttpServletResponse response)
			throws Exception{
		Map<String,Object> result = new HashMap<String,Object>();
		try{
			PageHelper.offsetPage(page.getStart(),10);
			List<ServiceCenter> list = serviceCenterService.list(serviceCenter);
			for (ServiceCenter serviceCenter2 : list) {
				String photo = serviceCenterService.getPhoto(serviceCenter2.getServiceHeadPhoto());
				serviceCenter2.setImgUrl(photo);
			}
			int total = (int) new PageInfo<>(list).getTotal();
	         
			page.caculateLast(total);
			result.put("list", list);
			result.put("code", 200);
			result.put("message", "success!");	
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed");
		}
			return result;		
	}
	
	/**
	 * 
	 * @param serviceCenter
	 * @author lshao
	 * 保存（服务中心、工单保存）
	 */
	@RequestMapping(value = "save")
	public Map<String, Object> save(@RequestBody OrderBusinessDraft orderBusinessDraft)
			throws Exception{
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			serviceCenterService.save(orderBusinessDraft);
			result.put("code", 200);
			result.put("message", "success!");	
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed");
		}
		return result;		
	}
	
	/**
	 * 新增预约服务信息
	 * @param 
	 * @return 
	 */
	@RequestMapping(value ="addRepairServer", method = RequestMethod.POST)
	public Map<String, Object> addRepairServer(HttpServletRequest request, HttpServletResponse response){
		Repair repair = new Repair();
		RepairNumber rs = new RepairNumber();
		Long userId = Long.valueOf(request.getParameter("userId"));
		Long tenantid = Long.valueOf(request.getParameter("tenantid"));
		String serviceAddress = request.getParameter("serviceAddress");
		String processPicture = request.getParameter("handleNum");
		String room = request.getParameter("houseName");
		String userName = request.getParameter("userName");
		String sphone = request.getParameter("sphone");
		String title = request.getParameter("title");
		String remark = request.getParameter("remark");
		String serviceContent = request.getParameter("content");
		String dat = request.getParameter("date");
		String appDate = dat.replaceAll("/", "-");
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String repairDate = sd.format(new Date());
		String draftDate = sd.format(new Date());
		String gdNumber = rs.createNumber(3);
		try {
			Date date = sd.parse(appDate);
			repair.setAppointmentDate(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Long contactNumber = Long.valueOf(request.getParameter("userPhone"));
		repair.setContactAddress(serviceAddress);
		repair.setServiceAddress(serviceAddress);
		//repair.setServiceContent(title);orderContent
		repair.setRepairDate(new Date());
		repair.setDraftDate(new Date());
		repair.setOrderContent(title);
		repair.setRealEstateCustomerId(userId);
		repair.setRealEstateCustomer(userName);
		repair.setProcessPicture(processPicture);
		repair.setTenantid(tenantid);
		repair.setHouseName(room);
		repair.setContactNumber(contactNumber);
		repair.setCreatorId(userId);
		repair.setCreatorName(userName);
		repair.setBillNumber(gdNumber);
		repair.setContacts(userName);
		repair.setServiceContent(serviceContent);
		repair.setRemark(remark);
		repair.setOrderStatus("6");
		repair.setIsAuto("0");
		repair.setOrderType("2");
		Map<String, Object> result = new HashMap<String, Object>();
		//自定义ID
	//	String ID = String.valueOf(new Date().getTime());
		Long id = new Date().getTime();
		repair.setId(id);
		try {
			int i = repairService.addRepair(repair);
			if(i == 1){
				result.put("code", "200");
				result.put("message", "success");
			}else{
				result.put("code", "201");
				result.put("message", "failed");
			}
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "failed");
			e.printStackTrace();
		}
		return result;
	}
	

	/**
	 * @param serviceCenter
	 * @author lshao
	 * APP首页服务中心
	 */
	@RequestMapping(value = "homeList")
	public Map<String, Object> homeList(ServiceCenter serviceCenter, HttpServletRequest request,HttpServletResponse response)
			throws Exception{
		Map<String,Object> result = new HashMap<String,Object>();
		try{
			List<ServiceCenter> homeList = serviceCenterService.homeList(serviceCenter);
			result.put("homeList", homeList);
			result.put("code", 200);
			result.put("message", "success!");	
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed");
		}
			return result;		
	}
	
}











