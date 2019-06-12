package com.htyw.app.user.pojo;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RmUser {
	private Long id;

	private String name;

	private String lockStatus;

	private String loginId;

	private String password;

	private String authenType;

	private String organizationId;

	private String employeeId;

	private String email;

	private String adminType;

	private String description;

	private String agentStatus;

	private String loginStatus;
	private String headImageUrl;

	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
	private Date lastLoginDate;

	private String lastLoginIp;

	private BigDecimal loginSum;

	private String lastCustomCss;

	private String isAffix;

	private String functionPermission;

	private String dataPermission;

	private String custom1;

	private String custom2;

	private String custom3;

	private String custom4;

	private String custom5;

	private String customXml;

	private String usableStatus;

	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
	private Date modifyDate;

	private String modifyIp;

	private BigDecimal modifyUserId;

	private String linkCalluser;

	private Short version;

	private String dr;

	private String isUpdPassword;

	private String organizationName;

	private String tenantid;

	private String merchantId;

	private String personno;

	public String getId() {
		return String.valueOf(id);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getLockStatus() {
		return lockStatus;
	}

	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus == null ? null : lockStatus.trim();
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId == null ? null : loginId.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getHeadImageUrl() {
		return headImageUrl;
	}

	public void setHeadImageUrl(String headImageUrl) {
		this.headImageUrl = headImageUrl;
	}

	public String getAuthenType() {
		return authenType;
	}

	public void setAuthenType(String authenType) {
		this.authenType = authenType == null ? null : authenType.trim();
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId == null ? null : organizationId.trim();
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId == null ? null : employeeId.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getAdminType() {
		return adminType;
	}

	public void setAdminType(String adminType) {
		this.adminType = adminType == null ? null : adminType.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getAgentStatus() {
		return agentStatus;
	}

	public void setAgentStatus(String agentStatus) {
		this.agentStatus = agentStatus == null ? null : agentStatus.trim();
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus == null ? null : loginStatus.trim();
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
	}

	public BigDecimal getLoginSum() {
		return loginSum;
	}

	public void setLoginSum(BigDecimal loginSum) {
		this.loginSum = loginSum;
	}

	public String getLastCustomCss() {
		return lastCustomCss;
	}

	public void setLastCustomCss(String lastCustomCss) {
		this.lastCustomCss = lastCustomCss == null ? null : lastCustomCss.trim();
	}

	public String getIsAffix() {
		return isAffix;
	}

	public void setIsAffix(String isAffix) {
		this.isAffix = isAffix == null ? null : isAffix.trim();
	}

	public String getFunctionPermission() {
		return functionPermission;
	}

	public void setFunctionPermission(String functionPermission) {
		this.functionPermission = functionPermission == null ? null : functionPermission.trim();
	}

	public String getDataPermission() {
		return dataPermission;
	}

	public void setDataPermission(String dataPermission) {
		this.dataPermission = dataPermission == null ? null : dataPermission.trim();
	}

	public String getCustom1() {
		return custom1;
	}

	public void setCustom1(String custom1) {
		this.custom1 = custom1 == null ? null : custom1.trim();
	}

	public String getCustom2() {
		return custom2;
	}

	public void setCustom2(String custom2) {
		this.custom2 = custom2 == null ? null : custom2.trim();
	}

	public String getCustom3() {
		return custom3;
	}

	public void setCustom3(String custom3) {
		this.custom3 = custom3 == null ? null : custom3.trim();
	}

	public String getCustom4() {
		return custom4;
	}

	public void setCustom4(String custom4) {
		this.custom4 = custom4 == null ? null : custom4.trim();
	}

	public String getCustom5() {
		return custom5;
	}

	public void setCustom5(String custom5) {
		this.custom5 = custom5 == null ? null : custom5.trim();
	}

	public String getCustomXml() {
		return customXml;
	}

	public void setCustomXml(String customXml) {
		this.customXml = customXml == null ? null : customXml.trim();
	}

	public String getUsableStatus() {
		return usableStatus;
	}

	public void setUsableStatus(String usableStatus) {
		this.usableStatus = usableStatus == null ? null : usableStatus.trim();
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getModifyIp() {
		return modifyIp;
	}

	public void setModifyIp(String modifyIp) {
		this.modifyIp = modifyIp == null ? null : modifyIp.trim();
	}

	public BigDecimal getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(BigDecimal modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public String getLinkCalluser() {
		return linkCalluser;
	}

	public void setLinkCalluser(String linkCalluser) {
		this.linkCalluser = linkCalluser == null ? null : linkCalluser.trim();
	}

	public Short getVersion() {
		return version;
	}

	public void setVersion(Short version) {
		this.version = version;
	}

	public String getDr() {
		return dr;
	}

	public void setDr(String dr) {
		this.dr = dr == null ? null : dr.trim();
	}

	public String getIsUpdPassword() {
		return isUpdPassword;
	}

	public void setIsUpdPassword(String isUpdPassword) {
		this.isUpdPassword = isUpdPassword == null ? null : isUpdPassword.trim();
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName == null ? null : organizationName.trim();
	}

	public String getTenantid() {
		return tenantid;
	}

	public void setTenantid(String tenantid) {
		this.tenantid = tenantid == null ? null : tenantid.trim();
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId == null ? null : merchantId.trim();
	}

	public String getPersonno() {
		return personno;
	}

	public void setPersonno(String personno) {
		this.personno = personno == null ? null : personno.trim();
	}
}