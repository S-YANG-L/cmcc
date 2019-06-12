package com.htyw.app.checkingIN.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CheckingInClockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckingInClockExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andOfficeHoursIsNull() {
            addCriterion("OFFICE_HOURS is null");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursIsNotNull() {
            addCriterion("OFFICE_HOURS is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursEqualTo(Date value) {
            addCriterionForJDBCTime("OFFICE_HOURS =", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursNotEqualTo(Date value) {
            addCriterionForJDBCTime("OFFICE_HOURS <>", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursGreaterThan(Date value) {
            addCriterionForJDBCTime("OFFICE_HOURS >", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("OFFICE_HOURS >=", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursLessThan(Date value) {
            addCriterionForJDBCTime("OFFICE_HOURS <", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("OFFICE_HOURS <=", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursIn(List<Date> values) {
            addCriterionForJDBCTime("OFFICE_HOURS in", values, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursNotIn(List<Date> values) {
            addCriterionForJDBCTime("OFFICE_HOURS not in", values, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("OFFICE_HOURS between", value1, value2, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("OFFICE_HOURS not between", value1, value2, "officeHours");
            return (Criteria) this;
        }

        public Criteria andClosingTimeIsNull() {
            addCriterion("CLOSING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andClosingTimeIsNotNull() {
            addCriterion("CLOSING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andClosingTimeEqualTo(Date value) {
            addCriterionForJDBCTime("CLOSING_TIME =", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("CLOSING_TIME <>", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("CLOSING_TIME >", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("CLOSING_TIME >=", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeLessThan(Date value) {
            addCriterionForJDBCTime("CLOSING_TIME <", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("CLOSING_TIME <=", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeIn(List<Date> values) {
            addCriterionForJDBCTime("CLOSING_TIME in", values, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("CLOSING_TIME not in", values, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("CLOSING_TIME between", value1, value2, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("CLOSING_TIME not between", value1, value2, "closingTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Long value) {
            addCriterion("STAFF_ID =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Long value) {
            addCriterion("STAFF_ID <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Long value) {
            addCriterion("STAFF_ID >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Long value) {
            addCriterion("STAFF_ID >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Long value) {
            addCriterion("STAFF_ID <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Long value) {
            addCriterion("STAFF_ID <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Long> values) {
            addCriterion("STAFF_ID in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Long> values) {
            addCriterion("STAFF_ID not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Long value1, Long value2) {
            addCriterion("STAFF_ID between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Long value1, Long value2) {
            addCriterion("STAFF_ID not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andCheckingInDateIdIsNull() {
            addCriterion("CHECKING_IN_DATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckingInDateIdIsNotNull() {
            addCriterion("CHECKING_IN_DATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckingInDateIdEqualTo(Long value) {
            addCriterion("CHECKING_IN_DATE_ID =", value, "checkingInDateId");
            return (Criteria) this;
        }

        public Criteria andCheckingInDateIdNotEqualTo(Long value) {
            addCriterion("CHECKING_IN_DATE_ID <>", value, "checkingInDateId");
            return (Criteria) this;
        }

        public Criteria andCheckingInDateIdGreaterThan(Long value) {
            addCriterion("CHECKING_IN_DATE_ID >", value, "checkingInDateId");
            return (Criteria) this;
        }

        public Criteria andCheckingInDateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHECKING_IN_DATE_ID >=", value, "checkingInDateId");
            return (Criteria) this;
        }

        public Criteria andCheckingInDateIdLessThan(Long value) {
            addCriterion("CHECKING_IN_DATE_ID <", value, "checkingInDateId");
            return (Criteria) this;
        }

        public Criteria andCheckingInDateIdLessThanOrEqualTo(Long value) {
            addCriterion("CHECKING_IN_DATE_ID <=", value, "checkingInDateId");
            return (Criteria) this;
        }

        public Criteria andCheckingInDateIdIn(List<Long> values) {
            addCriterion("CHECKING_IN_DATE_ID in", values, "checkingInDateId");
            return (Criteria) this;
        }

        public Criteria andCheckingInDateIdNotIn(List<Long> values) {
            addCriterion("CHECKING_IN_DATE_ID not in", values, "checkingInDateId");
            return (Criteria) this;
        }

        public Criteria andCheckingInDateIdBetween(Long value1, Long value2) {
            addCriterion("CHECKING_IN_DATE_ID between", value1, value2, "checkingInDateId");
            return (Criteria) this;
        }

        public Criteria andCheckingInDateIdNotBetween(Long value1, Long value2) {
            addCriterion("CHECKING_IN_DATE_ID not between", value1, value2, "checkingInDateId");
            return (Criteria) this;
        }

        public Criteria andOutworkerIsNull() {
            addCriterion("OUTWORKER is null");
            return (Criteria) this;
        }

        public Criteria andOutworkerIsNotNull() {
            addCriterion("OUTWORKER is not null");
            return (Criteria) this;
        }

        public Criteria andOutworkerEqualTo(String value) {
            addCriterion("OUTWORKER =", value, "outworker");
            return (Criteria) this;
        }

        public Criteria andOutworkerNotEqualTo(String value) {
            addCriterion("OUTWORKER <>", value, "outworker");
            return (Criteria) this;
        }

        public Criteria andOutworkerGreaterThan(String value) {
            addCriterion("OUTWORKER >", value, "outworker");
            return (Criteria) this;
        }

        public Criteria andOutworkerGreaterThanOrEqualTo(String value) {
            addCriterion("OUTWORKER >=", value, "outworker");
            return (Criteria) this;
        }

        public Criteria andOutworkerLessThan(String value) {
            addCriterion("OUTWORKER <", value, "outworker");
            return (Criteria) this;
        }

        public Criteria andOutworkerLessThanOrEqualTo(String value) {
            addCriterion("OUTWORKER <=", value, "outworker");
            return (Criteria) this;
        }

        public Criteria andOutworkerLike(String value) {
            addCriterion("OUTWORKER like", value, "outworker");
            return (Criteria) this;
        }

        public Criteria andOutworkerNotLike(String value) {
            addCriterion("OUTWORKER not like", value, "outworker");
            return (Criteria) this;
        }

        public Criteria andOutworkerIn(List<String> values) {
            addCriterion("OUTWORKER in", values, "outworker");
            return (Criteria) this;
        }

        public Criteria andOutworkerNotIn(List<String> values) {
            addCriterion("OUTWORKER not in", values, "outworker");
            return (Criteria) this;
        }

        public Criteria andOutworkerBetween(String value1, String value2) {
            addCriterion("OUTWORKER between", value1, value2, "outworker");
            return (Criteria) this;
        }

        public Criteria andOutworkerNotBetween(String value1, String value2) {
            addCriterion("OUTWORKER not between", value1, value2, "outworker");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("LOCATION like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("LOCATION not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andClockInTimeIsNull() {
            addCriterion("CLOCK_IN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andClockInTimeIsNotNull() {
            addCriterion("CLOCK_IN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andClockInTimeEqualTo(String value) {
            addCriterion("CLOCK_IN_TIME =", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeNotEqualTo(String value) {
            addCriterion("CLOCK_IN_TIME <>", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeGreaterThan(String value) {
            addCriterion("CLOCK_IN_TIME >", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CLOCK_IN_TIME >=", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeLessThan(String value) {
            addCriterion("CLOCK_IN_TIME <", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeLessThanOrEqualTo(String value) {
            addCriterion("CLOCK_IN_TIME <=", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeLike(String value) {
            addCriterion("CLOCK_IN_TIME like", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeNotLike(String value) {
            addCriterion("CLOCK_IN_TIME not like", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeIn(List<String> values) {
            addCriterion("CLOCK_IN_TIME in", values, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeNotIn(List<String> values) {
            addCriterion("CLOCK_IN_TIME not in", values, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeBetween(String value1, String value2) {
            addCriterion("CLOCK_IN_TIME between", value1, value2, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeNotBetween(String value1, String value2) {
            addCriterion("CLOCK_IN_TIME not between", value1, value2, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyIsNull() {
            addCriterion("LEAVE_EARLY is null");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyIsNotNull() {
            addCriterion("LEAVE_EARLY is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyEqualTo(String value) {
            addCriterion("LEAVE_EARLY =", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNotEqualTo(String value) {
            addCriterion("LEAVE_EARLY <>", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyGreaterThan(String value) {
            addCriterion("LEAVE_EARLY >", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_EARLY >=", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyLessThan(String value) {
            addCriterion("LEAVE_EARLY <", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_EARLY <=", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyLike(String value) {
            addCriterion("LEAVE_EARLY like", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNotLike(String value) {
            addCriterion("LEAVE_EARLY not like", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyIn(List<String> values) {
            addCriterion("LEAVE_EARLY in", values, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNotIn(List<String> values) {
            addCriterion("LEAVE_EARLY not in", values, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyBetween(String value1, String value2) {
            addCriterion("LEAVE_EARLY between", value1, value2, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNotBetween(String value1, String value2) {
            addCriterion("LEAVE_EARLY not between", value1, value2, "leaveEarly");
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