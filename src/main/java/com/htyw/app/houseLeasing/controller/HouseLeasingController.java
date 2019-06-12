package com.htyw.app.houseLeasing.controller;

import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.htyw.app.houseLeasing.pojo.HouseLeasing;
import com.htyw.app.houseLeasing.pojo.LookingRequest;
import com.htyw.app.houseLeasing.service.HouseLeasingService;
import com.htyw.app.utils.HttpRequestUtil;
import com.htyw.app.utils.Page;
import com.htyw.app.utils.PropertyFileUtil;

@RestController
@RequestMapping("houseLeasingController")
public class HouseLeasingController{

	@Autowired
	private HouseLeasingService houseLeasingService;
	
	/**
	 * @param houseLeasing
	 * @param request
	 * @author liushihao
	 * 获取房屋租赁列表
	 */
	@RequestMapping(value = "list")
	public Map<String, Object> list(HouseLeasing houseLeasing, Page page, HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			PageHelper.offsetPage(page.getStart(),10);
			List<HouseLeasing> houseList = houseLeasingService.houseList(houseLeasing); 
			for (HouseLeasing houseLeasing2 : houseList) {
				String photo = houseLeasingService.getPhoto(houseLeasing2.getApartmentPhoto());
				houseLeasing2.setHousePhotoVideo(photo);
			}
			int total = (int) new PageInfo<>(houseList).getTotal();
	         
			page.caculateLast(total);
			result.put("houseList", houseList);
			result.put("code", 200);
			result.put("message", "success!");
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed!");
		}
		return result;
		
	}
	/**
	 * 
	 * @param houseLeasing
	 * @author lshao
	 * @param lookingRequest
	 * 预约看房申请提交
	 */
	@RequestMapping(value = "appointLookHouse")
	public Map<String, Object> appointLookHouse(HttpServletRequest request, HttpServletResponse response)
			throws Exception{
		Map<String, Object> result = new HashMap<String, Object>();
		String houseId = request.getParameter("houseId");  
		String houseName = request.getParameter("houseName");  
		String applicantPhone = request.getParameter("applicantPhone");
		String applicantName = request.getParameter("applicantName");
		String leavingMessage = request.getParameter("leavingMessage");
		Long applicantId = Long.valueOf(request.getParameter("applicantId")).longValue();
		String applicantDate = request.getParameter("applicantDate");
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date applicant = format.parse(applicantDate);
		String applicantSex = request.getParameter("applicantSex");
		String ID = String.valueOf(new Date().getTime());
		Long id = Long.parseLong(ID);
		
		LookingRequest lookingRequest = new LookingRequest();
		lookingRequest.setId(id);
		lookingRequest.setHouseId(houseId);
		lookingRequest.setHouseName(houseName);
		lookingRequest.setApplicantName(applicantName);
		lookingRequest.setApplicantPhone(applicantPhone);
		lookingRequest.setLeavingMessage(leavingMessage);
		lookingRequest.setApplicantId(applicantId);		
		lookingRequest.setApplicantDate(applicant);
		lookingRequest.setApplicantSex(applicantSex);
		try{
			houseLeasingService.saveApplication(lookingRequest);
			try {
				approval(id);
			} catch (Exception e) {
				result.put("code", 200);
				result.put("message", "success!");
			}
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed!");
		}
		return result;		
	}

	/**
	 * @author liushihao
	 * 查社区
	 */
	@RequestMapping(value = "sqList")
	public Map<String, Object> sqList( HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			String id = request.getParameter("tenantId");
			List<HouseLeasing> sheQuList = houseLeasingService.sheQuList(id); 
			result.put("sheQuList", sheQuList);
			result.put("code", 200);
			result.put("message", "success!");
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed!");
		}
		return result;
		
	}

	/**
	 * @author liushihao
	 * 查小区
	 */
	@RequestMapping(value = "xqList")
	public Map<String, Object> xqList(HouseLeasing houseLeasing, HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			String vId = request.getParameter("communityId");
			List<HouseLeasing> xiaoQuList = houseLeasingService.xiaoQuList(vId); 
			result.put("xiaoQuList", xiaoQuList);
			result.put("code", 200);
			result.put("message", "success!");
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed!");
		}
		return result;
		
	}

	/**
	 * @author liushihao
	 * 查楼栋
	 */
	@RequestMapping(value = "ldList")
	public Map<String, Object> ldList(HouseLeasing houseLeasing, HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			String bId = request.getParameter("villageId");
			List<HouseLeasing> louDongList = houseLeasingService.louDongList(bId); 
			result.put("louDongList", louDongList);
			result.put("code", 200);
			result.put("message", "success!");
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed!");
		}
		return result;
		
	}
	/**
	 * @author liushihao
	 * 查类型
	 */
	@RequestMapping(value = "lxList")
	public Map<String, Object> lxList(HouseLeasing houseLeasing, HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			String aId = request.getParameter("buildingId");
			List<HouseLeasing> leiXingList = houseLeasingService.leiXingList(aId); 
			result.put("leiXingList", leiXingList);
			result.put("code", 200);
			result.put("message", "success!");
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed!");
		}
		return result;
		
	}
	/**
	 * 审批流
	 */
	private void approval(Long id) throws Exception{
		//靠工具类获取application.properties中配置的url数据
		String ip = PropertyFileUtil.getValue("pc.host");
		String port = PropertyFileUtil.getValue("pc.port");
		String ff = PropertyFileUtil.getValue("pc.rokenUrl");
		String username = PropertyFileUtil.getValue("pc.userName");
		String pd = PropertyFileUtil.getValue("pc.password");
		//定义一个url拼接整个"url"
		String url;
		if(port == ""){
			url = "http://"+ip+ff;
		}else{
			url = "http://"+ip+':'+port+ff;
		}
		//对url中参数-"密码"加密
		String aaString= pd;
		String encode = URLEncoder.encode(aaString, "utf-8");
		String encodeBase64 = encodeBase64( encode.getBytes());
		
		//将加密后的密码和用户名放到MAP中
		Map<String,String> paramGetToken = new HashMap<String,String>();
		paramGetToken.put("pd", encodeBase64);
		paramGetToken.put("username", username);
		
		//"url"、"paramGetToken(参数)"已处理好,访问httpclient
		HttpRequestUtil.doPost(paramGetToken, url);
		String returnPost = HttpRequestUtil.doPost(paramGetToken, url);
		JSONObject.parseObject(returnPost);
		JSONObject obj = JSONObject.parseObject(returnPost);
		obj.getString("token");
		
		String token = obj.getString("token");
		String ip2 = PropertyFileUtil.getValue("pc.host");
		String port2 = PropertyFileUtil.getValue("pc.port");
		String ff2 = PropertyFileUtil.getValue("pc.allDateUrl");
		String button = "button";
		String buttonToken = "audit_operation";
		String dataSourceCode = "rent_looking_house";
		String audit_type = "1";
		String audit_column = "BILL_STATUS";
		String tenant_code = "1";
		JSONObject obj2 = new JSONObject();
		obj2.put("ID", id);
		obj2.toString();
		URLEncoder.encode(obj2.toString(), "UTF-8");
		String urlTwoEncode = URLEncoder.encode(obj2.toString(), "UTF-8");
		
		String url2;
		if(port2 == ""){
			url2 = "http://"+ip2+ff2;
		}else{
			url2 = "http://"+ip2+':'+port2+ff2;
		}

		Map<String,String> paramForAllData = new HashMap<String,String>();
		paramForAllData.put("cmd", button);
		paramForAllData.put("buttonToken", buttonToken);
		paramForAllData.put("dataSourceCode", dataSourceCode);
		paramForAllData.put("audit_type", audit_type);
		paramForAllData.put("audit_column", audit_column);
		paramForAllData.put("tenant_code", tenant_code);
		paramForAllData.put("token", token);
		paramForAllData.put("jsonData", urlTwoEncode);
		
		HttpRequestUtil.doPost(paramForAllData, url2);
		
		
	}
	
	/**
	 * 加密
	 */
	public static String encodeBase64(byte[] input) throws Exception{  
		 Class clazz=Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64"); 
		 Method mainMethod= clazz.getMethod("encode", byte[].class);  
		 mainMethod.setAccessible(true);  
		 Object retObj=mainMethod.invoke(null, input);  
		 return (String)retObj;  
	 }

}
