package com.htyw.app.banner.pojo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class Banner {
	private Long id;//ID
	private String appType;//app类型
	private String shufflingFigure;//轮播图
	private String tenantid;//租户ID
	
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAppType() {
		return appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}
	public String getShufflingFigure() {
		return shufflingFigure;
	}
	public void setShufflingFigure(String shufflingFigure) {
		this.shufflingFigure = shufflingFigure;
	}
	public String getTenantid() {
		return tenantid;
	}
	public void setTenantid(String tenantid) {
		this.tenantid = tenantid;
	}
	
	
}
