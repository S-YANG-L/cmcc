package com.htyw.app.pollingDetails.dao;

import java.util.List;

import com.htyw.app.pollingDetails.pojo.PrgDeviceManagementMiddle;

public interface PrgDeviceManagementMiddleDao {
    int deleteByPrimaryKey(String id);

    int insert(PrgDeviceManagementMiddle record);

    int insertSelective(PrgDeviceManagementMiddle record);

    PrgDeviceManagementMiddle selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PrgDeviceManagementMiddle record);

    int updateByPrimaryKey(PrgDeviceManagementMiddle record);

    //获取单个设备
	List<PrgDeviceManagementMiddle> getByparentId(String parentId);

}