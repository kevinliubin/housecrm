package com.lb.ssm.vo;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMenuidIsNull() {
            addCriterion("menuId is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("menuId is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Integer value) {
            addCriterion("menuId =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Integer value) {
            addCriterion("menuId <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Integer value) {
            addCriterion("menuId >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuId >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Integer value) {
            addCriterion("menuId <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("menuId <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Integer> values) {
            addCriterion("menuId in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Integer> values) {
            addCriterion("menuId not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Integer value1, Integer value2) {
            addCriterion("menuId between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("menuId not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("menuName is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("menuName is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("menuName =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("menuName <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("menuName >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("menuName >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("menuName <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("menuName <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("menuName like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("menuName not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("menuName in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("menuName not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("menuName between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("menuName not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNull() {
            addCriterion("menuUrl is null");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNotNull() {
            addCriterion("menuUrl is not null");
            return (Criteria) this;
        }

        public Criteria andMenuurlEqualTo(String value) {
            addCriterion("menuUrl =", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotEqualTo(String value) {
            addCriterion("menuUrl <>", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThan(String value) {
            addCriterion("menuUrl >", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThanOrEqualTo(String value) {
            addCriterion("menuUrl >=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThan(String value) {
            addCriterion("menuUrl <", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThanOrEqualTo(String value) {
            addCriterion("menuUrl <=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLike(String value) {
            addCriterion("menuUrl like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotLike(String value) {
            addCriterion("menuUrl not like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlIn(List<String> values) {
            addCriterion("menuUrl in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotIn(List<String> values) {
            addCriterion("menuUrl not in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlBetween(String value1, String value2) {
            addCriterion("menuUrl between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotBetween(String value1, String value2) {
            addCriterion("menuUrl not between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenutypeIsNull() {
            addCriterion("menuType is null");
            return (Criteria) this;
        }

        public Criteria andMenutypeIsNotNull() {
            addCriterion("menuType is not null");
            return (Criteria) this;
        }

        public Criteria andMenutypeEqualTo(String value) {
            addCriterion("menuType =", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeNotEqualTo(String value) {
            addCriterion("menuType <>", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeGreaterThan(String value) {
            addCriterion("menuType >", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeGreaterThanOrEqualTo(String value) {
            addCriterion("menuType >=", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeLessThan(String value) {
            addCriterion("menuType <", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeLessThanOrEqualTo(String value) {
            addCriterion("menuType <=", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeLike(String value) {
            addCriterion("menuType like", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeNotLike(String value) {
            addCriterion("menuType not like", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeIn(List<String> values) {
            addCriterion("menuType in", values, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeNotIn(List<String> values) {
            addCriterion("menuType not in", values, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeBetween(String value1, String value2) {
            addCriterion("menuType between", value1, value2, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeNotBetween(String value1, String value2) {
            addCriterion("menuType not between", value1, value2, "menutype");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andMenustateIsNull() {
            addCriterion("menuState is null");
            return (Criteria) this;
        }

        public Criteria andMenustateIsNotNull() {
            addCriterion("menuState is not null");
            return (Criteria) this;
        }

        public Criteria andMenustateEqualTo(Integer value) {
            addCriterion("menuState =", value, "menustate");
            return (Criteria) this;
        }

        public Criteria andMenustateNotEqualTo(Integer value) {
            addCriterion("menuState <>", value, "menustate");
            return (Criteria) this;
        }

        public Criteria andMenustateGreaterThan(Integer value) {
            addCriterion("menuState >", value, "menustate");
            return (Criteria) this;
        }

        public Criteria andMenustateGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuState >=", value, "menustate");
            return (Criteria) this;
        }

        public Criteria andMenustateLessThan(Integer value) {
            addCriterion("menuState <", value, "menustate");
            return (Criteria) this;
        }

        public Criteria andMenustateLessThanOrEqualTo(Integer value) {
            addCriterion("menuState <=", value, "menustate");
            return (Criteria) this;
        }

        public Criteria andMenustateIn(List<Integer> values) {
            addCriterion("menuState in", values, "menustate");
            return (Criteria) this;
        }

        public Criteria andMenustateNotIn(List<Integer> values) {
            addCriterion("menuState not in", values, "menustate");
            return (Criteria) this;
        }

        public Criteria andMenustateBetween(Integer value1, Integer value2) {
            addCriterion("menuState between", value1, value2, "menustate");
            return (Criteria) this;
        }

        public Criteria andMenustateNotBetween(Integer value1, Integer value2) {
            addCriterion("menuState not between", value1, value2, "menustate");
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