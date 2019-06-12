package com.htyw.app.engineeringPolling.controller;


import java.util.ArrayList;
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

import com.htyw.app.engineeringPolling.pojo.CopyForm.CopyForm;
import com.htyw.app.engineeringPolling.pojo.CopyForm.CopyFormRecord;
import com.htyw.app.engineeringPolling.pojo.CopyForm.CopyFormType;
import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgInstrumentInfo;
import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgInstrumentType;
import com.htyw.app.engineeringPolling.pojo.baseCommunity.baseCommunity;
import com.htyw.app.engineeringPolling.pojo.baseCommunity.baseHouse;
import com.htyw.app.engineeringPolling.service.CopyFormService;

@RestController
@RequestMapping("/CopyFormController")
public class CopyFormController {
    @Autowired
    CopyFormService copyFormService;
    
    //抄表类型
    @RequestMapping(value = "copyList")
    public Map<String, Object> copyList() {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            System.out.println();
            List<CopyFormType> copyList = copyFormService.copyList();
            result.put("copyList", copyList);
            result.put("code", "200");
            result.put("message", "success");
        } catch (Exception e) {
            result.put("code", "201");
            result.put("message", "fail");
        }
        return result;
    }
    //抄表记录
    @RequestMapping("record")
    public Map<String, Object> record( HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
        	ArrayList<CopyFormRecord> reList = new ArrayList<CopyFormRecord>();
        	String roomId = request.getParameter("roomId");
            List<CopyFormRecord> record = copyFormService.record(roomId);
            for (CopyFormRecord copyFormRecord : record) {
            	if ("0".equals(copyFormRecord.getReceiptsName())) {
            		copyFormRecord.setReceiptsName("水费");
				}
            	if ("1".equals(copyFormRecord.getReceiptsName())) {
            		copyFormRecord.setReceiptsName("电费");
            	}
            	if ("2".equals(copyFormRecord.getReceiptsName())) {
            		copyFormRecord.setReceiptsName("燃气费");
            	}
            	if ("3".equals(copyFormRecord.getReceiptsName())) {
            		copyFormRecord.setReceiptsName("供热费");
            	}
            	reList.add(copyFormRecord);
			}
            result.put("recordList", reList );
            result.put("code", "200");
            //result.put("message", "success");
        } catch (Exception e) {
        	e.printStackTrace();
            result.put("code", "201");
            result.put("message", "系统开小差了");
        }
        return result;
    }
    //抄表单
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public Map<String, Object> save(@RequestBody CopyForm copyForm)
            throws Exception{
        Map<String, Object> result = new HashMap<String, Object>();
        try{
            copyFormService.save(copyForm);
            result.put("code", 200);
            result.put("message", "success!");
        }catch(Exception e){
            e.printStackTrace();
            result.put("code", 201);
            result.put("message", "failed");
        }
        return result;
    }
    
    //获得所有社区
    @RequestMapping("communityList")
	public Map<String, Object> communityList(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String tenantId = request.getParameter("tenantId");
        	List<baseCommunity> communityList=copyFormService.communityList(tenantId);
        	reMap.put("communityList", communityList);
        	reMap.put("code", "200");
        	return reMap;
		} catch (Exception e) {
			e.printStackTrace();
			reMap.put("massage", "系统开小差了请稍后重试");
			return reMap;
		}
    }
    //获取小区
    @RequestMapping("villageList")
    public Map<String, Object> villageList(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String id = request.getParameter("id");
    		List<baseHouse> villageList=copyFormService.villageList(id);
    		reMap.put("villageList", villageList);
    		reMap.put("code", "200");
    		return reMap;
    	} catch (Exception e) {
    		e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
    	}
    }
    //获取楼栋
    @RequestMapping("buildingList")
    public Map<String, Object> buildingList(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String id = request.getParameter("id");
    		List<baseHouse> buildingList=copyFormService.buildingList(id);
    		reMap.put("buildingList", buildingList);
    		reMap.put("code", "200");
    		return reMap;
    	} catch (Exception e) {
    		e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
    	}
    }
    //获取房间
    @RequestMapping("roomList")
    public Map<String, Object> roomList(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String id = request.getParameter("id");
    		List<baseHouse> roomList=copyFormService.roomList(id);
    		reMap.put("roomList", roomList);
    		reMap.put("code", "200");
    		return reMap;
    	} catch (Exception e) {
    		e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
    	}
    }
    
  /*//获取房间的上月抄表信息
    @RequestMapping("writeBack")
    public Map<String, Object> writeBack(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String roomId = request.getParameter("roomId");
        	//PrgCopyForm PrgCopyForm = copyFormService.writeBack(roomId);
        	return reMap;
		} catch (Exception e) {
			e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
		}
    }*/
    //回写仪表类型
    @RequestMapping("writeBackMeterGenre")
    public Map<String, Object> writeBackMeterGenre(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		List<PrgInstrumentType> PrgInstrumentTypeList = copyFormService.writeBackMeterGenre();
    		reMap.put("code", "200");
    		reMap.put("PrgInstrumentTypeList", PrgInstrumentTypeList);
    		return reMap;
    	} catch (Exception e) {
    		e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
    	}
    }
    
  //通过房屋id和仪表类型id查询上次刻度
    @RequestMapping("getParticulars")
    public Map<String, Object> getParticulars(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String roomId = request.getParameter("roomId");
    		String meterGenre = request.getParameter("meterGenre");
    		PrgInstrumentInfo getParticulars = copyFormService.getParticulars(Long.parseLong(roomId),Long.parseLong(meterGenre));
    		String initialReading = String.valueOf(getParticulars.getInitialReading());
    		String readingDate = copyFormService.getExamineTime(Long.parseLong(roomId),Long.parseLong(meterGenre));
    		reMap.put("code", "200");
    		reMap.put("initialReading", initialReading);//上次抄表刻度
    		reMap.put("readingDate", readingDate);//上次抄表刻度
    		return reMap;
    	} catch (Exception e) {
    		e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
    	}
    }

  //保存抄表
    @RequestMapping("submitAll")
    public Map<String, Object> submitAll(HttpServletRequest request, HttpServletResponse response){
    	HashMap<String, Object> reMap = new HashMap<String , Object>();
    	try {
    		String roomId = request.getParameter("roomId");//房屋id
    		String tenantId = request.getParameter("tenantId");//租户id
    		String instrumentType = request.getParameter("instrumentType");//抄表单类型
    		String meterGenre = request.getParameter("meterGenre");//仪表类型名称
    		String initialReadingHistory = request.getParameter("initialReadingHistory");//本月度数
    		String practical = request.getParameter("practical");//实际使用
    		String isOpenAccount = request.getParameter("isOpenAccount");//是否开张
    		String meterGenreID = request.getParameter("meterGenreID");//仪表类型id
    		copyFormService.submitAll(roomId,tenantId,instrumentType,meterGenre,initialReadingHistory,practical,isOpenAccount , meterGenreID);
    		reMap.put("code", "200");
    		return reMap;
    	} catch (Exception e) {
    		e.printStackTrace();
    		reMap.put("massage", "系统开小差了请稍后重试");
    		return reMap;
    	}
    }






}
