package com.htyw.app.houseLeasing.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitorExample() {
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

        public Criteria andVisitorNameIsNull() {
            addCriterion("VISITOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVisitorNameIsNotNull() {
            addCriterion("VISITOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorNameEqualTo(String value) {
            addCriterion("VISITOR_NAME =", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameNotEqualTo(String value) {
            addCriterion("VISITOR_NAME <>", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameGreaterThan(String value) {
            addCriterion("VISITOR_NAME >", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameGreaterThanOrEqualTo(String value) {
            addCriterion("VISITOR_NAME >=", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameLessThan(String value) {
            addCriterion("VISITOR_NAME <", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameLessThanOrEqualTo(String value) {
            addCriterion("VISITOR_NAME <=", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameLike(String value) {
            addCriterion("VISITOR_NAME like", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameNotLike(String value) {
            addCriterion("VISITOR_NAME not like", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameIn(List<String> values) {
            addCriterion("VISITOR_NAME in", values, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameNotIn(List<String> values) {
            addCriterion("VISITOR_NAME not in", values, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameBetween(String value1, String value2) {
            addCriterion("VISITOR_NAME between", value1, value2, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameNotBetween(String value1, String value2) {
            addCriterion("VISITOR_NAME not between", value1, value2, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorIphoneNumIsNull() {
            addCriterion("VISITOR_IPHONE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andVisitorIphoneNumIsNotNull() {
            addCriterion("VISITOR_IPHONE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorIphoneNumEqualTo(Integer value) {
            addCriterion("VISITOR_IPHONE_NUM =", value, "visitorIphoneNum");
            return (Criteria) this;
        }

        public Criteria andVisitorIphoneNumNotEqualTo(Integer value) {
            addCriterion("VISITOR_IPHONE_NUM <>", value, "visitorIphoneNum");
            return (Criteria) this;
        }

        public Criteria andVisitorIphoneNumGreaterThan(Integer value) {
            addCriterion("VISITOR_IPHONE_NUM >", value, "visitorIphoneNum");
            return (Criteria) this;
        }

        public Criteria andVisitorIphoneNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("VISITOR_IPHONE_NUM >=", value, "visitorIphoneNum");
            return (Criteria) this;
        }

        public Criteria andVisitorIphoneNumLessThan(Integer value) {
            addCriterion("VISITOR_IPHONE_NUM <", value, "visitorIphoneNum");
            return (Criteria) this;
        }

        public Criteria andVisitorIphoneNumLessThanOrEqualTo(Integer value) {
            addCriterion("VISITOR_IPHONE_NUM <=", value, "visitorIphoneNum");
            return (Criteria) this;
        }

        public Criteria andVisitorIphoneNumIn(List<Integer> values) {
            addCriterion("VISITOR_IPHONE_NUM in", values, "visitorIphoneNum");
            return (Criteria) this;
        }

        public Criteria andVisitorIphoneNumNotIn(List<Integer> values) {
            addCriterion("VISITOR_IPHONE_NUM not in", values, "visitorIphoneNum");
            return (Criteria) this;
        }

        public Criteria andVisitorIphoneNumBetween(Integer value1, Integer value2) {
            addCriterion("VISITOR_IPHONE_NUM between", value1, value2, "visitorIphoneNum");
            return (Criteria) this;
        }

        public Criteria andVisitorIphoneNumNotBetween(Integer value1, Integer value2) {
            addCriterion("VISITOR_IPHONE_NUM not between", value1, value2, "visitorIphoneNum");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberIsNull() {
            addCriterion("VISITOR_ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberIsNotNull() {
            addCriterion("VISITOR_ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberEqualTo(Integer value) {
            addCriterion("VISITOR_ID_NUMBER =", value, "visitorIdNumber");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberNotEqualTo(Integer value) {
            addCriterion("VISITOR_ID_NUMBER <>", value, "visitorIdNumber");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberGreaterThan(Integer value) {
            addCriterion("VISITOR_ID_NUMBER >", value, "visitorIdNumber");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("VISITOR_ID_NUMBER >=", value, "visitorIdNumber");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberLessThan(Integer value) {
            addCriterion("VISITOR_ID_NUMBER <", value, "visitorIdNumber");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberLessThanOrEqualTo(Integer value) {
            addCriterion("VISITOR_ID_NUMBER <=", value, "visitorIdNumber");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberIn(List<Integer> values) {
            addCriterion("VISITOR_ID_NUMBER in", values, "visitorIdNumber");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberNotIn(List<Integer> values) {
            addCriterion("VISITOR_ID_NUMBER not in", values, "visitorIdNumber");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberBetween(Integer value1, Integer value2) {
            addCriterion("VISITOR_ID_NUMBER between", value1, value2, "visitorIdNumber");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("VISITOR_ID_NUMBER not between", value1, value2, "visitorIdNumber");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameIsNull() {
            addCriterion("INTERVIEWEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameIsNotNull() {
            addCriterion("INTERVIEWEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameEqualTo(String value) {
            addCriterion("INTERVIEWEE_NAME =", value, "intervieweeName");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameNotEqualTo(String value) {
            addCriterion("INTERVIEWEE_NAME <>", value, "intervieweeName");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameGreaterThan(String value) {
            addCriterion("INTERVIEWEE_NAME >", value, "intervieweeName");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameGreaterThanOrEqualTo(String value) {
            addCriterion("INTERVIEWEE_NAME >=", value, "intervieweeName");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameLessThan(String value) {
            addCriterion("INTERVIEWEE_NAME <", value, "intervieweeName");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameLessThanOrEqualTo(String value) {
            addCriterion("INTERVIEWEE_NAME <=", value, "intervieweeName");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameLike(String value) {
            addCriterion("INTERVIEWEE_NAME like", value, "intervieweeName");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameNotLike(String value) {
            addCriterion("INTERVIEWEE_NAME not like", value, "intervieweeName");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameIn(List<String> values) {
            addCriterion("INTERVIEWEE_NAME in", values, "intervieweeName");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameNotIn(List<String> values) {
            addCriterion("INTERVIEWEE_NAME not in", values, "intervieweeName");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameBetween(String value1, String value2) {
            addCriterion("INTERVIEWEE_NAME between", value1, value2, "intervieweeName");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNameNotBetween(String value1, String value2) {
            addCriterion("INTERVIEWEE_NAME not between", value1, value2, "intervieweeName");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIphoneNumIsNull() {
            addCriterion("INTERVIEWEE_IPHONE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIphoneNumIsNotNull() {
            addCriterion("INTERVIEWEE_IPHONE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIphoneNumEqualTo(Integer value) {
            addCriterion("INTERVIEWEE_IPHONE_NUM =", value, "intervieweeIphoneNum");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIphoneNumNotEqualTo(Integer value) {
            addCriterion("INTERVIEWEE_IPHONE_NUM <>", value, "intervieweeIphoneNum");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIphoneNumGreaterThan(Integer value) {
            addCriterion("INTERVIEWEE_IPHONE_NUM >", value, "intervieweeIphoneNum");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIphoneNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("INTERVIEWEE_IPHONE_NUM >=", value, "intervieweeIphoneNum");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIphoneNumLessThan(Integer value) {
            addCriterion("INTERVIEWEE_IPHONE_NUM <", value, "intervieweeIphoneNum");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIphoneNumLessThanOrEqualTo(Integer value) {
            addCriterion("INTERVIEWEE_IPHONE_NUM <=", value, "intervieweeIphoneNum");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIphoneNumIn(List<Integer> values) {
            addCriterion("INTERVIEWEE_IPHONE_NUM in", values, "intervieweeIphoneNum");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIphoneNumNotIn(List<Integer> values) {
            addCriterion("INTERVIEWEE_IPHONE_NUM not in", values, "intervieweeIphoneNum");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIphoneNumBetween(Integer value1, Integer value2) {
            addCriterion("INTERVIEWEE_IPHONE_NUM between", value1, value2, "intervieweeIphoneNum");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIphoneNumNotBetween(Integer value1, Integer value2) {
            addCriterion("INTERVIEWEE_IPHONE_NUM not between", value1, value2, "intervieweeIphoneNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNull() {
            addCriterion("VISIT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNotNull() {
            addCriterion("VISIT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNumEqualTo(String value) {
            addCriterion("VISIT_NUM =", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotEqualTo(String value) {
            addCriterion("VISIT_NUM <>", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThan(String value) {
            addCriterion("VISIT_NUM >", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_NUM >=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThan(String value) {
            addCriterion("VISIT_NUM <", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThanOrEqualTo(String value) {
            addCriterion("VISIT_NUM <=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLike(String value) {
            addCriterion("VISIT_NUM like", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotLike(String value) {
            addCriterion("VISIT_NUM not like", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumIn(List<String> values) {
            addCriterion("VISIT_NUM in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotIn(List<String> values) {
            addCriterion("VISIT_NUM not in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumBetween(String value1, String value2) {
            addCriterion("VISIT_NUM between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotBetween(String value1, String value2) {
            addCriterion("VISIT_NUM not between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberTypeIsNull() {
            addCriterion("VISITOR_ID_NUMBER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberTypeIsNotNull() {
            addCriterion("VISITOR_ID_NUMBER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberTypeEqualTo(Integer value) {
            addCriterion("VISITOR_ID_NUMBER_TYPE =", value, "visitorIdNumberType");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberTypeNotEqualTo(Integer value) {
            addCriterion("VISITOR_ID_NUMBER_TYPE <>", value, "visitorIdNumberType");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberTypeGreaterThan(Integer value) {
            addCriterion("VISITOR_ID_NUMBER_TYPE >", value, "visitorIdNumberType");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("VISITOR_ID_NUMBER_TYPE >=", value, "visitorIdNumberType");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberTypeLessThan(Integer value) {
            addCriterion("VISITOR_ID_NUMBER_TYPE <", value, "visitorIdNumberType");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberTypeLessThanOrEqualTo(Integer value) {
            addCriterion("VISITOR_ID_NUMBER_TYPE <=", value, "visitorIdNumberType");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberTypeIn(List<Integer> values) {
            addCriterion("VISITOR_ID_NUMBER_TYPE in", values, "visitorIdNumberType");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberTypeNotIn(List<Integer> values) {
            addCriterion("VISITOR_ID_NUMBER_TYPE not in", values, "visitorIdNumberType");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberTypeBetween(Integer value1, Integer value2) {
            addCriterion("VISITOR_ID_NUMBER_TYPE between", value1, value2, "visitorIdNumberType");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNumberTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("VISITOR_ID_NUMBER_TYPE not between", value1, value2, "visitorIdNumberType");
            return (Criteria) this;
        }

        public Criteria andVisitStatrTimeIsNull() {
            addCriterion("VISIT_STATR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVisitStatrTimeIsNotNull() {
            addCriterion("VISIT_STATR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVisitStatrTimeEqualTo(Date value) {
            addCriterion("VISIT_STATR_TIME =", value, "visitStatrTime");
            return (Criteria) this;
        }

        public Criteria andVisitStatrTimeNotEqualTo(Date value) {
            addCriterion("VISIT_STATR_TIME <>", value, "visitStatrTime");
            return (Criteria) this;
        }

        public Criteria andVisitStatrTimeGreaterThan(Date value) {
            addCriterion("VISIT_STATR_TIME >", value, "visitStatrTime");
            return (Criteria) this;
        }

        public Criteria andVisitStatrTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("VISIT_STATR_TIME >=", value, "visitStatrTime");
            return (Criteria) this;
        }

        public Criteria andVisitStatrTimeLessThan(Date value) {
            addCriterion("VISIT_STATR_TIME <", value, "visitStatrTime");
            return (Criteria) this;
        }

        public Criteria andVisitStatrTimeLessThanOrEqualTo(Date value) {
            addCriterion("VISIT_STATR_TIME <=", value, "visitStatrTime");
            return (Criteria) this;
        }

        public Criteria andVisitStatrTimeIn(List<Date> values) {
            addCriterion("VISIT_STATR_TIME in", values, "visitStatrTime");
            return (Criteria) this;
        }

        public Criteria andVisitStatrTimeNotIn(List<Date> values) {
            addCriterion("VISIT_STATR_TIME not in", values, "visitStatrTime");
            return (Criteria) this;
        }

        public Criteria andVisitStatrTimeBetween(Date value1, Date value2) {
            addCriterion("VISIT_STATR_TIME between", value1, value2, "visitStatrTime");
            return (Criteria) this;
        }

        public Criteria andVisitStatrTimeNotBetween(Date value1, Date value2) {
            addCriterion("VISIT_STATR_TIME not between", value1, value2, "visitStatrTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeIsNull() {
            addCriterion("VISIT_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeIsNotNull() {
            addCriterion("VISIT_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeEqualTo(Date value) {
            addCriterion("VISIT_END_TIME =", value, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeNotEqualTo(Date value) {
            addCriterion("VISIT_END_TIME <>", value, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeGreaterThan(Date value) {
            addCriterion("VISIT_END_TIME >", value, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("VISIT_END_TIME >=", value, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeLessThan(Date value) {
            addCriterion("VISIT_END_TIME <", value, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("VISIT_END_TIME <=", value, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeIn(List<Date> values) {
            addCriterion("VISIT_END_TIME in", values, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeNotIn(List<Date> values) {
            addCriterion("VISIT_END_TIME not in", values, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeBetween(Date value1, Date value2) {
            addCriterion("VISIT_END_TIME between", value1, value2, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andVisitEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("VISIT_END_TIME not between", value1, value2, "visitEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyDescIsNull() {
            addCriterion("APPLY_DESC is null");
            return (Criteria) this;
        }

        public Criteria andApplyDescIsNotNull() {
            addCriterion("APPLY_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDescEqualTo(String value) {
            addCriterion("APPLY_DESC =", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescNotEqualTo(String value) {
            addCriterion("APPLY_DESC <>", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescGreaterThan(String value) {
            addCriterion("APPLY_DESC >", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DESC >=", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescLessThan(String value) {
            addCriterion("APPLY_DESC <", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DESC <=", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescLike(String value) {
            addCriterion("APPLY_DESC like", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescNotLike(String value) {
            addCriterion("APPLY_DESC not like", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescIn(List<String> values) {
            addCriterion("APPLY_DESC in", values, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescNotIn(List<String> values) {
            addCriterion("APPLY_DESC not in", values, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescBetween(String value1, String value2) {
            addCriterion("APPLY_DESC between", value1, value2, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescNotBetween(String value1, String value2) {
            addCriterion("APPLY_DESC not between", value1, value2, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andVisitPictureIsNull() {
            addCriterion("VISIT_PICTURE is null");
            return (Criteria) this;
        }

        public Criteria andVisitPictureIsNotNull() {
            addCriterion("VISIT_PICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitPictureEqualTo(String value) {
            addCriterion("VISIT_PICTURE =", value, "visitPicture");
            return (Criteria) this;
        }

        public Criteria andVisitPictureNotEqualTo(String value) {
            addCriterion("VISIT_PICTURE <>", value, "visitPicture");
            return (Criteria) this;
        }

        public Criteria andVisitPictureGreaterThan(String value) {
            addCriterion("VISIT_PICTURE >", value, "visitPicture");
            return (Criteria) this;
        }

        public Criteria andVisitPictureGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_PICTURE >=", value, "visitPicture");
            return (Criteria) this;
        }

        public Criteria andVisitPictureLessThan(String value) {
            addCriterion("VISIT_PICTURE <", value, "visitPicture");
            return (Criteria) this;
        }

        public Criteria andVisitPictureLessThanOrEqualTo(String value) {
            addCriterion("VISIT_PICTURE <=", value, "visitPicture");
            return (Criteria) this;
        }

        public Criteria andVisitPictureLike(String value) {
            addCriterion("VISIT_PICTURE like", value, "visitPicture");
            return (Criteria) this;
        }

        public Criteria andVisitPictureNotLike(String value) {
            addCriterion("VISIT_PICTURE not like", value, "visitPicture");
            return (Criteria) this;
        }

        public Criteria andVisitPictureIn(List<String> values) {
            addCriterion("VISIT_PICTURE in", values, "visitPicture");
            return (Criteria) this;
        }

        public Criteria andVisitPictureNotIn(List<String> values) {
            addCriterion("VISIT_PICTURE not in", values, "visitPicture");
            return (Criteria) this;
        }

        public Criteria andVisitPictureBetween(String value1, String value2) {
            addCriterion("VISIT_PICTURE between", value1, value2, "visitPicture");
            return (Criteria) this;
        }

        public Criteria andVisitPictureNotBetween(String value1, String value2) {
            addCriterion("VISIT_PICTURE not between", value1, value2, "visitPicture");
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

        public Criteria andDateCreateTimeIsNull() {
            addCriterion("DATE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDateCreateTimeIsNotNull() {
            addCriterion("DATE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreateTimeEqualTo(Date value) {
            addCriterion("DATE_CREATE_TIME =", value, "dateCreateTime");
            return (Criteria) this;
        }

        public Criteria andDateCreateTimeNotEqualTo(Date value) {
            addCriterion("DATE_CREATE_TIME <>", value, "dateCreateTime");
            return (Criteria) this;
        }

        public Criteria andDateCreateTimeGreaterThan(Date value) {
            addCriterion("DATE_CREATE_TIME >", value, "dateCreateTime");
            return (Criteria) this;
        }

        public Criteria andDateCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_CREATE_TIME >=", value, "dateCreateTime");
            return (Criteria) this;
        }

        public Criteria andDateCreateTimeLessThan(Date value) {
            addCriterion("DATE_CREATE_TIME <", value, "dateCreateTime");
            return (Criteria) this;
        }

        public Criteria andDateCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DATE_CREATE_TIME <=", value, "dateCreateTime");
            return (Criteria) this;
        }

        public Criteria andDateCreateTimeIn(List<Date> values) {
            addCriterion("DATE_CREATE_TIME in", values, "dateCreateTime");
            return (Criteria) this;
        }

        public Criteria andDateCreateTimeNotIn(List<Date> values) {
            addCriterion("DATE_CREATE_TIME not in", values, "dateCreateTime");
            return (Criteria) this;
        }

        public Criteria andDateCreateTimeBetween(Date value1, Date value2) {
            addCriterion("DATE_CREATE_TIME between", value1, value2, "dateCreateTime");
            return (Criteria) this;
        }

        public Criteria andDateCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DATE_CREATE_TIME not between", value1, value2, "dateCreateTime");
            return (Criteria) this;
        }

        public Criteria andDateUpdataTimeIsNull() {
            addCriterion("DATE_UPDATA_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDateUpdataTimeIsNotNull() {
            addCriterion("DATE_UPDATA_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDateUpdataTimeEqualTo(Date value) {
            addCriterion("DATE_UPDATA_TIME =", value, "dateUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDateUpdataTimeNotEqualTo(Date value) {
            addCriterion("DATE_UPDATA_TIME <>", value, "dateUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDateUpdataTimeGreaterThan(Date value) {
            addCriterion("DATE_UPDATA_TIME >", value, "dateUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDateUpdataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_UPDATA_TIME >=", value, "dateUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDateUpdataTimeLessThan(Date value) {
            addCriterion("DATE_UPDATA_TIME <", value, "dateUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDateUpdataTimeLessThanOrEqualTo(Date value) {
            addCriterion("DATE_UPDATA_TIME <=", value, "dateUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDateUpdataTimeIn(List<Date> values) {
            addCriterion("DATE_UPDATA_TIME in", values, "dateUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDateUpdataTimeNotIn(List<Date> values) {
            addCriterion("DATE_UPDATA_TIME not in", values, "dateUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDateUpdataTimeBetween(Date value1, Date value2) {
            addCriterion("DATE_UPDATA_TIME between", value1, value2, "dateUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDateUpdataTimeNotBetween(Date value1, Date value2) {
            addCriterion("DATE_UPDATA_TIME not between", value1, value2, "dateUpdataTime");
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

        public Criteria andVisitorsMakeTypeIsNull() {
            addCriterion("VISITORS_MAKE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeIsNotNull() {
            addCriterion("VISITORS_MAKE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeEqualTo(String value) {
            addCriterion("VISITORS_MAKE_TYPE =", value, "visitorsMakeType");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeNotEqualTo(String value) {
            addCriterion("VISITORS_MAKE_TYPE <>", value, "visitorsMakeType");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeGreaterThan(String value) {
            addCriterion("VISITORS_MAKE_TYPE >", value, "visitorsMakeType");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VISITORS_MAKE_TYPE >=", value, "visitorsMakeType");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeLessThan(String value) {
            addCriterion("VISITORS_MAKE_TYPE <", value, "visitorsMakeType");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeLessThanOrEqualTo(String value) {
            addCriterion("VISITORS_MAKE_TYPE <=", value, "visitorsMakeType");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeLike(String value) {
            addCriterion("VISITORS_MAKE_TYPE like", value, "visitorsMakeType");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeNotLike(String value) {
            addCriterion("VISITORS_MAKE_TYPE not like", value, "visitorsMakeType");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeIn(List<String> values) {
            addCriterion("VISITORS_MAKE_TYPE in", values, "visitorsMakeType");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeNotIn(List<String> values) {
            addCriterion("VISITORS_MAKE_TYPE not in", values, "visitorsMakeType");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeBetween(String value1, String value2) {
            addCriterion("VISITORS_MAKE_TYPE between", value1, value2, "visitorsMakeType");
            return (Criteria) this;
        }

        public Criteria andVisitorsMakeTypeNotBetween(String value1, String value2) {
            addCriterion("VISITORS_MAKE_TYPE not between", value1, value2, "visitorsMakeType");
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