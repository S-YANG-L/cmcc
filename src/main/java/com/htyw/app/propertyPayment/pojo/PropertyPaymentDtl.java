package com.htyw.app.propertyPayment.pojo;

public class PropertyPaymentDtl {
	private String id;
	private String moneyName;
	private String moneyType;
	private String moneyCorrespondingDate;
	private String plannedReceiptAmount;
	private String actualReceiptAmount;
	private String reductionAmount;
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

	public String getPlannedReceiptAmount() {
		return plannedReceiptAmount;
	}

	public void setPlannedReceiptAmount(String plannedReceiptAmount) {
		this.plannedReceiptAmount = plannedReceiptAmount;
	}

	public String getActualReceiptAmount() {
		return actualReceiptAmount;
	}

	public void setActualReceiptAmount(String actualReceiptAmount) {
		this.actualReceiptAmount = actualReceiptAmount;
	}

	public String getReductionAmount() {
		return reductionAmount;
	}

	public void setReductionAmount(String reductionAmount) {
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