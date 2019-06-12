package com.htyw.app.user.dao;

import com.htyw.app.user.pojo.RmUser;

public interface RmUserDao {
    int deleteByPrimaryKey(Long id);

    int insert(RmUser record);

    int insertSelective(RmUser record);

    RmUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RmUser record);

    int updateByPrimaryKey(RmUser record);
    
    RmUser selectByPassword(String account, String password);

	RmUser getUser(long id);

	int updatePass(String loginId, String endPassword);
}