package com.htyw.app.workOrder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.workOrder.dao.WorkOrderDao;
import com.htyw.app.workOrder.pojo.WorkOrder;

@Transactional
@Service
public class WorkOrderService {
	@Autowired
	private WorkOrderDao workOrderDao;

	public List<WorkOrder> listOrder(WorkOrder workOrder) {
		return workOrderDao.listOrder(workOrder);
	}

	public List<WorkOrder> listOrderRcd(WorkOrder workOrder) {
		return workOrderDao.listOrderRcd(workOrder);
	}

	public Object save(WorkOrder workOrder) {
		return workOrderDao.save(workOrder);
	}

	public String getName (String id){
		return workOrderDao.getName(id);
		}
}
