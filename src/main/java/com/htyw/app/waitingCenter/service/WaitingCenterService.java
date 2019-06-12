package com.htyw.app.waitingCenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.waitingCenter.dao.WaitingCenterDao;
import com.htyw.app.waitingCenter.pojo.WaitingCenter;
import com.htyw.app.workOrder.dao.WorkOrderDao;
import com.htyw.app.workOrder.pojo.WorkOrder;

@Transactional
@Service
public class WaitingCenterService {
	@Autowired
	private WaitingCenterDao waitingCenterDao;
	@Autowired
	private WorkOrderDao workOrderDao;

	public List<WaitingCenter> listTodo(WaitingCenter waitingCenter) {
		return waitingCenterDao.listTodo(waitingCenter);
	}

	public List<WaitingCenter> listDone(WaitingCenter waitingCenter) {
		return waitingCenterDao.listDone(waitingCenter);
	}

	public List<WorkOrder> listDoneDtl(WorkOrder wOrder) {
		return workOrderDao.listOrderRcd(wOrder);
	}

	public List<WorkOrder> listTodoDtl(WorkOrder workOrder) {
		return workOrderDao.listOrder(workOrder);
	}

	public List<WaitingCenter> saveToDo(WaitingCenter waitingCenter) {
		return waitingCenterDao.saveToDo(waitingCenter);

	}

}
