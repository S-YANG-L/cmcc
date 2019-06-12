package com.htyw.app.engineeringPolling.pojo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class PrgInspectionReport {
    private Long id;

    private String prgInspectionAllId;

    private String inspectionId;

    private String personId;

    private String personName;

    private String reportDate;

    private String inspectionAllTheme;

    private String inspectionTheme;

    private String picture;

    private String isNormal;

    private String isFinish;

    private String inspectionNum;

    private String surplusNum;

    private String remark;

    private String tenantid;

    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrgInspectionAllId() {
        return prgInspectionAllId;
    }

    public void setPrgInspectionAllId(String prgInspectionAllId) {
        this.prgInspectionAllId = prgInspectionAllId == null ? null : prgInspectionAllId.trim();
    }

    public String getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId == null ? null : inspectionId.trim();
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public String getInspectionAllTheme() {
        return inspectionAllTheme;
    }

    public void setInspectionAllTheme(String inspectionAllTheme) {
        this.inspectionAllTheme = inspectionAllTheme == null ? null : inspectionAllTheme.trim();
    }

    public String getInspectionTheme() {
        return inspectionTheme;
    }

    public void setInspectionTheme(String inspectionTheme) {
        this.inspectionTheme = inspectionTheme == null ? null : inspectionTheme.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getIsNormal() {
        return isNormal;
    }

    public void setIsNormal(String isNormal) {
        this.isNormal = isNormal == null ? null : isNormal.trim();
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish == null ? null : isFinish.trim();
    }

    public String getInspectionNum() {
        return inspectionNum;
    }

    public void setInspectionNum(String inspectionNum) {
        this.inspectionNum = inspectionNum == null ? null : inspectionNum.trim();
    }

    public String getSurplusNum() {
        return surplusNum;
    }

    public void setSurplusNum(String surplusNum) {
        this.surplusNum = surplusNum == null ? null : surplusNum.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid == null ? null : tenantid.trim();
    }
}