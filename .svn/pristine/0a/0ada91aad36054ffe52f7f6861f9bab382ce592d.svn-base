package com.htyw.app.myContract.pojo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class MyContract {
	
	private Long id;//合同主键
	private String leaseType;//租赁类型
	private String contractNumber;//合同编码
	private String contractName;//合同名称
	private Long customerId;//客户ID
	private String customerName;//客户名称
	private String contactNumber;//联系电话
	private String contactAddress;//联系地址
	private Long salesmanId;//业务员ID
	private String salesman;//业务员
	private Long certificateNumber;//证件号
	private Double earnestMoney;//定金
	private Date fixedRentDate;//下定日期
	private Date leaseStartDate;//租期开始时间
	private Date leaseEndDate;//租期结束时间
	private String lastOpenDate;//上次开账日期
	private String nextOpenDate;//下次开账日期
	private Date signLeaseDate;//签租日期
	private String contractStatus;//合同状态
	private Long communityId;//社区ID
	private String communityName;//社区名称
	private Long villageId;//小区ID
	private String villageName;//小区名称
	private Long buildingId;//楼栋ID
	private String buildingName;//楼栋名称
	private String houseName;//房间名称
	private Double tablePrice;//金额
	private Long currentTenantId;//当前租客ID
	private String currentTenantPhone;//当前租客电话
	private Long tenantId;  //租户ID
	private Long baseHouseId;  
	private String apartmentPhoto;//房屋图片编码
	private String contractType;
	private String imgUrl;//图片路径
	private String paymentMode;//付款方式
	private String paymentDate;//缴款账期
	private String advanceOpenDays;//提前开账天数
	private String rentalCollectMode;//租金收取方式
	private String contractEnclosure;//合同附件
	private List<DocumentFiles> DocumentFiles;
	
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLeaseType() {
		return leaseType;
	}
	public void setLeaseType(String leaseType) {
		this.leaseType = leaseType;
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
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)	
	public Long getSalesmanId() {
		return salesmanId;
	}
	public void setSalesmanId(Long salesmanId) {
		this.salesmanId = salesmanId;
	}
	public String getSalesman() {
		return salesman;
	}
	public void setSalesman(String salesman) {
		this.salesman = salesman;
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
	public String getContractStatus() {
		return contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)	
	public Long getCommunityId() {
		return communityId;
	}
	public void setCommunityId(Long communityId) {
		this.communityId = communityId;
	}
	public String getCommunityName() {
		return communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)	
	public Long getVillageId() {
		return villageId;
	}
	public void setVillageId(Long villageId) {
		this.villageId = villageId;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)	
	public Long getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public Double getTablePrice() {
		return tablePrice;
	}
	public void setTablePrice(Double tablePrice) {
		this.tablePrice = tablePrice;
	}
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)	
	public Long getCurrentTenantId() {
		return currentTenantId;
	}
	public void setCurrentTenantId(Long currentTenantId) {
		this.currentTenantId = currentTenantId;
	}
	public String getCurrentTenantPhone() {
		return currentTenantPhone;
	}
	public void setCurrentTenantPhone(String currentTenantPhone) {
		this.currentTenantPhone = currentTenantPhone;
	}
	public Long getTenantId() {
		return tenantId;
	}
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)	
	public Long getCertificateNumber() {
		return certificateNumber;
	}
	public void setCertificateNumber(Long certificateNumber) {
		this.certificateNumber = certificateNumber;
	}
	public Double getEarnestMoney() {
		return earnestMoney;
	}
	public void setEarnestMoney(Double earnestMoney) {
		this.earnestMoney = earnestMoney;
	}
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getFixedRentDate() {
		return fixedRentDate;
	}
	public void setFixedRentDate(Date fixedRentDate) {
		this.fixedRentDate = fixedRentDate;
	}
	
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)	
	public Long getBaseHouseId() {
		return baseHouseId;
	}
	public void setBaseHouseId(Long baseHouseId) {
		this.baseHouseId = baseHouseId;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getApartmentPhoto() {
		return apartmentPhoto;
	}
	public void setApartmentPhoto(String apartmentPhoto) {
		this.apartmentPhoto = apartmentPhoto;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getAdvanceOpenDays() {
		return advanceOpenDays;
	}
	public void setAdvanceOpenDays(String advanceOpenDays) {
		this.advanceOpenDays = advanceOpenDays;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getRentalCollectMode() {
		return rentalCollectMode;
	}
	public void setRentalCollectMode(String rentalCollectMode) {
		this.rentalCollectMode = rentalCollectMode;
	}
	public String getContractEnclosure() {
		return contractEnclosure;
	}
	public void setContractEnclosure(String contractEnclosure) {
		this.contractEnclosure = contractEnclosure;
	}
	public List<DocumentFiles> getDocumentFiles() {
		return DocumentFiles;
	}
	public void setDocumentFiles(List<DocumentFiles> documentFiles) {
		DocumentFiles = documentFiles;
	}
	
}