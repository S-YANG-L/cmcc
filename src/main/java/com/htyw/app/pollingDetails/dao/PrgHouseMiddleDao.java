package com.htyw.app.pollingDetails.dao;

import java.util.List;

import com.htyw.app.pollingDetails.pojo.PrgHouseMiddle;

public interface PrgHouseMiddleDao {
    int deleteByPrimaryKey(Long id);

    int insert(PrgHouseMiddle record);

    int insertSelective(PrgHouseMiddle record);

    PrgHouseMiddle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrgHouseMiddle record);

    int updateByPrimaryKey(PrgHouseMiddle record);

	List<PrgHouseMiddle> houseOff(String parentId);
}