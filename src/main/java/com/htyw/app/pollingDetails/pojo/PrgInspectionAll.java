package com.htyw.app.pollingDetails.pojo;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class PrgInspectionAll {
    private Long id;

    private Long inspection;

    private Date inspectionStartTime;

    private Date inspectionEndTime;

    private String inspectionPerson;

    private Long frequency;

    private Long finishNumber;

    private String effectStatus;

    private String remark;

    private String organizationId;

    private String organizationName;

    private String creatorId;

    private String creatorName;

    private String billStatus;

    private String tenantid;

    private String dr;

    private String inspectionPersonId;

    private String title;

    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getInspection() {
        return inspection;
    }

    public void setInspection(Long inspection) {
        this.inspection = inspection;
    }

    public Date getInspectionStartTime() {
        return inspectionStartTime;
    }

    public void setInspectionStartTime(Date inspectionStartTime) {
        this.inspectionStartTime = inspectionStartTime;
    }

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
        this.inspectionPerson = inspectionPerson == null ? null : inspectionPerson.trim();
    }

    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getFrequency() {
        return frequency;
    }

    public void setFrequency(Long frequency) {
        this.frequency = frequency;
    }

    public Long getFinishNumber() {
        return finishNumber;
    }

    public void setFinishNumber(Long finishNumber) {
        this.finishNumber = finishNumber;
    }

    public String getEffectStatus() {
        return effectStatus;
    }

    public void setEffectStatus(String effectStatus) {
        this.effectStatus = effectStatus == null ? null : effectStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid == null ? null : tenantid.trim();
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr == null ? null : dr.trim();
    }

    public String getInspectionPersonId() {
        return inspectionPersonId;
    }

    public void setInspectionPersonId(String inspectionPersonId) {
        this.inspectionPersonId = inspectionPersonId == null ? null : inspectionPersonId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}