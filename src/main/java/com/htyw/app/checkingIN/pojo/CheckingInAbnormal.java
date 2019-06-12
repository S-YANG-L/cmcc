package com.htyw.app.checkingIN.pojo;

public class CheckingInAbnormal {
	

	private Long id;//日期基准表id
	private String referenceDate;//日期基准表时期
	private Long staffId;//员工id
	private String name;//姓名
	private String leaveEarly;//是否早退
	private String state;//是否迟到
	private Long checkingInDateId;//日期基准表id
	private Long tenantId;//租户id
	private String clockStatus;//打卡状态 0是 1否
	private String auditState;//审批状态 0是 1否
	private String clockInTime;//打卡次数 CLOCK_IN_TIME
	private String abnormalState;//异常状态
	private Long clockId;//打卡id
	
	public String getAbnormalState() {
		return abnormalState;
	}
	public void setAbnormalState(String abnormalState) {
		this.abnormalState = abnormalState;
	}
	public Long getClockId() {
		return clockId;
	}
	public void setClockId(Long clockId) {
		this.clockId = clockId;
	}
	public String getClockInTime() {
		return clockInTime;
	}
	public void setClockInTime(String clockInTime) {
		this.clockInTime = clockInTime;
	}
	public String getAuditState() {
		return auditState;
	}
	public void setAuditState(String auditState) {
		this.auditState = auditState;
	}
	public String getClockStatus() {
		return clockStatus;
	}
	public void setClockStatus(String clockStatus) {
		this.clockStatus = clockStatus;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReferenceDate() {
		return referenceDate;
	}
	public void setReferenceDate(String referenceDate) {
		this.referenceDate = referenceDate;
	}
	public Long getStaffId() {
		return staffId;
	}
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLeaveEarly() {
		return leaveEarly;
	}
	public void setLeaveEarly(String leaveEarly) {
		this.leaveEarly = leaveEarly;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getCheckingInDateId() {
		return checkingInDateId;
	}
	public void setCheckingInDateId(Long checkingInDateId) {
		this.checkingInDateId = checkingInDateId;
	}
	public Long getTenantId() {
		return tenantId;
	}
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}
	@Override
	public String toString() {
		return "CheckingInAbnormal [id=" + id + ", referenceDate=" + referenceDate + ", staffId=" + staffId + ", name="
				+ name + ", leaveEarly=" + leaveEarly + ", state=" + state + ", checkingInDateId=" + checkingInDateId
				+ ", tenantId=" + tenantId + ", clockStatus=" + clockStatus + ", auditState=" + auditState
				+ ", clockInTime=" + clockInTime + ", clockId=" + clockId + "]";
	}
	
}
