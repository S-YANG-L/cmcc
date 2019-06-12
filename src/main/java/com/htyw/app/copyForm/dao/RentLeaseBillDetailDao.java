package com.htyw.app.copyForm.dao;

import com.htyw.app.copyForm.pojo.RentLeaseBillDetail;

public interface RentLeaseBillDetailDao {
    int deleteByPrimaryKey(Long id);

    int insert(RentLeaseBillDetail record);

    int insertSelective(RentLeaseBillDetail record);

    RentLeaseBillDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RentLeaseBillDetail record);

    int updateByPrimaryKey(RentLeaseBillDetail record);
}