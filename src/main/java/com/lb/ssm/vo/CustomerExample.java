package com.lb.ssm.vo;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomeridIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerId not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("customerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIsNull() {
            addCriterion("customerPhone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIsNotNull() {
            addCriterion("customerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneEqualTo(String value) {
            addCriterion("customerPhone =", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotEqualTo(String value) {
            addCriterion("customerPhone <>", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneGreaterThan(String value) {
            addCriterion("customerPhone >", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("customerPhone >=", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLessThan(String value) {
            addCriterion("customerPhone <", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLessThanOrEqualTo(String value) {
            addCriterion("customerPhone <=", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLike(String value) {
            addCriterion("customerPhone like", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotLike(String value) {
            addCriterion("customerPhone not like", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIn(List<String> values) {
            addCriterion("customerPhone in", values, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotIn(List<String> values) {
            addCriterion("customerPhone not in", values, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneBetween(String value1, String value2) {
            addCriterion("customerPhone between", value1, value2, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotBetween(String value1, String value2) {
            addCriterion("customerPhone not between", value1, value2, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2IsNull() {
            addCriterion("customerPhone2 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2IsNotNull() {
            addCriterion("customerPhone2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2EqualTo(String value) {
            addCriterion("customerPhone2 =", value, "customerphone2");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2NotEqualTo(String value) {
            addCriterion("customerPhone2 <>", value, "customerphone2");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2GreaterThan(String value) {
            addCriterion("customerPhone2 >", value, "customerphone2");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2GreaterThanOrEqualTo(String value) {
            addCriterion("customerPhone2 >=", value, "customerphone2");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2LessThan(String value) {
            addCriterion("customerPhone2 <", value, "customerphone2");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2LessThanOrEqualTo(String value) {
            addCriterion("customerPhone2 <=", value, "customerphone2");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2Like(String value) {
            addCriterion("customerPhone2 like", value, "customerphone2");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2NotLike(String value) {
            addCriterion("customerPhone2 not like", value, "customerphone2");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2In(List<String> values) {
            addCriterion("customerPhone2 in", values, "customerphone2");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2NotIn(List<String> values) {
            addCriterion("customerPhone2 not in", values, "customerphone2");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2Between(String value1, String value2) {
            addCriterion("customerPhone2 between", value1, value2, "customerphone2");
            return (Criteria) this;
        }

        public Criteria andCustomerphone2NotBetween(String value1, String value2) {
            addCriterion("customerPhone2 not between", value1, value2, "customerphone2");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrIsNull() {
            addCriterion("customerAddr is null");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrIsNotNull() {
            addCriterion("customerAddr is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrEqualTo(String value) {
            addCriterion("customerAddr =", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrNotEqualTo(String value) {
            addCriterion("customerAddr <>", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrGreaterThan(String value) {
            addCriterion("customerAddr >", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrGreaterThanOrEqualTo(String value) {
            addCriterion("customerAddr >=", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrLessThan(String value) {
            addCriterion("customerAddr <", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrLessThanOrEqualTo(String value) {
            addCriterion("customerAddr <=", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrLike(String value) {
            addCriterion("customerAddr like", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrNotLike(String value) {
            addCriterion("customerAddr not like", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrIn(List<String> values) {
            addCriterion("customerAddr in", values, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrNotIn(List<String> values) {
            addCriterion("customerAddr not in", values, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrBetween(String value1, String value2) {
            addCriterion("customerAddr between", value1, value2, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrNotBetween(String value1, String value2) {
            addCriterion("customerAddr not between", value1, value2, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomercardIsNull() {
            addCriterion("customerCard is null");
            return (Criteria) this;
        }

        public Criteria andCustomercardIsNotNull() {
            addCriterion("customerCard is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercardEqualTo(String value) {
            addCriterion("customerCard =", value, "customercard");
            return (Criteria) this;
        }

        public Criteria andCustomercardNotEqualTo(String value) {
            addCriterion("customerCard <>", value, "customercard");
            return (Criteria) this;
        }

        public Criteria andCustomercardGreaterThan(String value) {
            addCriterion("customerCard >", value, "customercard");
            return (Criteria) this;
        }

        public Criteria andCustomercardGreaterThanOrEqualTo(String value) {
            addCriterion("customerCard >=", value, "customercard");
            return (Criteria) this;
        }

        public Criteria andCustomercardLessThan(String value) {
            addCriterion("customerCard <", value, "customercard");
            return (Criteria) this;
        }

        public Criteria andCustomercardLessThanOrEqualTo(String value) {
            addCriterion("customerCard <=", value, "customercard");
            return (Criteria) this;
        }

        public Criteria andCustomercardLike(String value) {
            addCriterion("customerCard like", value, "customercard");
            return (Criteria) this;
        }

        public Criteria andCustomercardNotLike(String value) {
            addCriterion("customerCard not like", value, "customercard");
            return (Criteria) this;
        }

        public Criteria andCustomercardIn(List<String> values) {
            addCriterion("customerCard in", values, "customercard");
            return (Criteria) this;
        }

        public Criteria andCustomercardNotIn(List<String> values) {
            addCriterion("customerCard not in", values, "customercard");
            return (Criteria) this;
        }

        public Criteria andCustomercardBetween(String value1, String value2) {
            addCriterion("customerCard between", value1, value2, "customercard");
            return (Criteria) this;
        }

        public Criteria andCustomercardNotBetween(String value1, String value2) {
            addCriterion("customerCard not between", value1, value2, "customercard");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameIsNull() {
            addCriterion("customerCardname is null");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameIsNotNull() {
            addCriterion("customerCardname is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameEqualTo(String value) {
            addCriterion("customerCardname =", value, "customercardname");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameNotEqualTo(String value) {
            addCriterion("customerCardname <>", value, "customercardname");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameGreaterThan(String value) {
            addCriterion("customerCardname >", value, "customercardname");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameGreaterThanOrEqualTo(String value) {
            addCriterion("customerCardname >=", value, "customercardname");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameLessThan(String value) {
            addCriterion("customerCardname <", value, "customercardname");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameLessThanOrEqualTo(String value) {
            addCriterion("customerCardname <=", value, "customercardname");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameLike(String value) {
            addCriterion("customerCardname like", value, "customercardname");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameNotLike(String value) {
            addCriterion("customerCardname not like", value, "customercardname");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameIn(List<String> values) {
            addCriterion("customerCardname in", values, "customercardname");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameNotIn(List<String> values) {
            addCriterion("customerCardname not in", values, "customercardname");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameBetween(String value1, String value2) {
            addCriterion("customerCardname between", value1, value2, "customercardname");
            return (Criteria) this;
        }

        public Criteria andCustomercardnameNotBetween(String value1, String value2) {
            addCriterion("customerCardname not between", value1, value2, "customercardname");
            return (Criteria) this;
        }

        public Criteria andCellidIsNull() {
            addCriterion("cellId is null");
            return (Criteria) this;
        }

        public Criteria andCellidIsNotNull() {
            addCriterion("cellId is not null");
            return (Criteria) this;
        }

        public Criteria andCellidEqualTo(Integer value) {
            addCriterion("cellId =", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidNotEqualTo(Integer value) {
            addCriterion("cellId <>", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidGreaterThan(Integer value) {
            addCriterion("cellId >", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cellId >=", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidLessThan(Integer value) {
            addCriterion("cellId <", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidLessThanOrEqualTo(Integer value) {
            addCriterion("cellId <=", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidIn(List<Integer> values) {
            addCriterion("cellId in", values, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidNotIn(List<Integer> values) {
            addCriterion("cellId not in", values, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidBetween(Integer value1, Integer value2) {
            addCriterion("cellId between", value1, value2, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidNotBetween(Integer value1, Integer value2) {
            addCriterion("cellId not between", value1, value2, "cellid");
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