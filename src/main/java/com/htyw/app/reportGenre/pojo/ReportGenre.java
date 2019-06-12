package com.htyw.app.reportGenre.pojo;

public class ReportGenre {
    private Long id;

    private String reportGenre;

    private Long tenantid;
    
    private String strid;
    
    public String getStrid() {
		return strid;
	}

	public void setStrid(String strid) {
		this.strid = strid;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReportGenre() {
        return reportGenre;
    }

    public void setReportGenre(String reportGenre) {
        this.reportGenre = reportGenre == null ? null : reportGenre.trim();
    }

    public Long getTenantid() {
        return tenantid;
    }

    public void setTenantid(Long tenantid) {
        this.tenantid = tenantid;
    }
}