package com.htyw.app.reportGenre.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.reportGenre.dao.ReportGenreDao;
import com.htyw.app.reportGenre.dao.ReportGenreDetailsDao;
import com.htyw.app.reportGenre.pojo.ReportGenre;
import com.htyw.app.reportGenre.pojo.ReportGenreDetails;

@Service
@Transactional
public class ReportGenreService {

	@Autowired
	private ReportGenreDao rGDao;
	@Autowired
	private ReportGenreDetailsDao rGDDao;
	//获取所有的报事类型
	public List<ReportGenre> getAll(String tenantId) {
		return rGDao.getAll(Long.parseLong(tenantId));
	}
	//保存公共报事
	public void save(ReportGenreDetails rGDetails) {
		ReportGenre ReportGenre = rGDao.selectByPrimaryKey(rGDetails.getReportGenreId());
		rGDetails.setReportGenre(ReportGenre.getReportGenre());
		rGDDao.insertSelective(rGDetails);
	}

}
