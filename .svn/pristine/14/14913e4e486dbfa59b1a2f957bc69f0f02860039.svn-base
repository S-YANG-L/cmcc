package com.htyw.app.community.dao;

import com.htyw.app.community.pojo.CommunityNote;
import com.htyw.app.community.pojo.CommunityNoteExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CommunityNoteMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommunityNote record);

    int insertSelective(CommunityNote record);

    List<CommunityNote> selectByExample(CommunityNoteExample example);

    /**
     * 获取社区公告列表
     * @return	社区公告列表
     */
    List<Map> getNoteList(@Param("id")Long id, @Param("stype")String stype,@Param("dstart") Date dstart,@Param("dend") Date dend);
    
   CommunityNote selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommunityNote record);

    int updateByPrimaryKey(CommunityNote record);
    
    int updateState(String state, Long id);
    
    /**
	 * 根据ID获取未读消息数量
	 * @param request
	 * @param response
	 * @return
	 */
    int getNum(Long id, String stype);
}