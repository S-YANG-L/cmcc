package com.htyw.app.houseLeasing.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class LookingRequest {
	private Long id;  //预约看房ID
	private String houseId;  //房屋ID
	private String houseName;  //房屋名字
	private Long applicantId;  //预约者ID
	private String applicantName;  //预约者姓名
	private String applicantSex;  //预约者性别
	private String applicantPhone;  //预约者电话
	private Date applicantDate;  //预约看房时间
	private String leavingMessage;	  //留言
	
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public String getHouseId() {
		return houseId;
	}
	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantSex() {
		return applicantSex;
	}
	public void setApplicantSex(String applicantSex) {
		this.applicantSex = applicantSex;
	}
	public String getApplicantPhone() {
		return applicantPhone;
	}
	public void setApplicantPhone(String applicantPhone) {
		this.applicantPhone = applicantPhone;
	}
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getApplicantDate() {
		return applicantDate;
	}
	public void setApplicantDate(Date applicantDate) {
		this.applicantDate = applicantDate;
	}
	public String getLeavingMessage() {
		return leavingMessage;
	}
	public void setLeavingMessage(String leavingMessage) {
		this.leavingMessage = leavingMessage;
	}
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}
	
	
}
