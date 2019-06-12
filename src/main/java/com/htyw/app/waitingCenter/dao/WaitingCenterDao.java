package com.htyw.app.waitingCenter.dao;

import java.util.List;

import com.htyw.app.waitingCenter.pojo.WaitingCenter;

public interface WaitingCenterDao {
	List<WaitingCenter> listTodo(WaitingCenter waitingCenter);

	List<WaitingCenter> listDone(WaitingCenter waitingCenter);

	List<WaitingCenter> saveToDo(WaitingCenter waitingCenter);

}