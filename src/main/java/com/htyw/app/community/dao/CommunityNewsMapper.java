package com.htyw.app.community.dao;

import com.htyw.app.community.pojo.CommunityNews;
import com.htyw.app.community.pojo.CommunityNewsExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CommunityNewsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommunityNews record);

    int insertSelective(CommunityNews record);
    
    /**
     * 获取社区信息列表-分页查询
     * @param community_id：社区ID
     * @param type：消息类型
     * @param page：当前页
     * @param size：当前页几条数据
     * @return	List<CommunityNews>：信息列表
     */
    List<CommunityNews> getCommunityBulletin(CommunityNews CommunityNews);

    /**
     * 根据ID获取信息详情
     * @param id：主键ID
     * @return	CommunityNews：详情信息
     */
    CommunityNews getCommunityDetail(Long id);
    
    List<CommunityNews> selectByExample(CommunityNewsExample example);

    CommunityNews selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommunityNews record);

    int updateByPrimaryKey(CommunityNews record);

	String getPhoto(String image);
}