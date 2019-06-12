package com.htyw.app.checkingIN.pojo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CheckingInMend {
    private Long id;

    private String vacateType;

    @JsonFormat(pattern = "HH:mm:ss",timezone = "GMT+8")
    private Date startTime;

    @JsonFormat(pattern = "HH:mm:ss",timezone = "GMT+8")
    private Date finishTime;

    private String vacateName;

    private String checkName;

    private String vacateCause;

    private String status;

    private Long tenantid;

    private String checkingInClockIds;//员工id

    //异常考勤
    private List<CheckingInAbnormal> abnormals;
    
    public List<CheckingInAbnormal> getAbnormals() {
		return abnormals;
	}

	public void setAbnormals(List<CheckingInAbnormal> abnormals) {
		this.abnormals = abnormals;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVacateType() {
        return vacateType;
    }

    public void setVacateType(String vacateType) {
        this.vacateType = vacateType == null ? null : vacateType.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getVacateName() {
        return vacateName;
    }

    public void setVacateName(String vacateName) {
        this.vacateName = vacateName == null ? null : vacateName.trim();
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName == null ? null : checkName.trim();
    }

    public String getVacateCause() {
        return vacateCause;
    }

    public void setVacateCause(String vacateCause) {
        this.vacateCause = vacateCause == null ? null : vacateCause.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getTenantid() {
        return tenantid;
    }

    public void setTenantid(Long tenantid) {
        this.tenantid = tenantid;
    }

    public String getCheckingInClockIds() {
        return checkingInClockIds;
    }

    public void setCheckingInClockIds(String checkingInClockIds) {
        this.checkingInClockIds = checkingInClockIds == null ? null : checkingInClockIds.trim();
    }
}