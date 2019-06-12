package com.htyw.app.user.dao;

import com.htyw.app.user.pojo.User;
import com.htyw.app.user.pojo.UserExample;
import com.htyw.app.user.pojo.UserKey;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(UserKey key);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(UserKey key);
    
    User selectByPassword(String phone, String password);
    
    User selectByPhone(String phone);
    
    int updatePass(String phone, String password);
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	void changeUserInfo(String email, String contactAddress, Long postalCode, String contactNumber);

	void change(String headImageUrl, Long id);
}