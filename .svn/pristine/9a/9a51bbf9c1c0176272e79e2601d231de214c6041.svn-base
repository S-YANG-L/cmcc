package com.htyw.app.community.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.community.dao.CommunityNoteMapper;
import com.htyw.app.community.pojo.CommunityNote;



@Service
public class CommunityNoteService {

	@Autowired
	private CommunityNoteMapper communityNoteMapper;
	
	  
	/**
     * 获取社区公告列表
     * @return	社区公告列表
     */
	public List<Map>  getNoteList(Long id, String stype, Date dstart, Date dend){
		return  communityNoteMapper.getNoteList(id, stype, dstart, dend);
	}
	

    /**
     * 根据ID获取信息详情
     * @param id：主键ID
     * @return	CommunityNews：详情信息
     */
	public CommunityNote getCommunityDetail(Long id){
		return communityNoteMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * 根据ID修改未读状态
	 * @param state
	 * @param id
	 * @return
	 */
	public int updateState(String state, Long id){
		return communityNoteMapper.updateState(state, id);
	}
	
	/**
	 * 根据ID获取未读消息数量
	 * @param request
	 * @param response
	 * @return
	 */
	public int getNum(Long id, String stype){
		return  communityNoteMapper.getNum(id, stype);
	}
	
}
