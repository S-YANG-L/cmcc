package com.htyw.app.copyForm.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
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
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.copyForm.service.PRGCopyFormService;
import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgCopyForm;
import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgInstrumentInfo;
import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgMeterReding;
import com.htyw.app.engineeringPolling.pojo.baseCommunity.baseHouse;
import com.htyw.app.utils.IDUtis;

@RestController
@RequestMapping("/CopyForm")
public class PRGCopyFormController {
	
	@Autowired
	private PRGCopyFormService CFService;
	
	//获得所有社区
    @RequestMapping("getCommunityList")
	public Map<String, Object> getCommunityList(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String tenantId = request.getParameter("tenantId");
        	List<baseHouse> communityList = CFService.getCommunityList(tenantId);
        	reMap.put("communityList", communityList);
        	reMap.put("code", "200");
        	return reMap;
		} catch (Exception e) {
			e.printStackTrace();
			reMap.put("massage", "系统开小差了请稍后重试");
			return reMap;
		}
    }
    //获得所有小区
    @RequestMapping("getVillageList")
    public Map<String, Object> getVillageList(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String id = request.getParameter("id");
    		List<baseHouse> villageList = CFService.getVillageList(id);
    		reMap.put("villageList", villageList);
    		reMap.put("code", "200");
    		return reMap;
    	} catch (Exception e) {
    		e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
    	}
    }
    //获得所有楼栋
    @RequestMapping("getBuildingList")
    public Map<String, Object> getBuildingList(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String id = request.getParameter("id");
    		List<baseHouse> buildingList = CFService.getBuildingList(id);
    		reMap.put("buildingList", buildingList);
    		reMap.put("code", "200");
    		return reMap;
    	} catch (Exception e) {
    		e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
    	}
    }
    //获得所有楼栋
    @RequestMapping("getElementList")
    public Map<String, Object> getElementList(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String id = request.getParameter("id");
    		List<baseHouse> elementList = CFService.getElementList(id);
    		reMap.put("elementList", elementList);
    		reMap.put("code", "200");
    		return reMap;
    	} catch (Exception e) {
    		e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
    	}
    }
    //获得所有楼栋
    @RequestMapping("getFloorList")
    public Map<String, Object> getFloorList(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String id = request.getParameter("id");
    		List<baseHouse> floorList = CFService.getFloorList(id);
    		reMap.put("floorList", floorList);
    		reMap.put("code", "200");
    		return reMap;
    	} catch (Exception e) {
    		e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
    	}
    }
    //获得所有房屋
    @RequestMapping("getRoomList")
    public Map<String, Object> getRoomList(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String id = request.getParameter("id");
    		List<baseHouse> roomList = CFService.getRoomList(id);
    		reMap.put("roomList", roomList);
    		reMap.put("code", "200");
    		return reMap;
    	} catch (Exception e) {
    		e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
    	}
    }

    //获取详细仪表信息
    @RequestMapping("getOddDetail")
    public Map<String, Object> getOddDetail(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String roomId = request.getParameter("roomId");
    		String INSTRUMENT_TYPE = request.getParameter("INSTRUMENT_TYPE");
    		List<PrgInstrumentInfo> infosList=CFService.getOddDetail(Long.parseLong(roomId),INSTRUMENT_TYPE);
    		System.out.println(infosList.size());
    		reMap.put("infosList", infosList);
    		reMap.put("code", "200");
    		return reMap;
		} catch (Exception e) {
			e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
		}
    }
    
    //提交抄表单
    @RequestMapping("submitOddAll")
    public Map<String, Object> submitOddAll(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String READING_NUM = request.getParameter("READING_NUM");//抄表单号
    		String READING_DATE = request.getParameter("READING_DATE");//抄表日期
    		String READING_TYPE = request.getParameter("READING_TYPE");//抄表类型
    		String INSTRUMENT_TYPE = request.getParameter("INSTRUMENT_TYPE");//仪表类型
    		String IS_OPEN_ACCOUNT = request.getParameter("IS_OPEN_ACCOUNT");//是否开账
    		String OPEN_ACCOUNT_DATE = request.getParameter("OPEN_ACCOUNT_DATE");//缴费截止日
    		String INSTRUMENT_NAME = request.getParameter("INSTRUMENT_NAME");//仪表名称
    		String INSTRUMENT_NUMBER = request.getParameter("INSTRUMENT_NUMBER");//仪表编号
    		String SCALE = request.getParameter("SCALE");//新刻度
    		String OLD_SCALE = request.getParameter("OLD_SCALE");//旧刻度
    		String SCALE_DIFFERENCE= request.getParameter("SCALE_DIFFERENCE");//刻度差
    		//String UNIT_PRICE = request.getParameter("UNIT_PRICE");//单价
    		String TOTAL_PRICE = request.getParameter("TOTAL_PRICE");//总价
    		String tenantId = request.getParameter("tenantId");//租户id
    		String InfoId = request.getParameter("InfoId");//仪表信息id
    		String copy_name_id = request.getParameter("copy_name_id");//抄表人
    		String roomId = request.getParameter("roomId");//房屋id
    		Long pcfID= Long.parseLong(IDUtis.getUUID());//主表id
    		
    		PrgCopyForm PCF = new PrgCopyForm();//抄表单主表
    		PCF.setId(pcfID);//主键
    		PCF.setReadingNum(READING_NUM);//单号
    		PCF.setReadingDate(getDate(READING_DATE));//抄表日期
    		PCF.setReadingType(READING_TYPE);  //抄表类型
    		PCF.setIsOpenAccount(IS_OPEN_ACCOUNT); //是否开账
    		PCF.setOpenAccountDate(getDate(OPEN_ACCOUNT_DATE));  //缴费截止日
    		PCF.setInstrumentType(INSTRUMENT_TYPE);  //仪表类型
    		PCF.setTenantid(Long.parseLong(tenantId));  //租户id
    		PCF.setCopyNameId(copy_name_id);  //抄表人
    		
    		PrgMeterReding PMR = new PrgMeterReding();//抄表单子表(抄表记录)
    		PMR.setId(Long.parseLong(IDUtis.getUUID())); //主键
    		PMR.setParentId(pcfID);//主表id(抄表单)
    		PMR.setInstrumentNumber(INSTRUMENT_NUMBER); //仪表编号
    		PMR.setInstrumentName(INSTRUMENT_NAME); //仪表名称
    		PMR.setScale(Double.valueOf(SCALE)); //新刻度值
    		PMR.setTenantid(Long.parseLong(tenantId)); //租户id
    		PMR.setOldScale(new BigDecimal(OLD_SCALE)); //旧刻度
    		PMR.setScaleDifference(new BigDecimal(SCALE_DIFFERENCE)); //刻度差
    		PMR.setTotalPrice(new BigDecimal(TOTAL_PRICE)); //总价
    		
    		String submitOddAll = CFService.submitOddAll(PCF,PMR,InfoId);
    		if ("1".equals(submitOddAll)) {
    			//判断是与否需要开张
    			if("0".equals(IS_OPEN_ACCOUNT)){
    				//开账
    				CFService.makeOutBill(PCF,PMR,InfoId,roomId);
    			}
    			reMap.put("code", "200");
        		return reMap;
			}else{
				reMap.put("massage", "保存失败请稍后重试");
	    		return reMap;
			}
		} catch (Exception e) {
			e.printStackTrace();
    		reMap.put("massage", "保存失败请稍后重试");
    		return reMap;
		}
    }
    	
    
    //抄表记录
    @RequestMapping("getMeterredhistory")
    public Map<String, Object> getMeterredhistory(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String copy_name_id = request.getParameter("copy_name_id");//抄表人
    		List<PrgCopyForm> PCFList =  CFService.getMeterredhistory(copy_name_id);
    		List<PrgCopyForm> relist = new ArrayList<PrgCopyForm>();
    		for (PrgCopyForm PCF : PCFList) {
    			if ("0".equals(PCF.getInstrumentType())) {
    				PCF.setInstrumentType("水表");
				}
    			if ("1".equals(PCF.getInstrumentType())) {
    				PCF.setInstrumentType("电表");
    			}
    			if ("2".equals(PCF.getInstrumentType())) {
    				PCF.setInstrumentType("燃气表");
    			}
    			if ("3".equals(PCF.getInstrumentType())) {
    				PCF.setInstrumentType("供热");
    			}
    			
    			relist.add(PCF);
			}
    		reMap.put("PCFList", relist);
    		reMap.put("code", "200");
    		return reMap;
		} catch (Exception e) {
			e.printStackTrace();
    		reMap.put("massage", "查询失败请稍后重试");
    		return reMap;
		}
    }
    //模糊查询抄表记录
    @RequestMapping("getMeterredhistoryLike")
    public Map<String, Object> getMeterredhistoryLike(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String end = "";
    		String stare ="";
    		String copy_name_id = request.getParameter("copy_name_id");//抄表人
    		stare = request.getParameter("stare");//开始时间
    		end = request.getParameter("end");//结束时间
    		if("".equals(stare) || null==stare){
				stare="1000-01-01";
			}
			if("".equals(end) || null==end){
				end="9999-12-31";
			}
    		List<PrgCopyForm> PCFList =  CFService.getMeterredhistoryLike(copy_name_id,stare,end);
    		List<PrgCopyForm> relist = new ArrayList<PrgCopyForm>();
    		for (PrgCopyForm PCF : PCFList) {
    			if ("0".equals(PCF.getInstrumentType())) {
    				PCF.setInstrumentType("水表");
    			}
    			if ("1".equals(PCF.getInstrumentType())) {
    				PCF.setInstrumentType("电表");
    			}
    			if ("2".equals(PCF.getInstrumentType())) {
    				PCF.setInstrumentType("燃气表");
    			}
    			if ("3".equals(PCF.getInstrumentType())) {
    				PCF.setInstrumentType("供热");
    			}
    			
    			relist.add(PCF);
    		}
    		reMap.put("PCFList", relist);
    		reMap.put("code", "200");
    		return reMap;
    	} catch (Exception e) {
    		e.printStackTrace();
    		reMap.put("massage", "查询失败请稍后重试");
    		return reMap;
    	}
    }
   
    //获取详细抄表信息
    @RequestMapping("getMeterReadingDetail")
    public Map<String, Object> getMeterReadingDetail(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String Pid = request.getParameter("id");
    		List<PrgMeterReding> PMRList = CFService.getMeterReadingDetail(Pid);
    		reMap.put("PMRList", PMRList);
    		reMap.put("code", "200");
    		return reMap;
		} catch (Exception e) {
			e.printStackTrace();
    		reMap.put("massage", "查询失败请稍后重试");
    		return reMap;
		}
    }
    	
    // 获取当前日期
 	public String getDate() {
 		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
 		return sdf.format(new Date());
 	}












 // String 转为date
 	public Date getDate(String str) throws ParseException {
 		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
 		return format.parse(str);
 	}



}
