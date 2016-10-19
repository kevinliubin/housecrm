package com.lb.ssm.vo;

import java.util.ArrayList;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andLogidIsNull() {
            addCriterion("logId is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("logId is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(Integer value) {
            addCriterion("logId =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(Integer value) {
            addCriterion("logId <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(Integer value) {
            addCriterion("logId >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("logId >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(Integer value) {
            addCriterion("logId <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(Integer value) {
            addCriterion("logId <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<Integer> values) {
            addCriterion("logId in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<Integer> values) {
            addCriterion("logId not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(Integer value1, Integer value2) {
            addCriterion("logId between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("logId not between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLoguseridIsNull() {
            addCriterion("logUserId is null");
            return (Criteria) this;
        }

        public Criteria andLoguseridIsNotNull() {
            addCriterion("logUserId is not null");
            return (Criteria) this;
        }

        public Criteria andLoguseridEqualTo(Integer value) {
            addCriterion("logUserId =", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridNotEqualTo(Integer value) {
            addCriterion("logUserId <>", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridGreaterThan(Integer value) {
            addCriterion("logUserId >", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("logUserId >=", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridLessThan(Integer value) {
            addCriterion("logUserId <", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridLessThanOrEqualTo(Integer value) {
            addCriterion("logUserId <=", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridIn(List<Integer> values) {
            addCriterion("logUserId in", values, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridNotIn(List<Integer> values) {
            addCriterion("logUserId not in", values, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridBetween(Integer value1, Integer value2) {
            addCriterion("logUserId between", value1, value2, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridNotBetween(Integer value1, Integer value2) {
            addCriterion("logUserId not between", value1, value2, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLogusernameIsNull() {
            addCriterion("logUsername is null");
            return (Criteria) this;
        }

        public Criteria andLogusernameIsNotNull() {
            addCriterion("logUsername is not null");
            return (Criteria) this;
        }

        public Criteria andLogusernameEqualTo(String value) {
            addCriterion("logUsername =", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameNotEqualTo(String value) {
            addCriterion("logUsername <>", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameGreaterThan(String value) {
            addCriterion("logUsername >", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameGreaterThanOrEqualTo(String value) {
            addCriterion("logUsername >=", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameLessThan(String value) {
            addCriterion("logUsername <", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameLessThanOrEqualTo(String value) {
            addCriterion("logUsername <=", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameLike(String value) {
            addCriterion("logUsername like", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameNotLike(String value) {
            addCriterion("logUsername not like", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameIn(List<String> values) {
            addCriterion("logUsername in", values, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameNotIn(List<String> values) {
            addCriterion("logUsername not in", values, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameBetween(String value1, String value2) {
            addCriterion("logUsername between", value1, value2, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameNotBetween(String value1, String value2) {
            addCriterion("logUsername not between", value1, value2, "logusername");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNull() {
            addCriterion("loginIp is null");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNotNull() {
            addCriterion("loginIp is not null");
            return (Criteria) this;
        }

        public Criteria andLoginipEqualTo(String value) {
            addCriterion("loginIp =", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotEqualTo(String value) {
            addCriterion("loginIp <>", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThan(String value) {
            addCriterion("loginIp >", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("loginIp >=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThan(String value) {
            addCriterion("loginIp <", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThanOrEqualTo(String value) {
            addCriterion("loginIp <=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLike(String value) {
            addCriterion("loginIp like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotLike(String value) {
            addCriterion("loginIp not like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipIn(List<String> values) {
            addCriterion("loginIp in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotIn(List<String> values) {
            addCriterion("loginIp not in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipBetween(String value1, String value2) {
            addCriterion("loginIp between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotBetween(String value1, String value2) {
            addCriterion("loginIp not between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("operation is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("operation is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("operation =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("operation <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("operation >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("operation >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("operation <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("operation <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("operation like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("operation not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("operation in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("operation not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("operation between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("operation not between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andLogdateIsNull() {
            addCriterion("logDate is null");
            return (Criteria) this;
        }

        public Criteria andLogdateIsNotNull() {
            addCriterion("logDate is not null");
            return (Criteria) this;
        }

        public Criteria andLogdateEqualTo(String value) {
            addCriterion("logDate =", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotEqualTo(String value) {
            addCriterion("logDate <>", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateGreaterThan(String value) {
            addCriterion("logDate >", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateGreaterThanOrEqualTo(String value) {
            addCriterion("logDate >=", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLessThan(String value) {
            addCriterion("logDate <", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLessThanOrEqualTo(String value) {
            addCriterion("logDate <=", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLike(String value) {
            addCriterion("logDate like", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotLike(String value) {
            addCriterion("logDate not like", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateIn(List<String> values) {
            addCriterion("logDate in", values, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotIn(List<String> values) {
            addCriterion("logDate not in", values, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateBetween(String value1, String value2) {
            addCriterion("logDate between", value1, value2, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotBetween(String value1, String value2) {
            addCriterion("logDate not between", value1, value2, "logdate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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