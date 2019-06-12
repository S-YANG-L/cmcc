package com.htyw.app.insideInformation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.insideInformation.dao.PrgInternalNotificationDao;
import com.htyw.app.insideInformation.pojo.PrgInternalNotification;

@Service
@Transactional
public class insideInformationService {
	
	@Autowired
	private PrgInternalNotificationDao  PINDao;
	//服务消息
	public List<PrgInternalNotification> serveDetails(String rmUserId, String tenantId ,String state ,String headline) {
			String string="%"+headline+"%" ;
		if ("1".equals(state)) {
			return PINDao.serveDetails(rmUserId, tenantId ,string);
		}else{
			return PINDao.messageDetails(rmUserId, tenantId ,string);
		}
		
	}
	//详细的服务信息
	public PrgInternalNotification serveMessageDetails(String id) {
		//PrgInternalNotification PIN = new PrgInternalNotification();
		//PIN.setId(Long.parseLong(id));
		//PIN.setState("1");
		PINDao.updateState(Long.parseLong(id));
		return PINDao.selectByPrimaryKey(Long.parseLong(id));
	}
	
	public String getserveNumber(String rmUserId, String tenantId) {
		return String.valueOf(PINDao.getserveNumber(rmUserId,tenantId).size());
	}
	public String getmessageNumber(String rmUserId, String tenantId) {
		return String.valueOf(PINDao.getmessageNumber(rmUserId,tenantId).size());
	}

}
