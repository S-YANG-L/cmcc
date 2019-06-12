package com.htyw.app.engineeringPolling.pojo.Inspection;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
//空关巡检
public class KongguanInspection {
    private String id;
    private int inspection;
    private Date inspectionStartTime;
    private Date inspectionEndTime;
    private String inspectionPerson;
    private String housingResourcesId;
    private String housingResourcesName;

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
}
