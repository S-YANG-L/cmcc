package com.htyw.app.serviceCenter.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServerNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServerNoticeExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andBusMessageIsNull() {
            addCriterion("bus_message is null");
            return (Criteria) this;
        }

        public Criteria andBusMessageIsNotNull() {
            addCriterion("bus_message is not null");
            return (Criteria) this;
        }

        public Criteria andBusMessageEqualTo(String value) {
            addCriterion("bus_message =", value, "busMessage");
            return (Criteria) this;
        }

        public Criteria andBusMessageNotEqualTo(String value) {
            addCriterion("bus_message <>", value, "busMessage");
            return (Criteria) this;
        }

        public Criteria andBusMessageGreaterThan(String value) {
            addCriterion("bus_message >", value, "busMessage");
            return (Criteria) this;
        }

        public Criteria andBusMessageGreaterThanOrEqualTo(String value) {
            addCriterion("bus_message >=", value, "busMessage");
            return (Criteria) this;
        }

        public Criteria andBusMessageLessThan(String value) {
            addCriterion("bus_message <", value, "busMessage");
            return (Criteria) this;
        }

        public Criteria andBusMessageLessThanOrEqualTo(String value) {
            addCriterion("bus_message <=", value, "busMessage");
            return (Criteria) this;
        }

        public Criteria andBusMessageLike(String value) {
            addCriterion("bus_message like", value, "busMessage");
            return (Criteria) this;
        }

        public Criteria andBusMessageNotLike(String value) {
            addCriterion("bus_message not like", value, "busMessage");
            return (Criteria) this;
        }

        public Criteria andBusMessageIn(List<String> values) {
            addCriterion("bus_message in", values, "busMessage");
            return (Criteria) this;
        }

        public Criteria andBusMessageNotIn(List<String> values) {
            addCriterion("bus_message not in", values, "busMessage");
            return (Criteria) this;
        }

        public Criteria andBusMessageBetween(String value1, String value2) {
            addCriterion("bus_message between", value1, value2, "busMessage");
            return (Criteria) this;
        }

        public Criteria andBusMessageNotBetween(String value1, String value2) {
            addCriterion("bus_message not between", value1, value2, "busMessage");
            return (Criteria) this;
        }

        public Criteria andAuditMessageIsNull() {
            addCriterion("audit_message is null");
            return (Criteria) this;
        }

        public Criteria andAuditMessageIsNotNull() {
            addCriterion("audit_message is not null");
            return (Criteria) this;
        }

        public Criteria andAuditMessageEqualTo(String value) {
            addCriterion("audit_message =", value, "auditMessage");
            return (Criteria) this;
        }

        public Criteria andAuditMessageNotEqualTo(String value) {
            addCriterion("audit_message <>", value, "auditMessage");
            return (Criteria) this;
        }

        public Criteria andAuditMessageGreaterThan(String value) {
            addCriterion("audit_message >", value, "auditMessage");
            return (Criteria) this;
        }

        public Criteria andAuditMessageGreaterThanOrEqualTo(String value) {
            addCriterion("audit_message >=", value, "auditMessage");
            return (Criteria) this;
        }

        public Criteria andAuditMessageLessThan(String value) {
            addCriterion("audit_message <", value, "auditMessage");
            return (Criteria) this;
        }

        public Criteria andAuditMessageLessThanOrEqualTo(String value) {
            addCriterion("audit_message <=", value, "auditMessage");
            return (Criteria) this;
        }

        public Criteria andAuditMessageLike(String value) {
            addCriterion("audit_message like", value, "auditMessage");
            return (Criteria) this;
        }

        public Criteria andAuditMessageNotLike(String value) {
            addCriterion("audit_message not like", value, "auditMessage");
            return (Criteria) this;
        }

        public Criteria andAuditMessageIn(List<String> values) {
            addCriterion("audit_message in", values, "auditMessage");
            return (Criteria) this;
        }

        public Criteria andAuditMessageNotIn(List<String> values) {
            addCriterion("audit_message not in", values, "auditMessage");
            return (Criteria) this;
        }

        public Criteria andAuditMessageBetween(String value1, String value2) {
            addCriterion("audit_message between", value1, value2, "auditMessage");
            return (Criteria) this;
        }

        public Criteria andAuditMessageNotBetween(String value1, String value2) {
            addCriterion("audit_message not between", value1, value2, "auditMessage");
            return (Criteria) this;
        }

        public Criteria andNeedUserIdIsNull() {
            addCriterion("need_user_id is null");
            return (Criteria) this;
        }

        public Criteria andNeedUserIdIsNotNull() {
            addCriterion("need_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andNeedUserIdEqualTo(Long value) {
            addCriterion("need_user_id =", value, "needUserId");
            return (Criteria) this;
        }

        public Criteria andNeedUserIdNotEqualTo(Long value) {
            addCriterion("need_user_id <>", value, "needUserId");
            return (Criteria) this;
        }

        public Criteria andNeedUserIdGreaterThan(Long value) {
            addCriterion("need_user_id >", value, "needUserId");
            return (Criteria) this;
        }

        public Criteria andNeedUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("need_user_id >=", value, "needUserId");
            return (Criteria) this;
        }

        public Criteria andNeedUserIdLessThan(Long value) {
            addCriterion("need_user_id <", value, "needUserId");
            return (Criteria) this;
        }

        public Criteria andNeedUserIdLessThanOrEqualTo(Long value) {
            addCriterion("need_user_id <=", value, "needUserId");
            return (Criteria) this;
        }

        public Criteria andNeedUserIdIn(List<Long> values) {
            addCriterion("need_user_id in", values, "needUserId");
            return (Criteria) this;
        }

        public Criteria andNeedUserIdNotIn(List<Long> values) {
            addCriterion("need_user_id not in", values, "needUserId");
            return (Criteria) this;
        }

        public Criteria andNeedUserIdBetween(Long value1, Long value2) {
            addCriterion("need_user_id between", value1, value2, "needUserId");
            return (Criteria) this;
        }

        public Criteria andNeedUserIdNotBetween(Long value1, Long value2) {
            addCriterion("need_user_id not between", value1, value2, "needUserId");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameIsNull() {
            addCriterion("need_user_name is null");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameIsNotNull() {
            addCriterion("need_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameEqualTo(String value) {
            addCriterion("need_user_name =", value, "needUserName");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameNotEqualTo(String value) {
            addCriterion("need_user_name <>", value, "needUserName");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameGreaterThan(String value) {
            addCriterion("need_user_name >", value, "needUserName");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("need_user_name >=", value, "needUserName");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameLessThan(String value) {
            addCriterion("need_user_name <", value, "needUserName");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameLessThanOrEqualTo(String value) {
            addCriterion("need_user_name <=", value, "needUserName");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameLike(String value) {
            addCriterion("need_user_name like", value, "needUserName");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameNotLike(String value) {
            addCriterion("need_user_name not like", value, "needUserName");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameIn(List<String> values) {
            addCriterion("need_user_name in", values, "needUserName");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameNotIn(List<String> values) {
            addCriterion("need_user_name not in", values, "needUserName");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameBetween(String value1, String value2) {
            addCriterion("need_user_name between", value1, value2, "needUserName");
            return (Criteria) this;
        }

        public Criteria andNeedUserNameNotBetween(String value1, String value2) {
            addCriterion("need_user_name not between", value1, value2, "needUserName");
            return (Criteria) this;
        }

        public Criteria andNeedStateIsNull() {
            addCriterion("need_state is null");
            return (Criteria) this;
        }

        public Criteria andNeedStateIsNotNull() {
            addCriterion("need_state is not null");
            return (Criteria) this;
        }

        public Criteria andNeedStateEqualTo(String value) {
            addCriterion("need_state =", value, "needState");
            return (Criteria) this;
        }

        public Criteria andNeedStateNotEqualTo(String value) {
            addCriterion("need_state <>", value, "needState");
            return (Criteria) this;
        }

        public Criteria andNeedStateGreaterThan(String value) {
            addCriterion("need_state >", value, "needState");
            return (Criteria) this;
        }

        public Criteria andNeedStateGreaterThanOrEqualTo(String value) {
            addCriterion("need_state >=", value, "needState");
            return (Criteria) this;
        }

        public Criteria andNeedStateLessThan(String value) {
            addCriterion("need_state <", value, "needState");
            return (Criteria) this;
        }

        public Criteria andNeedStateLessThanOrEqualTo(String value) {
            addCriterion("need_state <=", value, "needState");
            return (Criteria) this;
        }

        public Criteria andNeedStateLike(String value) {
            addCriterion("need_state like", value, "needState");
            return (Criteria) this;
        }

        public Criteria andNeedStateNotLike(String value) {
            addCriterion("need_state not like", value, "needState");
            return (Criteria) this;
        }

        public Criteria andNeedStateIn(List<String> values) {
            addCriterion("need_state in", values, "needState");
            return (Criteria) this;
        }

        public Criteria andNeedStateNotIn(List<String> values) {
            addCriterion("need_state not in", values, "needState");
            return (Criteria) this;
        }

        public Criteria andNeedStateBetween(String value1, String value2) {
            addCriterion("need_state between", value1, value2, "needState");
            return (Criteria) this;
        }

        public Criteria andNeedStateNotBetween(String value1, String value2) {
            addCriterion("need_state not between", value1, value2, "needState");
            return (Criteria) this;
        }

        public Criteria andTaskOperationIsNull() {
            addCriterion("task_operation is null");
            return (Criteria) this;
        }

        public Criteria andTaskOperationIsNotNull() {
            addCriterion("task_operation is not null");
            return (Criteria) this;
        }

        public Criteria andTaskOperationEqualTo(String value) {
            addCriterion("task_operation =", value, "taskOperation");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNotEqualTo(String value) {
            addCriterion("task_operation <>", value, "taskOperation");
            return (Criteria) this;
        }

        public Criteria andTaskOperationGreaterThan(String value) {
            addCriterion("task_operation >", value, "taskOperation");
            return (Criteria) this;
        }

        public Criteria andTaskOperationGreaterThanOrEqualTo(String value) {
            addCriterion("task_operation >=", value, "taskOperation");
            return (Criteria) this;
        }

        public Criteria andTaskOperationLessThan(String value) {
            addCriterion("task_operation <", value, "taskOperation");
            return (Criteria) this;
        }

        public Criteria andTaskOperationLessThanOrEqualTo(String value) {
            addCriterion("task_operation <=", value, "taskOperation");
            return (Criteria) this;
        }

        public Criteria andTaskOperationLike(String value) {
            addCriterion("task_operation like", value, "taskOperation");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNotLike(String value) {
            addCriterion("task_operation not like", value, "taskOperation");
            return (Criteria) this;
        }

        public Criteria andTaskOperationIn(List<String> values) {
            addCriterion("task_operation in", values, "taskOperation");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNotIn(List<String> values) {
            addCriterion("task_operation not in", values, "taskOperation");
            return (Criteria) this;
        }

        public Criteria andTaskOperationBetween(String value1, String value2) {
            addCriterion("task_operation between", value1, value2, "taskOperation");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNotBetween(String value1, String value2) {
            addCriterion("task_operation not between", value1, value2, "taskOperation");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameIsNull() {
            addCriterion("task_operation_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameIsNotNull() {
            addCriterion("task_operation_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameEqualTo(String value) {
            addCriterion("task_operation_name =", value, "taskOperationName");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameNotEqualTo(String value) {
            addCriterion("task_operation_name <>", value, "taskOperationName");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameGreaterThan(String value) {
            addCriterion("task_operation_name >", value, "taskOperationName");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_operation_name >=", value, "taskOperationName");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameLessThan(String value) {
            addCriterion("task_operation_name <", value, "taskOperationName");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameLessThanOrEqualTo(String value) {
            addCriterion("task_operation_name <=", value, "taskOperationName");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameLike(String value) {
            addCriterion("task_operation_name like", value, "taskOperationName");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameNotLike(String value) {
            addCriterion("task_operation_name not like", value, "taskOperationName");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameIn(List<String> values) {
            addCriterion("task_operation_name in", values, "taskOperationName");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameNotIn(List<String> values) {
            addCriterion("task_operation_name not in", values, "taskOperationName");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameBetween(String value1, String value2) {
            addCriterion("task_operation_name between", value1, value2, "taskOperationName");
            return (Criteria) this;
        }

        public Criteria andTaskOperationNameNotBetween(String value1, String value2) {
            addCriterion("task_operation_name not between", value1, value2, "taskOperationName");
            return (Criteria) this;
        }

        public Criteria andNeedStepIsNull() {
            addCriterion("need_step is null");
            return (Criteria) this;
        }

        public Criteria andNeedStepIsNotNull() {
            addCriterion("need_step is not null");
            return (Criteria) this;
        }

        public Criteria andNeedStepEqualTo(String value) {
            addCriterion("need_step =", value, "needStep");
            return (Criteria) this;
        }

        public Criteria andNeedStepNotEqualTo(String value) {
            addCriterion("need_step <>", value, "needStep");
            return (Criteria) this;
        }

        public Criteria andNeedStepGreaterThan(String value) {
            addCriterion("need_step >", value, "needStep");
            return (Criteria) this;
        }

        public Criteria andNeedStepGreaterThanOrEqualTo(String value) {
            addCriterion("need_step >=", value, "needStep");
            return (Criteria) this;
        }

        public Criteria andNeedStepLessThan(String value) {
            addCriterion("need_step <", value, "needStep");
            return (Criteria) this;
        }

        public Criteria andNeedStepLessThanOrEqualTo(String value) {
            addCriterion("need_step <=", value, "needStep");
            return (Criteria) this;
        }

        public Criteria andNeedStepLike(String value) {
            addCriterion("need_step like", value, "needStep");
            return (Criteria) this;
        }

        public Criteria andNeedStepNotLike(String value) {
            addCriterion("need_step not like", value, "needStep");
            return (Criteria) this;
        }

        public Criteria andNeedStepIn(List<String> values) {
            addCriterion("need_step in", values, "needStep");
            return (Criteria) this;
        }

        public Criteria andNeedStepNotIn(List<String> values) {
            addCriterion("need_step not in", values, "needStep");
            return (Criteria) this;
        }

        public Criteria andNeedStepBetween(String value1, String value2) {
            addCriterion("need_step between", value1, value2, "needStep");
            return (Criteria) this;
        }

        public Criteria andNeedStepNotBetween(String value1, String value2) {
            addCriterion("need_step not between", value1, value2, "needStep");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdIsNull() {
            addCriterion("need_process_id is null");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdIsNotNull() {
            addCriterion("need_process_id is not null");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdEqualTo(String value) {
            addCriterion("need_process_id =", value, "needProcessId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdNotEqualTo(String value) {
            addCriterion("need_process_id <>", value, "needProcessId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdGreaterThan(String value) {
            addCriterion("need_process_id >", value, "needProcessId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("need_process_id >=", value, "needProcessId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdLessThan(String value) {
            addCriterion("need_process_id <", value, "needProcessId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdLessThanOrEqualTo(String value) {
            addCriterion("need_process_id <=", value, "needProcessId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdLike(String value) {
            addCriterion("need_process_id like", value, "needProcessId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdNotLike(String value) {
            addCriterion("need_process_id not like", value, "needProcessId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdIn(List<String> values) {
            addCriterion("need_process_id in", values, "needProcessId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdNotIn(List<String> values) {
            addCriterion("need_process_id not in", values, "needProcessId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdBetween(String value1, String value2) {
            addCriterion("need_process_id between", value1, value2, "needProcessId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessIdNotBetween(String value1, String value2) {
            addCriterion("need_process_id not between", value1, value2, "needProcessId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdIsNull() {
            addCriterion("need_process_ins_id is null");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdIsNotNull() {
            addCriterion("need_process_ins_id is not null");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdEqualTo(String value) {
            addCriterion("need_process_ins_id =", value, "needProcessInsId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdNotEqualTo(String value) {
            addCriterion("need_process_ins_id <>", value, "needProcessInsId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdGreaterThan(String value) {
            addCriterion("need_process_ins_id >", value, "needProcessInsId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdGreaterThanOrEqualTo(String value) {
            addCriterion("need_process_ins_id >=", value, "needProcessInsId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdLessThan(String value) {
            addCriterion("need_process_ins_id <", value, "needProcessInsId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdLessThanOrEqualTo(String value) {
            addCriterion("need_process_ins_id <=", value, "needProcessInsId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdLike(String value) {
            addCriterion("need_process_ins_id like", value, "needProcessInsId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdNotLike(String value) {
            addCriterion("need_process_ins_id not like", value, "needProcessInsId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdIn(List<String> values) {
            addCriterion("need_process_ins_id in", values, "needProcessInsId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdNotIn(List<String> values) {
            addCriterion("need_process_ins_id not in", values, "needProcessInsId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdBetween(String value1, String value2) {
            addCriterion("need_process_ins_id between", value1, value2, "needProcessInsId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessInsIdNotBetween(String value1, String value2) {
            addCriterion("need_process_ins_id not between", value1, value2, "needProcessInsId");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdIsNull() {
            addCriterion("need_node_id is null");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdIsNotNull() {
            addCriterion("need_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdEqualTo(String value) {
            addCriterion("need_node_id =", value, "needNodeId");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdNotEqualTo(String value) {
            addCriterion("need_node_id <>", value, "needNodeId");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdGreaterThan(String value) {
            addCriterion("need_node_id >", value, "needNodeId");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("need_node_id >=", value, "needNodeId");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdLessThan(String value) {
            addCriterion("need_node_id <", value, "needNodeId");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdLessThanOrEqualTo(String value) {
            addCriterion("need_node_id <=", value, "needNodeId");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdLike(String value) {
            addCriterion("need_node_id like", value, "needNodeId");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdNotLike(String value) {
            addCriterion("need_node_id not like", value, "needNodeId");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdIn(List<String> values) {
            addCriterion("need_node_id in", values, "needNodeId");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdNotIn(List<String> values) {
            addCriterion("need_node_id not in", values, "needNodeId");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdBetween(String value1, String value2) {
            addCriterion("need_node_id between", value1, value2, "needNodeId");
            return (Criteria) this;
        }

        public Criteria andNeedNodeIdNotBetween(String value1, String value2) {
            addCriterion("need_node_id not between", value1, value2, "needNodeId");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeIsNull() {
            addCriterion("need_process_code is null");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeIsNotNull() {
            addCriterion("need_process_code is not null");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeEqualTo(String value) {
            addCriterion("need_process_code =", value, "needProcessCode");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeNotEqualTo(String value) {
            addCriterion("need_process_code <>", value, "needProcessCode");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeGreaterThan(String value) {
            addCriterion("need_process_code >", value, "needProcessCode");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("need_process_code >=", value, "needProcessCode");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeLessThan(String value) {
            addCriterion("need_process_code <", value, "needProcessCode");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeLessThanOrEqualTo(String value) {
            addCriterion("need_process_code <=", value, "needProcessCode");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeLike(String value) {
            addCriterion("need_process_code like", value, "needProcessCode");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeNotLike(String value) {
            addCriterion("need_process_code not like", value, "needProcessCode");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeIn(List<String> values) {
            addCriterion("need_process_code in", values, "needProcessCode");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeNotIn(List<String> values) {
            addCriterion("need_process_code not in", values, "needProcessCode");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeBetween(String value1, String value2) {
            addCriterion("need_process_code between", value1, value2, "needProcessCode");
            return (Criteria) this;
        }

        public Criteria andNeedProcessCodeNotBetween(String value1, String value2) {
            addCriterion("need_process_code not between", value1, value2, "needProcessCode");
            return (Criteria) this;
        }

        public Criteria andNeedMarkIsNull() {
            addCriterion("need_mark is null");
            return (Criteria) this;
        }

        public Criteria andNeedMarkIsNotNull() {
            addCriterion("need_mark is not null");
            return (Criteria) this;
        }

        public Criteria andNeedMarkEqualTo(String value) {
            addCriterion("need_mark =", value, "needMark");
            return (Criteria) this;
        }

        public Criteria andNeedMarkNotEqualTo(String value) {
            addCriterion("need_mark <>", value, "needMark");
            return (Criteria) this;
        }

        public Criteria andNeedMarkGreaterThan(String value) {
            addCriterion("need_mark >", value, "needMark");
            return (Criteria) this;
        }

        public Criteria andNeedMarkGreaterThanOrEqualTo(String value) {
            addCriterion("need_mark >=", value, "needMark");
            return (Criteria) this;
        }

        public Criteria andNeedMarkLessThan(String value) {
            addCriterion("need_mark <", value, "needMark");
            return (Criteria) this;
        }

        public Criteria andNeedMarkLessThanOrEqualTo(String value) {
            addCriterion("need_mark <=", value, "needMark");
            return (Criteria) this;
        }

        public Criteria andNeedMarkLike(String value) {
            addCriterion("need_mark like", value, "needMark");
            return (Criteria) this;
        }

        public Criteria andNeedMarkNotLike(String value) {
            addCriterion("need_mark not like", value, "needMark");
            return (Criteria) this;
        }

        public Criteria andNeedMarkIn(List<String> values) {
            addCriterion("need_mark in", values, "needMark");
            return (Criteria) this;
        }

        public Criteria andNeedMarkNotIn(List<String> values) {
            addCriterion("need_mark not in", values, "needMark");
            return (Criteria) this;
        }

        public Criteria andNeedMarkBetween(String value1, String value2) {
            addCriterion("need_mark between", value1, value2, "needMark");
            return (Criteria) this;
        }

        public Criteria andNeedMarkNotBetween(String value1, String value2) {
            addCriterion("need_mark not between", value1, value2, "needMark");
            return (Criteria) this;
        }

        public Criteria andNeedStartTimeIsNull() {
            addCriterion("need_start_time is null");
            return (Criteria) this;
        }

        public Criteria andNeedStartTimeIsNotNull() {
            addCriterion("need_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andNeedStartTimeEqualTo(Date value) {
            addCriterion("need_start_time =", value, "needStartTime");
            return (Criteria) this;
        }

        public Criteria andNeedStartTimeNotEqualTo(Date value) {
            addCriterion("need_start_time <>", value, "needStartTime");
            return (Criteria) this;
        }

        public Criteria andNeedStartTimeGreaterThan(Date value) {
            addCriterion("need_start_time >", value, "needStartTime");
            return (Criteria) this;
        }

        public Criteria andNeedStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("need_start_time >=", value, "needStartTime");
            return (Criteria) this;
        }

        public Criteria andNeedStartTimeLessThan(Date value) {
            addCriterion("need_start_time <", value, "needStartTime");
            return (Criteria) this;
        }

        public Criteria andNeedStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("need_start_time <=", value, "needStartTime");
            return (Criteria) this;
        }

        public Criteria andNeedStartTimeIn(List<Date> values) {
            addCriterion("need_start_time in", values, "needStartTime");
            return (Criteria) this;
        }

        public Criteria andNeedStartTimeNotIn(List<Date> values) {
            addCriterion("need_start_time not in", values, "needStartTime");
            return (Criteria) this;
        }

        public Criteria andNeedStartTimeBetween(Date value1, Date value2) {
            addCriterion("need_start_time between", value1, value2, "needStartTime");
            return (Criteria) this;
        }

        public Criteria andNeedStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("need_start_time not between", value1, value2, "needStartTime");
            return (Criteria) this;
        }

        public Criteria andNeedEndTimeIsNull() {
            addCriterion("need_end_time is null");
            return (Criteria) this;
        }

        public Criteria andNeedEndTimeIsNotNull() {
            addCriterion("need_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andNeedEndTimeEqualTo(Date value) {
            addCriterion("need_end_time =", value, "needEndTime");
            return (Criteria) this;
        }

        public Criteria andNeedEndTimeNotEqualTo(Date value) {
            addCriterion("need_end_time <>", value, "needEndTime");
            return (Criteria) this;
        }

        public Criteria andNeedEndTimeGreaterThan(Date value) {
            addCriterion("need_end_time >", value, "needEndTime");
            return (Criteria) this;
        }

        public Criteria andNeedEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("need_end_time >=", value, "needEndTime");
            return (Criteria) this;
        }

        public Criteria andNeedEndTimeLessThan(Date value) {
            addCriterion("need_end_time <", value, "needEndTime");
            return (Criteria) this;
        }

        public Criteria andNeedEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("need_end_time <=", value, "needEndTime");
            return (Criteria) this;
        }

        public Criteria andNeedEndTimeIn(List<Date> values) {
            addCriterion("need_end_time in", values, "needEndTime");
            return (Criteria) this;
        }

        public Criteria andNeedEndTimeNotIn(List<Date> values) {
            addCriterion("need_end_time not in", values, "needEndTime");
            return (Criteria) this;
        }

        public Criteria andNeedEndTimeBetween(Date value1, Date value2) {
            addCriterion("need_end_time between", value1, value2, "needEndTime");
            return (Criteria) this;
        }

        public Criteria andNeedEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("need_end_time not between", value1, value2, "needEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskSerialIsNull() {
            addCriterion("task_serial is null");
            return (Criteria) this;
        }

        public Criteria andTaskSerialIsNotNull() {
            addCriterion("task_serial is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSerialEqualTo(String value) {
            addCriterion("task_serial =", value, "taskSerial");
            return (Criteria) this;
        }

        public Criteria andTaskSerialNotEqualTo(String value) {
            addCriterion("task_serial <>", value, "taskSerial");
            return (Criteria) this;
        }

        public Criteria andTaskSerialGreaterThan(String value) {
            addCriterion("task_serial >", value, "taskSerial");
            return (Criteria) this;
        }

        public Criteria andTaskSerialGreaterThanOrEqualTo(String value) {
            addCriterion("task_serial >=", value, "taskSerial");
            return (Criteria) this;
        }

        public Criteria andTaskSerialLessThan(String value) {
            addCriterion("task_serial <", value, "taskSerial");
            return (Criteria) this;
        }

        public Criteria andTaskSerialLessThanOrEqualTo(String value) {
            addCriterion("task_serial <=", value, "taskSerial");
            return (Criteria) this;
        }

        public Criteria andTaskSerialLike(String value) {
            addCriterion("task_serial like", value, "taskSerial");
            return (Criteria) this;
        }

        public Criteria andTaskSerialNotLike(String value) {
            addCriterion("task_serial not like", value, "taskSerial");
            return (Criteria) this;
        }

        public Criteria andTaskSerialIn(List<String> values) {
            addCriterion("task_serial in", values, "taskSerial");
            return (Criteria) this;
        }

        public Criteria andTaskSerialNotIn(List<String> values) {
            addCriterion("task_serial not in", values, "taskSerial");
            return (Criteria) this;
        }

        public Criteria andTaskSerialBetween(String value1, String value2) {
            addCriterion("task_serial between", value1, value2, "taskSerial");
            return (Criteria) this;
        }

        public Criteria andTaskSerialNotBetween(String value1, String value2) {
            addCriterion("task_serial not between", value1, value2, "taskSerial");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andOwerGroupIsNull() {
            addCriterion("ower_group is null");
            return (Criteria) this;
        }

        public Criteria andOwerGroupIsNotNull() {
            addCriterion("ower_group is not null");
            return (Criteria) this;
        }

        public Criteria andOwerGroupEqualTo(String value) {
            addCriterion("ower_group =", value, "owerGroup");
            return (Criteria) this;
        }

        public Criteria andOwerGroupNotEqualTo(String value) {
            addCriterion("ower_group <>", value, "owerGroup");
            return (Criteria) this;
        }

        public Criteria andOwerGroupGreaterThan(String value) {
            addCriterion("ower_group >", value, "owerGroup");
            return (Criteria) this;
        }

        public Criteria andOwerGroupGreaterThanOrEqualTo(String value) {
            addCriterion("ower_group >=", value, "owerGroup");
            return (Criteria) this;
        }

        public Criteria andOwerGroupLessThan(String value) {
            addCriterion("ower_group <", value, "owerGroup");
            return (Criteria) this;
        }

        public Criteria andOwerGroupLessThanOrEqualTo(String value) {
            addCriterion("ower_group <=", value, "owerGroup");
            return (Criteria) this;
        }

        public Criteria andOwerGroupLike(String value) {
            addCriterion("ower_group like", value, "owerGroup");
            return (Criteria) this;
        }

        public Criteria andOwerGroupNotLike(String value) {
            addCriterion("ower_group not like", value, "owerGroup");
            return (Criteria) this;
        }

        public Criteria andOwerGroupIn(List<String> values) {
            addCriterion("ower_group in", values, "owerGroup");
            return (Criteria) this;
        }

        public Criteria andOwerGroupNotIn(List<String> values) {
            addCriterion("ower_group not in", values, "owerGroup");
            return (Criteria) this;
        }

        public Criteria andOwerGroupBetween(String value1, String value2) {
            addCriterion("ower_group between", value1, value2, "owerGroup");
            return (Criteria) this;
        }

        public Criteria andOwerGroupNotBetween(String value1, String value2) {
            addCriterion("ower_group not between", value1, value2, "owerGroup");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupIsNull() {
            addCriterion("next_ower_group is null");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupIsNotNull() {
            addCriterion("next_ower_group is not null");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupEqualTo(String value) {
            addCriterion("next_ower_group =", value, "nextOwerGroup");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupNotEqualTo(String value) {
            addCriterion("next_ower_group <>", value, "nextOwerGroup");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupGreaterThan(String value) {
            addCriterion("next_ower_group >", value, "nextOwerGroup");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupGreaterThanOrEqualTo(String value) {
            addCriterion("next_ower_group >=", value, "nextOwerGroup");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupLessThan(String value) {
            addCriterion("next_ower_group <", value, "nextOwerGroup");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupLessThanOrEqualTo(String value) {
            addCriterion("next_ower_group <=", value, "nextOwerGroup");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupLike(String value) {
            addCriterion("next_ower_group like", value, "nextOwerGroup");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupNotLike(String value) {
            addCriterion("next_ower_group not like", value, "nextOwerGroup");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupIn(List<String> values) {
            addCriterion("next_ower_group in", values, "nextOwerGroup");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupNotIn(List<String> values) {
            addCriterion("next_ower_group not in", values, "nextOwerGroup");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupBetween(String value1, String value2) {
            addCriterion("next_ower_group between", value1, value2, "nextOwerGroup");
            return (Criteria) this;
        }

        public Criteria andNextOwerGroupNotBetween(String value1, String value2) {
            addCriterion("next_ower_group not between", value1, value2, "nextOwerGroup");
            return (Criteria) this;
        }

        public Criteria andBusIdIsNull() {
            addCriterion("bus_id is null");
            return (Criteria) this;
        }

        public Criteria andBusIdIsNotNull() {
            addCriterion("bus_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusIdEqualTo(Long value) {
            addCriterion("bus_id =", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotEqualTo(Long value) {
            addCriterion("bus_id <>", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdGreaterThan(Long value) {
            addCriterion("bus_id >", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bus_id >=", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdLessThan(Long value) {
            addCriterion("bus_id <", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdLessThanOrEqualTo(Long value) {
            addCriterion("bus_id <=", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdIn(List<Long> values) {
            addCriterion("bus_id in", values, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotIn(List<Long> values) {
            addCriterion("bus_id not in", values, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdBetween(Long value1, Long value2) {
            addCriterion("bus_id between", value1, value2, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotBetween(Long value1, Long value2) {
            addCriterion("bus_id not between", value1, value2, "busId");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlIsNull() {
            addCriterion("visit_bus_url is null");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlIsNotNull() {
            addCriterion("visit_bus_url is not null");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlEqualTo(String value) {
            addCriterion("visit_bus_url =", value, "visitBusUrl");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlNotEqualTo(String value) {
            addCriterion("visit_bus_url <>", value, "visitBusUrl");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlGreaterThan(String value) {
            addCriterion("visit_bus_url >", value, "visitBusUrl");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlGreaterThanOrEqualTo(String value) {
            addCriterion("visit_bus_url >=", value, "visitBusUrl");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlLessThan(String value) {
            addCriterion("visit_bus_url <", value, "visitBusUrl");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlLessThanOrEqualTo(String value) {
            addCriterion("visit_bus_url <=", value, "visitBusUrl");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlLike(String value) {
            addCriterion("visit_bus_url like", value, "visitBusUrl");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlNotLike(String value) {
            addCriterion("visit_bus_url not like", value, "visitBusUrl");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlIn(List<String> values) {
            addCriterion("visit_bus_url in", values, "visitBusUrl");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlNotIn(List<String> values) {
            addCriterion("visit_bus_url not in", values, "visitBusUrl");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlBetween(String value1, String value2) {
            addCriterion("visit_bus_url between", value1, value2, "visitBusUrl");
            return (Criteria) this;
        }

        public Criteria andVisitBusUrlNotBetween(String value1, String value2) {
            addCriterion("visit_bus_url not between", value1, value2, "visitBusUrl");
            return (Criteria) this;
        }

        public Criteria andNextUsersIsNull() {
            addCriterion("next_users is null");
            return (Criteria) this;
        }

        public Criteria andNextUsersIsNotNull() {
            addCriterion("next_users is not null");
            return (Criteria) this;
        }

        public Criteria andNextUsersEqualTo(String value) {
            addCriterion("next_users =", value, "nextUsers");
            return (Criteria) this;
        }

        public Criteria andNextUsersNotEqualTo(String value) {
            addCriterion("next_users <>", value, "nextUsers");
            return (Criteria) this;
        }

        public Criteria andNextUsersGreaterThan(String value) {
            addCriterion("next_users >", value, "nextUsers");
            return (Criteria) this;
        }

        public Criteria andNextUsersGreaterThanOrEqualTo(String value) {
            addCriterion("next_users >=", value, "nextUsers");
            return (Criteria) this;
        }

        public Criteria andNextUsersLessThan(String value) {
            addCriterion("next_users <", value, "nextUsers");
            return (Criteria) this;
        }

        public Criteria andNextUsersLessThanOrEqualTo(String value) {
            addCriterion("next_users <=", value, "nextUsers");
            return (Criteria) this;
        }

        public Criteria andNextUsersLike(String value) {
            addCriterion("next_users like", value, "nextUsers");
            return (Criteria) this;
        }

        public Criteria andNextUsersNotLike(String value) {
            addCriterion("next_users not like", value, "nextUsers");
            return (Criteria) this;
        }

        public Criteria andNextUsersIn(List<String> values) {
            addCriterion("next_users in", values, "nextUsers");
            return (Criteria) this;
        }

        public Criteria andNextUsersNotIn(List<String> values) {
            addCriterion("next_users not in", values, "nextUsers");
            return (Criteria) this;
        }

        public Criteria andNextUsersBetween(String value1, String value2) {
            addCriterion("next_users between", value1, value2, "nextUsers");
            return (Criteria) this;
        }

        public Criteria andNextUsersNotBetween(String value1, String value2) {
            addCriterion("next_users not between", value1, value2, "nextUsers");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlIsNull() {
            addCriterion("update_bus_url is null");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlIsNotNull() {
            addCriterion("update_bus_url is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlEqualTo(String value) {
            addCriterion("update_bus_url =", value, "updateBusUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlNotEqualTo(String value) {
            addCriterion("update_bus_url <>", value, "updateBusUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlGreaterThan(String value) {
            addCriterion("update_bus_url >", value, "updateBusUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlGreaterThanOrEqualTo(String value) {
            addCriterion("update_bus_url >=", value, "updateBusUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlLessThan(String value) {
            addCriterion("update_bus_url <", value, "updateBusUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlLessThanOrEqualTo(String value) {
            addCriterion("update_bus_url <=", value, "updateBusUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlLike(String value) {
            addCriterion("update_bus_url like", value, "updateBusUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlNotLike(String value) {
            addCriterion("update_bus_url not like", value, "updateBusUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlIn(List<String> values) {
            addCriterion("update_bus_url in", values, "updateBusUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlNotIn(List<String> values) {
            addCriterion("update_bus_url not in", values, "updateBusUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlBetween(String value1, String value2) {
            addCriterion("update_bus_url between", value1, value2, "updateBusUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateBusUrlNotBetween(String value1, String value2) {
            addCriterion("update_bus_url not between", value1, value2, "updateBusUrl");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameIsNull() {
            addCriterion("PREVIOUS_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameIsNotNull() {
            addCriterion("PREVIOUS_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameEqualTo(String value) {
            addCriterion("PREVIOUS_USER_NAME =", value, "previousUserName");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameNotEqualTo(String value) {
            addCriterion("PREVIOUS_USER_NAME <>", value, "previousUserName");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameGreaterThan(String value) {
            addCriterion("PREVIOUS_USER_NAME >", value, "previousUserName");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("PREVIOUS_USER_NAME >=", value, "previousUserName");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameLessThan(String value) {
            addCriterion("PREVIOUS_USER_NAME <", value, "previousUserName");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameLessThanOrEqualTo(String value) {
            addCriterion("PREVIOUS_USER_NAME <=", value, "previousUserName");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameLike(String value) {
            addCriterion("PREVIOUS_USER_NAME like", value, "previousUserName");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameNotLike(String value) {
            addCriterion("PREVIOUS_USER_NAME not like", value, "previousUserName");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameIn(List<String> values) {
            addCriterion("PREVIOUS_USER_NAME in", values, "previousUserName");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameNotIn(List<String> values) {
            addCriterion("PREVIOUS_USER_NAME not in", values, "previousUserName");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameBetween(String value1, String value2) {
            addCriterion("PREVIOUS_USER_NAME between", value1, value2, "previousUserName");
            return (Criteria) this;
        }

        public Criteria andPreviousUserNameNotBetween(String value1, String value2) {
            addCriterion("PREVIOUS_USER_NAME not between", value1, value2, "previousUserName");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdIsNull() {
            addCriterion("PREVIOUS_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdIsNotNull() {
            addCriterion("PREVIOUS_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdEqualTo(String value) {
            addCriterion("PREVIOUS_USER_ID =", value, "previousUserId");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdNotEqualTo(String value) {
            addCriterion("PREVIOUS_USER_ID <>", value, "previousUserId");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdGreaterThan(String value) {
            addCriterion("PREVIOUS_USER_ID >", value, "previousUserId");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("PREVIOUS_USER_ID >=", value, "previousUserId");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdLessThan(String value) {
            addCriterion("PREVIOUS_USER_ID <", value, "previousUserId");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdLessThanOrEqualTo(String value) {
            addCriterion("PREVIOUS_USER_ID <=", value, "previousUserId");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdLike(String value) {
            addCriterion("PREVIOUS_USER_ID like", value, "previousUserId");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdNotLike(String value) {
            addCriterion("PREVIOUS_USER_ID not like", value, "previousUserId");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdIn(List<String> values) {
            addCriterion("PREVIOUS_USER_ID in", values, "previousUserId");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdNotIn(List<String> values) {
            addCriterion("PREVIOUS_USER_ID not in", values, "previousUserId");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdBetween(String value1, String value2) {
            addCriterion("PREVIOUS_USER_ID between", value1, value2, "previousUserId");
            return (Criteria) this;
        }

        public Criteria andPreviousUserIdNotBetween(String value1, String value2) {
            addCriterion("PREVIOUS_USER_ID not between", value1, value2, "previousUserId");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkIsNull() {
            addCriterion("NEED_HANDLE_MARK is null");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkIsNotNull() {
            addCriterion("NEED_HANDLE_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkEqualTo(String value) {
            addCriterion("NEED_HANDLE_MARK =", value, "needHandleMark");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkNotEqualTo(String value) {
            addCriterion("NEED_HANDLE_MARK <>", value, "needHandleMark");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkGreaterThan(String value) {
            addCriterion("NEED_HANDLE_MARK >", value, "needHandleMark");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkGreaterThanOrEqualTo(String value) {
            addCriterion("NEED_HANDLE_MARK >=", value, "needHandleMark");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkLessThan(String value) {
            addCriterion("NEED_HANDLE_MARK <", value, "needHandleMark");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkLessThanOrEqualTo(String value) {
            addCriterion("NEED_HANDLE_MARK <=", value, "needHandleMark");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkLike(String value) {
            addCriterion("NEED_HANDLE_MARK like", value, "needHandleMark");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkNotLike(String value) {
            addCriterion("NEED_HANDLE_MARK not like", value, "needHandleMark");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkIn(List<String> values) {
            addCriterion("NEED_HANDLE_MARK in", values, "needHandleMark");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkNotIn(List<String> values) {
            addCriterion("NEED_HANDLE_MARK not in", values, "needHandleMark");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkBetween(String value1, String value2) {
            addCriterion("NEED_HANDLE_MARK between", value1, value2, "needHandleMark");
            return (Criteria) this;
        }

        public Criteria andNeedHandleMarkNotBetween(String value1, String value2) {
            addCriterion("NEED_HANDLE_MARK not between", value1, value2, "needHandleMark");
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