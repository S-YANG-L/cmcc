package com.htyw.app.engineeringPolling.service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.engineeringPolling.mapper.CopyFormMapper;
import com.htyw.app.engineeringPolling.mapper.PrgCopyFormDao;
import com.htyw.app.engineeringPolling.mapper.PrgInstrumentInfoDao;
import com.htyw.app.engineeringPolling.mapper.PrgInstrumentTypeDao;
import com.htyw.app.engineeringPolling.mapper.PrgMeterRedingDao;
import com.htyw.app.engineeringPolling.mapper.baseCommunityDao;
import com.htyw.app.engineeringPolling.mapper.baseHouseDao;
import com.htyw.app.engineeringPolling.pojo.CopyForm.CopyForm;
import com.htyw.app.engineeringPolling.pojo.CopyForm.CopyFormRecord;
import com.htyw.app.engineeringPolling.pojo.CopyForm.CopyFormType;
import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgCopyForm;
import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgInstrumentInfo;
import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgInstrumentType;
import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgMeterReding;
import com.htyw.app.engineeringPolling.pojo.baseCommunity.baseCommunity;
import com.htyw.app.engineeringPolling.pojo.baseCommunity.baseHouse;
import com.htyw.app.utils.IDUtis;

@Service
public class CopyFormService {
    @Autowired
    private CopyFormMapper copyFormMapper;
    @Autowired
	private baseCommunityDao commDao;
    @Autowired
    private baseHouseDao houseDao;
    @Autowired
    private PrgInstrumentTypeDao inTypeDao;
    @Autowired
    private PrgInstrumentInfoDao infoDao;
    @Autowired
    private PrgCopyFormDao formDao;
    @Autowired
    private PrgMeterRedingDao RedingDao ;
    
    public List<CopyFormType> copyList(){
        return  copyFormMapper.copyList();
    }
    public List<CopyFormRecord> record(String roomId){
        return  copyFormMapper.record(Long.parseLong(roomId));
    }
    public void save(CopyForm copyForm){
        copyFormMapper.save(copyForm);
    }
    //获取社区
	public List<baseCommunity> communityList(String tenantId) {
		return commDao.communityList(Long.parseLong(tenantId));
	}
	//获取小去
	public List<baseHouse> villageList(String id) {
		return houseDao.villageList(Long.parseLong(id));
	}
	//获取楼栋
	public List<baseHouse> buildingList(String id) {
		return houseDao.buildingList(Long.parseLong(id));
	}
	//获取房间
	public List<baseHouse> roomList(String id) {
		return houseDao.roomList(Long.parseLong(id));
	}
	
	/*//获取详细的房间上月度数
	public  PrgCopyForm writeBack(String roomId) {
		//获取仪表类型
		//inTypeDao
		return null;
	}*/
	//回写仪表类型
	public List<PrgInstrumentType> writeBackMeterGenre() {
		List<PrgInstrumentType> selectAll = inTypeDao.selectAll();
		System.out.println(selectAll);
		return selectAll;
	}
	//通过房屋id和仪表类型id查询上次刻度
	public PrgInstrumentInfo getParticulars(long roomId, long meterGenre) {
		PrgInstrumentInfo particulars = infoDao.getParticulars(roomId, meterGenre);
		return particulars;
	}
	public String getExamineTime(long roomId, long meterGenre) {
		return infoDao.getExamineTime(roomId, meterGenre);
	}
	public void submitAll(String roomId, String tenantId, String instrumentType, String meterGenre,
			String initialReadingHistory, String practical, String isOpenAccount ,String meterGenreID) throws ParseException {
		//保存主表
		long copyFormID = Long.parseLong(IDUtis.getUUID());
		PrgCopyForm copyForm = new PrgCopyForm();
		copyForm.setId(copyFormID);
		copyForm.setReadingNum( GetReadingNum());
		copyForm.setReadingDate(GetNowYue());
		copyForm.setIsOpenAccount(isOpenAccount);
		copyForm.setInstrumentTypeId(Long.parseLong(meterGenreID));
		copyForm.setInstrumentType(instrumentType);
		copyForm.setTenantid(Long.parseLong(tenantId));
		copyForm.setReceiptsName(instrumentType);
		int insert = formDao.insert(copyForm);
		if (insert>0) {
			//保存抄表详情
			PrgMeterReding prgMeterReding = new PrgMeterReding();
			prgMeterReding.setId(Long.parseLong(IDUtis.getUUID()));
			prgMeterReding.setParentId(copyFormID);
			prgMeterReding.setInstrumentNumber(meterGenreID);
			prgMeterReding.setScale(Double.valueOf(initialReadingHistory));
			prgMeterReding.setInstrumentName(meterGenre);
			prgMeterReding.setTenantid(Long.parseLong(tenantId));
			int i = RedingDao.insert(prgMeterReding);
			if(i>0){
				//保存仪表信息
				PrgInstrumentInfo prgInstrumentInfo = new PrgInstrumentInfo();
				prgInstrumentInfo.setId(Long.parseLong(IDUtis.getUUID()));
				prgInstrumentInfo.setInstrumentNumber(meterGenreID);
				prgInstrumentInfo.setInstrumentName(meterGenre);
				prgInstrumentInfo.setHousingResourcesId(Long.parseLong(roomId));
				prgInstrumentInfo.setInitialReadingHistory(Double.valueOf(initialReadingHistory));
				prgInstrumentInfo.setInitialReading(Double.valueOf(practical));
				prgInstrumentInfo.setTenantid(Long.parseLong(tenantId));
				infoDao.insert(prgInstrumentInfo);
			}
		}
		
	}
	
	
	public String GetReadingNum() {
		return "CBD"+IDUtis.getUUID();
	}
	
	// 获取详细月
		public Date GetNowYue() throws ParseException {
			String temp_str = "";
			Date dt = new Date();
			// 最后的aa表示“上午”或“下午” HH表示24小时制 如果换成hh表示12小时制
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			temp_str = sdf.format(dt);
			
			return sdf.parse(temp_str);
		}
	
}
