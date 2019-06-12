package com.htyw.app.engineeringPolling.mapper;

import java.util.List;

import com.htyw.app.engineeringPolling.pojo.PrgInspectionReport;

public interface PrgInspectionReportDao {
    int deleteByPrimaryKey(Long id);

    int insert(PrgInspectionReport record);

    int insertSelective(PrgInspectionReport record);

    PrgInspectionReport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrgInspectionReport record);

    int updateByPrimaryKey(PrgInspectionReport record);

	List<PrgInspectionReport> getReportDetail(String objectId, String inspectionID, String userId);
}