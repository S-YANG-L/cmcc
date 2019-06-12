package com.htyw.app.reportGenre.dao;

import com.htyw.app.reportGenre.pojo.ReportGenreDetails;

public interface ReportGenreDetailsDao {
    int deleteByPrimaryKey(Long id);

    int insert(ReportGenreDetails record);

    int insertSelective(ReportGenreDetails record);

    ReportGenreDetails selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReportGenreDetails record);

    int updateByPrimaryKey(ReportGenreDetails record);
}