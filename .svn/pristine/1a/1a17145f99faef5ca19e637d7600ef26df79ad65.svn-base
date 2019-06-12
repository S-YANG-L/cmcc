package com.htyw.app.copyForm.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.copyForm.dao.RentLeaseBillDetailDao;
import com.htyw.app.copyForm.dao.RentLeasebillDao;
import com.htyw.app.copyForm.pojo.RentLeaseBillDetail;
import com.htyw.app.copyForm.pojo.RentLeasebill;
import com.htyw.app.engineeringPolling.mapper.PrgCopyFormDao;
import com.htyw.app.engineeringPolling.mapper.PrgInstrumentInfoDao;
import com.htyw.app.engineeringPolling.mapper.PrgMeterRedingDao;
import com.htyw.app.engineeringPolling.mapper.baseHouseDao;
import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgCopyForm;
import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgInstrumentInfo;
import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgMeterReding;
import com.htyw.app.engineeringPolling.pojo.baseCommunity.baseHouse;
import com.htyw.app.user.dao.RmUserDao;
import com.htyw.app.user.pojo.RmUser;
import com.htyw.app.utils.IDUtis;

@Service
public class PRGCopyFormService {
	
	@Autowired
	private baseHouseDao BHDao;
	@Autowired
	private PrgInstrumentInfoDao PIIDao;
	@Autowired
	private PrgCopyFormDao PCFDao;
	@Autowired
	private PrgMeterRedingDao PMRDao;
	@Autowired
	private RmUserDao PUserDao;
	@Autowired
	private RentLeasebillDao RLBDao;
	@Autowired
	private RentLeaseBillDetailDao RLBDDao;

	public List<baseHouse> getCommunityList(String tenantId) {
		return BHDao.getCommunityList(Long.parseLong(tenantId));
	}

	public List<baseHouse> getVillageList(String id) {
		return BHDao.villageList(Long.parseLong(id));
	}

	public List<baseHouse> getBuildingList(String id) {
		return BHDao.buildingList(Long.parseLong(id));
	}

	public List<baseHouse> getRoomList(String id) {
		return BHDao.roomList(Long.parseLong(id));
	}

	public List<PrgInstrumentInfo> getOddDetail(long roomId, String iNSTRUMENT_TYPE) {
		return PIIDao.getOddDetail(roomId,iNSTRUMENT_TYPE);
	}

	public String submitOddAll(PrgCopyForm pCF, PrgMeterReding pMR,String InfoId) throws Exception {
		//保存主表
		int i = PCFDao.insertSelective(pCF);
		if(i>0){
			//保存子表
			PMRDao.insertSelective(pMR);
			//修改仪表信息表的刻度值
			PrgInstrumentInfo PII = new PrgInstrumentInfo();
			PII.setInitialReading(pMR.getScale());//添加新的刻度值
			PII.setId(Long.parseLong(InfoId));
			PIIDao.updateByPrimaryKeySelective(PII);
			return "1";
		}else{
			return "0";
		}
	}

	public List<PrgCopyForm> getMeterredhistory(String copy_name_id) {
		return PCFDao.getMeterredhistory(copy_name_id);
	}

	public List<PrgMeterReding> getMeterReadingDetail(String pid) {
		return PMRDao.getMeterReadingDetail(pid);
	}

	public List<baseHouse> getElementList(String id) {
		return BHDao.getElementList(Long.parseLong(id));
	}

	public List<baseHouse> getFloorList(String id) {
		// TODO Auto-generated method stub
		return BHDao.getFloorList(id);
	}

	public List<PrgCopyForm> getMeterredhistoryLike(String copy_name_id, String stare, String end) {
		// TODO Auto-generated method stub
		return PCFDao.getMeterredhistoryLike(copy_name_id,stare,end);
	}

