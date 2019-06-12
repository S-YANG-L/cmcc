package com.htyw.app.houseLeasing.dao;

import com.htyw.app.houseLeasing.pojo.Visitor;
import com.htyw.app.houseLeasing.pojo.VisitorExample;

import java.util.List;

public interface VisitorMapper {
    int deleteByPrimaryKey(Long id);

   
    int insert(Visitor record);

    /**
     * 新增访客信息
     * @param record：访客信息
     * @return	int：影响行数
     */
    int insertSelective(Visitor record);

	/**
	 * 根据主键ID获取访客详情信息
	 * @param id 主键ID
	 * @return
	 */
    Visitor getVisitorById(String id);
    
    /**
	 * 获取访客列表信息
	 * @return 访客列表
	 */
    List<Visitor> visitorList(/*String page, String size*/);
    
    
    List<Visitor> selectByExample(VisitorExample example);

    Visitor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Visitor record);

    int updateByPrimaryKey(Visitor record);

	List<Visitor> aList(Visitor visitor);

	List<Visitor> bList(Visitor visitor);

	int updateAgreeStatus(Visitor visitor);

	int updateDisagreeStatus(Visitor visitor);

	List<Visitor> phoneList(Visitor visitor);
    
}