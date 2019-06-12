package com.htyw.app.engineeringPolling.mapper;

import java.util.List;

import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgInstrumentInfo;

public interface PrgInstrumentInfoDao {
    int deleteByPrimaryKey(Long id);

    int insert(PrgInstrumentInfo record);

    int insertSelective(PrgInstrumentInfo record);

    PrgInstrumentInfo selectByPrimaryKey(Long id);
    
    PrgInstrumentInfo getParticulars(Long housingResourcesId , Long instrumentTypeId);

    int updateByPrimaryKeySelective(PrgInstrumentInfo record);

    int updateByPrimaryKey(PrgInstrumentInfo record);

    String getExamineTime(long roomId, long meterGenre);

	List<PrgInstrumentInfo> getOddDetail(long roomId, String iNSTRUMENT_TYPE);
}