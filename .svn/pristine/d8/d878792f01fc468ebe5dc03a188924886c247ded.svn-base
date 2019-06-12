package com.htyw.app.houseLeasing.pojo;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class Repair {
	//主键
    private Long id;
    //房产客户主键
    private Long realEstateCustomerId;
    //房产客户
    private String realEstateCustomer;
    //房间名称
    private String houseName;
    //联系人
    private String contacts;
    //联系电话
    private Long contactNumber;
    //联系地址
    private String contactAddress;
    //收费对象
    private String chargingObject;
    //预约日期

    private Date appointmentDate;
    //客服事件来源
    private String customerEventSource;
    //客服事件
    private String customerEvent;
    //投诉人
    private String complaintPeople;
    //投诉电话
    private Long complaintPhone;
    //投诉性别（0：男，1：女）
    private String complaintSex;
    //投诉内容
    private String complaintContent;
    //报修人
    private String repairPeople;
    //报修日期
    
    private Date repairDate;
    //报修位置
    private String repairPosition;
    //报修内容
    private String repairContent;
    //报修图片
    private String repairImage;
    //服务地址
    private String serviceAddress;
    //服务内容
    private String serviceContent;
    //接单人
    private String singlePerson;
    //起草日期
   
    private Date draftDate;
    //备注
    private String remark;
    //租户主键
    private Long tenantid;
    //创建人主键
    private Long creatorId;
    //创建人名称
    private String creatorName;
    //公司主键
    private Long organizationId;
    //公司名称
    private String organizationName;
    //审批状态
    private String billStatus;
    //删除标识（0：未删除，1：已删除）
    private String dr;
    //版本号
    private BigDecimal version;
    //工单编码
    private String billNumber;
    //接单日期
    private String receiveOrder;
    //单据类型0：投诉、咨询类 1:报修类 2:预约类
    private String orderType;
    //单据内容
    private String orderContent;
    //单据状态 0：起草 1:已接单 2:已派单，进行中 3:结果回填已完成 4:重新派单 5:已完成 6:待派单7:已派单，待接单  
    private String orderStatus;
    //是否锁单 0 不锁单  1锁单
    private String lockStatus;
    //回访人
    private String feedbackPeople;
    //回访方式
    private String feedbackType;
    //回访情况
    private String feedbackCircumstances;
    //回访满意度
    private String feedbackFraction;
    //派单人
    private String sendPeople;
    //派单人id
    private Long sendPeopleId;
    //接单人id
    private Long singleId;
    //是否自动 0否  1是
    private String isAuto;
    //派单次数
    private Integer redispatchTimes;
    //处理情况
    private String handlingSituation;
    //处理图片
    private String processPicture;
    //用户满意度
    private String userFraction;
    //用户评价
    private String userEvaluate;
    
    private Date dstart;
    
    private Date dend;
    
    
    
    public Date getDstart() {
		return dstart;
	}

	public void setDstart(Date dstart) {
		this.dstart = dstart;
	}

	public Date getDend() {
		return dend;
	}

	public void setDend(Date dend) {
		this.dend = dend;
	}

	public String getUserFraction() {
		return userFraction;
	}

	public void setUserFraction(String userFraction) {
		this.userFraction = userFraction;
	}

	public String getUserEvaluate() {
		return userEvaluate;
	}

	public void setUserEvaluate(String userEvaluate) {
		this.userEvaluate = userEvaluate;
	}

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
    public Long getRealEstateCustomerId() {
        return realEstateCustomerId;
    }

    public void setRealEstateCustomerId(Long realEstateCustomerId) {
        this.realEstateCustomerId = realEstateCustomerId;
    }

    public String getRealEstateCustomer() {
        return realEstateCustomer;
    }

    public void setRealEstateCustomer(String realEstateCustomer) {
        this.realEstateCustomer = realEstateCustomer == null ? null : realEstateCustomer.trim();
    }

    public String getHouseName() {
        return houseName;
    }

    
    public String getRepairImage() {
		return repairImage;
	}

	public void setRepairImage(String repairImage) {
		this.repairImage = repairImage;
	}

	public void setHouseName(String houseName) {
        this.houseName = houseName == null ? null : houseName.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public String getChargingObject() {
        return chargingObject;
    }

    public void setChargingObject(String chargingObject) {
        this.chargingObject = chargingObject == null ? null : chargingObject.trim();
    }
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getCustomerEventSource() {
        return customerEventSource;
    }

    public void setCustomerEventSource(String customerEventSource) {
        this.customerEventSource = customerEventSource == null ? null : customerEventSource.trim();
    }

    public String getCustomerEvent() {
        return customerEvent;
    }

    public void setCustomerEvent(String customerEvent) {
        this.customerEvent = customerEvent == null ? null : customerEvent.trim();
    }

    public String getComplaintPeople() {
        return complaintPeople;
    }

    public void setComplaintPeople(String complaintPeople) {
        this.complaintPeople = complaintPeople == null ? null : complaintPeople.trim();
    }

    public Long getComplaintPhone() {
        return complaintPhone;
    }

    public void setComplaintPhone(Long complaintPhone) {
        this.complaintPhone = complaintPhone;
    }

    public String getComplaintSex() {
        return complaintSex;
    }

    public void setComplaintSex(String complaintSex) {
        this.complaintSex = complaintSex == null ? null : complaintSex.trim();
    }

    public String getComplaintContent() {
        return complaintContent;
    }

    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent == null ? null : complaintContent.trim();
    }

    public String getRepairPeople() {
        return repairPeople;
    }

    public void setRepairPeople(String repairPeople) {
        this.repairPeople = repairPeople == null ? null : repairPeople.trim();
    }

    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public String getRepairPosition() {
        return repairPosition;
    }

    public void setRepairPosition(String repairPosition) {
        this.repairPosition = repairPosition == null ? null : repairPosition.trim();
    }

    public String getRepairContent() {
        return repairContent;
    }

    public void setRepairContent(String repairContent) {
        this.repairContent = repairContent == null ? null : repairContent.trim();
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress == null ? null : serviceAddress.trim();
    }

    public String getServiceContent() {
        return serviceContent;
    }

    public void setServiceContent(String serviceContent) {
        this.serviceContent = serviceContent == null ? null : serviceContent.trim();
    }

    public String getSinglePerson() {
        return singlePerson;
    }

    public void setSinglePerson(String singlePerson) {
        this.singlePerson = singlePerson == null ? null : singlePerson.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getDraftDate() {
        return draftDate;
    }

    public void setDraftDate(Date draftDate) {
        this.draftDate = draftDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getTenantid() {
        return tenantid;
    }

    public void setTenantid(Long tenantid) {
        this.tenantid = tenantid;
    }
    
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }
    
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr == null ? null : dr.trim();
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber == null ? null : billNumber.trim();
    }

    public String getReceiveOrder() {
        return receiveOrder;
    }

    public void setReceiveOrder(String receiveOrder) {
        this.receiveOrder = receiveOrder == null ? null : receiveOrder.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus == null ? null : lockStatus.trim();
    }

    public String getFeedbackPeople() {
        return feedbackPeople;
    }

    public void setFeedbackPeople(String feedbackPeople) {
        this.feedbackPeople = feedbackPeople == null ? null : feedbackPeople.trim();
    }

    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType == null ? null : feedbackType.trim();
    }

    public String getFeedbackCircumstances() {
        return feedbackCircumstances;
    }

    public void setFeedbackCircumstances(String feedbackCircumstances) {
        this.feedbackCircumstances = feedbackCircumstances == null ? null : feedbackCircumstances.trim();
    }

    public String getFeedbackFraction() {
        return feedbackFraction;
    }

    public void setFeedbackFraction(String feedbackFraction) {
        this.feedbackFraction = feedbackFraction == null ? null : feedbackFraction.trim();
    }

    public String getSendPeople() {
        return sendPeople;
    }

    public void setSendPeople(String sendPeople) {
        this.sendPeople = sendPeople == null ? null : sendPeople.trim();
    }
    
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getSendPeopleId() {
        return sendPeopleId;
    }

    public void setSendPeopleId(Long sendPeopleId) {
        this.sendPeopleId = sendPeopleId;
    }
    
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getSingleId() {
        return singleId;
    }

    public void setSingleId(Long singleId) {
        this.singleId = singleId;
    }

    public String getIsAuto() {
        return isAuto;
    }

    public void setIsAuto(String isAuto) {
        this.isAuto = isAuto == null ? null : isAuto.trim();
    }

    public Integer getRedispatchTimes() {
        return redispatchTimes;
    }

    public void setRedispatchTimes(Integer redispatchTimes) {
        this.redispatchTimes = redispatchTimes;
    }

    public String getHandlingSituation() {
        return handlingSituation;
    }

    public void setHandlingSituation(String handlingSituation) {
        this.handlingSituation = handlingSituation == null ? null : handlingSituation.trim();
    }

    public String getProcessPicture() {
        return processPicture;
    }

    public void setProcessPicture(String processPicture) {
        this.processPicture = processPicture == null ? null : processPicture.trim();
    }
}