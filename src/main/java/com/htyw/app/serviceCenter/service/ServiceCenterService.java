package com.htyw.app.serviceCenter.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.serviceCenter.dao.ServiceCenterDao;
import com.htyw.app.serviceCenter.pojo.OrderBusinessDraft;
import com.htyw.app.serviceCenter.pojo.ServiceCenter;

@Service
public class ServiceCenterService {

	@Autowired
	private ServiceCenterDao serviceCenterDao;
	
	/**
	 * 
	 * @param serviceCenter
	 * @author lshao
	 * 查询，服务中心
	 */
	public List<ServiceCenter> list(ServiceCenter serviceCenter) {
		return serviceCenterDao.list(serviceCenter);
	}
	
	/**
	 * 
	 * @param serviceCenter
	 * @author lshao
	 * 保存（服务中心、工单保存）
	 */
	public void save(OrderBusinessDraft orderBusinessDraft) {	
		orderBusinessDraft.setId(new Date().getTime());
		serviceCenterDao.save(orderBusinessDraft);
	}
	
	/**
	 * 
	 * @param serviceCenter
	 * @author lshao
	 * 查询，首页服务中心
	 */
	public List<ServiceCenter> homeList(ServiceCenter serviceCenter) {
		return serviceCenterDao.homeList(serviceCenter);
	}

	public String getPhoto(String serviceHeadPhoto) {
		return serviceCenterDao.getPhoto(serviceHeadPhoto);
	}

}
