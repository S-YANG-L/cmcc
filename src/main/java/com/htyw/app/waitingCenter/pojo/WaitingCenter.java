package com.htyw.app.waitingCenter.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class WaitingCenter {
	private String id;
	private String title;
	private String needUserId;
	private String needUserName;
	private String busId;
	private String nextUsers;
	private String needState;
	private Date needStartTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNeedUserId() {
		return needUserId;
	}

	public void setNeedUserId(String needUserId) {
		this.needUserId = needUserId;
	}

	public String getNeedUserName() {
		return needUserName;
	}

	public void setNeedUserName(String needUserName) {
		this.needUserName = needUserName;
	}

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public String getNextUsers() {
		return nextUsers;
	}

	public void setNextUsers(String nextUsers) {
		this.nextUsers = nextUsers;
	}

	public String getNeedState() {
		return needState;
	}

	public void setNeedState(String needState) {
		this.needState = needState;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getNeedStartTime() {
		return needStartTime;
	}

	public void setNeedStartTime(Date needStartTime) {
		this.needStartTime = needStartTime;
	}

}
