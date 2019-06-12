package com.htyw.app.insideInformation.dao;

import java.util.List;

import com.htyw.app.insideInformation.pojo.PrgInternalNotification;

public interface PrgInternalNotificationDao {
    int deleteByPrimaryKey(Long id);

    int insert(PrgInternalNotification record);

    int insertSelective(PrgInternalNotification record);

    PrgInternalNotification selectByPrimaryKey(Long id);
    List<PrgInternalNotification> serveDetails(String rmUserId, String tenantid ,String headline);
    List<PrgInternalNotification> messageDetails(String rmUserId, String tenantid ,String headline);

    int updateByPrimaryKeySelective(PrgInternalNotification record);

    int updateByPrimaryKey(PrgInternalNotification record);

    List<PrgInternalNotification> getserveNumber(String rmUserId, String tenantId);

	List<PrgInternalNotification> getmessageNumber(String rmUserId, String tenantId);

	void updateState(long parseLong);
}