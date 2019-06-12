package com.htyw.app.checkingIN.pojo;

import java.util.Date;

public class CheckingInConfiguration {
    private Long id;

    private String theme;
    private String location;

    private String locationScope;

    private Date officeHours;
    private Date closingTime;
    private Long tenantid;

    private String longitude;

    private String latitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking_in_configuration.THEME
     *
     * @param theme the value for checking_in_configuration.THEME
     *
     * @mbg.generated
     */
    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checking_in_configuration.LOCATION
     *
     * @return the value of checking_in_configuration.LOCATION
     *
     * @mbg.generated
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking_in_configuration.LOCATION
     *
     * @param location the value for checking_in_configuration.LOCATION
     *
     * @mbg.generated
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checking_in_configuration.LOCATION_SCOPE
     *
     * @return the value of checking_in_configuration.LOCATION_SCOPE
     *
     * @mbg.generated
     */
    public String getLocationScope() {
        return locationScope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking_in_configuration.LOCATION_SCOPE
     *
     * @param locationScope the value for checking_in_configuration.LOCATION_SCOPE
     *
     * @mbg.generated
     */
    public void setLocationScope(String locationScope) {
        this.locationScope = locationScope == null ? null : locationScope.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checking_in_configuration.OFFICE_HOURS
     *
     * @return the value of checking_in_configuration.OFFICE_HOURS
     *
     * @mbg.generated
     */
    public Date getOfficeHours() {
        return officeHours;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking_in_configuration.OFFICE_HOURS
     *
     * @param officeHours the value for checking_in_configuration.OFFICE_HOURS
     *
     * @mbg.generated
     */
    public void setOfficeHours(Date officeHours) {
        this.officeHours = officeHours;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checking_in_configuration.CLOSING_TIME
     *
     * @return the value of checking_in_configuration.CLOSING_TIME
     *
     * @mbg.generated
     */
    public Date getClosingTime() {
        return closingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking_in_configuration.CLOSING_TIME
     *
     * @param closingTime the value for checking_in_configuration.CLOSING_TIME
     *
     * @mbg.generated
     */
    public void setClosingTime(Date closingTime) {
        this.closingTime = closingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checking_in_configuration.TENANTID
     *
     * @return the value of checking_in_configuration.TENANTID
     *
     * @mbg.generated
     */
    public Long getTenantid() {
        return tenantid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking_in_configuration.TENANTID
     *
     * @param tenantid the value for checking_in_configuration.TENANTID
     *
     * @mbg.generated
     */
    public void setTenantid(Long tenantid) {
        this.tenantid = tenantid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checking_in_configuration.LONGITUDE
     *
     * @return the value of checking_in_configuration.LONGITUDE
     *
     * @mbg.generated
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking_in_configuration.LONGITUDE
     *
     * @param longitude the value for checking_in_configuration.LONGITUDE
     *
     * @mbg.generated
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checking_in_configuration.LATITUDE
     *
     * @return the value of checking_in_configuration.LATITUDE
     *
     * @mbg.generated
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking_in_configuration.LATITUDE
     *
     * @param latitude the value for checking_in_configuration.LATITUDE
     *
     * @mbg.generated
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }
}