package com.htyw.app.pollingDetails.dao;

import java.util.List;

import com.htyw.app.pollingDetails.pojo.PrgDecorationRegMiddle;
import com.htyw.app.pollingDetails.pojo.PrgInspectionManaMiddle;

public interface PrgInspectionManaMiddleDao {
    int deleteByPrimaryKey(Long id);

    int insert(PrgInspectionManaMiddle record);

    int insertSelective(PrgInspectionManaMiddle record);

    PrgInspectionManaMiddle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrgInspectionManaMiddle record);

    int updateByPrimaryKey(PrgInspectionManaMiddle record);

	List<PrgInspectionManaMiddle> inspectionMana(String parseLong);
}