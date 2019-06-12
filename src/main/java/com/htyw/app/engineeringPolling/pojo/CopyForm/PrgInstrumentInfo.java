package com.htyw.app.engineeringPolling.pojo.CopyForm;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class PrgInstrumentInfo {
    private Long id;

    private String instrumentNumber;

    private String instrumentName;

    private Long instrumentTypeId;

    private String instrumentType;

    private String instrumentTypeName;

    private Long housingResourcesId;

    private String housingResources;

    private String meterReadingCycle;

    private String instrumentStatus;

    private String scaleName;

    private Double initialReadingHistory;

    private Double initialReading;

    private String oldOrNew;

    private Long tenantid;

    private String dr;

    private Long organizationId;

    private String organizationName;

    private Long creatorId;

    private String creatorName;

    private String billStatus;
    
    private BigDecimal unitPrice;

    public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstrumentNumber() {
        return instrumentNumber;
    }

    public void setInstrumentNumber(String instrumentNumber) {
        this.instrumentNumber = instrumentNumber == null ? null : instrumentNumber.trim();
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName == null ? null : instrumentName.trim();
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

    public String getInstrumentTypeName() {
        return instrumentTypeName;
    }

    public void setInstrumentTypeName(String instrumentTypeName) {
        this.instrumentTypeName = instrumentTypeName == null ? null : instrumentTypeName.trim();
    }

    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getHousingResourcesId() {
        return housingResourcesId;
    }

    public void setHousingResourcesId(Long housingResourcesId) {
        this.housingResourcesId = housingResourcesId;
    }

    public String getHousingResources() {
        return housingResources;
    }

    public void setHousingResources(String housingResources) {
        this.housingResources = housingResources == null ? null : housingResources.trim();
    }

    public String getMeterReadingCycle() {
        return meterReadingCycle;
    }

    public void setMeterReadingCycle(String meterReadingCycle) {
        this.meterReadingCycle = meterReadingCycle == null ? null : meterReadingCycle.trim();
    }

    public String getInstrumentStatus() {
        return instrumentStatus;
    }

    public void setInstrumentStatus(String instrumentStatus) {
        this.instrumentStatus = instrumentStatus == null ? null : instrumentStatus.trim();
    }

    public String getScaleName() {
        return scaleName;
    }

    public void setScaleName(String scaleName) {
        this.scaleName = scaleName == null ? null : scaleName.trim();
    }

    public Double getInitialReadingHistory() {
        return initialReadingHistory;
    }

    public void setInitialReadingHistory(Double initialReadingHistory) {
        this.initialReadingHistory = initialReadingHistory;
    }

    public Double getInitialReading() {
        return initialReading;
    }

    public void setInitialReading(Double initialReading) {
        this.initialReading = initialReading;
    }

    public String getOldOrNew() {
        return oldOrNew;
    }

    public void setOldOrNew(String oldOrNew) {
        this.oldOrNew = oldOrNew == null ? null : oldOrNew.trim();
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