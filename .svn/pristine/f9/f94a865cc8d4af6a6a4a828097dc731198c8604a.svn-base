package com.htyw.app.serviceCenter.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class ServiceCenter {
	
	private Long id;  // 主键（服务中心）
	private Long houseId;  //房间主键
	private String houseName;  //房间名称
	private String serviceTitle;  //服务标题
	private String serviceAddress;  //服务地址
	private String serviceContactInformation;  //服务联系方式
	private String serviceType;  //服务类型
	private String serviceHeadPhoto;  //服务头像
	private Long tenantId;  //租户ID
	private Date createDate;  //创建时间
	private String imgUrl;//服务头像路径
	
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
	public Long getHouseId() {
		return houseId;
	}
	public void setHouseId(Long houseId) {
		this.houseId = houseId;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getServiceTitle() {
		return serviceTitle;
	}
	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}
	public String getServiceAddress() {
		return serviceAddress;
	}
	public void setServiceAddress(String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}
	public String getServiceContactInformation() {
		return serviceContactInformation;
	}
	public void setServiceContactInformation(String serviceContactInformation) {
		this.serviceContactInformation = serviceContactInformation;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getServiceHeadPhoto() {
		return serviceHeadPhoto;
	}
	public void setServiceHeadPhoto(String serviceHeadPhoto) {
		this.serviceHeadPhoto = serviceHeadPhoto;
	}
	public Long getTenantId() {
		return tenantId;
	}
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	
}
