package com.htyw.app.pollingDetails.dao;

import java.util.List;

import com.htyw.app.pollingDetails.pojo.PrgDecorationRegMiddle;

public interface PrgDecorationRegMiddleDao {
    int deleteByPrimaryKey(Long id);

    int insert(PrgDecorationRegMiddle record);

    int insertSelective(PrgDecorationRegMiddle record);

    PrgDecorationRegMiddle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrgDecorationRegMiddle record);

    int updateByPrimaryKey(PrgDecorationRegMiddle record);

	List<PrgDecorationRegMiddle> decorationReg(String parseLong);
}