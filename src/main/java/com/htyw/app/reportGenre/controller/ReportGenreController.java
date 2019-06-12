package com.htyw.app.reportGenre.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.reportGenre.pojo.ReportGenre;
import com.htyw.app.reportGenre.pojo.ReportGenreDetails;
import com.htyw.app.reportGenre.service.ReportGenreService;
import com.htyw.app.utils.IDUtis;

@RestController
@RequestMapping("/reportGenre")
public class ReportGenreController {

	@Autowired
	private ReportGenreService rGService;
	
	//获取报事类型
	@RequestMapping(value="type" , method = RequestMethod.POST)
    public Map<String, Object> singleInspection( HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String tenantId = request.getParameter("tenantId");
			List<ReportGenre> rGList = rGService.getAll(tenantId);
			ArrayList<ReportGenre> reList = new ArrayList<ReportGenre>();
			for (ReportGenre reportGenre : rGList) {
				reportGenre.setStrid(String.valueOf(reportGenre.getId()));
				reList.add(reportGenre);
			}
			result.put("rGList", reList);
			result.put("code", "200");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "系统开小差了请稍后重试");
			return result;
		}
	}
    	
	//保存
		@RequestMapping(value="save" , method = RequestMethod.POST)
	    public Map<String, Object> save( HttpServletRequest request, HttpServletResponse response) {
			Map<String, Object> result = new HashMap<String, Object>();
			try {
				ReportGenreDetails rGDetails = new ReportGenreDetails();
				rGDetails.setTenantid (Long.parseLong(request.getParameter("tenantId")));
				rGDetails.setId(Long.parseLong(IDUtis.getUUID()));
				rGDetails.setReportGenreId(Long.parseLong(request.getParameter("typeSelect")));
				rGDetails.setReportName(request.getParameter("name"));
				rGDetails.setReportTime(request.getParameter("time"));
				rGDetails.setSite(request.getParameter("site"));
				rGDetails.setDetails(request.getParameter("details"));
				rGDetails.setPicture(request.getParameter("picture"));
				rGService.save(rGDetails);
				result.put("code", "200");
				return result;
			} catch (Exception e) {
				e.printStackTrace();
				result.put("code", "201");
				result.put("message", "系统开小差了请稍后重试");
				return result;
			}
		}
			
	
	
	
	
}
