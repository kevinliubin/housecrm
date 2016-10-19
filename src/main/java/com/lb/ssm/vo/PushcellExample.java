package com.lb.ssm.vo;

import java.util.ArrayList;
import java.util.List;

public class PushcellExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PushcellExample() {
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

        public Criteria andPushidIsNull() {
            addCriterion("pushId is null");
            return (Criteria) this;
        }

        public Criteria andPushidIsNotNull() {
            addCriterion("pushId is not null");
            return (Criteria) this;
        }

        public Criteria andPushidEqualTo(Integer value) {
            addCriterion("pushId =", value, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidNotEqualTo(Integer value) {
            addCriterion("pushId <>", value, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidGreaterThan(Integer value) {
            addCriterion("pushId >", value, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pushId >=", value, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidLessThan(Integer value) {
            addCriterion("pushId <", value, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidLessThanOrEqualTo(Integer value) {
            addCriterion("pushId <=", value, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidIn(List<Integer> values) {
            addCriterion("pushId in", values, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidNotIn(List<Integer> values) {
            addCriterion("pushId not in", values, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidBetween(Integer value1, Integer value2) {
            addCriterion("pushId between", value1, value2, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidNotBetween(Integer value1, Integer value2) {
            addCriterion("pushId not between", value1, value2, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushdateIsNull() {
            addCriterion("pushDate is null");
            return (Criteria) this;
        }

        public Criteria andPushdateIsNotNull() {
            addCriterion("pushDate is not null");
            return (Criteria) this;
        }

        public Criteria andPushdateEqualTo(String value) {
            addCriterion("pushDate =", value, "pushdate");
            return (Criteria) this;
        }

        public Criteria andPushdateNotEqualTo(String value) {
            addCriterion("pushDate <>", value, "pushdate");
            return (Criteria) this;
        }

        public Criteria andPushdateGreaterThan(String value) {
            addCriterion("pushDate >", value, "pushdate");
            return (Criteria) this;
        }

        public Criteria andPushdateGreaterThanOrEqualTo(String value) {
            addCriterion("pushDate >=", value, "pushdate");
            return (Criteria) this;
        }

        public Criteria andPushdateLessThan(String value) {
            addCriterion("pushDate <", value, "pushdate");
            return (Criteria) this;
        }

        public Criteria andPushdateLessThanOrEqualTo(String value) {
            addCriterion("pushDate <=", value, "pushdate");
            return (Criteria) this;
        }

        public Criteria andPushdateLike(String value) {
            addCriterion("pushDate like", value, "pushdate");
            return (Criteria) this;
        }

        public Criteria andPushdateNotLike(String value) {
            addCriterion("pushDate not like", value, "pushdate");
            return (Criteria) this;
        }

        public Criteria andPushdateIn(List<String> values) {
            addCriterion("pushDate in", values, "pushdate");
            return (Criteria) this;
        }

        public Criteria andPushdateNotIn(List<String> values) {
            addCriterion("pushDate not in", values, "pushdate");
            return (Criteria) this;
        }

        public Criteria andPushdateBetween(String value1, String value2) {
            addCriterion("pushDate between", value1, value2, "pushdate");
            return (Criteria) this;
        }

        public Criteria andPushdateNotBetween(String value1, String value2) {
            addCriterion("pushDate not between", value1, value2, "pushdate");
            return (Criteria) this;
        }

        public Criteria andPushcellidIsNull() {
            addCriterion("pushCellId is null");
            return (Criteria) this;
        }

        public Criteria andPushcellidIsNotNull() {
            addCriterion("pushCellId is not null");
            return (Criteria) this;
        }

        public Criteria andPushcellidEqualTo(Integer value) {
            addCriterion("pushCellId =", value, "pushcellid");
            return (Criteria) this;
        }

        public Criteria andPushcellidNotEqualTo(Integer value) {
            addCriterion("pushCellId <>", value, "pushcellid");
            return (Criteria) this;
        }

        public Criteria andPushcellidGreaterThan(Integer value) {
            addCriterion("pushCellId >", value, "pushcellid");
            return (Criteria) this;
        }

        public Criteria andPushcellidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pushCellId >=", value, "pushcellid");
            return (Criteria) this;
        }

        public Criteria andPushcellidLessThan(Integer value) {
            addCriterion("pushCellId <", value, "pushcellid");
            return (Criteria) this;
        }

        public Criteria andPushcellidLessThanOrEqualTo(Integer value) {
            addCriterion("pushCellId <=", value, "pushcellid");
            return (Criteria) this;
        }

        public Criteria andPushcellidIn(List<Integer> values) {
            addCriterion("pushCellId in", values, "pushcellid");
            return (Criteria) this;
        }

        public Criteria andPushcellidNotIn(List<Integer> values) {
            addCriterion("pushCellId not in", values, "pushcellid");
            return (Criteria) this;
        }

        public Criteria andPushcellidBetween(Integer value1, Integer value2) {
            addCriterion("pushCellId between", value1, value2, "pushcellid");
            return (Criteria) this;
        }

        public Criteria andPushcellidNotBetween(Integer value1, Integer value2) {
            addCriterion("pushCellId not between", value1, value2, "pushcellid");
            return (Criteria) this;
        }

        public Criteria andPushcushidIsNull() {
            addCriterion("pushCushId is null");
            return (Criteria) this;
        }

        public Criteria andPushcushidIsNotNull() {
            addCriterion("pushCushId is not null");
            return (Criteria) this;
        }

        public Criteria andPushcushidEqualTo(Integer value) {
            addCriterion("pushCushId =", value, "pushcushid");
            return (Criteria) this;
        }

        public Criteria andPushcushidNotEqualTo(Integer value) {
            addCriterion("pushCushId <>", value, "pushcushid");
            return (Criteria) this;
        }

        public Criteria andPushcushidGreaterThan(Integer value) {
            addCriterion("pushCushId >", value, "pushcushid");
            return (Criteria) this;
        }

        public Criteria andPushcushidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pushCushId >=", value, "pushcushid");
            return (Criteria) this;
        }

        public Criteria andPushcushidLessThan(Integer value) {
            addCriterion("pushCushId <", value, "pushcushid");
            return (Criteria) this;
        }

        public Criteria andPushcushidLessThanOrEqualTo(Integer value) {
            addCriterion("pushCushId <=", value, "pushcushid");
            return (Criteria) this;
        }

        public Criteria andPushcushidIn(List<Integer> values) {
            addCriterion("pushCushId in", values, "pushcushid");
            return (Criteria) this;
        }

        public Criteria andPushcushidNotIn(List<Integer> values) {
            addCriterion("pushCushId not in", values, "pushcushid");
            return (Criteria) this;
        }

        public Criteria andPushcushidBetween(Integer value1, Integer value2) {
            addCriterion("pushCushId between", value1, value2, "pushcushid");
            return (Criteria) this;
        }

        public Criteria andPushcushidNotBetween(Integer value1, Integer value2) {
            addCriterion("pushCushId not between", value1, value2, "pushcushid");
            return (Criteria) this;
        }

        public Criteria andPushcushnameIsNull() {
            addCriterion("pushCushName is null");
            return (Criteria) this;
        }

        public Criteria andPushcushnameIsNotNull() {
            addCriterion("pushCushName is not null");
            return (Criteria) this;
        }

        public Criteria andPushcushnameEqualTo(String value) {
            addCriterion("pushCushName =", value, "pushcushname");
            return (Criteria) this;
        }

        public Criteria andPushcushnameNotEqualTo(String value) {
            addCriterion("pushCushName <>", value, "pushcushname");
            return (Criteria) this;
        }

        public Criteria andPushcushnameGreaterThan(String value) {
            addCriterion("pushCushName >", value, "pushcushname");
            return (Criteria) this;
        }

        public Criteria andPushcushnameGreaterThanOrEqualTo(String value) {
            addCriterion("pushCushName >=", value, "pushcushname");
            return (Criteria) this;
        }

        public Criteria andPushcushnameLessThan(String value) {
            addCriterion("pushCushName <", value, "pushcushname");
            return (Criteria) this;
        }

        public Criteria andPushcushnameLessThanOrEqualTo(String value) {
            addCriterion("pushCushName <=", value, "pushcushname");
            return (Criteria) this;
        }

        public Criteria andPushcushnameLike(String value) {
            addCriterion("pushCushName like", value, "pushcushname");
            return (Criteria) this;
        }

        public Criteria andPushcushnameNotLike(String value) {
            addCriterion("pushCushName not like", value, "pushcushname");
            return (Criteria) this;
        }

        public Criteria andPushcushnameIn(List<String> values) {
            addCriterion("pushCushName in", values, "pushcushname");
            return (Criteria) this;
        }

        public Criteria andPushcushnameNotIn(List<String> values) {
            addCriterion("pushCushName not in", values, "pushcushname");
            return (Criteria) this;
        }

        public Criteria andPushcushnameBetween(String value1, String value2) {
            addCriterion("pushCushName between", value1, value2, "pushcushname");
            return (Criteria) this;
        }

        public Criteria andPushcushnameNotBetween(String value1, String value2) {
            addCriterion("pushCushName not between", value1, value2, "pushcushname");
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