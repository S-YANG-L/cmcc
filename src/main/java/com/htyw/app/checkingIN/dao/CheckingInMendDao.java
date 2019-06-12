package com.htyw.app.checkingIN.dao;

import com.htyw.app.checkingIN.pojo.CheckingInMend;
import com.htyw.app.checkingIN.pojo.CheckingInMendExample;
import java.util.List;

public interface CheckingInMendDao {
    int deleteByPrimaryKey(Long id);

    int insert(CheckingInMend record);

    int insertSelective(CheckingInMend record);

    List<CheckingInMend> selectByExample(CheckingInMendExample example);

    CheckingInMend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckingInMend record);

    int updateByPrimaryKey(CheckingInMend record);
}