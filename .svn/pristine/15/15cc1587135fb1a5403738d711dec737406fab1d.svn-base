package com.htyw.app.notice.controller;

/*
 * 通知模块
 * 
 * 
 * */
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.htyw.app.notice.pojo.Notice;
import com.htyw.app.notice.service.NoticeService;
import com.htyw.app.utils.IDUtis;
import com.htyw.app.utils.Page;
import com.htyw.app.workOrder.service.WorkOrderService;

// 告诉spring mvc这是个控制器
@RestController
@RequestMapping("notice")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	@Autowired
	private WorkOrderService workOrderService;

	@RequestMapping("listNotice")
	public Map<String, Object> listNotice(Notice notice, Page page, HttpServletRequest request,
			HttpServletResponse response) throws Exception, ServletException, IOException {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			PageHelper.offsetPage(page.getStart(), 10);
			List<Notice> listNotice = noticeService.listNotice(notice);
			int total = (int) new PageInfo<>(listNotice).getTotal();
			page.caculateLast(total);
			result.put("listNotice", listNotice);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	@RequestMapping("saveNotice")
	public Map<String, Object> saveNotice(Notice notice) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String name = workOrderService.getName(notice.getRmUserId());
			notice.setReleaseScope(name);
			String uuid = IDUtis.getUUID();
			notice.setId(uuid);
			notice.setDr("0");
			noticeService.saveNotice(notice);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "fail");
		}
		return result;
	}
}
