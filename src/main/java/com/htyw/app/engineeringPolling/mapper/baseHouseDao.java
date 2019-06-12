package com.htyw.app.engineeringPolling.mapper;

import java.util.List;

import com.htyw.app.engineeringPolling.pojo.baseCommunity.baseHouse;

public interface baseHouseDao {
    int deleteByPrimaryKey(Long id);

    int insert(baseHouse record);

    int insertSelective(baseHouse record);

    baseHouse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(baseHouse record);

    int updateByPrimaryKey(baseHouse record);
    
    List<baseHouse> villageList(Long id);

	List<baseHouse> buildingList(long parseLong);

	List<baseHouse> roomList(long parseLong);

	List<baseHouse> getCommunityList(long parseLong);

	List<baseHouse> getElementList(long parseLong);

	List<baseHouse> getFloorList(String id);

}