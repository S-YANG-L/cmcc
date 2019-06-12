package com.htyw.app.houseLeasing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.houseLeasing.dao.VisitorMapper;
import com.htyw.app.houseLeasing.pojo.Visitor;


@Service
public class VisitorService {

	@Autowired
	private VisitorMapper VisitorMapper;
	
	/**
	 * 获取访客列表信息
	 * @return 访客列表
	 */
	public List<Visitor> visitorList(/*String page, String size*/){
		return VisitorMapper.visitorList();
	}
	
	/**
	 * 根据主键ID获取访客详情信息
	 * @param id 主键ID
	 * @return Visitor:访客详情信息
	 */
	public Visitor getVisitorById(String id){
		return VisitorMapper.getVisitorById(id);
	}
	
	/**
	 * 新增访客信息
	 * @param Visitoror 访客信息
	 * @return  int：影响行数
	 */
	public int addVisotor(Visitor Visitor){
		return VisitorMapper.insertSelective(Visitor);
	}
	
	/**
	 * 我的访客--查我的申请
	 * @param visitor
	 * @return
	 */
	public List<Visitor> applicationList(Visitor visitor) {
		return VisitorMapper.aList(visitor);
	}

	/**
	 * 我的访客--查我的访客
	 * @param visitor
	 * @return
	 */
	public List<Visitor> myVisitorList(Visitor visitor) {
		return VisitorMapper.bList(visitor);
	}

	public int updateInfo(Visitor visitor) {
		return VisitorMapper.updateAgreeStatus(visitor);
		
	}

	public int updateDisInfo(Visitor visitor) {
		return VisitorMapper.updateDisagreeStatus(visitor);
		
	}

	public List<Visitor> phone(Visitor visitor) {
		return VisitorMapper.phoneList(visitor);
	}
	
}
