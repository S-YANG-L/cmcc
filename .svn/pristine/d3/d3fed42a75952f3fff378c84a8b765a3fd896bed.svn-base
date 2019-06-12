package com.htyw.app.serviceCenter.dao;

import java.util.List;

import com.htyw.app.serviceCenter.pojo.ServerNotice;
import com.htyw.app.serviceCenter.pojo.ServerNoticeExample;

public interface ServerNoticeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ServerNotice record);

    int insertSelective(ServerNotice record);

    List<ServerNotice> selectByExample(ServerNoticeExample example);

    ServerNotice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ServerNotice record);

    int updateByPrimaryKey(ServerNotice record);
    
    /**
     * 根据租户ID查询服务通知
     * @param tenantid
     * @return
     */
    List<ServerNotice> queryByTenantId(Long tenantid);
}