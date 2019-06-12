package com.htyw.app.pollingDetails.pojo;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class PrgDecorationRegMiddle {
    private Long id;

    private String parentId;

    private String decoApprovalId;

    private Long decoApprovalState;

    private String tenant;

    private String tenantCon;

    private String formTenantId;

    private String formTenant;

    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date tenantTimeStrat;

    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date tenantTimeEnd;

    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date decoTimeStrat;

    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date decoTimeEnd;

    private BigDecimal decoSureCost;

    private Long checkState;

    private String deocIngPeson;

    private String deocCompanyName;

    private String remarks;

    private String enc;

    private String organizationId;

    private String organizationName;

    private String creatorId;

    private String creatorName;

    private String billStatus;

    private String tenantid;

    private String dr;
    
    private String finish_number;
    
    private String status;

    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getDecoApprovalId() {
        return decoApprovalId;
    }

    public void setDecoApprovalId(String decoApprovalId) {
        this.decoApprovalId = decoApprovalId == null ? null : decoApprovalId.trim();
    }

    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getDecoApprovalState() {
        return decoApprovalState;
    }

    public void setDecoApprovalState(Long decoApprovalState) {
        this.decoApprovalState = decoApprovalState;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant == null ? null : tenant.trim();
    }

    public String getTenantCon() {
        return tenantCon;
    }

    public void setTenantCon(String tenantCon) {
        this.tenantCon = tenantCon == null ? null : tenantCon.trim();
    }

    public String getFormTenantId() {
        return formTenantId;
    }

    public void setFormTenantId(String formTenantId) {
        this.formTenantId = formTenantId == null ? null : formTenantId.trim();
    }

    public String getFormTenant() {
        return formTenant;
    }

    public void setFormTenant(String formTenant) {
        this.formTenant = formTenant == null ? null : formTenant.trim();
    }

    public Date getTenantTimeStrat() {
        return tenantTimeStrat;
    }

    public void setTenantTimeStrat(Date tenantTimeStrat) {
        this.tenantTimeStrat = tenantTimeStrat;
    }

    public Date getTenantTimeEnd() {
        return tenantTimeEnd;
    }

    public void setTenantTimeEnd(Date tenantTimeEnd) {
        this.tenantTimeEnd = tenantTimeEnd;
    }

    public Date getDecoTimeStrat() {
        return decoTimeStrat;
    }

    public void setDecoTimeStrat(Date decoTimeStrat) {
        this.decoTimeStrat = decoTimeStrat;
    }

    public Date getDecoTimeEnd() {
        return decoTimeEnd;
    }

    public void setDecoTimeEnd(Date decoTimeEnd) {
        this.decoTimeEnd = decoTimeEnd;
    }

    public BigDecimal getDecoSureCost() {
        return decoSureCost;
    }

    public void setDecoSureCost(BigDecimal decoSureCost) {
        this.decoSureCost = decoSureCost;
    }

    @JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
    public Long getCheckState() {
        return checkState;
    }

    public void setCheckState(Long checkState) {
        this.checkState = checkState;
    }

    public String getDeocIngPeson() {
        return deocIngPeson;
    }

    public void setDeocIngPeson(String deocIngPeson) {
        this.deocIngPeson = deocIngPeson == null ? null : deocIngPeson.trim();
    }

    public String getDeocCompanyName() {
        return deocCompanyName;
    }

    public void setDeocCompanyName(String deocCompanyName) {
        this.deocCompanyName = deocCompanyName == null ? null : deocCompanyName.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getEnc() {
        return enc;
    }

    public void setEnc(String enc) {
        this.enc = enc == null ? null : enc.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
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

    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid == null ? null : tenantid.trim();
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr == null ? null : dr.trim();
    }

	public String getFinish_number() {
		return finish_number;
	}

	public void setFinish_number(String finish_number) {
		this.finish_number = finish_number;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
    
    
}