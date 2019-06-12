package com.htyw.app.insideInformation.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class PrgInternalNotification {
	private Long id;

	private String title;

	private String image;

	private String url;

	private String releaseScope;

	private String content;

	private String roofPlacement;

	private String publisher;
	
	private String customer_name;
	
	private Long customer_id;
	
	@JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
	private Date publishDate;

	@JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
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

	private String type;
	
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getId() {
		return String.valueOf(id);
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
		if (image != null) {
			return image;
		}
		return "";
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
		if (releaseScope != null) {
			return releaseScope;
		}
		return "";
	}

	public void setReleaseScope(String releaseScope) {
		this.releaseScope = releaseScope == null ? null : releaseScope.trim();
	}

	public String getContent() {
		if (content != null) {
			return content;
		}
		return "";
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public String getRoofPlacement() {
		if (roofPlacement != null) {
			return roofPlacement;
		}
		return "";
	}

	public void setRoofPlacement(String roofPlacement) {
		this.roofPlacement = roofPlacement == null ? null : roofPlacement.trim();
	}

	public String getPublisher() {
		if (publisher != null) {
			return publisher;
		}
		return "";
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher == null ? null : publisher.trim();
	}

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
		if (state != null) {
			return state;
		}
		return "";

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
		if(organizationName!=null){
			 return organizationName;
		}
        return "";
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
		if(creatorName!=null){
			return creatorName;
		}
		return "";
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}
}