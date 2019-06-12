package com.htyw.app.reportGenre.dao;

import java.util.List;

import com.htyw.app.reportGenre.pojo.ReportGenre;

public interface ReportGenreDao {
    int deleteByPrimaryKey(Long id);

    int insert(ReportGenre record);

    int insertSelective(ReportGenre record);

    ReportGenre selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReportGenre record);

    int updateByPrimaryKey(ReportGenre record);

	List<ReportGenre> getAll(long parseLong);
}