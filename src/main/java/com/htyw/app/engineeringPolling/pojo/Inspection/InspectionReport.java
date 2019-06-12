package com.htyw.app.engineeringPolling.pojo.Inspection;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

//巡检情况上报
public class InspectionReport {
    private Long id;
    private Long parentId;
    private String inspection;
    private String reportType;
    private String inspectionPerson;
    private String inspectionLocation;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date reportTime;
    private String reportContent;
    private String reportPictureFile;
    private Long tenantId;
    private String normal;
    private String effectStatus;
    

    public String getEffectStatus() {
		return effectStatus;
	}

	public void setEffectStatus(String effectStatus) {
		this.effectStatus = effectStatus;
	}

	public String getNormal() {
		return normal;
	}

	public void setNormal(String normal) {
		this.normal = normal;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getInspection() {
        return inspection;
    }

    public void setInspection(String inspection) {
        this.inspection = inspection;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getInspectionPerson() {
        return inspectionPerson;
    }

    public void setInspectionPerson(String inspectionPerson) {
        this.inspectionPerson = inspectionPerson;
    }

    public String getInspectionLocation() {
        return inspectionLocation;
    }

    public void setInspectionLocation(String inspectionLocation) {
        this.inspectionLocation = inspectionLocation;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getReportPictureFile() {
        return reportPictureFile;
    }

    public void setReportPictureFile(String reportPictureFile) {
        this.reportPictureFile = reportPictureFile;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }
}
