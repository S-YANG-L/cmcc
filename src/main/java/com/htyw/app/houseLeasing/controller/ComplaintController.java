package com.htyw.app.houseLeasing.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.houseLeasing.pojo.Repair;
import com.htyw.app.houseLeasing.service.RepairService;
import com.htyw.app.utils.RepairNumber;


@RestController
@RequestMapping(value = "ComplaintSuggestion")
public class ComplaintController {
	
	@Autowired
	private RepairService repairService;
	
	/**
	 * 新增投诉建议信息
	 * @param repair 投诉建议信息
	 * @return 
	 */
	@RequestMapping(value ="csSave", method = RequestMethod.POST)
	public Map<String, Object> addRepair(HttpServletRequest request, HttpServletResponse response){
		Repair repair = new Repair();
		RepairNumber rs = new RepairNumber();
		Long userId = Long.valueOf(request.getParameter("userId"));
		Long tenantid = Long.valueOf(request.getParameter("tenantid"));
		String complaintPeople = request.getParameter("complaintPeople");
		String processPicture = request.getParameter("handleNum");
		Long complaintPhone =  Long.valueOf(request.getParameter("complaintPhone")).longValue();
		String orderContent = request.getParameter("orderContent");
		String houseName = request.getParameter("houseName");
		String address = request.getParameter("address");
		String remark = request.getParameter("remark");
		String complaintContent = request.getParameter("content");
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String repairDate = sd.format(new Date());
		String draftDate = sd.format(new Date());
		
		repair.setRepairDate(new Date());
		repair.setDraftDate(new Date());
		repair.setRealEstateCustomerId(userId);
		repair.setRealEstateCustomer(complaintPeople);
		repair.setComplaintPeople(complaintPeople);
		repair.setProcessPicture(processPicture);
		repair.setHouseName(houseName);
		repair.setContacts(complaintPeople);
		repair.setContactNumber(complaintPhone);
		repair.setComplaintPhone(complaintPhone);
		//repair.setComplaintContent(complaintContent);
		repair.setOrderContent(orderContent);
		repair.setRemark(remark);
		repair.setComplaintContent(complaintContent);
		repair.setContactAddress(address);
		repair.setServiceAddress(address);
		Map<String, Object> result = new HashMap<String, Object>();
		String gdNumber = rs.createNumber(2);
		//自定义ID
		Long id = new Date().getTime();
		repair.setId(id);
		repair.setOrderType("0");
		repair.setTenantid(tenantid);
		repair.setCreatorId(userId);
		repair.setCreatorName(complaintPeople);
		repair.setBillNumber(gdNumber);
		repair.setOrderStatus("6");
		repair.setIsAuto("0");
		repair.setAppointmentDate(new Date());
		int i = repairService.addRepair(repair);
		if(i == 1){
			result.put("code", "200");
			result.put("message", "success");
		}else{
			result.put("code", "201");
			result.put("message", "failed");
		}
		return result;
	}

	/**
	 * 获取完成投诉建议信息
	 * @param userName 投诉人
	 * 		  page：当前页码
	 * 		  size：显示条数
	 * @return 投诉建议信息列表
	 */
	@RequestMapping(value ="csList", method = RequestMethod.POST)
	public Map<String, Object> getRepaitLlist(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		String userName = request.getParameter("userName");
//		int page = Integer.parseInt(request.getParameter("page"));
//		int size = Integer.parseInt(request.getParameter("size"));
		List<Map> list = new ArrayList<Map>();
		list = repairService.repairList(userName);
		if(list.size() > 0){
			result.put("listRepair", list);
			result.put("code", "200");
			result.put("message", "success");
		}else{
			result.put("code", "201");
			result.put("message", "failed");
		}
		
		return result;
	}
	
	
	/**
	 * 通过ID查询报投诉建议信息
	 * @param id 主键ID
	 * @return 投诉建议信息
	 */
	@RequestMapping(value = "queryDetail", method = RequestMethod.POST)
	public Map<String, Object> getRepairById(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		String ID = request.getParameter("id");
		Long id = Long.parseLong(ID);
		Repair repair = repairService.getComplaintById(id);
		if(repair != null || !repair.equals("")){
			result.put("Repair", repair);
			result.put("code", "200");
			result.put("message", "success");
		}else{
			result.put("code", "201");
			result.put("message", "failed");
		}
		return result;
	}
	
	
	
	
}
