package com.htyw.app.community.dao;

import com.htyw.app.community.pojo.CommunityYpages;
import com.htyw.app.community.pojo.CommunityYpagesExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CommunityYpagesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommunityYpages record);

    int insertSelective(CommunityYpages record);

    List<CommunityYpages> selectByExample(CommunityYpagesExample example);

    /**
     * 根据主键ID查询社区黄页信息
     * @param id：主键ID
     * @return CommunityYpages：社区黄页信息
     */
    CommunityYpages selectByPrimaryKey(Long id);
    
    /**
     * 获取社区黄页信息列表
     * @param community_id：社区ID
     * @return List<CommunityYpages>：社区黄页信息列表
     */
    List<CommunityYpages> getCommunityYpages(CommunityYpages communityYpages);

    int updateByPrimaryKeySelective(CommunityYpages record);

    int updateByPrimaryKey(CommunityYpages record);

	String getPhoto(String image);
	
	
	
	
	
}