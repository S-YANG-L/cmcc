package com.htyw.app.order.dao;

import java.util.List;

import com.htyw.app.order.pojo.OrderBusinessDraft;

public interface OrderBusinessDraftDao {
    int deleteByPrimaryKey(Long id);

    int insert(OrderBusinessDraft record);

    int insertSelective(OrderBusinessDraft record);

    OrderBusinessDraft selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderBusinessDraft record);

    int updateByPrimaryKey(OrderBusinessDraft record);
    
    List<OrderBusinessDraft> selectBacklog(Long singleId , Long tenantid);
    
    List<OrderBusinessDraft> GetHaveFinished(Long singleId , Long tenantid);
    
    List<OrderBusinessDraft> getRefusing(Long singleId , Long tenantid);
    
    List<OrderBusinessDraft> obscure(Long singleId , Long tenantid ,String orderContentLike);
    
    List<OrderBusinessDraft> selectTakeOrders(Long singleId , Long tenantid);
    
    List<OrderBusinessDraft> selectAccomplish(Long singleId , Long tenantid);

	List<OrderBusinessDraft> takeOrders(long parseLong, long parseLong2, String orderContentLike);

	List<OrderBusinessDraft> endOrders(long parseLong, long parseLong2, String orderContentLike);

	List<OrderBusinessDraft> refuseOrders(long parseLong, long parseLong2, String orderContentLike);

	

}