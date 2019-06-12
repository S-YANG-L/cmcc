package com.htyw.app.billAndPay.pojo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class BillAndPay {
	
private Long id;  //账单ID
private String billNumber;  //账单编号
private String leaseholdName;  //租赁物名称
private String customerName;  //客户名称
private Long customerId;  //客户ID
private Double plannedReceiptAmount;  //计划收款金额
private Double amountReceived;//已收金额
private Double unpaidAmount;  //未付金额
private String openDate;  //开账日期
private Date signLeaseDate;
private String paymentDeadline;//缴款截止日
private String billType;  //账单类型
private String leaseBillStatus;  //账单状态
private Long tenantId;  //租户ID
private List<BillAndPayDetail> BillAndPayDetail;

@JsonSerialize(using = LongJsonSerializer.class)
@JsonDeserialize(using = LongJsonDeserializer.class)
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getBillNumber() {
	return billNumber;
}
public void setBillNumber(String billNumber) {
	this.billNumber = billNumber;
}
public String getLeaseholdName() {
	return leaseholdName;
}
public void setLeaseholdName(String leaseholdName) {
	this.leaseholdName = leaseholdName;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
@JsonSerialize(using = LongJsonSerializer.class)
@JsonDeserialize(using = LongJsonDeserializer.class)
public Long getCustomerId() {
	return customerId;
}
public void setCustomerId(Long customerId) {
	this.customerId = customerId;
}
public Double getPlannedReceiptAmount() {
	return plannedReceiptAmount;
}
public void setPlannedReceiptAmount(Double plannedReceiptAmount) {
	this.plannedReceiptAmount = plannedReceiptAmount;
}
public Double getUnpaidAmount() {
	return unpaidAmount;
}
public void setUnpaidAmount(Double unpaidAmount) {
	this.unpaidAmount = unpaidAmount;
}
/*@JsonFormat(pattern = "yyyy-MM-dd")
public Date getOpenDate() {
	return openDate;
}
public void setOpenDate(Date openDate) {
	this.openDate = openDate;
}*/

public String getBillType() {
	return billType;
}
public void setBillType(String billType) {
	this.billType = billType;
}
@JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
public Date getSignLeaseDate() {
	return signLeaseDate;
}
public void setSignLeaseDate(Date signLeaseDate) {
	this.signLeaseDate = signLeaseDate;
}

public String getLeaseBillStatus() {
	return leaseBillStatus;
}
public void setLeaseBillStatus(String leaseBillStatus) {
	this.leaseBillStatus = leaseBillStatus;
}
public Long getTenantId() {
	return tenantId;
}
public void setTenantId(Long tenantId) {
	this.tenantId = tenantId;
}
public List<BillAndPayDetail> getBillAndPayDetail() {
	return BillAndPayDetail;
}
public void setBillAndPayDetail(List<BillAndPayDetail> billAndPayDetail) {
	BillAndPayDetail = billAndPayDetail;
}

public String getOpenDate() {
	return openDate;
}
public void setOpenDate(String openDate) {
	this.openDate = openDate;
}
public String getPaymentDeadline() {
	return paymentDeadline;
}
public void setPaymentDeadline(String paymentDeadline) {
	this.paymentDeadline = paymentDeadline;
}
public Double getAmountReceived() {
	return amountReceived;
}
public void setAmountReceived(Double amountReceived) {
	this.amountReceived = amountReceived;
}


}
