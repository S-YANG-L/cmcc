package com.htyw.app.checkingIN.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CheckingInClock {
    private Long id;

    //@DateTimeFormat(pattern="HH:mm:ss")
    @JsonFormat(pattern = "HH:mm:ss",timezone = "GMT+8")
    private Date officeHours;

   // @DateTimeFormat(pattern="HH:mm:ss")
    @JsonFormat(pattern = "HH:mm:ss",timezone = "GMT+8")
    private Date closingTime;

    private String state;

    private Long tenantid;

    private String name;

    private Long staffId;

    private Long checkingInDateId;

    private String outworker;

    private String location;

    private String clockInTime;

    private String leaveEarly;

    private String checkingInDate;

    private String auditState;
    
    private String outworkCause;

    public String getOutworkCause() {
		return outworkCause;
	}

	public void setOutworkCause(String outworkCause) {
		this.outworkCause = outworkCause;
	}

	public String getId() {
        return String.valueOf(id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(Date officeHours) {
        this.officeHours = officeHours;
    }

    public Date getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(Date closingTime) {
        this.closingTime = closingTime;
    }

    public String getState() {
    	//if(state!=null){
    		return state;
    	//}
       // return "";
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getTenantid() {
        return String.valueOf(tenantid);
    }

    public void setTenantid(Long tenantid) {
        this.tenantid = tenantid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStaffId() {
        return String.valueOf(staffId);
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Long getCheckingInDateId() {
        return checkingInDateId;
    }

    public void setCheckingInDateId(Long checkingInDateId) {
        this.checkingInDateId = checkingInDateId;
    }

    public String getOutworker() {
        return outworker;
    }

    public void setOutworker(String outworker) {
        this.outworker = outworker == null ? null : outworker.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getClockInTime() {
        return clockInTime;
    }

    public void setClockInTime(String clockInTime) {
        this.clockInTime = clockInTime == null ? null : clockInTime.trim();
    }

    public String getLeaveEarly() {
        return leaveEarly;
    }

    public void setLeaveEarly(String leaveEarly) {
        this.leaveEarly = leaveEarly == null ? null : leaveEarly.trim();
    }

    public String getCheckingInDate() {
        return checkingInDate;
    }

    public void setCheckingInDate(String checkingInDate) {
        this.checkingInDate = checkingInDate;
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState == null ? null : auditState.trim();
    }
}