	public void makeOutBill(PrgCopyForm PCF, PrgMeterReding PMR, String infoId ,String roomId) throws ParseException {
		//主表id
		long id = Long.parseLong(IDUtis.getUUID());
		//保存主表
		RentLeasebill LB = new RentLeasebill();
		LB.setSignLeaseDate(getDate(getStringDate()));//签署日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LB.setPaymentDeadline(sdf.format(PCF.getOpenAccountDate()));//截止日期
		LB.setBillType("1"); //账单类型
		LB.setLeaseBillStatus("0"); //账单状态
		LB.setLeaseholdName(getRoom(roomId ,PCF)); //租赁物名称
		LB.setBillNumber(getSerialCode()); //账单编号
		LB.setPlannedReceiptAmount(PMR.getTotalPrice()); //计划收款金额
		LB.setOpenDate(getStringDate()); //开账日期
		LB.setCustomerName(getHouse(roomId).getCurrentTenant()); //客户姓名
		LB.setCustomerId(Long.parseLong(getHouse(roomId).getCurrentTenantId())); //客户id
		LB.setTenantid(PCF.getTenantid()); //租户id
		LB.setCreatorName(getUser(Long.parseLong(PCF.getCopyNameId())).getName()); //制单人
		LB.setCreatorId(Long.parseLong(PCF.getCopyNameId())); //录入人主键
		LB.setId(id);//设置主键
		LB.setUnpaidAmount(PMR.getTotalPrice());//未付金额
		//保存主表
		int i = RLBDao.insertSelective(LB);
		if(i>0){
			//保存字表
			RentLeaseBillDetail LBD = new RentLeaseBillDetail();
			LBD.setMoneyType("0"); //款项类型（0：物业费；1：违约金；2：租金）
			LBD.setMoneyName(getMoneyName(PCF)); //款项名称
			LBD.setMoneyCorrespondingDate(sdf.format(PCF.getReadingDate())+"-"+sdf.format(PCF.getOpenAccountDate())); //款项对应时间段
			LBD.setPlannedReceiptAmount(PMR.getTotalPrice()); //计划收款金额
			LBD.setBillId(id); //账单主键
			LBD.setOperation("2"); //
			LBD.setTenantid(PCF.getTenantid()); //
			LBD.setCreatorName(getUser(Long.parseLong(PCF.getCopyNameId())).getName()); //创建人
			LBD.setCreatorId(Long.parseLong(PCF.getCopyNameId())); //创建人id
			LBD.setId(Long.parseLong(IDUtis.getUUID()));
			RLBDDao.insertSelective(LBD);
		}
	}
	
	//获取用户
	public RmUser getUser(Long id) {
		return PUserDao.selectByPrimaryKey(id);
	}
	
	
	//获取当前日期
	public String getStringDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String nowDateStr = sdf.format(new Date());
		return nowDateStr;
	}
	
	// String 转为date
	public Date getDate(String str) throws ParseException {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.parse(str);
	}
	
	//获取账单编号
	public String getSerialCode() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYYMMddHHmmss");
		String Code ="ZD";
		Code += dateFormat.format(new Date());
		System.out.println(Code);
		return Code;
	}
	//获取房屋详细名称
	public String getRoom(String roomId ,PrgCopyForm PCF) {
		String roomName="";
		//查询房屋表
		baseHouse house = BHDao.selectByPrimaryKey(Long.parseLong(roomId));
		roomName += house.getCommunityName();
		roomName +="-"+ house.getVillageName();
		roomName += "-"+ house.getBuildingName();
		roomName += "-"+ house.getHouseName();
		roomName += "-"+ house.getUnitNumber();
		roomName += "-"+ house.getFloorNumber();
		if("0".equals(PCF.getInstrumentType()) ){
			roomName += "-(水)";
		}
		if("1".equals(PCF.getInstrumentType()) ){
			roomName += "-(电)";
		}
		if("3".equals(PCF.getInstrumentType()) ){
			roomName += "-(供热)";
		}
		if("2".equals(PCF.getInstrumentType()) ){
			roomName += "-(燃气)";
		}
		return roomName;
		
	}
	
	public baseHouse getHouse(String roomId) {
		return  BHDao.selectByPrimaryKey(Long.parseLong(roomId));
	}
	
	public String getMoneyName(PrgCopyForm PCF){
		String string = "";
		if("0".equals(PCF.getInstrumentType()) ){
			string = "水";
		}
		if("1".equals(PCF.getInstrumentType()) ){
			string = "电";
		}
		if("3".equals(PCF.getInstrumentType()) ){
			string = "供热";
		}
		if("2".equals(PCF.getInstrumentType()) ){
			string = "燃气";
		}
		return string;
	}
	
	
}
