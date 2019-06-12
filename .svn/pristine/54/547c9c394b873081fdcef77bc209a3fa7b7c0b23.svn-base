package com.htyw.app.user.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
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

        public Criteria andContactNumberEqualTo(String value) {
            addCriterion("CONTACT_NUMBER =", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotEqualTo(String value) {
            addCriterion("CONTACT_NUMBER <>", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThan(String value) {
            addCriterion("CONTACT_NUMBER >", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_NUMBER >=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThan(String value) {
            addCriterion("CONTACT_NUMBER <", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_NUMBER <=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLike(String value) {
            addCriterion("CONTACT_NUMBER like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotLike(String value) {
            addCriterion("CONTACT_NUMBER not like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberIn(List<String> values) {
            addCriterion("CONTACT_NUMBER in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotIn(List<String> values) {
            addCriterion("CONTACT_NUMBER not in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberBetween(String value1, String value2) {
            addCriterion("CONTACT_NUMBER between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotBetween(String value1, String value2) {
            addCriterion("CONTACT_NUMBER not between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
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

        public Criteria andPostalCodeIsNull() {
            addCriterion("POSTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNotNull() {
            addCriterion("POSTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(Long value) {
            addCriterion("POSTAL_CODE =", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotEqualTo(Long value) {
            addCriterion("POSTAL_CODE <>", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThan(Long value) {
            addCriterion("POSTAL_CODE >", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("POSTAL_CODE >=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThan(Long value) {
            addCriterion("POSTAL_CODE <", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThanOrEqualTo(Long value) {
            addCriterion("POSTAL_CODE <=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIn(List<Long> values) {
            addCriterion("POSTAL_CODE in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotIn(List<Long> values) {
            addCriterion("POSTAL_CODE not in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeBetween(Long value1, Long value2) {
            addCriterion("POSTAL_CODE between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotBetween(Long value1, Long value2) {
            addCriterion("POSTAL_CODE not between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNull() {
            addCriterion("ENCLOSURE is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNotNull() {
            addCriterion("ENCLOSURE is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureEqualTo(String value) {
            addCriterion("ENCLOSURE =", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotEqualTo(String value) {
            addCriterion("ENCLOSURE <>", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThan(String value) {
            addCriterion("ENCLOSURE >", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThanOrEqualTo(String value) {
            addCriterion("ENCLOSURE >=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThan(String value) {
            addCriterion("ENCLOSURE <", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThanOrEqualTo(String value) {
            addCriterion("ENCLOSURE <=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLike(String value) {
            addCriterion("ENCLOSURE like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotLike(String value) {
            addCriterion("ENCLOSURE not like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureIn(List<String> values) {
            addCriterion("ENCLOSURE in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotIn(List<String> values) {
            addCriterion("ENCLOSURE not in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureBetween(String value1, String value2) {
            addCriterion("ENCLOSURE between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotBetween(String value1, String value2) {
            addCriterion("ENCLOSURE not between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkIsNull() {
            addCriterion("RECEPTION_CLERK is null");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkIsNotNull() {
            addCriterion("RECEPTION_CLERK is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkEqualTo(String value) {
            addCriterion("RECEPTION_CLERK =", value, "receptionClerk");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkNotEqualTo(String value) {
            addCriterion("RECEPTION_CLERK <>", value, "receptionClerk");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkGreaterThan(String value) {
            addCriterion("RECEPTION_CLERK >", value, "receptionClerk");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkGreaterThanOrEqualTo(String value) {
            addCriterion("RECEPTION_CLERK >=", value, "receptionClerk");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkLessThan(String value) {
            addCriterion("RECEPTION_CLERK <", value, "receptionClerk");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkLessThanOrEqualTo(String value) {
            addCriterion("RECEPTION_CLERK <=", value, "receptionClerk");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkLike(String value) {
            addCriterion("RECEPTION_CLERK like", value, "receptionClerk");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkNotLike(String value) {
            addCriterion("RECEPTION_CLERK not like", value, "receptionClerk");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkIn(List<String> values) {
            addCriterion("RECEPTION_CLERK in", values, "receptionClerk");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkNotIn(List<String> values) {
            addCriterion("RECEPTION_CLERK not in", values, "receptionClerk");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkBetween(String value1, String value2) {
            addCriterion("RECEPTION_CLERK between", value1, value2, "receptionClerk");
            return (Criteria) this;
        }

        public Criteria andReceptionClerkNotBetween(String value1, String value2) {
            addCriterion("RECEPTION_CLERK not between", value1, value2, "receptionClerk");
            return (Criteria) this;
        }

        public Criteria andReceptionDateIsNull() {
            addCriterion("RECEPTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReceptionDateIsNotNull() {
            addCriterion("RECEPTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionDateEqualTo(Date value) {
            addCriterionForJDBCDate("RECEPTION_DATE =", value, "receptionDate");
            return (Criteria) this;
        }

        public Criteria andReceptionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RECEPTION_DATE <>", value, "receptionDate");
            return (Criteria) this;
        }

        public Criteria andReceptionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("RECEPTION_DATE >", value, "receptionDate");
            return (Criteria) this;
        }

        public Criteria andReceptionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECEPTION_DATE >=", value, "receptionDate");
            return (Criteria) this;
        }

        public Criteria andReceptionDateLessThan(Date value) {
            addCriterionForJDBCDate("RECEPTION_DATE <", value, "receptionDate");
            return (Criteria) this;
        }

        public Criteria andReceptionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECEPTION_DATE <=", value, "receptionDate");
            return (Criteria) this;
        }

        public Criteria andReceptionDateIn(List<Date> values) {
            addCriterionForJDBCDate("RECEPTION_DATE in", values, "receptionDate");
            return (Criteria) this;
        }

        public Criteria andReceptionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RECEPTION_DATE not in", values, "receptionDate");
            return (Criteria) this;
        }

        public Criteria andReceptionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECEPTION_DATE between", value1, value2, "receptionDate");
            return (Criteria) this;
        }

        public Criteria andReceptionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECEPTION_DATE not between", value1, value2, "receptionDate");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeIsNull() {
            addCriterion("RECEPTION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeIsNotNull() {
            addCriterion("RECEPTION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeEqualTo(Date value) {
            addCriterionForJDBCTime("RECEPTION_TIME =", value, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("RECEPTION_TIME <>", value, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("RECEPTION_TIME >", value, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("RECEPTION_TIME >=", value, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeLessThan(Date value) {
            addCriterionForJDBCTime("RECEPTION_TIME <", value, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("RECEPTION_TIME <=", value, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeIn(List<Date> values) {
            addCriterionForJDBCTime("RECEPTION_TIME in", values, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("RECEPTION_TIME not in", values, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("RECEPTION_TIME between", value1, value2, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andReceptionTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("RECEPTION_TIME not between", value1, value2, "receptionTime");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNull() {
            addCriterion("ACCESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNotNull() {
            addCriterion("ACCESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeEqualTo(String value) {
            addCriterion("ACCESS_TYPE =", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotEqualTo(String value) {
            addCriterion("ACCESS_TYPE <>", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThan(String value) {
            addCriterion("ACCESS_TYPE >", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_TYPE >=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThan(String value) {
            addCriterion("ACCESS_TYPE <", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_TYPE <=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLike(String value) {
            addCriterion("ACCESS_TYPE like", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotLike(String value) {
            addCriterion("ACCESS_TYPE not like", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIn(List<String> values) {
            addCriterion("ACCESS_TYPE in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotIn(List<String> values) {
            addCriterion("ACCESS_TYPE not in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeBetween(String value1, String value2) {
            addCriterion("ACCESS_TYPE between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotBetween(String value1, String value2) {
            addCriterion("ACCESS_TYPE not between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthIsNull() {
            addCriterion("INTENTIONAL_STRENGTH is null");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthIsNotNull() {
            addCriterion("INTENTIONAL_STRENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthEqualTo(String value) {
            addCriterion("INTENTIONAL_STRENGTH =", value, "intentionalStrength");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthNotEqualTo(String value) {
            addCriterion("INTENTIONAL_STRENGTH <>", value, "intentionalStrength");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthGreaterThan(String value) {
            addCriterion("INTENTIONAL_STRENGTH >", value, "intentionalStrength");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthGreaterThanOrEqualTo(String value) {
            addCriterion("INTENTIONAL_STRENGTH >=", value, "intentionalStrength");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthLessThan(String value) {
            addCriterion("INTENTIONAL_STRENGTH <", value, "intentionalStrength");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthLessThanOrEqualTo(String value) {
            addCriterion("INTENTIONAL_STRENGTH <=", value, "intentionalStrength");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthLike(String value) {
            addCriterion("INTENTIONAL_STRENGTH like", value, "intentionalStrength");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthNotLike(String value) {
            addCriterion("INTENTIONAL_STRENGTH not like", value, "intentionalStrength");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthIn(List<String> values) {
            addCriterion("INTENTIONAL_STRENGTH in", values, "intentionalStrength");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthNotIn(List<String> values) {
            addCriterion("INTENTIONAL_STRENGTH not in", values, "intentionalStrength");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthBetween(String value1, String value2) {
            addCriterion("INTENTIONAL_STRENGTH between", value1, value2, "intentionalStrength");
            return (Criteria) this;
        }

        public Criteria andIntentionalStrengthNotBetween(String value1, String value2) {
            addCriterion("INTENTIONAL_STRENGTH not between", value1, value2, "intentionalStrength");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageIsNull() {
            addCriterion("RECEPTION_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageIsNotNull() {
            addCriterion("RECEPTION_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageEqualTo(String value) {
            addCriterion("RECEPTION_MESSAGE =", value, "receptionMessage");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageNotEqualTo(String value) {
            addCriterion("RECEPTION_MESSAGE <>", value, "receptionMessage");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageGreaterThan(String value) {
            addCriterion("RECEPTION_MESSAGE >", value, "receptionMessage");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageGreaterThanOrEqualTo(String value) {
            addCriterion("RECEPTION_MESSAGE >=", value, "receptionMessage");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageLessThan(String value) {
            addCriterion("RECEPTION_MESSAGE <", value, "receptionMessage");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageLessThanOrEqualTo(String value) {
            addCriterion("RECEPTION_MESSAGE <=", value, "receptionMessage");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageLike(String value) {
            addCriterion("RECEPTION_MESSAGE like", value, "receptionMessage");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageNotLike(String value) {
            addCriterion("RECEPTION_MESSAGE not like", value, "receptionMessage");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageIn(List<String> values) {
            addCriterion("RECEPTION_MESSAGE in", values, "receptionMessage");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageNotIn(List<String> values) {
            addCriterion("RECEPTION_MESSAGE not in", values, "receptionMessage");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageBetween(String value1, String value2) {
            addCriterion("RECEPTION_MESSAGE between", value1, value2, "receptionMessage");
            return (Criteria) this;
        }

        public Criteria andReceptionMessageNotBetween(String value1, String value2) {
            addCriterion("RECEPTION_MESSAGE not between", value1, value2, "receptionMessage");
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

        public Criteria andMemberidIdIsNull() {
            addCriterion("MEMBERID_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIdIsNotNull() {
            addCriterion("MEMBERID_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidIdEqualTo(String value) {
            addCriterion("MEMBERID_ID =", value, "memberidId");
            return (Criteria) this;
        }

        public Criteria andMemberidIdNotEqualTo(String value) {
            addCriterion("MEMBERID_ID <>", value, "memberidId");
            return (Criteria) this;
        }

        public Criteria andMemberidIdGreaterThan(String value) {
            addCriterion("MEMBERID_ID >", value, "memberidId");
            return (Criteria) this;
        }

        public Criteria andMemberidIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBERID_ID >=", value, "memberidId");
            return (Criteria) this;
        }

        public Criteria andMemberidIdLessThan(String value) {
            addCriterion("MEMBERID_ID <", value, "memberidId");
            return (Criteria) this;
        }

        public Criteria andMemberidIdLessThanOrEqualTo(String value) {
            addCriterion("MEMBERID_ID <=", value, "memberidId");
            return (Criteria) this;
        }

        public Criteria andMemberidIdLike(String value) {
            addCriterion("MEMBERID_ID like", value, "memberidId");
            return (Criteria) this;
        }

        public Criteria andMemberidIdNotLike(String value) {
            addCriterion("MEMBERID_ID not like", value, "memberidId");
            return (Criteria) this;
        }

        public Criteria andMemberidIdIn(List<String> values) {
            addCriterion("MEMBERID_ID in", values, "memberidId");
            return (Criteria) this;
        }

        public Criteria andMemberidIdNotIn(List<String> values) {
            addCriterion("MEMBERID_ID not in", values, "memberidId");
            return (Criteria) this;
        }

        public Criteria andMemberidIdBetween(String value1, String value2) {
            addCriterion("MEMBERID_ID between", value1, value2, "memberidId");
            return (Criteria) this;
        }

        public Criteria andMemberidIdNotBetween(String value1, String value2) {
            addCriterion("MEMBERID_ID not between", value1, value2, "memberidId");
            return (Criteria) this;
        }

        public Criteria andPersonnoIsNull() {
            addCriterion("PERSONNO is null");
            return (Criteria) this;
        }

        public Criteria andPersonnoIsNotNull() {
            addCriterion("PERSONNO is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnoEqualTo(String value) {
            addCriterion("PERSONNO =", value, "personno");
            return (Criteria) this;
        }

        public Criteria andPersonnoNotEqualTo(String value) {
            addCriterion("PERSONNO <>", value, "personno");
            return (Criteria) this;
        }

        public Criteria andPersonnoGreaterThan(String value) {
            addCriterion("PERSONNO >", value, "personno");
            return (Criteria) this;
        }

        public Criteria andPersonnoGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONNO >=", value, "personno");
            return (Criteria) this;
        }

        public Criteria andPersonnoLessThan(String value) {
            addCriterion("PERSONNO <", value, "personno");
            return (Criteria) this;
        }

        public Criteria andPersonnoLessThanOrEqualTo(String value) {
            addCriterion("PERSONNO <=", value, "personno");
            return (Criteria) this;
        }

        public Criteria andPersonnoLike(String value) {
            addCriterion("PERSONNO like", value, "personno");
            return (Criteria) this;
        }

        public Criteria andPersonnoNotLike(String value) {
            addCriterion("PERSONNO not like", value, "personno");
            return (Criteria) this;
        }

        public Criteria andPersonnoIn(List<String> values) {
            addCriterion("PERSONNO in", values, "personno");
            return (Criteria) this;
        }

        public Criteria andPersonnoNotIn(List<String> values) {
            addCriterion("PERSONNO not in", values, "personno");
            return (Criteria) this;
        }

        public Criteria andPersonnoBetween(String value1, String value2) {
            addCriterion("PERSONNO between", value1, value2, "personno");
            return (Criteria) this;
        }

        public Criteria andPersonnoNotBetween(String value1, String value2) {
            addCriterion("PERSONNO not between", value1, value2, "personno");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIsNull() {
            addCriterion("CUSTOMER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIsNotNull() {
            addCriterion("CUSTOMER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordEqualTo(String value) {
            addCriterion("CUSTOMER_PASSWORD =", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotEqualTo(String value) {
            addCriterion("CUSTOMER_PASSWORD <>", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordGreaterThan(String value) {
            addCriterion("CUSTOMER_PASSWORD >", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PASSWORD >=", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLessThan(String value) {
            addCriterion("CUSTOMER_PASSWORD <", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PASSWORD <=", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLike(String value) {
            addCriterion("CUSTOMER_PASSWORD like", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotLike(String value) {
            addCriterion("CUSTOMER_PASSWORD not like", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIn(List<String> values) {
            addCriterion("CUSTOMER_PASSWORD in", values, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotIn(List<String> values) {
            addCriterion("CUSTOMER_PASSWORD not in", values, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PASSWORD between", value1, value2, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PASSWORD not between", value1, value2, "customerPassword");
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