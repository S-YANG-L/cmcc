package com.htyw.app.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.user.dao.UserMapper;
import com.htyw.app.user.pojo.User;



@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 修改用户信息
	 * @param user：用户信息
	 * @return int：影响行数
	 */
/*	public int updateUser(User user){
		return userMapper.updateByPrimaryKeySelective(user);
	}*/
	
	
	public User selectByPassword(String phone, String password){
		return userMapper.selectByPassword(phone, password);
	}
	
	public User selectByPhone(String phone){
		return userMapper.selectByPhone(phone);
	}
	
	/**
	 * 根据用户ID修改密码
	 * @param id：主键ID
	 * @param password：用户密码
	 * @return int：影响行数
	 */
	public int updatePass(String phone, String password){
		return userMapper.updatePass(password, phone);
	}
	
	/**
	 * 修改用户个人信息
	 */
	public void changeUserInfo(String email, String contactAddress, Long postalCode, String contactNumber) {
		userMapper.changeUserInfo(email,contactAddress,postalCode,contactNumber);
	}
	
	/**
	 * 修改用户个人信息
	 * @param id 
	 */
	public void changeHeadImage(String headImageUrl, Long id) {
		userMapper.change(headImageUrl ,id);
	}
}
