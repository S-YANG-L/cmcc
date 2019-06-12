package com.htyw.app.community.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class CommunityNote {
    private Long id;

    private String title;

    private String image;

    private String url;

    private String releaseScope;

    private String content;

    private String roofPlacement;

    private String publisher;

    private Date publishDate;

    private Date lastUpdateDate;

    private String state;

    private String tenantid;

    private String dr;

    private String organizationId;

    private String organizationName;

    private String creatorId;

    private String creatorName;

    private String billStatus;

    private String rmUserId;
    
    private String sId;
    
    private String type;
    
 private Date dstart;
    
    private Date dend;
    
    private Long customerId;
    
    private String customerName;
    
    
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

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getReleaseScope() {
        return releaseScope;
    }

    public void setReleaseScope(String releaseScope) {
        this.releaseScope = releaseScope == null ? null : releaseScope.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRoofPlacement() {
        return roofPlacement;
    }

    public void setRoofPlacement(String roofPlacement) {
        this.roofPlacement = roofPlacement == null ? null : roofPlacement.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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

    public String getRmUserId() {
        return rmUserId;
    }

    public void setRmUserId(String rmUserId) {
        this.rmUserId = rmUserId == null ? null : rmUserId.trim();
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
    
}