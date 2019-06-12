package com.htyw.app.houseLeasing.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.houseLeasing.dao.HouseBaseInfoDao;
import com.htyw.app.houseLeasing.dao.HouseLeasingDao;
import com.htyw.app.houseLeasing.pojo.HouseLeasing;
import com.htyw.app.houseLeasing.pojo.LookingRequest;

@Service
public class HouseLeasingService {

	@Autowired
	private HouseLeasingDao houseLeasingDao;
	@Autowired
	private HouseBaseInfoDao houseBaseInfoDao;
	
	/**
	 * 
	 * @param houseLeasing
	 * @author lshao
	 * 获取房屋租赁列表
	 */
	public List<HouseLeasing> houseList(HouseLeasing houseLeasing) {
		return houseLeasingDao.houseList(houseLeasing);
	}

	/**
	 * 
	 * @param houseLeasing
	 * @author lshao
	 * 预约看房申请提交
	 */
	public void saveApplication(LookingRequest lookingRequest) {
		houseLeasingDao.saveApplication(lookingRequest);
	}
	
	/**
	 * 
	 * @author lshao
	 * 查询社区
	 */
	public List<HouseLeasing> sheQuList(String id) {
		return houseBaseInfoDao.sheQuList(Long.parseLong(id));
	}
	
	/**
	 * 
	 * @author lshao
	 * 查询小区
	 */
	public List<HouseLeasing> xiaoQuList(String vId) {
		return houseBaseInfoDao.xiaoQuList(Long.parseLong(vId));
	}
	
	/**
	 * 
	 * @author lshao
	 * 查询楼栋
	 */
	public List<HouseLeasing> louDongList(String bId) {
		return houseBaseInfoDao.louDongList(Long.parseLong(bId));
	}
	
	/**
	 * 
	 * @author lshao
	 * 查询类型
	 */
	public List<HouseLeasing> leiXingList(String aId) {
		return houseBaseInfoDao.leiXingList(Long.parseLong(aId));
	}

	public String getPhoto(String apartmentPhoto) {
		return houseLeasingDao.getPhoto(apartmentPhoto);
	}



}
