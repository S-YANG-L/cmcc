package com.htyw.app.houseLeasing.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.htyw.app.houseLeasing.pojo.Repair;
import com.htyw.app.houseLeasing.service.RepairService;
import com.htyw.app.utils.DocumentUtils;
import com.htyw.app.utils.Page;
import com.htyw.app.utils.RepairNumber;


@RestController
@RequestMapping(value = "Repair")
public class RepairController {
	
	@Autowired
	private RepairService repairService;
	
	private DocumentUtils documenUtils;
	
	/**
	 * 新增报修信息
	 * @param repair 报修信息
	 * @return 
	 */
	@RequestMapping(value ="repairSave", method = RequestMethod.POST)
	public Map<String, Object> addRepair(HttpServletRequest request, HttpServletResponse response){
		Repair repair = new Repair();
		RepairNumber rs = new RepairNumber();
		//"processPicture":oneNum,
		//"repairImage":twoNum,repairImage
		String processPicture = request.getParameter("processPicture");
		String repairImage = request.getParameter("repairImage");
		Long userId = Long.valueOf(request.getParameter("userId"));
		Long tenantid = Long.valueOf(request.getParameter("tenantid"));
		String userName = request.getParameter("userName");
		String serviceAddress = request.getParameter("serviceAddress");
		String room = request.getParameter("room");
		String repairPeople = request.getParameter("repairPeople");
		String appointmentDate = request.getParameter("appointmentDate");
		String appDate = appointmentDate.replaceAll("/", "-");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String repairDate = sd.format(new Date());
		String draftDate = sd.format(new Date());
		String gdNumber = rs.createNumber(1);
		try {
			Date dat = sdf.parse(appDate);
			repair.setAppointmentDate(dat);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String orderContent = request.getParameter("orderContent");
		String repairContent = request.getParameter("repairContent");
		String remark = request.getParameter("remark");
		repair.setContactAddress(serviceAddress);
		Long contactNumber = Long.valueOf(request.getParameter("contactNumber"));
		repair.setRepairDate(new Date());
		repair.setDraftDate(new Date());
		repair.setServiceAddress(serviceAddress);
		repair.setRealEstateCustomerId(userId);
		repair.setRealEstateCustomer(userName);
		repair.setTenantid(tenantid);
		repair.setHouseName(room);
		repair.setProcessPicture(processPicture);
		repair.setRepairImage(repairImage);
		repair.setRepairPeople(repairPeople);
		repair.setOrderContent(orderContent);
		repair.setRepairContent(repairContent);
		repair.setRemark(remark);
		repair.setContactNumber(contactNumber);
		repair.setContacts(repairPeople);
		repair.setCreatorId(userId);
		repair.setCreatorName(repairPeople);
		repair.setBillNumber(gdNumber);
		repair.setIsAuto("0");
		repair.setOrderType("1");
		repair.setOrderStatus("6");
		Map<String, Object> result = new HashMap<String, Object>();
		//自定义ID
	//	String ID = String.valueOf(new Date().getTime());
		Long id = new Date().getTime();
		repair.setId(id);
		repair.setOrderType("1");
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
	 * 获取报修完成信息列表
	 * @param userName 报修人姓名
	 * 		  status：报修状态 5:完成   其他：未完成
	 * 		  page：当前页码
	 * 		  size：显示条数
	 * @return 报修信息列表
	 */
	@RequestMapping(value ="repaitLlist", method = RequestMethod.POST)
	public Map<String, Object> getRepaitLlist(Page page,HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		String status = request.getParameter("status");
		String userName = request.getParameter("userName");
		String order = request.getParameter("orderType");
		String start = request.getParameter("startTime");
		String end = request.getParameter("end");
		Date dstart = null;
		Date dend = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		if(start.length() > 0){
			start = start.replaceAll("/", "-");
			try {
				dstart = sdf.parse(start);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if(end.length() > 0){
			end = end.replaceAll("/", "-");
			try {
				dend = sdf.parse(end);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
//		int page = Integer.parseInt(request.getParameter("page"));
//		int size = Integer.parseInt(request.getParameter("size"));
		List<Map> list = new ArrayList<Map>();
		if(status.equals("5")){
			//查询完成报修的信息
			try {
				PageHelper.offsetPage(page.getStart(),10);
				list = repairService.repairList1(userName, order, dstart, dend);
				if(list.size() > 0){
					for (Map map : list) {
						String orderStatus = (String) map.get("orderStatus");
						//map.put("orderStatus", "已完成");
						//String image = (String) map.get("repairImage");
						//image = documenUtils.httpRespString(image);
						//map.put("repairImage", image);
					}
					int total = (int) new PageInfo<>(list).getTotal();
			         
					page.caculateLast(total);
					result.put("listRepair", list);
					result.put("code", "200");
					result.put("message", "success");
				}else{
					result.put("code", "202");
					result.put("message", "暂无数据");
				}
			} catch (Exception e) {
				result.put("code", "201");
				result.put("message", "failed");
				e.printStackTrace();
			}
		}else if(status.equals("3")){
			//查询未完成的报修信息
			try {
				PageHelper.offsetPage(page.getStart(),10);
				list = repairService.repairList2(userName, order, dstart, dend);
				if(list.size() > 0){
					for (Map map : list) {
						//map.put("orderStatus", "未处理");
						String orderStatus2 = (String) map.get("orderStatus");
						String name = (String) map.get("singlePerson");
						//String image = (String) map.get("repairImage");
						//image = documenUtils.httpRespString(image);
						//map.put("repairImage", image);
						if(name == null){
							map.put("singlePerson", "待派发");
						}
					}
					int total = (int) new PageInfo<>(list).getTotal();
			         
					page.caculateLast(total);
					result.put("listRepairs", list);
					result.put("code", "200");
					result.put("message", "success");
				}else{
					result.put("code", "202");
					result.put("message", "暂无数据");
				}
			} catch (Exception e) {
				result.put("code", "201");
				result.put("message", "failed");
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	/**
	 * 通过ID查询报修详情信息
	 * @param id 主键ID
	 * @return 报修详情信息
	 */
	@RequestMapping(value = "queryRepair", method = RequestMethod.POST)
	public Map<String, Object> getRepairById(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		String ID = request.getParameter("id");
		Long id = Long.parseLong(ID);
		try {
			Repair repair = repairService.getRepairById(id);
			if(repair != null || !repair.equals("")){
				//String repairImage = repair.getRepairImage();
				//repairImage = documenUtils.httpRespString(repairImage);
				//repair.setRepairImage(repairImage);
				result.put("Repair", repair);
				result.put("code", "200");
				result.put("message", "success");
			}else{
				result.put("code", "202");
				result.put("message", "暂无数据");
			}
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "failed");
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	/**
     * 新增满意度、意见
     * @param id：主键ID
     * @param userFraction：满意度  
     * @param userEvaluate：意见
     * @return
     */
	@RequestMapping(value = "addRepairView", method = RequestMethod.POST)
	public Map<String, Object> addRepairView(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		String ID = request.getParameter("id");
		Long id = Long.parseLong(ID);
		String userFraction = request.getParameter("userFraction");
		String userEvaluate = request.getParameter("userEvaluate");
		String orderStatus = request.getParameter("orderStatus");
		try {
			
			int i = repairService.addView(id, userFraction, userEvaluate, orderStatus);
			if(i == 1){
				result.put("code", "200");
				result.put("message", "success");
			}else{
				result.put("code", "202");
				result.put("message", "暂无数据");
			}
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "failed");
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	/**
	 * 根据用户名获取房间号、小区名
	 * @param name：用户名
	 * @param date：当前时间
	 * @return
	 */
	@RequestMapping(value = "getHouseName", method = RequestMethod.POST)
	public Map<String, Object> getHouseName(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
//		String name = request.getParameter("userName");
		String ID = request.getParameter("userId");
		Long id = Long.parseLong(ID);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dat = sdf.format(date);
		try {
			List<Map> list = repairService.getHouseName(id, dat);
			System.out.println("获取到小区信息："+list);
			if(list.size() > 0){
				result.put("list", list);
				result.put("code", "200");
				result.put("message", "success");
			}else{
				result.put("code", "202");
				result.put("message", "暂无数据");
			}
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "failed");
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * 获取工单完成信息列表
	 * @param userName 用户姓名
	 * 		  page：当前页码
	 * 		  size：显示条数
	 * @return 工单信息列表
	 */
	@RequestMapping(value ="getEvaluateLlist", method = RequestMethod.POST)
	public Map<String, Object> getEvaluateLlist(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		String userName = request.getParameter("userName");
//		int page = Integer.parseInt(request.getParameter("page"));
//		int size = Integer.parseInt(request.getParameter("size"));
		List<Map> list = new ArrayList<Map>();
		try {
			list = repairService.getEvaluateList(userName/*, page, size*/);
			if(list.size() > 0){
				result.put("list", list);
				result.put("code", "200");
				result.put("message", "success");
			}else{
				result.put("code", "202");
				result.put("message", "暂无数据");
			}
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "failed");
			e.printStackTrace();
		}
		return result;
	}
	
	
	
}
