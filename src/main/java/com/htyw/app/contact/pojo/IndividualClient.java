package com.htyw.app.contact.pojo;

public class IndividualClient {
	private String id;
	private String CUSTOMERNAME;
	private String CONTACTNUMBER;
	private String email;
	private String CONTACTADDRESS;
	private String headImageUrl;
	private String tenantId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCUSTOMERNAME() {
		return CUSTOMERNAME;
	}

	public void setCUSTOMERNAME(String cUSTOMERNAME) {
		CUSTOMERNAME = cUSTOMERNAME;
	}

	public String getCONTACTNUMBER() {
		return CONTACTNUMBER;
	}

	public void setCONTACTNUMBER(String cONTACTNUMBER) {
		CONTACTNUMBER = cONTACTNUMBER;
	}

	public String getHeadImageUrl() {
		return headImageUrl;
	}

	public void setHeadImageUrl(String headImageUrl) {
		this.headImageUrl = headImageUrl;
	}

	public String getCONTACTADDRESS() {
		return CONTACTADDRESS;
	}

	public void setCONTACTADDRESS(String cONTACTADDRESS) {
		CONTACTADDRESS = cONTACTADDRESS;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
