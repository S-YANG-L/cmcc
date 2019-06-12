package com.htyw.app.contract.pojo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.htyw.app.myContract.pojo.DocumentFiles;

public class ContractList {
	private String id;
	private String customerId;
	private String customerName; // 客户姓名
	private String contractNumber; // 合同编码
	private String contractName; // 合同名称
	private String certificateNumber; // 证件号
	private String contactNumber; // 联系电话
	private String contactAddress; // 联系地址
	private String earnestMoney; // 定金
	private Date fixedRentDate; // 下定日期
	private String salesMan; // 业务员
	private String contractStatus; // 合同状态
	private Date leaseStartDate; // 租期开始时间
	private Date leaseEndDate;// 租期结束时间
	private String lastOpenDate;// 上次开账日期
	private String nextOpenDate;// 下次开账日期
	private Date signLeaseDate;// 签租日期
	private Date extimateOpenDate;// 预计开业日期
	private String paymentDate;// 交款账期(天)
	private String advanceOpenDays; // 提前开帐天数
	private String rentalCycle; // 租金周期
	private String leaseType; // 租赁类型
	private String paymentMode; // 付款方式
	private String rentalCollectMode; // 租金收取方式
	private String collectPropertyFeePrice; // 是否收取物业费
	private String additionalClause; // 附加条款
	private String deposit; // 押金
	private String rentalUnitPrice; // 租金单价
	private String propertyFeeUnitPrice; // 物业费单价
	private String totalLeaseAcreage; // 总出租面积
	private String totalBuildingAcreage; // 总建筑面积
	private String totalSetAcreage; // 总套内面积
	private String contractType; // 合同类型
	private String contractEnclosure; // 合同附件
	private String tenantId;
	private List<DocumentFiles> DocumentFiles;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractEnclosure() {
		return contractEnclosure;
	}

	public void setContractEnclosure(String contractEnclosure) {
		this.contractEnclosure = contractEnclosure;
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getEarnestMoney() {
		return earnestMoney;
	}

	public void setEarnestMoney(String earnestMoney) {
		this.earnestMoney = earnestMoney;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getFixedRentDate() {
		return fixedRentDate;
	}

	public void setFixedRentDate(Date fixedRentDate) {
		this.fixedRentDate = fixedRentDate;
	}

	public String getSalesMan() {
		return salesMan;
	}

	public void setSalesMan(String salesMan) {
		this.salesMan = salesMan;
	}

	public List<DocumentFiles> getDocumentFiles() {
		return DocumentFiles;
	}

	public void setDocumentFiles(List<DocumentFiles> documentFiles) {
		DocumentFiles = documentFiles;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getLeaseStartDate() {
		return leaseStartDate;
	}

	public void setLeaseStartDate(Date leaseStartDate) {
		this.leaseStartDate = leaseStartDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getLeaseEndDate() {
		return leaseEndDate;
	}

	public void setLeaseEndDate(Date leaseEndDate) {
		this.leaseEndDate = leaseEndDate;
	}

	public String getLastOpenDate() {
		return lastOpenDate;
	}

	public void setLastOpenDate(String lastOpenDate) {
		this.lastOpenDate = lastOpenDate;
	}

	public String getNextOpenDate() {
		return nextOpenDate;
	}

	public void setNextOpenDate(String nextOpenDate) {
		this.nextOpenDate = nextOpenDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getSignLeaseDate() {
		return signLeaseDate;
	}

	public void setSignLeaseDate(Date signLeaseDate) {
		this.signLeaseDate = signLeaseDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getExtimateOpenDate() {
		return extimateOpenDate;
	}

	public void setExtimateOpenDate(Date extimateOpenDate) {
		this.extimateOpenDate = extimateOpenDate;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getAdvanceOpenDays() {
		return advanceOpenDays;
	}

	public void setAdvanceOpenDays(String advanceOpenDays) {
		this.advanceOpenDays = advanceOpenDays;
	}

	public String getRentalCycle() {
		return rentalCycle;
	}

	public void setRentalCycle(String rentalCycle) {
		this.rentalCycle = rentalCycle;
	}

	public String getLeaseType() {
		return leaseType;
	}

	public void setLeaseType(String leaseType) {
		this.leaseType = leaseType;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getRentalCollectMode() {
		return rentalCollectMode;
	}

	public void setRentalCollectMode(String rentalCollectMode) {
		this.rentalCollectMode = rentalCollectMode;
	}

	public String getCollectPropertyFeePrice() {
		return collectPropertyFeePrice;
	}

	public void setCollectPropertyFeePrice(String collectPropertyFeePrice) {
		this.collectPropertyFeePrice = collectPropertyFeePrice;
	}

	public String getAdditionalClause() {
		return additionalClause;
	}

	public void setAdditionalClause(String additionalClause) {
		this.additionalClause = additionalClause;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getRentalUnitPrice() {
		return rentalUnitPrice;
	}

	public void setRentalUnitPrice(String rentalUnitPrice) {
		this.rentalUnitPrice = rentalUnitPrice;
	}

	public String getPropertyFeeUnitPrice() {
		return propertyFeeUnitPrice;
	}

	public void setPropertyFeeUnitPrice(String propertyFeeUnitPrice) {
		this.propertyFeeUnitPrice = propertyFeeUnitPrice;
	}

	public String getTotalLeaseAcreage() {
		return totalLeaseAcreage;
	}

	public void setTotalLeaseAcreage(String totalLeaseAcreage) {
		this.totalLeaseAcreage = totalLeaseAcreage;
	}

	public String getTotalBuildingAcreage() {
		return totalBuildingAcreage;
	}

	public void setTotalBuildingAcreage(String totalBuildingAcreage) {
		this.totalBuildingAcreage = totalBuildingAcreage;
	}

	public String getTotalSetAcreage() {
		return totalSetAcreage;
	}

	public void setTotalSetAcreage(String totalSetAcreage) {
		this.totalSetAcreage = totalSetAcreage;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
