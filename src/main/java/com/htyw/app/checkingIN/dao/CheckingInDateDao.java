package com.htyw.app.checkingIN.dao;

import com.htyw.app.checkingIN.pojo.CheckingInDate;
import com.htyw.app.checkingIN.pojo.CheckingInDateExample;
import java.util.List;

public interface CheckingInDateDao {
    int deleteByPrimaryKey(Long id);

    int insert(CheckingInDate record);

    int insertSelective(CheckingInDate record);

    List<CheckingInDate> selectByExample(CheckingInDateExample example);

    CheckingInDate selectByPrimaryKey(Long id);
    
    CheckingInDate selectByDate(String referenceDate);

    int updateByPrimaryKeySelective(CheckingInDate record);

    int updateByPrimaryKey(CheckingInDate record);
}