package com.htyw.app.pollingDetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.engineeringPolling.mapper.PrgInspectionReportDao;
import com.htyw.app.engineeringPolling.pojo.PrgInspectionReport;
import com.htyw.app.pollingDetails.dao.PrgDecorationRegMiddleDao;
import com.htyw.app.pollingDetails.dao.PrgDeviceManagementMiddleDao;
import com.htyw.app.pollingDetails.dao.PrgHouseMiddleDao;
import com.htyw.app.pollingDetails.dao.PrgInspectionAllDao;
import com.htyw.app.pollingDetails.dao.PrgInspectionManaMiddleDao;
import com.htyw.app.pollingDetails.pojo.PrgDecorationRegMiddle;
import com.htyw.app.pollingDetails.pojo.PrgDeviceManagementMiddle;
import com.htyw.app.pollingDetails.pojo.PrgHouseMiddle;
import com.htyw.app.pollingDetails.pojo.PrgInspectionAll;
import com.htyw.app.pollingDetails.pojo.PrgInspectionManaMiddle;
import com.htyw.app.utils.IDUtis;

import net.sf.jsqlparser.expression.StringValue;

@Service
@Transactional
public class pollingDetailsService {

	@Autowired
	private PrgDeviceManagementMiddleDao PMMDao;//设备
	@Autowired
	private PrgHouseMiddleDao PHMDao;//空关
	@Autowired
	private PrgDecorationRegMiddleDao PDRMDao;//装修
	@Autowired
	private PrgInspectionManaMiddleDao PIMMDao;//园区
	@Autowired
	private PrgInspectionReportDao PIRDao;//情况上报表
	@Autowired
	private PrgInspectionAllDao PIADao;//巡检主表
	//获取单个设备
	public List<PrgDeviceManagementMiddle> getByparentId(String parentId) {
		return PMMDao.getByparentId(parentId);
	}
	public List<PrgHouseMiddle> houseOff(String parentId) {
		return PHMDao.houseOff(parentId);
	}
	//装修
	public List<PrgDecorationRegMiddle> decorationReg(String parentId) {
		return PDRMDao.decorationReg(parentId);
	}
	//园区
	public List<PrgInspectionManaMiddle> inspectionMana(String parentId) {
		return PIMMDao.inspectionMana(parentId);
	}
	
	//设备上报
	public String facilitySave(PrgInspectionReport PIR) {
		String code ="300";
		//获取总次数 巡检完成次数
		int inspectionNum = Integer.valueOf(PIR.getInspectionNum());//总次数
		int surplusNum = Integer.valueOf(PIR.getSurplusNum())+1;//完成次数
		String IS_FINISH ="1";//是否完成
		 if(inspectionNum-surplusNum<=0){
			 surplusNum=inspectionNum;
			 IS_FINISH ="0";
		 }
		 //修改设备表数据
		 PrgDeviceManagementMiddle PDMM = new PrgDeviceManagementMiddle();
		 PDMM.setId(PIR.getInspectionId());//主键
		 PDMM.setFinish_number(String.valueOf(surplusNum));//完成次数
		 PDMM.setStatus(IS_FINISH);//完成状态
		 int i = PMMDao.updateByPrimaryKeySelective(PDMM);
		 if(i>0){
			 //保存情况上报表PIRDao
			 PIR.setId(Long.parseLong(IDUtis.getUUID()));//主键
			 PIR.setInspectionAllTheme(getPIA(PIR.getPrgInspectionAllId()).getTitle());//主题
			 PIR.setSurplusNum(String.valueOf(surplusNum));//完成次数
			 PIR.setIsFinish(IS_FINISH);//是否完成
			 int j = PIRDao.insertSelective(PIR);
			 if(j>0){
				 code="200";
				 getUPPIA(PIR.getPrgInspectionAllId(),"0");//设备
			 }
		 }
		return code;
	}
	
