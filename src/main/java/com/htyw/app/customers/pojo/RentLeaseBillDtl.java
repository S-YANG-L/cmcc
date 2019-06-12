package com.htyw.app.customers.pojo;

public class RentLeaseBillDtl {
	private String id;
	private String moneyName;
	private String moneyType;
	private String moneyCorrespondingDate;
	private Double plannedReceiptAmount;
	private Double actualReceiptAmount;
	private Double unpaidAmount;
	private Double reductionAmount;
	private String remark;
	private String billId;
	private String tenantId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMoneyName() {
		return moneyName;
	}

	public void setMoneyName(String moneyName) {
		this.moneyName = moneyName;
	}

	public String getMoneyType() {
		return moneyType;
	}

	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}

	public String getMoneyCorrespondingDate() {
		return moneyCorrespondingDate;
	}

	public void setMoneyCorrespondingDate(String moneyCorrespondingDate) {
		this.moneyCorrespondingDate = moneyCorrespondingDate;
	}

	public Double getPlannedReceiptAmount() {
		return plannedReceiptAmount;
	}

	public void setPlannedReceiptAmount(Double plannedReceiptAmount) {
		this.plannedReceiptAmount = plannedReceiptAmount;
	}

	public Double getActualReceiptAmount() {
		return actualReceiptAmount;
	}

	public void setActualReceiptAmount(Double actualReceiptAmount) {
		this.actualReceiptAmount = actualReceiptAmount;
	}

	public Double getUnpaidAmount() {
		return unpaidAmount;
	}

	public void setUnpaidAmount(Double unpaidAmount) {
		this.unpaidAmount = unpaidAmount;
	}

	public Double getReductionAmount() {
		return reductionAmount;
	}

	public void setReductionAmount(Double reductionAmount) {
		this.reductionAmount = reductionAmount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
