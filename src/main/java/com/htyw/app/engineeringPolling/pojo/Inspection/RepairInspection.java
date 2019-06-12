package com.htyw.app.engineeringPolling.pojo.Inspection;

import java.util.Date;
//设备维保计划
public class RepairInspection {
    private String deviceId;
    private String deviceName;
    private String tainType;
    private Date planStartTime;
    private Date planEndTime;
    private String tainPerson;
    private String tainCompany;
    private String tainReq;
    private String tainStandard;
    private double willTainCost;
    private String tainContent;
    private String phonePerson;
    private String phone;
    private String remarks;

    public String getDeviceId() {
        return deviceId;
    }


    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getTainType() {
        return tainType;
    }

    public void setTainType(String tainType) {
        this.tainType = tainType;
    }

    public Date getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    public Date getPlanEndTime() {
        return planEndTime;
    }

    public void setPlanEndTime(Date planEndTime) {
        this.planEndTime = planEndTime;
    }

    public String getTainPerson() {
        return tainPerson;
    }

    public void setTainPerson(String tainPerson) {
        this.tainPerson = tainPerson;
    }

    public String getTainCompany() {
        return tainCompany;
    }

    public void setTainCompany(String tainCompany) {
        this.tainCompany = tainCompany;
    }

    public String getTainReq() {
        return tainReq;
    }

    public void setTainReq(String tainReq) {
        this.tainReq = tainReq;
    }

    public String getTainStandard() {
        return tainStandard;
    }

    public void setTainStandard(String tainStandard) {
        this.tainStandard = tainStandard;
    }

    public double getWillTainCost() {
        return willTainCost;
    }

    public void setWillTainCost(double willTainCost) {
        this.willTainCost = willTainCost;
    }

    public String getTainContent() {
        return tainContent;
    }

    public void setTainContent(String tainContent) {
        this.tainContent = tainContent;
    }

    public String getPhonePerson() {
        return phonePerson;
    }

    public void setPhonePerson(String phonePerson) {
        this.phonePerson = phonePerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
