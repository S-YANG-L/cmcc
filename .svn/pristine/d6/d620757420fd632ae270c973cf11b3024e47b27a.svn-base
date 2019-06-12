package com.htyw.app.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.user.dao.RmUserDao;
import com.htyw.app.user.pojo.RmUser;



@Service
public class CustodianService {

	@Autowired
	private RmUserDao userDao;
	
	/**
	 * 修改用户信息
	 * @param user：用户信息
	 * @return int：影响行数
	 */
/*	public int updateUser(User user){
		return userMapper.updateByPrimaryKeySelective(user);
	}*/
	
	//获取用户名密码
	public RmUser selectByPassword(String account, String password){
		return userDao.selectByPassword(account, password);
	}

	//获取单个用户
	public RmUser getUser(long id) {
		return userDao.getUser(id);
	}

	public int updatePass(String loginId, String endPassword) {
		return userDao.updatePass(loginId, endPassword);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
