package com.htyw.app.engineering.pojo;

//空关
public class PrgHouse {
	private String id;
	private String parentId;
	private String housingResourcesId;
	private String housingResourcesName;
	private double finishNumber;
	private String tenantId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getHousingResourcesId() {
		return housingResourcesId;
	}

	public void setHousingResourcesId(String housingResourcesId) {
		this.housingResourcesId = housingResourcesId;
	}

	public String getHousingResourcesName() {
		return housingResourcesName;
	}

	public void setHousingResourcesName(String housingResourcesName) {
		this.housingResourcesName = housingResourcesName;
	}

	public double getFinishNumber() {
		return finishNumber;
	}

	public void setFinishNumber(double finishNumber) {
		this.finishNumber = finishNumber;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
