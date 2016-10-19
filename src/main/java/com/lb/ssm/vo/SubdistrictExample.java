package com.lb.ssm.vo;

import java.util.ArrayList;
import java.util.List;

public class SubdistrictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubdistrictExample() {
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

        public Criteria andSubdistrictidIsNull() {
            addCriterion("subdistrictId is null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictidIsNotNull() {
            addCriterion("subdistrictId is not null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictidEqualTo(Integer value) {
            addCriterion("subdistrictId =", value, "subdistrictid");
            return (Criteria) this;
        }

        public Criteria andSubdistrictidNotEqualTo(Integer value) {
            addCriterion("subdistrictId <>", value, "subdistrictid");
            return (Criteria) this;
        }

        public Criteria andSubdistrictidGreaterThan(Integer value) {
            addCriterion("subdistrictId >", value, "subdistrictid");
            return (Criteria) this;
        }

        public Criteria andSubdistrictidGreaterThanOrEqualTo(Integer value) {
            addCriterion("subdistrictId >=", value, "subdistrictid");
            return (Criteria) this;
        }

        public Criteria andSubdistrictidLessThan(Integer value) {
            addCriterion("subdistrictId <", value, "subdistrictid");
            return (Criteria) this;
        }

        public Criteria andSubdistrictidLessThanOrEqualTo(Integer value) {
            addCriterion("subdistrictId <=", value, "subdistrictid");
            return (Criteria) this;
        }

        public Criteria andSubdistrictidIn(List<Integer> values) {
            addCriterion("subdistrictId in", values, "subdistrictid");
            return (Criteria) this;
        }

        public Criteria andSubdistrictidNotIn(List<Integer> values) {
            addCriterion("subdistrictId not in", values, "subdistrictid");
            return (Criteria) this;
        }

        public Criteria andSubdistrictidBetween(Integer value1, Integer value2) {
            addCriterion("subdistrictId between", value1, value2, "subdistrictid");
            return (Criteria) this;
        }

        public Criteria andSubdistrictidNotBetween(Integer value1, Integer value2) {
            addCriterion("subdistrictId not between", value1, value2, "subdistrictid");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameIsNull() {
            addCriterion("subdistrictName is null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameIsNotNull() {
            addCriterion("subdistrictName is not null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameEqualTo(String value) {
            addCriterion("subdistrictName =", value, "subdistrictname");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameNotEqualTo(String value) {
            addCriterion("subdistrictName <>", value, "subdistrictname");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameGreaterThan(String value) {
            addCriterion("subdistrictName >", value, "subdistrictname");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameGreaterThanOrEqualTo(String value) {
            addCriterion("subdistrictName >=", value, "subdistrictname");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameLessThan(String value) {
            addCriterion("subdistrictName <", value, "subdistrictname");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameLessThanOrEqualTo(String value) {
            addCriterion("subdistrictName <=", value, "subdistrictname");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameLike(String value) {
            addCriterion("subdistrictName like", value, "subdistrictname");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameNotLike(String value) {
            addCriterion("subdistrictName not like", value, "subdistrictname");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameIn(List<String> values) {
            addCriterion("subdistrictName in", values, "subdistrictname");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameNotIn(List<String> values) {
            addCriterion("subdistrictName not in", values, "subdistrictname");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameBetween(String value1, String value2) {
            addCriterion("subdistrictName between", value1, value2, "subdistrictname");
            return (Criteria) this;
        }

        public Criteria andSubdistrictnameNotBetween(String value1, String value2) {
            addCriterion("subdistrictName not between", value1, value2, "subdistrictname");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeIsNull() {
            addCriterion("subdistrictDiscribe is null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeIsNotNull() {
            addCriterion("subdistrictDiscribe is not null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeEqualTo(String value) {
            addCriterion("subdistrictDiscribe =", value, "subdistrictdiscribe");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeNotEqualTo(String value) {
            addCriterion("subdistrictDiscribe <>", value, "subdistrictdiscribe");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeGreaterThan(String value) {
            addCriterion("subdistrictDiscribe >", value, "subdistrictdiscribe");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeGreaterThanOrEqualTo(String value) {
            addCriterion("subdistrictDiscribe >=", value, "subdistrictdiscribe");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeLessThan(String value) {
            addCriterion("subdistrictDiscribe <", value, "subdistrictdiscribe");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeLessThanOrEqualTo(String value) {
            addCriterion("subdistrictDiscribe <=", value, "subdistrictdiscribe");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeLike(String value) {
            addCriterion("subdistrictDiscribe like", value, "subdistrictdiscribe");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeNotLike(String value) {
            addCriterion("subdistrictDiscribe not like", value, "subdistrictdiscribe");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeIn(List<String> values) {
            addCriterion("subdistrictDiscribe in", values, "subdistrictdiscribe");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeNotIn(List<String> values) {
            addCriterion("subdistrictDiscribe not in", values, "subdistrictdiscribe");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeBetween(String value1, String value2) {
            addCriterion("subdistrictDiscribe between", value1, value2, "subdistrictdiscribe");
            return (Criteria) this;
        }

        public Criteria andSubdistrictdiscribeNotBetween(String value1, String value2) {
            addCriterion("subdistrictDiscribe not between", value1, value2, "subdistrictdiscribe");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrIsNull() {
            addCriterion("subdistrictAddr is null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrIsNotNull() {
            addCriterion("subdistrictAddr is not null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrEqualTo(String value) {
            addCriterion("subdistrictAddr =", value, "subdistrictaddr");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrNotEqualTo(String value) {
            addCriterion("subdistrictAddr <>", value, "subdistrictaddr");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrGreaterThan(String value) {
            addCriterion("subdistrictAddr >", value, "subdistrictaddr");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrGreaterThanOrEqualTo(String value) {
            addCriterion("subdistrictAddr >=", value, "subdistrictaddr");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrLessThan(String value) {
            addCriterion("subdistrictAddr <", value, "subdistrictaddr");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrLessThanOrEqualTo(String value) {
            addCriterion("subdistrictAddr <=", value, "subdistrictaddr");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrLike(String value) {
            addCriterion("subdistrictAddr like", value, "subdistrictaddr");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrNotLike(String value) {
            addCriterion("subdistrictAddr not like", value, "subdistrictaddr");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrIn(List<String> values) {
            addCriterion("subdistrictAddr in", values, "subdistrictaddr");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrNotIn(List<String> values) {
            addCriterion("subdistrictAddr not in", values, "subdistrictaddr");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrBetween(String value1, String value2) {
            addCriterion("subdistrictAddr between", value1, value2, "subdistrictaddr");
            return (Criteria) this;
        }

        public Criteria andSubdistrictaddrNotBetween(String value1, String value2) {
            addCriterion("subdistrictAddr not between", value1, value2, "subdistrictaddr");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicIsNull() {
            addCriterion("subdistrictPic is null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicIsNotNull() {
            addCriterion("subdistrictPic is not null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicEqualTo(String value) {
            addCriterion("subdistrictPic =", value, "subdistrictpic");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicNotEqualTo(String value) {
            addCriterion("subdistrictPic <>", value, "subdistrictpic");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicGreaterThan(String value) {
            addCriterion("subdistrictPic >", value, "subdistrictpic");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicGreaterThanOrEqualTo(String value) {
            addCriterion("subdistrictPic >=", value, "subdistrictpic");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicLessThan(String value) {
            addCriterion("subdistrictPic <", value, "subdistrictpic");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicLessThanOrEqualTo(String value) {
            addCriterion("subdistrictPic <=", value, "subdistrictpic");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicLike(String value) {
            addCriterion("subdistrictPic like", value, "subdistrictpic");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicNotLike(String value) {
            addCriterion("subdistrictPic not like", value, "subdistrictpic");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicIn(List<String> values) {
            addCriterion("subdistrictPic in", values, "subdistrictpic");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicNotIn(List<String> values) {
            addCriterion("subdistrictPic not in", values, "subdistrictpic");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicBetween(String value1, String value2) {
            addCriterion("subdistrictPic between", value1, value2, "subdistrictpic");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpicNotBetween(String value1, String value2) {
            addCriterion("subdistrictPic not between", value1, value2, "subdistrictpic");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongIsNull() {
            addCriterion("subdistrictBelong is null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongIsNotNull() {
            addCriterion("subdistrictBelong is not null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongEqualTo(String value) {
            addCriterion("subdistrictBelong =", value, "subdistrictbelong");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongNotEqualTo(String value) {
            addCriterion("subdistrictBelong <>", value, "subdistrictbelong");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongGreaterThan(String value) {
            addCriterion("subdistrictBelong >", value, "subdistrictbelong");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongGreaterThanOrEqualTo(String value) {
            addCriterion("subdistrictBelong >=", value, "subdistrictbelong");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongLessThan(String value) {
            addCriterion("subdistrictBelong <", value, "subdistrictbelong");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongLessThanOrEqualTo(String value) {
            addCriterion("subdistrictBelong <=", value, "subdistrictbelong");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongLike(String value) {
            addCriterion("subdistrictBelong like", value, "subdistrictbelong");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongNotLike(String value) {
            addCriterion("subdistrictBelong not like", value, "subdistrictbelong");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongIn(List<String> values) {
            addCriterion("subdistrictBelong in", values, "subdistrictbelong");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongNotIn(List<String> values) {
            addCriterion("subdistrictBelong not in", values, "subdistrictbelong");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongBetween(String value1, String value2) {
            addCriterion("subdistrictBelong between", value1, value2, "subdistrictbelong");
            return (Criteria) this;
        }

        public Criteria andSubdistrictbelongNotBetween(String value1, String value2) {
            addCriterion("subdistrictBelong not between", value1, value2, "subdistrictbelong");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2IsNull() {
            addCriterion("subdistrictPic2 is null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2IsNotNull() {
            addCriterion("subdistrictPic2 is not null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2EqualTo(String value) {
            addCriterion("subdistrictPic2 =", value, "subdistrictpic2");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2NotEqualTo(String value) {
            addCriterion("subdistrictPic2 <>", value, "subdistrictpic2");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2GreaterThan(String value) {
            addCriterion("subdistrictPic2 >", value, "subdistrictpic2");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2GreaterThanOrEqualTo(String value) {
            addCriterion("subdistrictPic2 >=", value, "subdistrictpic2");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2LessThan(String value) {
            addCriterion("subdistrictPic2 <", value, "subdistrictpic2");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2LessThanOrEqualTo(String value) {
            addCriterion("subdistrictPic2 <=", value, "subdistrictpic2");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2Like(String value) {
            addCriterion("subdistrictPic2 like", value, "subdistrictpic2");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2NotLike(String value) {
            addCriterion("subdistrictPic2 not like", value, "subdistrictpic2");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2In(List<String> values) {
            addCriterion("subdistrictPic2 in", values, "subdistrictpic2");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2NotIn(List<String> values) {
            addCriterion("subdistrictPic2 not in", values, "subdistrictpic2");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2Between(String value1, String value2) {
            addCriterion("subdistrictPic2 between", value1, value2, "subdistrictpic2");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic2NotBetween(String value1, String value2) {
            addCriterion("subdistrictPic2 not between", value1, value2, "subdistrictpic2");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3IsNull() {
            addCriterion("subdistrictPic3 is null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3IsNotNull() {
            addCriterion("subdistrictPic3 is not null");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3EqualTo(String value) {
            addCriterion("subdistrictPic3 =", value, "subdistrictpic3");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3NotEqualTo(String value) {
            addCriterion("subdistrictPic3 <>", value, "subdistrictpic3");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3GreaterThan(String value) {
            addCriterion("subdistrictPic3 >", value, "subdistrictpic3");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3GreaterThanOrEqualTo(String value) {
            addCriterion("subdistrictPic3 >=", value, "subdistrictpic3");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3LessThan(String value) {
            addCriterion("subdistrictPic3 <", value, "subdistrictpic3");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3LessThanOrEqualTo(String value) {
            addCriterion("subdistrictPic3 <=", value, "subdistrictpic3");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3Like(String value) {
            addCriterion("subdistrictPic3 like", value, "subdistrictpic3");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3NotLike(String value) {
            addCriterion("subdistrictPic3 not like", value, "subdistrictpic3");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3In(List<String> values) {
            addCriterion("subdistrictPic3 in", values, "subdistrictpic3");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3NotIn(List<String> values) {
            addCriterion("subdistrictPic3 not in", values, "subdistrictpic3");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3Between(String value1, String value2) {
            addCriterion("subdistrictPic3 between", value1, value2, "subdistrictpic3");
            return (Criteria) this;
        }

        public Criteria andSubdistrictpic3NotBetween(String value1, String value2) {
            addCriterion("subdistrictPic3 not between", value1, value2, "subdistrictpic3");
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