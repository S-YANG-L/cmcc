package com.htyw.app.workOrder.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class WorkOrder {
	private String id;
	private String billNumber;
	private String realEstateCustomerId;
	private String realEstateCustomer;
	private String contacts;
	private String houseName;
	private String contactNumber;
	private String orderContent;
	private String contactAddress;
	private String repairPeopleId;
	private String repairPeople;
	private Date draftDate;
	private Date repairDate;
	private Date appointmentDate;
	private String orderType;
	private String orderStatus;
	private String singlePerson;
	private String singleId;
	private String repairPosition;
	private String serviceAddress;
	private String serviceType;
	private String repairImage;
	private String processPicture;
	private String serviceContent;
	private String repairContent;
	private String busId;
	private String remark;
	private String complaintPeople;
	private String complaintPhone;
	private String complaintSex;
	private String customerEvent;
	private String customerEventSource;
	private String complaintContent;
	private String tenantId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public String getRealEstateCustomerId() {
		return realEstateCustomerId;
	}

	public void setRealEstateCustomerId(String realEstateCustomerId) {
		this.realEstateCustomerId = realEstateCustomerId;
	}

	public String getSingleId() {
		return singleId;
	}

	public void setSingleId(String singleId) {
		this.singleId = singleId;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getRealEstateCustomer() {
		return realEstateCustomer;
	}

	public void setRealEstateCustomer(String realEstateCustomer) {
		this.realEstateCustomer = realEstateCustomer;
	}

	public String getRepairPeople() {
		return repairPeople;
	}

	public void setRepairPeople(String repairPeople) {
		this.repairPeople = repairPeople;
	}

	public String getRepairPosition() {
		return repairPosition;
	}

	public void setRepairPosition(String repairPosition) {
		this.repairPosition = repairPosition;
	}

	public String getServiceContent() {
		return serviceContent;
	}

	public void setServiceContent(String serviceContent) {
		this.serviceContent = serviceContent;
	}

	public String getCustomerEvent() {
		return customerEvent;
	}

	public void setCustomerEvent(String customerEvent) {
		this.customerEvent = customerEvent;
	}

	public String getServiceAddress() {
		return serviceAddress;
	}

	public void setServiceAddress(String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getRepairImage() {
		return repairImage;
	}

	public void setRepairImage(String repairImage) {
		this.repairImage = repairImage;
	}

	public String getProcessPicture() {
		return processPicture;
	}

	public void setProcessPicture(String processPicture) {
		this.processPicture = processPicture;
	}

	public String getCustomerEventSource() {
		return customerEventSource;
	}

	public void setCustomerEventSource(String customerEventSource) {
		this.customerEventSource = customerEventSource;
	}

	public String getComplaintContent() {
		return complaintContent;
	}

	public void setComplaintContent(String complaintContent) {
		this.complaintContent = complaintContent;
	}

	public String getRepairContent() {
		return repairContent;
	}

	public void setRepairContent(String repairContent) {
		this.repairContent = repairContent;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSinglePerson() {
		return singlePerson;
	}

	public void setSinglePerson(String singlePerson) {
		this.singlePerson = singlePerson;
	}

	public String getRepairPeopleId() {
		return repairPeopleId;
	}

	public void setRepairPeopleId(String repairPeopleId) {
		this.repairPeopleId = repairPeopleId;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getDraftDate() {
		return draftDate;
	}

	public void setDraftDate(Date draftDate) {
		this.draftDate = draftDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getRepairDate() {
		return repairDate;
	}

	public void setRepairDate(Date repairDate) {
		this.repairDate = repairDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getOrderContent() {
		return orderContent;
	}

	public void setOrderContent(String orderContent) {
		this.orderContent = orderContent;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getComplaintPeople() {
		return complaintPeople;
	}

	public void setComplaintPeople(String complaintPeople) {
		this.complaintPeople = complaintPeople;
	}

	public String getComplaintPhone() {
		return complaintPhone;
	}

	public void setComplaintPhone(String complaintPhone) {
		this.complaintPhone = complaintPhone;
	}

	public String getComplaintSex() {
		return complaintSex;
	}

	public void setComplaintSex(String complaintSex) {
		this.complaintSex = complaintSex;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
