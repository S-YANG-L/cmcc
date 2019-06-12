package com.htyw.app.community.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.community.dao.CommunityNewsMapper;
import com.htyw.app.community.pojo.CommunityNews;



@Service
public class CommunityNewsService {

	@Autowired
	private CommunityNewsMapper communityNewsMapper;
	
	  
    /**
     * 获取社区信息列表-分页查询
     * @param community_id：社区ID
     * @param type：消息类型
     * @param page：当前页
     * @param size：当前页几条数据
     * @return	List<CommunityNews>：信息列表
     */
	public List<CommunityNews>  getCommunityBulletin(CommunityNews communityNews){
		return communityNewsMapper.getCommunityBulletin(communityNews);
	}
	

    /**
     * 根据ID获取信息详情
     * @param id：主键ID
     * @return	CommunityNews：详情信息
     */
	public CommunityNews getCommunityDetail(Long id){
		return communityNewsMapper.getCommunityDetail(id);
	}


	public String getPhoto(String image) {
		return communityNewsMapper.getPhoto(image);
	}
}
