package com.htyw.app.engineeringPolling.mapper;

import java.util.List;

import com.htyw.app.engineeringPolling.pojo.baseCommunity.baseCommunity;

public interface baseCommunityDao {
    int deleteByPrimaryKey(Long id);

    int insert(baseCommunity record);

    int insertSelective(baseCommunity record);

    baseCommunity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(baseCommunity record);

    int updateByPrimaryKey(baseCommunity record);
    
    List<baseCommunity> communityList(Long tenantId);
}