package com.lb.ssm.vo;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrdercustomeridIsNull() {
            addCriterion("orderCustomerId is null");
            return (Criteria) this;
        }

        public Criteria andOrdercustomeridIsNotNull() {
            addCriterion("orderCustomerId is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercustomeridEqualTo(Integer value) {
            addCriterion("orderCustomerId =", value, "ordercustomerid");
            return (Criteria) this;
        }

        public Criteria andOrdercustomeridNotEqualTo(Integer value) {
            addCriterion("orderCustomerId <>", value, "ordercustomerid");
            return (Criteria) this;
        }

        public Criteria andOrdercustomeridGreaterThan(Integer value) {
            addCriterion("orderCustomerId >", value, "ordercustomerid");
            return (Criteria) this;
        }

        public Criteria andOrdercustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderCustomerId >=", value, "ordercustomerid");
            return (Criteria) this;
        }

        public Criteria andOrdercustomeridLessThan(Integer value) {
            addCriterion("orderCustomerId <", value, "ordercustomerid");
            return (Criteria) this;
        }

        public Criteria andOrdercustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("orderCustomerId <=", value, "ordercustomerid");
            return (Criteria) this;
        }

        public Criteria andOrdercustomeridIn(List<Integer> values) {
            addCriterion("orderCustomerId in", values, "ordercustomerid");
            return (Criteria) this;
        }

        public Criteria andOrdercustomeridNotIn(List<Integer> values) {
            addCriterion("orderCustomerId not in", values, "ordercustomerid");
            return (Criteria) this;
        }

        public Criteria andOrdercustomeridBetween(Integer value1, Integer value2) {
            addCriterion("orderCustomerId between", value1, value2, "ordercustomerid");
            return (Criteria) this;
        }

        public Criteria andOrdercustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("orderCustomerId not between", value1, value2, "ordercustomerid");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameIsNull() {
            addCriterion("orderCustomerName is null");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameIsNotNull() {
            addCriterion("orderCustomerName is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameEqualTo(String value) {
            addCriterion("orderCustomerName =", value, "ordercustomername");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameNotEqualTo(String value) {
            addCriterion("orderCustomerName <>", value, "ordercustomername");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameGreaterThan(String value) {
            addCriterion("orderCustomerName >", value, "ordercustomername");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("orderCustomerName >=", value, "ordercustomername");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameLessThan(String value) {
            addCriterion("orderCustomerName <", value, "ordercustomername");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameLessThanOrEqualTo(String value) {
            addCriterion("orderCustomerName <=", value, "ordercustomername");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameLike(String value) {
            addCriterion("orderCustomerName like", value, "ordercustomername");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameNotLike(String value) {
            addCriterion("orderCustomerName not like", value, "ordercustomername");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameIn(List<String> values) {
            addCriterion("orderCustomerName in", values, "ordercustomername");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameNotIn(List<String> values) {
            addCriterion("orderCustomerName not in", values, "ordercustomername");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameBetween(String value1, String value2) {
            addCriterion("orderCustomerName between", value1, value2, "ordercustomername");
            return (Criteria) this;
        }

        public Criteria andOrdercustomernameNotBetween(String value1, String value2) {
            addCriterion("orderCustomerName not between", value1, value2, "ordercustomername");
            return (Criteria) this;
        }

        public Criteria andOrdercellidIsNull() {
            addCriterion("orderCellId is null");
            return (Criteria) this;
        }

        public Criteria andOrdercellidIsNotNull() {
            addCriterion("orderCellId is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercellidEqualTo(Integer value) {
            addCriterion("orderCellId =", value, "ordercellid");
            return (Criteria) this;
        }

        public Criteria andOrdercellidNotEqualTo(Integer value) {
            addCriterion("orderCellId <>", value, "ordercellid");
            return (Criteria) this;
        }

        public Criteria andOrdercellidGreaterThan(Integer value) {
            addCriterion("orderCellId >", value, "ordercellid");
            return (Criteria) this;
        }

        public Criteria andOrdercellidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderCellId >=", value, "ordercellid");
            return (Criteria) this;
        }

        public Criteria andOrdercellidLessThan(Integer value) {
            addCriterion("orderCellId <", value, "ordercellid");
            return (Criteria) this;
        }

        public Criteria andOrdercellidLessThanOrEqualTo(Integer value) {
            addCriterion("orderCellId <=", value, "ordercellid");
            return (Criteria) this;
        }

        public Criteria andOrdercellidIn(List<Integer> values) {
            addCriterion("orderCellId in", values, "ordercellid");
            return (Criteria) this;
        }

        public Criteria andOrdercellidNotIn(List<Integer> values) {
            addCriterion("orderCellId not in", values, "ordercellid");
            return (Criteria) this;
        }

        public Criteria andOrdercellidBetween(Integer value1, Integer value2) {
            addCriterion("orderCellId between", value1, value2, "ordercellid");
            return (Criteria) this;
        }

        public Criteria andOrdercellidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderCellId not between", value1, value2, "ordercellid");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("orderDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(String value) {
            addCriterion("orderDate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(String value) {
            addCriterion("orderDate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(String value) {
            addCriterion("orderDate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(String value) {
            addCriterion("orderDate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(String value) {
            addCriterion("orderDate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(String value) {
            addCriterion("orderDate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLike(String value) {
            addCriterion("orderDate like", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotLike(String value) {
            addCriterion("orderDate not like", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<String> values) {
            addCriterion("orderDate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<String> values) {
            addCriterion("orderDate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(String value1, String value2) {
            addCriterion("orderDate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(String value1, String value2) {
            addCriterion("orderDate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderuseridIsNull() {
            addCriterion("orderUserId is null");
            return (Criteria) this;
        }

        public Criteria andOrderuseridIsNotNull() {
            addCriterion("orderUserId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderuseridEqualTo(Integer value) {
            addCriterion("orderUserId =", value, "orderuserid");
            return (Criteria) this;
        }

        public Criteria andOrderuseridNotEqualTo(Integer value) {
            addCriterion("orderUserId <>", value, "orderuserid");
            return (Criteria) this;
        }

        public Criteria andOrderuseridGreaterThan(Integer value) {
            addCriterion("orderUserId >", value, "orderuserid");
            return (Criteria) this;
        }

        public Criteria andOrderuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderUserId >=", value, "orderuserid");
            return (Criteria) this;
        }

        public Criteria andOrderuseridLessThan(Integer value) {
            addCriterion("orderUserId <", value, "orderuserid");
            return (Criteria) this;
        }

        public Criteria andOrderuseridLessThanOrEqualTo(Integer value) {
            addCriterion("orderUserId <=", value, "orderuserid");
            return (Criteria) this;
        }

        public Criteria andOrderuseridIn(List<Integer> values) {
            addCriterion("orderUserId in", values, "orderuserid");
            return (Criteria) this;
        }

        public Criteria andOrderuseridNotIn(List<Integer> values) {
            addCriterion("orderUserId not in", values, "orderuserid");
            return (Criteria) this;
        }

        public Criteria andOrderuseridBetween(Integer value1, Integer value2) {
            addCriterion("orderUserId between", value1, value2, "orderuserid");
            return (Criteria) this;
        }

        public Criteria andOrderuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("orderUserId not between", value1, value2, "orderuserid");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNull() {
            addCriterion("orderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("orderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(Integer value) {
            addCriterion("orderState =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(Integer value) {
            addCriterion("orderState <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(Integer value) {
            addCriterion("orderState >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderState >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(Integer value) {
            addCriterion("orderState <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(Integer value) {
            addCriterion("orderState <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<Integer> values) {
            addCriterion("orderState in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<Integer> values) {
            addCriterion("orderState not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(Integer value1, Integer value2) {
            addCriterion("orderState between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(Integer value1, Integer value2) {
            addCriterion("orderState not between", value1, value2, "orderstate");
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