package com.htyw.app.engineeringPolling.pojo.Inspection;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
//社区楼宇计划
public class BuildingInspection {
    private String id;
    private int inspection;
    private Date inspectionStartTime;
    private Date inspectionEndTime;
    private String inspectionPerson;
    private String inspectionId;
    private String inspectionName;
    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getInspection() {
        return inspection;
    }

    public void setInspection(int inspection) {
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

    public String getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId;
    }

    public String getInspectionName() {
        return inspectionName;
    }

    public void setInspectionName(String inspectionName) {
        this.inspectionName = inspectionName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
