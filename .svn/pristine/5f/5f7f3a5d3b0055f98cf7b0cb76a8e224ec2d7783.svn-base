package com.htyw.app.billAndPay.pojo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class BillAndPayDetail {
	
private Long id;  //主键
private String moneyName;  //款项名称
private String moneyType;  //款项类型
private String actualReceiptAmount;  //实际收款金额
private Double plannedReceiptAmount;  //计划收款金额
private Long billId;  //账单ID
private Long tenantId;  //租户ID
private String strId; //ID转换类型避免因为其太长数据出错

public String getStrId() {
	return strId;
}
public void setStrId(String strId) {
	this.strId = strId;
}
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
	this.moneyName = moneyName;
}
public String getMoneyType() {
	return moneyType;
}
public void setMoneyType(String moneyType) {
	this.moneyType = moneyType;
}
public String getActualReceiptAmount() {
	return actualReceiptAmount;
}
public void setActualReceiptAmount(String actualReceiptAmount) {
	this.actualReceiptAmount = actualReceiptAmount;
}
@JsonSerialize(using = LongJsonSerializer.class)
@JsonDeserialize(using = LongJsonDeserializer.class)
public Long getBillId() {
	return billId;
}
public void setBillId(Long billId) {
	this.billId = billId;
}
public Long getTenantId() {
	return tenantId;
}
public void setTenantId(Long tenantId) {
	this.tenantId = tenantId;
}
public Double getPlannedReceiptAmount() {
	return plannedReceiptAmount;
}
public void setPlannedReceiptAmount(Double plannedReceiptAmount) {
	this.plannedReceiptAmount = plannedReceiptAmount;
}

}
