package com.htyw.app.workOrder.dao;

import java.util.List;

import com.htyw.app.workOrder.pojo.WorkOrder;

public interface WorkOrderDao {

	List<WorkOrder> listOrder(WorkOrder workOrder);

	Object save(WorkOrder workOrder);

	List<WorkOrder> listOrderRcd(WorkOrder workOrder);

	String getName(String id);
}