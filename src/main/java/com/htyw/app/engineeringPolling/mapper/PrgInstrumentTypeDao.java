package com.htyw.app.engineeringPolling.mapper;

import java.util.List;

import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgInstrumentType;

public interface PrgInstrumentTypeDao {
    int deleteByPrimaryKey(Long id);

    int insert(PrgInstrumentType record);

    int insertSelective(PrgInstrumentType record);

    PrgInstrumentType selectByPrimaryKey(Long id);
    
    List<PrgInstrumentType> selectAll ();

    int updateByPrimaryKeySelective(PrgInstrumentType record);

    int updateByPrimaryKey(PrgInstrumentType record);
}