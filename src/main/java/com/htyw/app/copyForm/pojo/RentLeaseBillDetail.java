package com.htyw.app.copyForm.pojo;

import java.math.BigDecimal;

public class RentLeaseBillDetail {
    private Long id;

    private String moneyName;

    private String moneyType;

    private String moneyCorrespondingDate;

    private BigDecimal plannedReceiptAmount;

    private BigDecimal actualReceiptAmount;

    private BigDecimal reductionAmount;

    private BigDecimal unpaidAmount;

    private String remark;

    private Long billId;

    private String operation;

    private String billStatus;

    private BigDecimal version;

    private String dr;

    private Long tenantid;

    private String creatorName;

    private Long creatorId;

    private String organizationName;

    private Long organizationId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMoneyName() {
        return moneyName;
    }

    public void setMoneyName(String moneyName) {
        this.moneyName = moneyName == null ? null : moneyName.trim();
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType == null ? null : moneyType.trim();
    }

    public String getMoneyCorrespondingDate() {
        return moneyCorrespondingDate;
    }

    public void setMoneyCorrespondingDate(String moneyCorrespondingDate) {
        this.moneyCorrespondingDate = moneyCorrespondingDate == null ? null : moneyCorrespondingDate.trim();
    }

    public BigDecimal getPlannedReceiptAmount() {
        return plannedReceiptAmount;
    }

    public void setPlannedReceiptAmount(BigDecimal plannedReceiptAmount) {
        this.plannedReceiptAmount = plannedReceiptAmount;
    }

    public BigDecimal getActualReceiptAmount() {
        return actualReceiptAmount;
    }

    public void setActualReceiptAmount(BigDecimal actualReceiptAmount) {
        this.actualReceiptAmount = actualReceiptAmount;
    }

    public BigDecimal getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(BigDecimal reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    public BigDecimal getUnpaidAmount() {
        return unpaidAmount;
    }

    public void setUnpaidAmount(BigDecimal unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr == null ? null : dr.trim();
    }

    public Long getTenantid() {
        return tenantid;
    }

    public void setTenantid(Long tenantid) {
        this.tenantid = tenantid;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }
}