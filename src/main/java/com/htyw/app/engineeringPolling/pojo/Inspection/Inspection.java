package com.htyw.app.engineeringPolling.pojo.Inspection;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
//巡检计划列表
public class Inspection {
    private String id;
    private String inspection;
    private Date inspectionStartTime;
    private Date inspectionEndTime;
    private String inspectionPerson;
    private int frequency;
    private String effectStatus;
    private String tenantId;
    private String remark;
    private String normal;
    private String finishNumber;
    private String title;
    
    
    
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNormal() {
		return normal;
	}
	public void setNormal(String normal) {
		this.normal = normal;
	}
	public String getFinishNumber() {
		return finishNumber;
	}
	public void setFinishNumber(String finishNumber) {
		this.finishNumber = finishNumber;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	private Long inspectionPersonId;
    
    public Long getInspectionPersonId() {
		return inspectionPersonId;
	}
	public void setInspectionPersonId(Long inspectionPersonId) {
		this.inspectionPersonId = inspectionPersonId;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getInspection() {
        return inspection;
    }
    public void setInspection(String inspection) {
        this.inspection = inspection;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getInspectionStartTime() {
        return inspectionStartTime;
    }

    public void setInspectionStartTime(Date inspectionStartTime) {
        this.inspectionStartTime = inspectionStartTime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getInspectionEndTime() {
        return inspectionEndTime;
    }

    public void setInspectionEndTime(Date inspectionEndTime) {
        this.inspectionEndTime = inspectionEndTime;
    }

    public String getInspectionPerson() {
        return inspectionPerson;
    }
    public void setInspectionPerson(String inspectionPerson) {
        this.inspectionPerson = inspectionPerson;
    }

    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getEffectStatus() {
        return effectStatus;
    }

    public void setEffectStatus(String effectStatus) {
        this.effectStatus = effectStatus;
    }
}
