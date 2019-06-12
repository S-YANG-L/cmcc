package com.htyw.app.community.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.community.dao.CommunityYpagesMapper;
import com.htyw.app.community.pojo.CommunityYpages;



@Service
public class CommunityYpagesService {

	@Autowired
	private CommunityYpagesMapper communityYpagesMapper;
	
	  /**
     * 根据主键ID查询社区黄页信息
     * @param id：主键ID
     * @return CommunityYpages：社区黄页信息
     */
    public CommunityYpages selectByPrimaryKey(Long id){
    	return communityYpagesMapper.selectByPrimaryKey(id);
    }
    
    /**
     * 获取社区黄页信息列表
     * @param community_id：社区ID
     * @param page：当前页
     * @param size：一页多少条
     * @return List<CommunityYpages>：社区黄页信息列表
     */
    public List<CommunityYpages> getCommunityYpages(CommunityYpages communityYpages){
    	return communityYpagesMapper.getCommunityYpages(communityYpages);
    }

	public String getPhoto(String image) {
		return communityYpagesMapper.getPhoto(image);
	}
}