	//空关巡检上报
	public String houseReportSave(PrgInspectionReport PIR) {
		String code ="300";
		//获取总次数 巡检完成次数
		int inspectionNum = Integer.valueOf(PIR.getInspectionNum());//总次数
		int surplusNum = Integer.valueOf(PIR.getSurplusNum())+1;//完成次数
		String IS_FINISH ="1";//是否完成
		 if(inspectionNum-surplusNum<=0){
			 surplusNum=inspectionNum;
			 IS_FINISH ="0";
		 }
		 //修改空关表数据
		 PrgHouseMiddle PHM = new PrgHouseMiddle();
		 PHM.setId(Long.parseLong(PIR.getInspectionId()));//主键
		 PHM.setFinish_number(String.valueOf(surplusNum));//完成次数
		 PHM.setStatus(IS_FINISH);//完成状态
		 int i = PHMDao.updateByPrimaryKeySelective(PHM);
		 if(i>0){
			 //保存情况上报表PIRDao
			 PIR.setId(Long.parseLong(IDUtis.getUUID()));//主键
			 PIR.setInspectionAllTheme(getPIA(PIR.getPrgInspectionAllId()).getTitle());//主题
			 PIR.setSurplusNum(String.valueOf(surplusNum));//完成次数
			 PIR.setIsFinish(IS_FINISH);//是否完成
			 int j = PIRDao.insertSelective(PIR);
			 if(j>0){
				 code="200";
				 getUPPIA(PIR.getPrgInspectionAllId(),"1");//空关
			 }
		 }
		return code;
	}
	
	//装修巡检上报
	public String decorationRegSave(PrgInspectionReport PIR) {
		String code ="300";
		//获取总次数 巡检完成次数
		int inspectionNum = Integer.valueOf(PIR.getInspectionNum());//总次数
		int surplusNum = Integer.valueOf(PIR.getSurplusNum())+1;//完成次数
		String IS_FINISH ="1";//是否完成
		if(inspectionNum-surplusNum<=0){
			surplusNum=inspectionNum;
			IS_FINISH ="0";
		}
		//修改装修表数据
		PrgDecorationRegMiddle PDRM = new PrgDecorationRegMiddle();
		PDRM.setId(Long.parseLong(PIR.getInspectionId()));//主键
		PDRM.setFinish_number(String.valueOf(surplusNum));//完成次数
		PDRM.setStatus(IS_FINISH);//完成状态
		int i = PDRMDao.updateByPrimaryKeySelective(PDRM);
		if(i>0){
			//保存情况上报表PIRDao
			PIR.setId(Long.parseLong(IDUtis.getUUID()));//主键
			PIR.setInspectionAllTheme(getPIA(PIR.getPrgInspectionAllId()).getTitle());//主题
			PIR.setSurplusNum(String.valueOf(surplusNum));//完成次数
			PIR.setIsFinish(IS_FINISH);//是否完成
			int j = PIRDao.insertSelective(PIR);
			if(j>0){
				code="200";
				getUPPIA(PIR.getPrgInspectionAllId(),"2");//装修
			}
		}
		return code;
	}
	
	//园区巡检上报
	public String inspectionManaReportSave(PrgInspectionReport PIR) {
		String code ="300";
		//获取总次数 巡检完成次数
		int inspectionNum = Integer.valueOf(PIR.getInspectionNum());//总次数
		int surplusNum = Integer.valueOf(PIR.getSurplusNum())+1;//完成次数
		String IS_FINISH ="1";//是否完成
		if(inspectionNum-surplusNum<=0){
			surplusNum=inspectionNum;
			IS_FINISH ="0";
		}
		//修改园区表数据
		PrgInspectionManaMiddle PIMM = new PrgInspectionManaMiddle();
		PIMM.setId(Long.parseLong(PIR.getInspectionId()));//主键
		PIMM.setFinish_number(String.valueOf(surplusNum));//完成次数
		PIMM.setStatus(IS_FINISH);//完成状态
		int i = PIMMDao.updateByPrimaryKeySelective(PIMM);
		if(i>0){
			//保存情况上报表PIRDao
			PIR.setId(Long.parseLong(IDUtis.getUUID()));//主键
			PIR.setInspectionAllTheme(getPIA(PIR.getPrgInspectionAllId()).getTitle());//主题
			PIR.setSurplusNum(String.valueOf(surplusNum));//完成次数
			PIR.setIsFinish(IS_FINISH);//是否完成
			int j = PIRDao.insertSelective(PIR);
			if(j>0){
				code="200";
				getUPPIA(PIR.getPrgInspectionAllId(),"3");//园区
			}
		}
		return code;
	}
	
