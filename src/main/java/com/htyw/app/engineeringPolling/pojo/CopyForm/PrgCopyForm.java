package com.htyw.app.engineeringPolling.pojo.CopyForm;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class PrgCopyForm {
    private Long id;

    private String readingNum;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date readingDate;

    private String readingType;

    private String isOpenAccount;

    private String state;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date openAccountDate;

    private Long instrumentTypeId;

    private String instrumentType;

    private Long tenantid;

    private String dr;

    private Long organizationId;

    private String organizationName;

    private Long creatorId;

    private String creatorName;

    private String billStatus;
    private String receiptsName;
    private String copyNameId;

    public String getCopyNameId() {
		return copyNameId;
	}

	public void setCopyNameId(String copyNameId) {
		this.copyNameId = copyNameId;
	}

	public String getReceiptsName() {
		return receiptsName;
	}

	public void setReceiptsName(String receiptsName) {
		this.receiptsName = receiptsName;
	}

	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReadingNum() {
        return readingNum;
    }

    public void setReadingNum(String readingNum) {
        this.readingNum = readingNum == null ? null : readingNum.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getReadingDate() {
        return readingDate;
    }

    public void setReadingDate(Date readingDate) {
        this.readingDate = readingDate;
    }

    public String getReadingType() {
        return readingType;
    }

    public void setReadingType(String readingType) {
        this.readingType = readingType == null ? null : readingType.trim();
    }

    public String getIsOpenAccount() {
        return isOpenAccount;
    }

    public void setIsOpenAccount(String isOpenAccount) {
        this.isOpenAccount = isOpenAccount == null ? null : isOpenAccount.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getOpenAccountDate() {
        return openAccountDate;
    }

    public void setOpenAccountDate(Date openAccountDate) {
        this.openAccountDate = openAccountDate;
    }

    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getInstrumentTypeId() {
        return instrumentTypeId;
    }

    public void setInstrumentTypeId(Long instrumentTypeId) {
        this.instrumentTypeId = instrumentTypeId;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType == null ? null : instrumentType.trim();
    }

    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getTenantid() {
        return tenantid;
    }

    public void setTenantid(Long tenantid) {
        this.tenantid = tenantid;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr == null ? null : dr.trim();
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

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }
}