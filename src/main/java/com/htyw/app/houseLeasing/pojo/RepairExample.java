package com.htyw.app.houseLeasing.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIdIsNull() {
            addCriterion("REAL_ESTATE_CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIdIsNotNull() {
            addCriterion("REAL_ESTATE_CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIdEqualTo(Long value) {
            addCriterion("REAL_ESTATE_CUSTOMER_ID =", value, "realEstateCustomerId");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIdNotEqualTo(Long value) {
            addCriterion("REAL_ESTATE_CUSTOMER_ID <>", value, "realEstateCustomerId");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIdGreaterThan(Long value) {
            addCriterion("REAL_ESTATE_CUSTOMER_ID >", value, "realEstateCustomerId");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REAL_ESTATE_CUSTOMER_ID >=", value, "realEstateCustomerId");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIdLessThan(Long value) {
            addCriterion("REAL_ESTATE_CUSTOMER_ID <", value, "realEstateCustomerId");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("REAL_ESTATE_CUSTOMER_ID <=", value, "realEstateCustomerId");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIdIn(List<Long> values) {
            addCriterion("REAL_ESTATE_CUSTOMER_ID in", values, "realEstateCustomerId");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIdNotIn(List<Long> values) {
            addCriterion("REAL_ESTATE_CUSTOMER_ID not in", values, "realEstateCustomerId");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIdBetween(Long value1, Long value2) {
            addCriterion("REAL_ESTATE_CUSTOMER_ID between", value1, value2, "realEstateCustomerId");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("REAL_ESTATE_CUSTOMER_ID not between", value1, value2, "realEstateCustomerId");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIsNull() {
            addCriterion("REAL_ESTATE_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIsNotNull() {
            addCriterion("REAL_ESTATE_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerEqualTo(String value) {
            addCriterion("REAL_ESTATE_CUSTOMER =", value, "realEstateCustomer");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerNotEqualTo(String value) {
            addCriterion("REAL_ESTATE_CUSTOMER <>", value, "realEstateCustomer");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerGreaterThan(String value) {
            addCriterion("REAL_ESTATE_CUSTOMER >", value, "realEstateCustomer");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_ESTATE_CUSTOMER >=", value, "realEstateCustomer");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerLessThan(String value) {
            addCriterion("REAL_ESTATE_CUSTOMER <", value, "realEstateCustomer");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerLessThanOrEqualTo(String value) {
            addCriterion("REAL_ESTATE_CUSTOMER <=", value, "realEstateCustomer");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerLike(String value) {
            addCriterion("REAL_ESTATE_CUSTOMER like", value, "realEstateCustomer");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerNotLike(String value) {
            addCriterion("REAL_ESTATE_CUSTOMER not like", value, "realEstateCustomer");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerIn(List<String> values) {
            addCriterion("REAL_ESTATE_CUSTOMER in", values, "realEstateCustomer");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerNotIn(List<String> values) {
            addCriterion("REAL_ESTATE_CUSTOMER not in", values, "realEstateCustomer");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerBetween(String value1, String value2) {
            addCriterion("REAL_ESTATE_CUSTOMER between", value1, value2, "realEstateCustomer");
            return (Criteria) this;
        }

        public Criteria andRealEstateCustomerNotBetween(String value1, String value2) {
            addCriterion("REAL_ESTATE_CUSTOMER not between", value1, value2, "realEstateCustomer");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNull() {
            addCriterion("HOUSE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNotNull() {
            addCriterion("HOUSE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNameEqualTo(String value) {
            addCriterion("HOUSE_NAME =", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotEqualTo(String value) {
            addCriterion("HOUSE_NAME <>", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThan(String value) {
            addCriterion("HOUSE_NAME >", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSE_NAME >=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThan(String value) {
            addCriterion("HOUSE_NAME <", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThanOrEqualTo(String value) {
            addCriterion("HOUSE_NAME <=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLike(String value) {
            addCriterion("HOUSE_NAME like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotLike(String value) {
            addCriterion("HOUSE_NAME not like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameIn(List<String> values) {
            addCriterion("HOUSE_NAME in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotIn(List<String> values) {
            addCriterion("HOUSE_NAME not in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameBetween(String value1, String value2) {
            addCriterion("HOUSE_NAME between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotBetween(String value1, String value2) {
            addCriterion("HOUSE_NAME not between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("CONTACTS is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("CONTACTS is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("CONTACTS =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("CONTACTS <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("CONTACTS >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("CONTACTS <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("CONTACTS like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("CONTACTS not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("CONTACTS in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("CONTACTS not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("CONTACTS between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("CONTACTS not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNull() {
            addCriterion("CONTACT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNotNull() {
            addCriterion("CONTACT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andContactNumberEqualTo(Long value) {
            addCriterion("CONTACT_NUMBER =", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotEqualTo(Long value) {
            addCriterion("CONTACT_NUMBER <>", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThan(Long value) {
            addCriterion("CONTACT_NUMBER >", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTACT_NUMBER >=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThan(Long value) {
            addCriterion("CONTACT_NUMBER <", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThanOrEqualTo(Long value) {
            addCriterion("CONTACT_NUMBER <=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberIn(List<Long> values) {
            addCriterion("CONTACT_NUMBER in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotIn(List<Long> values) {
            addCriterion("CONTACT_NUMBER not in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberBetween(Long value1, Long value2) {
            addCriterion("CONTACT_NUMBER between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotBetween(Long value1, Long value2) {
            addCriterion("CONTACT_NUMBER not between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("CONTACT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("CONTACT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("CONTACT_ADDRESS >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("CONTACT_ADDRESS <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("CONTACT_ADDRESS like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("CONTACT_ADDRESS not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("CONTACT_ADDRESS in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("CONTACT_ADDRESS not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("CONTACT_ADDRESS between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("CONTACT_ADDRESS not between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andChargingObjectIsNull() {
            addCriterion("CHARGING_OBJECT is null");
            return (Criteria) this;
        }

        public Criteria andChargingObjectIsNotNull() {
            addCriterion("CHARGING_OBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andChargingObjectEqualTo(String value) {
            addCriterion("CHARGING_OBJECT =", value, "chargingObject");
            return (Criteria) this;
        }

        public Criteria andChargingObjectNotEqualTo(String value) {
            addCriterion("CHARGING_OBJECT <>", value, "chargingObject");
            return (Criteria) this;
        }

        public Criteria andChargingObjectGreaterThan(String value) {
            addCriterion("CHARGING_OBJECT >", value, "chargingObject");
            return (Criteria) this;
        }

        public Criteria andChargingObjectGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGING_OBJECT >=", value, "chargingObject");
            return (Criteria) this;
        }

        public Criteria andChargingObjectLessThan(String value) {
            addCriterion("CHARGING_OBJECT <", value, "chargingObject");
            return (Criteria) this;
        }

        public Criteria andChargingObjectLessThanOrEqualTo(String value) {
            addCriterion("CHARGING_OBJECT <=", value, "chargingObject");
            return (Criteria) this;
        }

        public Criteria andChargingObjectLike(String value) {
            addCriterion("CHARGING_OBJECT like", value, "chargingObject");
            return (Criteria) this;
        }

        public Criteria andChargingObjectNotLike(String value) {
            addCriterion("CHARGING_OBJECT not like", value, "chargingObject");
            return (Criteria) this;
        }

        public Criteria andChargingObjectIn(List<String> values) {
            addCriterion("CHARGING_OBJECT in", values, "chargingObject");
            return (Criteria) this;
        }

        public Criteria andChargingObjectNotIn(List<String> values) {
            addCriterion("CHARGING_OBJECT not in", values, "chargingObject");
            return (Criteria) this;
        }

        public Criteria andChargingObjectBetween(String value1, String value2) {
            addCriterion("CHARGING_OBJECT between", value1, value2, "chargingObject");
            return (Criteria) this;
        }

        public Criteria andChargingObjectNotBetween(String value1, String value2) {
            addCriterion("CHARGING_OBJECT not between", value1, value2, "chargingObject");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIsNull() {
            addCriterion("APPOINTMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIsNotNull() {
            addCriterion("APPOINTMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateEqualTo(Date value) {
            addCriterionForJDBCDate("APPOINTMENT_DATE =", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("APPOINTMENT_DATE <>", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("APPOINTMENT_DATE >", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("APPOINTMENT_DATE >=", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLessThan(Date value) {
            addCriterionForJDBCDate("APPOINTMENT_DATE <", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("APPOINTMENT_DATE <=", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIn(List<Date> values) {
            addCriterionForJDBCDate("APPOINTMENT_DATE in", values, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("APPOINTMENT_DATE not in", values, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("APPOINTMENT_DATE between", value1, value2, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("APPOINTMENT_DATE not between", value1, value2, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceIsNull() {
            addCriterion("CUSTOMER_EVENT_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceIsNotNull() {
            addCriterion("CUSTOMER_EVENT_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceEqualTo(String value) {
            addCriterion("CUSTOMER_EVENT_SOURCE =", value, "customerEventSource");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceNotEqualTo(String value) {
            addCriterion("CUSTOMER_EVENT_SOURCE <>", value, "customerEventSource");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceGreaterThan(String value) {
            addCriterion("CUSTOMER_EVENT_SOURCE >", value, "customerEventSource");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_EVENT_SOURCE >=", value, "customerEventSource");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceLessThan(String value) {
            addCriterion("CUSTOMER_EVENT_SOURCE <", value, "customerEventSource");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_EVENT_SOURCE <=", value, "customerEventSource");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceLike(String value) {
            addCriterion("CUSTOMER_EVENT_SOURCE like", value, "customerEventSource");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceNotLike(String value) {
            addCriterion("CUSTOMER_EVENT_SOURCE not like", value, "customerEventSource");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceIn(List<String> values) {
            addCriterion("CUSTOMER_EVENT_SOURCE in", values, "customerEventSource");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceNotIn(List<String> values) {
            addCriterion("CUSTOMER_EVENT_SOURCE not in", values, "customerEventSource");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceBetween(String value1, String value2) {
            addCriterion("CUSTOMER_EVENT_SOURCE between", value1, value2, "customerEventSource");
            return (Criteria) this;
        }

        public Criteria andCustomerEventSourceNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_EVENT_SOURCE not between", value1, value2, "customerEventSource");
            return (Criteria) this;
        }

        public Criteria andCustomerEventIsNull() {
            addCriterion("CUSTOMER_EVENT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEventIsNotNull() {
            addCriterion("CUSTOMER_EVENT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEventEqualTo(String value) {
            addCriterion("CUSTOMER_EVENT =", value, "customerEvent");
            return (Criteria) this;
        }

        public Criteria andCustomerEventNotEqualTo(String value) {
            addCriterion("CUSTOMER_EVENT <>", value, "customerEvent");
            return (Criteria) this;
        }

        public Criteria andCustomerEventGreaterThan(String value) {
            addCriterion("CUSTOMER_EVENT >", value, "customerEvent");
            return (Criteria) this;
        }

        public Criteria andCustomerEventGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_EVENT >=", value, "customerEvent");
            return (Criteria) this;
        }

        public Criteria andCustomerEventLessThan(String value) {
            addCriterion("CUSTOMER_EVENT <", value, "customerEvent");
            return (Criteria) this;
        }

        public Criteria andCustomerEventLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_EVENT <=", value, "customerEvent");
            return (Criteria) this;
        }

        public Criteria andCustomerEventLike(String value) {
            addCriterion("CUSTOMER_EVENT like", value, "customerEvent");
            return (Criteria) this;
        }

        public Criteria andCustomerEventNotLike(String value) {
            addCriterion("CUSTOMER_EVENT not like", value, "customerEvent");
            return (Criteria) this;
        }

        public Criteria andCustomerEventIn(List<String> values) {
            addCriterion("CUSTOMER_EVENT in", values, "customerEvent");
            return (Criteria) this;
        }

        public Criteria andCustomerEventNotIn(List<String> values) {
            addCriterion("CUSTOMER_EVENT not in", values, "customerEvent");
            return (Criteria) this;
        }

        public Criteria andCustomerEventBetween(String value1, String value2) {
            addCriterion("CUSTOMER_EVENT between", value1, value2, "customerEvent");
            return (Criteria) this;
        }

        public Criteria andCustomerEventNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_EVENT not between", value1, value2, "customerEvent");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleIsNull() {
            addCriterion("COMPLAINT_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleIsNotNull() {
            addCriterion("COMPLAINT_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleEqualTo(String value) {
            addCriterion("COMPLAINT_PEOPLE =", value, "complaintPeople");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleNotEqualTo(String value) {
            addCriterion("COMPLAINT_PEOPLE <>", value, "complaintPeople");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleGreaterThan(String value) {
            addCriterion("COMPLAINT_PEOPLE >", value, "complaintPeople");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLAINT_PEOPLE >=", value, "complaintPeople");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleLessThan(String value) {
            addCriterion("COMPLAINT_PEOPLE <", value, "complaintPeople");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleLessThanOrEqualTo(String value) {
            addCriterion("COMPLAINT_PEOPLE <=", value, "complaintPeople");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleLike(String value) {
            addCriterion("COMPLAINT_PEOPLE like", value, "complaintPeople");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleNotLike(String value) {
            addCriterion("COMPLAINT_PEOPLE not like", value, "complaintPeople");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleIn(List<String> values) {
            addCriterion("COMPLAINT_PEOPLE in", values, "complaintPeople");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleNotIn(List<String> values) {
            addCriterion("COMPLAINT_PEOPLE not in", values, "complaintPeople");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleBetween(String value1, String value2) {
            addCriterion("COMPLAINT_PEOPLE between", value1, value2, "complaintPeople");
            return (Criteria) this;
        }

        public Criteria andComplaintPeopleNotBetween(String value1, String value2) {
            addCriterion("COMPLAINT_PEOPLE not between", value1, value2, "complaintPeople");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneIsNull() {
            addCriterion("COMPLAINT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneIsNotNull() {
            addCriterion("COMPLAINT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneEqualTo(Long value) {
            addCriterion("COMPLAINT_PHONE =", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneNotEqualTo(Long value) {
            addCriterion("COMPLAINT_PHONE <>", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneGreaterThan(Long value) {
            addCriterion("COMPLAINT_PHONE >", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPLAINT_PHONE >=", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneLessThan(Long value) {
            addCriterion("COMPLAINT_PHONE <", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneLessThanOrEqualTo(Long value) {
            addCriterion("COMPLAINT_PHONE <=", value, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneIn(List<Long> values) {
            addCriterion("COMPLAINT_PHONE in", values, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneNotIn(List<Long> values) {
            addCriterion("COMPLAINT_PHONE not in", values, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneBetween(Long value1, Long value2) {
            addCriterion("COMPLAINT_PHONE between", value1, value2, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintPhoneNotBetween(Long value1, Long value2) {
            addCriterion("COMPLAINT_PHONE not between", value1, value2, "complaintPhone");
            return (Criteria) this;
        }

        public Criteria andComplaintSexIsNull() {
            addCriterion("COMPLAINT_SEX is null");
            return (Criteria) this;
        }

        public Criteria andComplaintSexIsNotNull() {
            addCriterion("COMPLAINT_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintSexEqualTo(String value) {
            addCriterion("COMPLAINT_SEX =", value, "complaintSex");
            return (Criteria) this;
        }

        public Criteria andComplaintSexNotEqualTo(String value) {
            addCriterion("COMPLAINT_SEX <>", value, "complaintSex");
            return (Criteria) this;
        }

        public Criteria andComplaintSexGreaterThan(String value) {
            addCriterion("COMPLAINT_SEX >", value, "complaintSex");
            return (Criteria) this;
        }

        public Criteria andComplaintSexGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLAINT_SEX >=", value, "complaintSex");
            return (Criteria) this;
        }

        public Criteria andComplaintSexLessThan(String value) {
            addCriterion("COMPLAINT_SEX <", value, "complaintSex");
            return (Criteria) this;
        }

        public Criteria andComplaintSexLessThanOrEqualTo(String value) {
            addCriterion("COMPLAINT_SEX <=", value, "complaintSex");
            return (Criteria) this;
        }

        public Criteria andComplaintSexLike(String value) {
            addCriterion("COMPLAINT_SEX like", value, "complaintSex");
            return (Criteria) this;
        }

        public Criteria andComplaintSexNotLike(String value) {
            addCriterion("COMPLAINT_SEX not like", value, "complaintSex");
            return (Criteria) this;
        }

        public Criteria andComplaintSexIn(List<String> values) {
            addCriterion("COMPLAINT_SEX in", values, "complaintSex");
            return (Criteria) this;
        }

        public Criteria andComplaintSexNotIn(List<String> values) {
            addCriterion("COMPLAINT_SEX not in", values, "complaintSex");
            return (Criteria) this;
        }

        public Criteria andComplaintSexBetween(String value1, String value2) {
            addCriterion("COMPLAINT_SEX between", value1, value2, "complaintSex");
            return (Criteria) this;
        }

        public Criteria andComplaintSexNotBetween(String value1, String value2) {
            addCriterion("COMPLAINT_SEX not between", value1, value2, "complaintSex");
            return (Criteria) this;
        }

        public Criteria andComplaintContentIsNull() {
            addCriterion("COMPLAINT_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentIsNotNull() {
            addCriterion("COMPLAINT_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentEqualTo(String value) {
            addCriterion("COMPLAINT_CONTENT =", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotEqualTo(String value) {
            addCriterion("COMPLAINT_CONTENT <>", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentGreaterThan(String value) {
            addCriterion("COMPLAINT_CONTENT >", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLAINT_CONTENT >=", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentLessThan(String value) {
            addCriterion("COMPLAINT_CONTENT <", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentLessThanOrEqualTo(String value) {
            addCriterion("COMPLAINT_CONTENT <=", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentLike(String value) {
            addCriterion("COMPLAINT_CONTENT like", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotLike(String value) {
            addCriterion("COMPLAINT_CONTENT not like", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentIn(List<String> values) {
            addCriterion("COMPLAINT_CONTENT in", values, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotIn(List<String> values) {
            addCriterion("COMPLAINT_CONTENT not in", values, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentBetween(String value1, String value2) {
            addCriterion("COMPLAINT_CONTENT between", value1, value2, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotBetween(String value1, String value2) {
            addCriterion("COMPLAINT_CONTENT not between", value1, value2, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleIsNull() {
            addCriterion("REPAIR_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleIsNotNull() {
            addCriterion("REPAIR_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleEqualTo(String value) {
            addCriterion("REPAIR_PEOPLE =", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleNotEqualTo(String value) {
            addCriterion("REPAIR_PEOPLE <>", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleGreaterThan(String value) {
            addCriterion("REPAIR_PEOPLE >", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("REPAIR_PEOPLE >=", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleLessThan(String value) {
            addCriterion("REPAIR_PEOPLE <", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleLessThanOrEqualTo(String value) {
            addCriterion("REPAIR_PEOPLE <=", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleLike(String value) {
            addCriterion("REPAIR_PEOPLE like", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleNotLike(String value) {
            addCriterion("REPAIR_PEOPLE not like", value, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleIn(List<String> values) {
            addCriterion("REPAIR_PEOPLE in", values, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleNotIn(List<String> values) {
            addCriterion("REPAIR_PEOPLE not in", values, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleBetween(String value1, String value2) {
            addCriterion("REPAIR_PEOPLE between", value1, value2, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairPeopleNotBetween(String value1, String value2) {
            addCriterion("REPAIR_PEOPLE not between", value1, value2, "repairPeople");
            return (Criteria) this;
        }

        public Criteria andRepairDateIsNull() {
            addCriterion("REPAIR_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRepairDateIsNotNull() {
            addCriterion("REPAIR_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRepairDateEqualTo(Date value) {
            addCriterionForJDBCDate("REPAIR_DATE =", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REPAIR_DATE <>", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateGreaterThan(Date value) {
            addCriterionForJDBCDate("REPAIR_DATE >", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REPAIR_DATE >=", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateLessThan(Date value) {
            addCriterionForJDBCDate("REPAIR_DATE <", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REPAIR_DATE <=", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateIn(List<Date> values) {
            addCriterionForJDBCDate("REPAIR_DATE in", values, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REPAIR_DATE not in", values, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REPAIR_DATE between", value1, value2, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REPAIR_DATE not between", value1, value2, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairPositionIsNull() {
            addCriterion("REPAIR_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andRepairPositionIsNotNull() {
            addCriterion("REPAIR_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andRepairPositionEqualTo(String value) {
            addCriterion("REPAIR_POSITION =", value, "repairPosition");
            return (Criteria) this;
        }

        public Criteria andRepairPositionNotEqualTo(String value) {
            addCriterion("REPAIR_POSITION <>", value, "repairPosition");
            return (Criteria) this;
        }

        public Criteria andRepairPositionGreaterThan(String value) {
            addCriterion("REPAIR_POSITION >", value, "repairPosition");
            return (Criteria) this;
        }

        public Criteria andRepairPositionGreaterThanOrEqualTo(String value) {
            addCriterion("REPAIR_POSITION >=", value, "repairPosition");
            return (Criteria) this;
        }

        public Criteria andRepairPositionLessThan(String value) {
            addCriterion("REPAIR_POSITION <", value, "repairPosition");
            return (Criteria) this;
        }

        public Criteria andRepairPositionLessThanOrEqualTo(String value) {
            addCriterion("REPAIR_POSITION <=", value, "repairPosition");
            return (Criteria) this;
        }

        public Criteria andRepairPositionLike(String value) {
            addCriterion("REPAIR_POSITION like", value, "repairPosition");
            return (Criteria) this;
        }

        public Criteria andRepairPositionNotLike(String value) {
            addCriterion("REPAIR_POSITION not like", value, "repairPosition");
            return (Criteria) this;
        }

        public Criteria andRepairPositionIn(List<String> values) {
            addCriterion("REPAIR_POSITION in", values, "repairPosition");
            return (Criteria) this;
        }

        public Criteria andRepairPositionNotIn(List<String> values) {
            addCriterion("REPAIR_POSITION not in", values, "repairPosition");
            return (Criteria) this;
        }

        public Criteria andRepairPositionBetween(String value1, String value2) {
            addCriterion("REPAIR_POSITION between", value1, value2, "repairPosition");
            return (Criteria) this;
        }

        public Criteria andRepairPositionNotBetween(String value1, String value2) {
            addCriterion("REPAIR_POSITION not between", value1, value2, "repairPosition");
            return (Criteria) this;
        }

        public Criteria andRepairContentIsNull() {
            addCriterion("REPAIR_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andRepairContentIsNotNull() {
            addCriterion("REPAIR_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andRepairContentEqualTo(String value) {
            addCriterion("REPAIR_CONTENT =", value, "repairContent");
            return (Criteria) this;
        }

        public Criteria andRepairContentNotEqualTo(String value) {
            addCriterion("REPAIR_CONTENT <>", value, "repairContent");
            return (Criteria) this;
        }

        public Criteria andRepairContentGreaterThan(String value) {
            addCriterion("REPAIR_CONTENT >", value, "repairContent");
            return (Criteria) this;
        }

        public Criteria andRepairContentGreaterThanOrEqualTo(String value) {
            addCriterion("REPAIR_CONTENT >=", value, "repairContent");
            return (Criteria) this;
        }

        public Criteria andRepairContentLessThan(String value) {
            addCriterion("REPAIR_CONTENT <", value, "repairContent");
            return (Criteria) this;
        }

        public Criteria andRepairContentLessThanOrEqualTo(String value) {
            addCriterion("REPAIR_CONTENT <=", value, "repairContent");
            return (Criteria) this;
        }

        public Criteria andRepairContentLike(String value) {
            addCriterion("REPAIR_CONTENT like", value, "repairContent");
            return (Criteria) this;
        }

        public Criteria andRepairContentNotLike(String value) {
            addCriterion("REPAIR_CONTENT not like", value, "repairContent");
            return (Criteria) this;
        }

        public Criteria andRepairContentIn(List<String> values) {
            addCriterion("REPAIR_CONTENT in", values, "repairContent");
            return (Criteria) this;
        }

        public Criteria andRepairContentNotIn(List<String> values) {
            addCriterion("REPAIR_CONTENT not in", values, "repairContent");
            return (Criteria) this;
        }

        public Criteria andRepairContentBetween(String value1, String value2) {
            addCriterion("REPAIR_CONTENT between", value1, value2, "repairContent");
            return (Criteria) this;
        }

        public Criteria andRepairContentNotBetween(String value1, String value2) {
            addCriterion("REPAIR_CONTENT not between", value1, value2, "repairContent");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIsNull() {
            addCriterion("SERVICE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIsNotNull() {
            addCriterion("SERVICE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andServiceAddressEqualTo(String value) {
            addCriterion("SERVICE_ADDRESS =", value, "serviceAddress");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNotEqualTo(String value) {
            addCriterion("SERVICE_ADDRESS <>", value, "serviceAddress");
            return (Criteria) this;
        }

        public Criteria andServiceAddressGreaterThan(String value) {
            addCriterion("SERVICE_ADDRESS >", value, "serviceAddress");
            return (Criteria) this;
        }

        public Criteria andServiceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_ADDRESS >=", value, "serviceAddress");
            return (Criteria) this;
        }

        public Criteria andServiceAddressLessThan(String value) {
            addCriterion("SERVICE_ADDRESS <", value, "serviceAddress");
            return (Criteria) this;
        }

        public Criteria andServiceAddressLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_ADDRESS <=", value, "serviceAddress");
            return (Criteria) this;
        }

        public Criteria andServiceAddressLike(String value) {
            addCriterion("SERVICE_ADDRESS like", value, "serviceAddress");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNotLike(String value) {
            addCriterion("SERVICE_ADDRESS not like", value, "serviceAddress");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIn(List<String> values) {
            addCriterion("SERVICE_ADDRESS in", values, "serviceAddress");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNotIn(List<String> values) {
            addCriterion("SERVICE_ADDRESS not in", values, "serviceAddress");
            return (Criteria) this;
        }

        public Criteria andServiceAddressBetween(String value1, String value2) {
            addCriterion("SERVICE_ADDRESS between", value1, value2, "serviceAddress");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNotBetween(String value1, String value2) {
            addCriterion("SERVICE_ADDRESS not between", value1, value2, "serviceAddress");
            return (Criteria) this;
        }

        public Criteria andServiceContentIsNull() {
            addCriterion("SERVICE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andServiceContentIsNotNull() {
            addCriterion("SERVICE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andServiceContentEqualTo(String value) {
            addCriterion("SERVICE_CONTENT =", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentNotEqualTo(String value) {
            addCriterion("SERVICE_CONTENT <>", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentGreaterThan(String value) {
            addCriterion("SERVICE_CONTENT >", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_CONTENT >=", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentLessThan(String value) {
            addCriterion("SERVICE_CONTENT <", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_CONTENT <=", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentLike(String value) {
            addCriterion("SERVICE_CONTENT like", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentNotLike(String value) {
            addCriterion("SERVICE_CONTENT not like", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentIn(List<String> values) {
            addCriterion("SERVICE_CONTENT in", values, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentNotIn(List<String> values) {
            addCriterion("SERVICE_CONTENT not in", values, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentBetween(String value1, String value2) {
            addCriterion("SERVICE_CONTENT between", value1, value2, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentNotBetween(String value1, String value2) {
            addCriterion("SERVICE_CONTENT not between", value1, value2, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIsNull() {
            addCriterion("SINGLE_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIsNotNull() {
            addCriterion("SINGLE_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andSinglePersonEqualTo(String value) {
            addCriterion("SINGLE_PERSON =", value, "singlePerson");
            return (Criteria) this;
        }

        public Criteria andSinglePersonNotEqualTo(String value) {
            addCriterion("SINGLE_PERSON <>", value, "singlePerson");
            return (Criteria) this;
        }

        public Criteria andSinglePersonGreaterThan(String value) {
            addCriterion("SINGLE_PERSON >", value, "singlePerson");
            return (Criteria) this;
        }

        public Criteria andSinglePersonGreaterThanOrEqualTo(String value) {
            addCriterion("SINGLE_PERSON >=", value, "singlePerson");
            return (Criteria) this;
        }

        public Criteria andSinglePersonLessThan(String value) {
            addCriterion("SINGLE_PERSON <", value, "singlePerson");
            return (Criteria) this;
        }

        public Criteria andSinglePersonLessThanOrEqualTo(String value) {
            addCriterion("SINGLE_PERSON <=", value, "singlePerson");
            return (Criteria) this;
        }

        public Criteria andSinglePersonLike(String value) {
            addCriterion("SINGLE_PERSON like", value, "singlePerson");
            return (Criteria) this;
        }

        public Criteria andSinglePersonNotLike(String value) {
            addCriterion("SINGLE_PERSON not like", value, "singlePerson");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIn(List<String> values) {
            addCriterion("SINGLE_PERSON in", values, "singlePerson");
            return (Criteria) this;
        }

        public Criteria andSinglePersonNotIn(List<String> values) {
            addCriterion("SINGLE_PERSON not in", values, "singlePerson");
            return (Criteria) this;
        }

        public Criteria andSinglePersonBetween(String value1, String value2) {
            addCriterion("SINGLE_PERSON between", value1, value2, "singlePerson");
            return (Criteria) this;
        }

        public Criteria andSinglePersonNotBetween(String value1, String value2) {
            addCriterion("SINGLE_PERSON not between", value1, value2, "singlePerson");
            return (Criteria) this;
        }

        public Criteria andDraftDateIsNull() {
            addCriterion("DRAFT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDraftDateIsNotNull() {
            addCriterion("DRAFT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDraftDateEqualTo(Date value) {
            addCriterion("DRAFT_DATE =", value, "draftDate");
            return (Criteria) this;
        }

        public Criteria andDraftDateNotEqualTo(Date value) {
            addCriterion("DRAFT_DATE <>", value, "draftDate");
            return (Criteria) this;
        }

        public Criteria andDraftDateGreaterThan(Date value) {
            addCriterion("DRAFT_DATE >", value, "draftDate");
            return (Criteria) this;
        }

        public Criteria andDraftDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DRAFT_DATE >=", value, "draftDate");
            return (Criteria) this;
        }

        public Criteria andDraftDateLessThan(Date value) {
            addCriterion("DRAFT_DATE <", value, "draftDate");
            return (Criteria) this;
        }

        public Criteria andDraftDateLessThanOrEqualTo(Date value) {
            addCriterion("DRAFT_DATE <=", value, "draftDate");
            return (Criteria) this;
        }

        public Criteria andDraftDateIn(List<Date> values) {
            addCriterion("DRAFT_DATE in", values, "draftDate");
            return (Criteria) this;
        }

        public Criteria andDraftDateNotIn(List<Date> values) {
            addCriterion("DRAFT_DATE not in", values, "draftDate");
            return (Criteria) this;
        }

        public Criteria andDraftDateBetween(Date value1, Date value2) {
            addCriterion("DRAFT_DATE between", value1, value2, "draftDate");
            return (Criteria) this;
        }

        public Criteria andDraftDateNotBetween(Date value1, Date value2) {
            addCriterion("DRAFT_DATE not between", value1, value2, "draftDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNull() {
            addCriterion("TENANTID is null");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNotNull() {
            addCriterion("TENANTID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantidEqualTo(Long value) {
            addCriterion("TENANTID =", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotEqualTo(Long value) {
            addCriterion("TENANTID <>", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThan(Long value) {
            addCriterion("TENANTID >", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThanOrEqualTo(Long value) {
            addCriterion("TENANTID >=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThan(Long value) {
            addCriterion("TENANTID <", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThanOrEqualTo(Long value) {
            addCriterion("TENANTID <=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidIn(List<Long> values) {
            addCriterion("TENANTID in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotIn(List<Long> values) {
            addCriterion("TENANTID not in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidBetween(Long value1, Long value2) {
            addCriterion("TENANTID between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotBetween(Long value1, Long value2) {
            addCriterion("TENANTID not between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATOR_ID not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNull() {
            addCriterion("CREATOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNotNull() {
            addCriterion("CREATOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("CREATOR_NAME =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotEqualTo(String value) {
            addCriterion("CREATOR_NAME <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThan(String value) {
            addCriterion("CREATOR_NAME >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR_NAME >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThan(String value) {
            addCriterion("CREATOR_NAME <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("CREATOR_NAME <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLike(String value) {
            addCriterion("CREATOR_NAME like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotLike(String value) {
            addCriterion("CREATOR_NAME not like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIn(List<String> values) {
            addCriterion("CREATOR_NAME in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotIn(List<String> values) {
            addCriterion("CREATOR_NAME not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameBetween(String value1, String value2) {
            addCriterion("CREATOR_NAME between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotBetween(String value1, String value2) {
            addCriterion("CREATOR_NAME not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("ORGANIZATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("ORGANIZATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(Long value) {
            addCriterion("ORGANIZATION_ID =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(Long value) {
            addCriterion("ORGANIZATION_ID <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(Long value) {
            addCriterion("ORGANIZATION_ID >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORGANIZATION_ID >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(Long value) {
            addCriterion("ORGANIZATION_ID <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(Long value) {
            addCriterion("ORGANIZATION_ID <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<Long> values) {
            addCriterion("ORGANIZATION_ID in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<Long> values) {
            addCriterion("ORGANIZATION_ID not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(Long value1, Long value2) {
            addCriterion("ORGANIZATION_ID between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(Long value1, Long value2) {
            addCriterion("ORGANIZATION_ID not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameIsNull() {
            addCriterion("ORGANIZATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameIsNotNull() {
            addCriterion("ORGANIZATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEqualTo(String value) {
            addCriterion("ORGANIZATION_NAME =", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotEqualTo(String value) {
            addCriterion("ORGANIZATION_NAME <>", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameGreaterThan(String value) {
            addCriterion("ORGANIZATION_NAME >", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_NAME >=", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLessThan(String value) {
            addCriterion("ORGANIZATION_NAME <", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_NAME <=", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLike(String value) {
            addCriterion("ORGANIZATION_NAME like", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotLike(String value) {
            addCriterion("ORGANIZATION_NAME not like", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameIn(List<String> values) {
            addCriterion("ORGANIZATION_NAME in", values, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotIn(List<String> values) {
            addCriterion("ORGANIZATION_NAME not in", values, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_NAME between", value1, value2, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_NAME not between", value1, value2, "organizationName");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNull() {
            addCriterion("BILL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("BILL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBillStatusEqualTo(String value) {
            addCriterion("BILL_STATUS =", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotEqualTo(String value) {
            addCriterion("BILL_STATUS <>", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThan(String value) {
            addCriterion("BILL_STATUS >", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_STATUS >=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThan(String value) {
            addCriterion("BILL_STATUS <", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(String value) {
            addCriterion("BILL_STATUS <=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLike(String value) {
            addCriterion("BILL_STATUS like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotLike(String value) {
            addCriterion("BILL_STATUS not like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIn(List<String> values) {
            addCriterion("BILL_STATUS in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotIn(List<String> values) {
            addCriterion("BILL_STATUS not in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusBetween(String value1, String value2) {
            addCriterion("BILL_STATUS between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotBetween(String value1, String value2) {
            addCriterion("BILL_STATUS not between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andDrIsNull() {
            addCriterion("DR is null");
            return (Criteria) this;
        }

        public Criteria andDrIsNotNull() {
            addCriterion("DR is not null");
            return (Criteria) this;
        }

        public Criteria andDrEqualTo(String value) {
            addCriterion("DR =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(String value) {
            addCriterion("DR <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(String value) {
            addCriterion("DR >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(String value) {
            addCriterion("DR >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(String value) {
            addCriterion("DR <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(String value) {
            addCriterion("DR <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLike(String value) {
            addCriterion("DR like", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotLike(String value) {
            addCriterion("DR not like", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<String> values) {
            addCriterion("DR in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<String> values) {
            addCriterion("DR not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(String value1, String value2) {
            addCriterion("DR between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(String value1, String value2) {
            addCriterion("DR not between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(BigDecimal value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(BigDecimal value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(BigDecimal value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(BigDecimal value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<BigDecimal> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<BigDecimal> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andBillNumberIsNull() {
            addCriterion("BILL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBillNumberIsNotNull() {
            addCriterion("BILL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBillNumberEqualTo(String value) {
            addCriterion("BILL_NUMBER =", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberNotEqualTo(String value) {
            addCriterion("BILL_NUMBER <>", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberGreaterThan(String value) {
            addCriterion("BILL_NUMBER >", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_NUMBER >=", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberLessThan(String value) {
            addCriterion("BILL_NUMBER <", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberLessThanOrEqualTo(String value) {
            addCriterion("BILL_NUMBER <=", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberLike(String value) {
            addCriterion("BILL_NUMBER like", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberNotLike(String value) {
            addCriterion("BILL_NUMBER not like", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberIn(List<String> values) {
            addCriterion("BILL_NUMBER in", values, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberNotIn(List<String> values) {
            addCriterion("BILL_NUMBER not in", values, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberBetween(String value1, String value2) {
            addCriterion("BILL_NUMBER between", value1, value2, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberNotBetween(String value1, String value2) {
            addCriterion("BILL_NUMBER not between", value1, value2, "billNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderIsNull() {
            addCriterion("RECEIVE_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderIsNotNull() {
            addCriterion("RECEIVE_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderEqualTo(String value) {
            addCriterion("RECEIVE_ORDER =", value, "receiveOrder");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderNotEqualTo(String value) {
            addCriterion("RECEIVE_ORDER <>", value, "receiveOrder");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderGreaterThan(String value) {
            addCriterion("RECEIVE_ORDER >", value, "receiveOrder");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_ORDER >=", value, "receiveOrder");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderLessThan(String value) {
            addCriterion("RECEIVE_ORDER <", value, "receiveOrder");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_ORDER <=", value, "receiveOrder");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderLike(String value) {
            addCriterion("RECEIVE_ORDER like", value, "receiveOrder");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderNotLike(String value) {
            addCriterion("RECEIVE_ORDER not like", value, "receiveOrder");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderIn(List<String> values) {
            addCriterion("RECEIVE_ORDER in", values, "receiveOrder");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderNotIn(List<String> values) {
            addCriterion("RECEIVE_ORDER not in", values, "receiveOrder");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderBetween(String value1, String value2) {
            addCriterion("RECEIVE_ORDER between", value1, value2, "receiveOrder");
            return (Criteria) this;
        }

        public Criteria andReceiveOrderNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_ORDER not between", value1, value2, "receiveOrder");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("ORDER_TYPE =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("ORDER_TYPE <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("ORDER_TYPE >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("ORDER_TYPE <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("ORDER_TYPE like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("ORDER_TYPE not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("ORDER_TYPE in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("ORDER_TYPE not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderContentIsNull() {
            addCriterion("ORDER_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andOrderContentIsNotNull() {
            addCriterion("ORDER_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderContentEqualTo(String value) {
            addCriterion("ORDER_CONTENT =", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotEqualTo(String value) {
            addCriterion("ORDER_CONTENT <>", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentGreaterThan(String value) {
            addCriterion("ORDER_CONTENT >", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CONTENT >=", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentLessThan(String value) {
            addCriterion("ORDER_CONTENT <", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CONTENT <=", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentLike(String value) {
            addCriterion("ORDER_CONTENT like", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotLike(String value) {
            addCriterion("ORDER_CONTENT not like", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentIn(List<String> values) {
            addCriterion("ORDER_CONTENT in", values, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotIn(List<String> values) {
            addCriterion("ORDER_CONTENT not in", values, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentBetween(String value1, String value2) {
            addCriterion("ORDER_CONTENT between", value1, value2, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotBetween(String value1, String value2) {
            addCriterion("ORDER_CONTENT not between", value1, value2, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("ORDER_STATUS like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("ORDER_STATUS not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNull() {
            addCriterion("LOCK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNotNull() {
            addCriterion("LOCK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLockStatusEqualTo(String value) {
            addCriterion("LOCK_STATUS =", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotEqualTo(String value) {
            addCriterion("LOCK_STATUS <>", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThan(String value) {
            addCriterion("LOCK_STATUS >", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_STATUS >=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThan(String value) {
            addCriterion("LOCK_STATUS <", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThanOrEqualTo(String value) {
            addCriterion("LOCK_STATUS <=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLike(String value) {
            addCriterion("LOCK_STATUS like", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotLike(String value) {
            addCriterion("LOCK_STATUS not like", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusIn(List<String> values) {
            addCriterion("LOCK_STATUS in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotIn(List<String> values) {
            addCriterion("LOCK_STATUS not in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusBetween(String value1, String value2) {
            addCriterion("LOCK_STATUS between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotBetween(String value1, String value2) {
            addCriterion("LOCK_STATUS not between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleIsNull() {
            addCriterion("FEEDBACK_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleIsNotNull() {
            addCriterion("FEEDBACK_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleEqualTo(String value) {
            addCriterion("FEEDBACK_PEOPLE =", value, "feedbackPeople");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleNotEqualTo(String value) {
            addCriterion("FEEDBACK_PEOPLE <>", value, "feedbackPeople");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleGreaterThan(String value) {
            addCriterion("FEEDBACK_PEOPLE >", value, "feedbackPeople");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_PEOPLE >=", value, "feedbackPeople");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleLessThan(String value) {
            addCriterion("FEEDBACK_PEOPLE <", value, "feedbackPeople");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_PEOPLE <=", value, "feedbackPeople");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleLike(String value) {
            addCriterion("FEEDBACK_PEOPLE like", value, "feedbackPeople");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleNotLike(String value) {
            addCriterion("FEEDBACK_PEOPLE not like", value, "feedbackPeople");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleIn(List<String> values) {
            addCriterion("FEEDBACK_PEOPLE in", values, "feedbackPeople");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleNotIn(List<String> values) {
            addCriterion("FEEDBACK_PEOPLE not in", values, "feedbackPeople");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleBetween(String value1, String value2) {
            addCriterion("FEEDBACK_PEOPLE between", value1, value2, "feedbackPeople");
            return (Criteria) this;
        }

        public Criteria andFeedbackPeopleNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_PEOPLE not between", value1, value2, "feedbackPeople");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeIsNull() {
            addCriterion("FEEDBACK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeIsNotNull() {
            addCriterion("FEEDBACK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE =", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE <>", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeGreaterThan(String value) {
            addCriterion("FEEDBACK_TYPE >", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE >=", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeLessThan(String value) {
            addCriterion("FEEDBACK_TYPE <", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE <=", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeLike(String value) {
            addCriterion("FEEDBACK_TYPE like", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotLike(String value) {
            addCriterion("FEEDBACK_TYPE not like", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeIn(List<String> values) {
            addCriterion("FEEDBACK_TYPE in", values, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotIn(List<String> values) {
            addCriterion("FEEDBACK_TYPE not in", values, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeBetween(String value1, String value2) {
            addCriterion("FEEDBACK_TYPE between", value1, value2, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_TYPE not between", value1, value2, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesIsNull() {
            addCriterion("FEEDBACK_CIRCUMSTANCES is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesIsNotNull() {
            addCriterion("FEEDBACK_CIRCUMSTANCES is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesEqualTo(String value) {
            addCriterion("FEEDBACK_CIRCUMSTANCES =", value, "feedbackCircumstances");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesNotEqualTo(String value) {
            addCriterion("FEEDBACK_CIRCUMSTANCES <>", value, "feedbackCircumstances");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesGreaterThan(String value) {
            addCriterion("FEEDBACK_CIRCUMSTANCES >", value, "feedbackCircumstances");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_CIRCUMSTANCES >=", value, "feedbackCircumstances");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesLessThan(String value) {
            addCriterion("FEEDBACK_CIRCUMSTANCES <", value, "feedbackCircumstances");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_CIRCUMSTANCES <=", value, "feedbackCircumstances");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesLike(String value) {
            addCriterion("FEEDBACK_CIRCUMSTANCES like", value, "feedbackCircumstances");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesNotLike(String value) {
            addCriterion("FEEDBACK_CIRCUMSTANCES not like", value, "feedbackCircumstances");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesIn(List<String> values) {
            addCriterion("FEEDBACK_CIRCUMSTANCES in", values, "feedbackCircumstances");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesNotIn(List<String> values) {
            addCriterion("FEEDBACK_CIRCUMSTANCES not in", values, "feedbackCircumstances");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesBetween(String value1, String value2) {
            addCriterion("FEEDBACK_CIRCUMSTANCES between", value1, value2, "feedbackCircumstances");
            return (Criteria) this;
        }

        public Criteria andFeedbackCircumstancesNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_CIRCUMSTANCES not between", value1, value2, "feedbackCircumstances");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionIsNull() {
            addCriterion("FEEDBACK_FRACTION is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionIsNotNull() {
            addCriterion("FEEDBACK_FRACTION is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionEqualTo(String value) {
            addCriterion("FEEDBACK_FRACTION =", value, "feedbackFraction");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionNotEqualTo(String value) {
            addCriterion("FEEDBACK_FRACTION <>", value, "feedbackFraction");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionGreaterThan(String value) {
            addCriterion("FEEDBACK_FRACTION >", value, "feedbackFraction");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_FRACTION >=", value, "feedbackFraction");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionLessThan(String value) {
            addCriterion("FEEDBACK_FRACTION <", value, "feedbackFraction");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_FRACTION <=", value, "feedbackFraction");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionLike(String value) {
            addCriterion("FEEDBACK_FRACTION like", value, "feedbackFraction");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionNotLike(String value) {
            addCriterion("FEEDBACK_FRACTION not like", value, "feedbackFraction");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionIn(List<String> values) {
            addCriterion("FEEDBACK_FRACTION in", values, "feedbackFraction");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionNotIn(List<String> values) {
            addCriterion("FEEDBACK_FRACTION not in", values, "feedbackFraction");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionBetween(String value1, String value2) {
            addCriterion("FEEDBACK_FRACTION between", value1, value2, "feedbackFraction");
            return (Criteria) this;
        }

        public Criteria andFeedbackFractionNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_FRACTION not between", value1, value2, "feedbackFraction");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIsNull() {
            addCriterion("SEND_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIsNotNull() {
            addCriterion("SEND_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andSendPeopleEqualTo(String value) {
            addCriterion("SEND_PEOPLE =", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleNotEqualTo(String value) {
            addCriterion("SEND_PEOPLE <>", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleGreaterThan(String value) {
            addCriterion("SEND_PEOPLE >", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_PEOPLE >=", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleLessThan(String value) {
            addCriterion("SEND_PEOPLE <", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleLessThanOrEqualTo(String value) {
            addCriterion("SEND_PEOPLE <=", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleLike(String value) {
            addCriterion("SEND_PEOPLE like", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleNotLike(String value) {
            addCriterion("SEND_PEOPLE not like", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIn(List<String> values) {
            addCriterion("SEND_PEOPLE in", values, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleNotIn(List<String> values) {
            addCriterion("SEND_PEOPLE not in", values, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleBetween(String value1, String value2) {
            addCriterion("SEND_PEOPLE between", value1, value2, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleNotBetween(String value1, String value2) {
            addCriterion("SEND_PEOPLE not between", value1, value2, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIdIsNull() {
            addCriterion("SEND_PEOPLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIdIsNotNull() {
            addCriterion("SEND_PEOPLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIdEqualTo(Long value) {
            addCriterion("SEND_PEOPLE_ID =", value, "sendPeopleId");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIdNotEqualTo(Long value) {
            addCriterion("SEND_PEOPLE_ID <>", value, "sendPeopleId");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIdGreaterThan(Long value) {
            addCriterion("SEND_PEOPLE_ID >", value, "sendPeopleId");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SEND_PEOPLE_ID >=", value, "sendPeopleId");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIdLessThan(Long value) {
            addCriterion("SEND_PEOPLE_ID <", value, "sendPeopleId");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIdLessThanOrEqualTo(Long value) {
            addCriterion("SEND_PEOPLE_ID <=", value, "sendPeopleId");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIdIn(List<Long> values) {
            addCriterion("SEND_PEOPLE_ID in", values, "sendPeopleId");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIdNotIn(List<Long> values) {
            addCriterion("SEND_PEOPLE_ID not in", values, "sendPeopleId");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIdBetween(Long value1, Long value2) {
            addCriterion("SEND_PEOPLE_ID between", value1, value2, "sendPeopleId");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIdNotBetween(Long value1, Long value2) {
            addCriterion("SEND_PEOPLE_ID not between", value1, value2, "sendPeopleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdIsNull() {
            addCriterion("SINGLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSingleIdIsNotNull() {
            addCriterion("SINGLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSingleIdEqualTo(Long value) {
            addCriterion("SINGLE_ID =", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdNotEqualTo(Long value) {
            addCriterion("SINGLE_ID <>", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdGreaterThan(Long value) {
            addCriterion("SINGLE_ID >", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SINGLE_ID >=", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdLessThan(Long value) {
            addCriterion("SINGLE_ID <", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdLessThanOrEqualTo(Long value) {
            addCriterion("SINGLE_ID <=", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdIn(List<Long> values) {
            addCriterion("SINGLE_ID in", values, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdNotIn(List<Long> values) {
            addCriterion("SINGLE_ID not in", values, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdBetween(Long value1, Long value2) {
            addCriterion("SINGLE_ID between", value1, value2, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdNotBetween(Long value1, Long value2) {
            addCriterion("SINGLE_ID not between", value1, value2, "singleId");
            return (Criteria) this;
        }

        public Criteria andIsAutoIsNull() {
            addCriterion("IS_AUTO is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoIsNotNull() {
            addCriterion("IS_AUTO is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoEqualTo(String value) {
            addCriterion("IS_AUTO =", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotEqualTo(String value) {
            addCriterion("IS_AUTO <>", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoGreaterThan(String value) {
            addCriterion("IS_AUTO >", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AUTO >=", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoLessThan(String value) {
            addCriterion("IS_AUTO <", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoLessThanOrEqualTo(String value) {
            addCriterion("IS_AUTO <=", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoLike(String value) {
            addCriterion("IS_AUTO like", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotLike(String value) {
            addCriterion("IS_AUTO not like", value, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoIn(List<String> values) {
            addCriterion("IS_AUTO in", values, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotIn(List<String> values) {
            addCriterion("IS_AUTO not in", values, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoBetween(String value1, String value2) {
            addCriterion("IS_AUTO between", value1, value2, "isAuto");
            return (Criteria) this;
        }

        public Criteria andIsAutoNotBetween(String value1, String value2) {
            addCriterion("IS_AUTO not between", value1, value2, "isAuto");
            return (Criteria) this;
        }

        public Criteria andRedispatchTimesIsNull() {
            addCriterion("REDISPATCH_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andRedispatchTimesIsNotNull() {
            addCriterion("REDISPATCH_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andRedispatchTimesEqualTo(Integer value) {
            addCriterion("REDISPATCH_TIMES =", value, "redispatchTimes");
            return (Criteria) this;
        }

        public Criteria andRedispatchTimesNotEqualTo(Integer value) {
            addCriterion("REDISPATCH_TIMES <>", value, "redispatchTimes");
            return (Criteria) this;
        }

        public Criteria andRedispatchTimesGreaterThan(Integer value) {
            addCriterion("REDISPATCH_TIMES >", value, "redispatchTimes");
            return (Criteria) this;
        }

        public Criteria andRedispatchTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("REDISPATCH_TIMES >=", value, "redispatchTimes");
            return (Criteria) this;
        }

        public Criteria andRedispatchTimesLessThan(Integer value) {
            addCriterion("REDISPATCH_TIMES <", value, "redispatchTimes");
            return (Criteria) this;
        }

        public Criteria andRedispatchTimesLessThanOrEqualTo(Integer value) {
            addCriterion("REDISPATCH_TIMES <=", value, "redispatchTimes");
            return (Criteria) this;
        }

        public Criteria andRedispatchTimesIn(List<Integer> values) {
            addCriterion("REDISPATCH_TIMES in", values, "redispatchTimes");
            return (Criteria) this;
        }

        public Criteria andRedispatchTimesNotIn(List<Integer> values) {
            addCriterion("REDISPATCH_TIMES not in", values, "redispatchTimes");
            return (Criteria) this;
        }

        public Criteria andRedispatchTimesBetween(Integer value1, Integer value2) {
            addCriterion("REDISPATCH_TIMES between", value1, value2, "redispatchTimes");
            return (Criteria) this;
        }

        public Criteria andRedispatchTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("REDISPATCH_TIMES not between", value1, value2, "redispatchTimes");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationIsNull() {
            addCriterion("HANDLING_SITUATION is null");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationIsNotNull() {
            addCriterion("HANDLING_SITUATION is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationEqualTo(String value) {
            addCriterion("HANDLING_SITUATION =", value, "handlingSituation");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationNotEqualTo(String value) {
            addCriterion("HANDLING_SITUATION <>", value, "handlingSituation");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationGreaterThan(String value) {
            addCriterion("HANDLING_SITUATION >", value, "handlingSituation");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLING_SITUATION >=", value, "handlingSituation");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationLessThan(String value) {
            addCriterion("HANDLING_SITUATION <", value, "handlingSituation");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationLessThanOrEqualTo(String value) {
            addCriterion("HANDLING_SITUATION <=", value, "handlingSituation");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationLike(String value) {
            addCriterion("HANDLING_SITUATION like", value, "handlingSituation");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationNotLike(String value) {
            addCriterion("HANDLING_SITUATION not like", value, "handlingSituation");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationIn(List<String> values) {
            addCriterion("HANDLING_SITUATION in", values, "handlingSituation");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationNotIn(List<String> values) {
            addCriterion("HANDLING_SITUATION not in", values, "handlingSituation");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationBetween(String value1, String value2) {
            addCriterion("HANDLING_SITUATION between", value1, value2, "handlingSituation");
            return (Criteria) this;
        }

        public Criteria andHandlingSituationNotBetween(String value1, String value2) {
            addCriterion("HANDLING_SITUATION not between", value1, value2, "handlingSituation");
            return (Criteria) this;
        }

        public Criteria andProcessPictureIsNull() {
            addCriterion("PROCESS_PICTURE is null");
            return (Criteria) this;
        }

        public Criteria andProcessPictureIsNotNull() {
            addCriterion("PROCESS_PICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessPictureEqualTo(String value) {
            addCriterion("PROCESS_PICTURE =", value, "processPicture");
            return (Criteria) this;
        }

        public Criteria andProcessPictureNotEqualTo(String value) {
            addCriterion("PROCESS_PICTURE <>", value, "processPicture");
            return (Criteria) this;
        }

        public Criteria andProcessPictureGreaterThan(String value) {
            addCriterion("PROCESS_PICTURE >", value, "processPicture");
            return (Criteria) this;
        }

        public Criteria andProcessPictureGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_PICTURE >=", value, "processPicture");
            return (Criteria) this;
        }

        public Criteria andProcessPictureLessThan(String value) {
            addCriterion("PROCESS_PICTURE <", value, "processPicture");
            return (Criteria) this;
        }

        public Criteria andProcessPictureLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_PICTURE <=", value, "processPicture");
            return (Criteria) this;
        }

        public Criteria andProcessPictureLike(String value) {
            addCriterion("PROCESS_PICTURE like", value, "processPicture");
            return (Criteria) this;
        }

        public Criteria andProcessPictureNotLike(String value) {
            addCriterion("PROCESS_PICTURE not like", value, "processPicture");
            return (Criteria) this;
        }

        public Criteria andProcessPictureIn(List<String> values) {
            addCriterion("PROCESS_PICTURE in", values, "processPicture");
            return (Criteria) this;
        }

        public Criteria andProcessPictureNotIn(List<String> values) {
            addCriterion("PROCESS_PICTURE not in", values, "processPicture");
            return (Criteria) this;
        }

        public Criteria andProcessPictureBetween(String value1, String value2) {
            addCriterion("PROCESS_PICTURE between", value1, value2, "processPicture");
            return (Criteria) this;
        }

        public Criteria andProcessPictureNotBetween(String value1, String value2) {
            addCriterion("PROCESS_PICTURE not between", value1, value2, "processPicture");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}