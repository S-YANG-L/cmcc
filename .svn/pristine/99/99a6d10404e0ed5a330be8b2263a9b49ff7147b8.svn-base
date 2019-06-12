package com.htyw.app.serviceCenter.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.serviceCenter.pojo.ServerNotice;
import com.htyw.app.serviceCenter.service.ServerNoticeService;

@RestController
@RequestMapping("serverNotice")
public class ServerNoticeController {

	@Autowired
	private ServerNoticeService serverNoticeService;
	
	
	
	/**
     * 根据租户ID查询服务通知
     * @param tenantid
     * @return
     */
	@RequestMapping(value = "queryList", method = RequestMethod.POST)
	public Map<String, Object> queryByTenantId(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		Long tenantid = Long.valueOf(request.getParameter("tenantid"));
		
		try {
			List<ServerNotice> list = serverNoticeService.queryByTenantId(tenantid);
			if(list.size() > 0){
				for (ServerNotice sn : list) {
					String ss = sn.getId() +"";
					sn.setSid(ss);
				}
				result.put("list", list);
				result.put("code", 200);
				result.put("message", "success!");	
			}else{
				result.put("code", 201);
				result.put("message", "failed");
			}
		} catch (Exception e) {
			result.put("code", 201);
			result.put("message", "failed");
			e.printStackTrace();
		}
		return result;
	}
	
	/**
     * 根据租户ID查询服务通知
     * @param tenantid
     * @return
     */
	@RequestMapping(value = "queryById", method = RequestMethod.POST)
	public Map<String, Object> selectByPrimaryKey(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		Long id = Long.valueOf(request.getParameter("id"));
		
		try {
			ServerNotice serverNotice = serverNoticeService.selectByPrimaryKey(id);
			if(null != serverNotice){
				result.put("list", serverNotice);
				result.put("code", 200);
				result.put("message", "success!");	
			}else{
				result.put("code", 201);
				result.put("message", "failed");
			}
		} catch (Exception e) {
			result.put("code", 201);
			result.put("message", "failed");
			e.printStackTrace();
		}
		return result;
	}
	
	
}
