package com.htyw.app.serviceCenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.serviceCenter.dao.ServerNoticeMapper;
import com.htyw.app.serviceCenter.pojo.ServerNotice;



@Service
public class ServerNoticeService {

	@Autowired
	private ServerNoticeMapper serverNoticeMapper;
	
	/**
     * 根据租户ID查询服务通知
     * @param tenantid
     * @return
     */
	public List<ServerNotice> queryByTenantId(Long tenantid){
		return serverNoticeMapper.queryByTenantId(tenantid);
	}
	/**
     * 根据租户ID查询服务通知
     * @param tenantid
     * @return
     */
	public ServerNotice selectByPrimaryKey(Long id){
		return serverNoticeMapper.selectByPrimaryKey(id);
	}
}