	//获取巡检单
	public PrgInspectionAll getPIA(String id){
		return PIADao.selectByPrimaryKey(Long.parseLong(id));
	}
	
	//查询字表判断是否完成所有巡检
	public void getUPPIA(String id,String state){
		if ("0".equals(state)) {//设备
			int allState=0;
			PrgInspectionAll all = new PrgInspectionAll();
			List<PrgDeviceManagementMiddle> list = PMMDao.getByparentId(id);
			for (PrgDeviceManagementMiddle PDMM : list) {
				if ("1".equals(PDMM.getStatus())) {
					allState+=1;
				}
			}
			if (list.size() == allState) {//完成了字表所有巡检
				all.setId(Long.parseLong(id));
				all.setEffectStatus("3");//已完成
				PIADao.updateByPrimaryKeySelective(all);
			}
		}
		
		if ("1".equals(state)) {//空关
			int allState=0;
			PrgInspectionAll all = new PrgInspectionAll();
			List<PrgHouseMiddle> list = PHMDao.houseOff(id);
			for (PrgHouseMiddle PHM : list) {
				if ("1".equals(PHM.getStatus())) {
					allState+=1;
				}
			}
			if (list.size() == allState) {//完成了字表所有巡检
				all.setId(Long.parseLong(id));
				all.setEffectStatus("3");//已完成
				PIADao.updateByPrimaryKeySelective(all);
			}
		}
		
		if ("2".equals(state)) {//装修
			int allState=0;
			PrgInspectionAll all = new PrgInspectionAll();
			 List<PrgDecorationRegMiddle> list = PDRMDao.decorationReg(id);
			for (PrgDecorationRegMiddle PDRM : list) {
				if ("1".equals(PDRM.getStatus())) {
					allState+=1;
				}
			}
			if (list.size() == allState) {//完成了字表所有巡检
				all.setId(Long.parseLong(id));
				all.setEffectStatus("3");//已完成
				PIADao.updateByPrimaryKeySelective(all);
			}
		}
		
		if ("3".equals(state)) {//园区
			int allState=0;
			PrgInspectionAll all = new PrgInspectionAll();
			 List<PrgInspectionManaMiddle> list = PIMMDao.inspectionMana(id);
			for (PrgInspectionManaMiddle PIMM : list) {
				if ("1".equals(PIMM.getStatus())) {
					allState+=1;
				}
			}
			if (list.size() == allState) {//完成了字表所有巡检
				all.setId(Long.parseLong(id));
				all.setEffectStatus("3");//已完成
				PIADao.updateByPrimaryKeySelective(all);
			}
		}
		
	}
	//获取情况上报详情
	public List<PrgInspectionReport> getReportDetail(String objectId, String inspectionID, String userId) {
		 List<PrgInspectionReport> reList = new ArrayList<PrgInspectionReport>();
		 List<PrgInspectionReport> PIRList= PIRDao.getReportDetail(objectId,inspectionID,userId);
		 for (PrgInspectionReport PIR : PIRList) {
			if(PIR.getIsNormal().equals("0")){
				PIR.setIsNormal("正常");
			}
			if(PIR.getIsNormal().equals("1")){
				PIR.setIsNormal("不正常");
			}
			if(PIR.getIsFinish().equals("0")){
				PIR.setIsFinish("已完成");
			}
			if(PIR.getIsFinish().equals("1")){
				PIR.setIsFinish("未完成");
			}
			reList.add(PIR);
		}
		return reList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
