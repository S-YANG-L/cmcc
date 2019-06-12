package com.htyw.app.checkingIN.pojo;

public class UserChecking {

	private String userName;
	private String checkLocation;//打卡地址
	private String userId;
	private String longitude;//经度
	private String latitude;//维度
	private String TENANTID;//zuhuid
	
	
	public String getTENANTID() {
		return TENANTID;
	}
	public void setTENANTID(String tENANTID) {
		TENANTID = tENANTID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCheckLocation() {
		return checkLocation;
	}
	public void setCheckLocation(String checkLocation) {
		this.checkLocation = checkLocation;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
}
