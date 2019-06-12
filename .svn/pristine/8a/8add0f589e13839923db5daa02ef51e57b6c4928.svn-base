package com.htyw.app.houseLeasing.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class Visitor {
	//自增主键
    private Long id;
    //被访人姓名
    private String intervieweeName;
    //被访人手机号
    private String intervieweeIphoneNum;
    //被访人房间
    private String intervieweeHouse;
    //访客姓名
    private String visitorName;
    //访客id
    private Long visitorId;
    //访客手机号
    private String visitorIphoneNum;
    //访客证件号
    private String visitorIdNumber;  
    //访客申请证件类型（1:身份证）
    private String visitorIdNumberType;
    //访客访问开始时间
    private Date visitStatrTime;
    //访客访问结束时间
    private Date visitEndTime;
    //申请原因描述
    private String applyDesc;
    //申请人照片
    private String visitPicture;
    //访客登记记录状态
    private String status;
    //数据新增时间
    private Date dateCreateTime;
    //数据更改时间
    private Date dateUpdataTime;
    //删除标识
    private String dr;
    //访客预约类型(0l临时访客;1预约访客)
    private String visitorsMakeType;
    //拒绝内容
    private String refuseContent;
    //客户姓名
    private String contactNumber;
    //客户手机号
    private String customerName;
    
    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName == null ? null : visitorName.trim();
    }


    public String getIntervieweeName() {
        return intervieweeName;
    }

    public void setIntervieweeName(String intervieweeName) {
        this.intervieweeName = intervieweeName == null ? null : intervieweeName.trim();
    }
    public String getVisitorIphoneNum() {
		return visitorIphoneNum;
	}

	public void setVisitorIphoneNum(String visitorIphoneNum) {
		this.visitorIphoneNum = visitorIphoneNum;
	}

	public String getVisitorIdNumber() {
		return visitorIdNumber;
	}

	public void setVisitorIdNumber(String visitorIdNumber) {
		this.visitorIdNumber = visitorIdNumber;
	}

	public String getIntervieweeIphoneNum() {
		return intervieweeIphoneNum;
	}

	public void setIntervieweeIphoneNum(String intervieweeIphoneNum) {
		this.intervieweeIphoneNum = intervieweeIphoneNum;
	}

	public String getVisitorIdNumberType() {
		return visitorIdNumberType;
	}

	public void setVisitorIdNumberType(String visitorIdNumberType) {
		this.visitorIdNumberType = visitorIdNumberType;
	}
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getVisitStatrTime() {
        return visitStatrTime;
    }

    public void setVisitStatrTime(Date visitStatrTime) {
        this.visitStatrTime = visitStatrTime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getVisitEndTime() {
        return visitEndTime;
    }

    public void setVisitEndTime(Date visitEndTime) {
        this.visitEndTime = visitEndTime;
    }

    public String getApplyDesc() {
        return applyDesc;
    }

    public void setApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc == null ? null : applyDesc.trim();
    }

    public String getVisitPicture() {
        return visitPicture;
    }

    public void setVisitPicture(String visitPicture) {
        this.visitPicture = visitPicture == null ? null : visitPicture.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getDateCreateTime() {
        return dateCreateTime;
    }

    public void setDateCreateTime(Date dateCreateTime) {
        this.dateCreateTime = dateCreateTime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getDateUpdataTime() {
        return dateUpdataTime;
    }

    public void setDateUpdataTime(Date dateUpdataTime) {
        this.dateUpdataTime = dateUpdataTime;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr == null ? null : dr.trim();
    }

    public String getVisitorsMakeType() {
        return visitorsMakeType;
    }

    public void setVisitorsMakeType(String visitorsMakeType) {
        this.visitorsMakeType = visitorsMakeType == null ? null : visitorsMakeType.trim();
    }
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(Long visitorId) {
		this.visitorId = visitorId;
	}

	public String getIntervieweeHouse() {
		return intervieweeHouse;
	}

	public void setIntervieweeHouse(String intervieweeHouse) {
		this.intervieweeHouse = intervieweeHouse;
	}

	public String getRefuseContent() {
		return refuseContent;
	}

	public void setRefuseContent(String refuseContent) {
		this.refuseContent = refuseContent;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
    
}