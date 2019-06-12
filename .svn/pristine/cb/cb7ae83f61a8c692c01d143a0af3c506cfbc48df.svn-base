package com.htyw.app.notice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.notice.dao.NoticeDao;
import com.htyw.app.notice.pojo.Notice;

@Transactional
@Service
public class NoticeService {
	@Autowired
	private NoticeDao NoticeDao;

	public List<Notice> listNotice(Notice notice) {
		return NoticeDao.listNotice(notice);
	}

	public void saveNotice(Notice notice) {
		NoticeDao.saveNotice(notice);

	}

}
