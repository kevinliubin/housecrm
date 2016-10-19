package com.lb.ssm.vo;

import java.util.ArrayList;
import java.util.List;

public class CellExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CellExample() {
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

        public Criteria andCellnameIsNull() {
            addCriterion("cellName is null");
            return (Criteria) this;
        }

        public Criteria andCellnameIsNotNull() {
            addCriterion("cellName is not null");
            return (Criteria) this;
        }

        public Criteria andCellnameEqualTo(String value) {
            addCriterion("cellName =", value, "cellname");
            return (Criteria) this;
        }

        public Criteria andCellnameNotEqualTo(String value) {
            addCriterion("cellName <>", value, "cellname");
            return (Criteria) this;
        }

        public Criteria andCellnameGreaterThan(String value) {
            addCriterion("cellName >", value, "cellname");
            return (Criteria) this;
        }

        public Criteria andCellnameGreaterThanOrEqualTo(String value) {
            addCriterion("cellName >=", value, "cellname");
            return (Criteria) this;
        }

        public Criteria andCellnameLessThan(String value) {
            addCriterion("cellName <", value, "cellname");
            return (Criteria) this;
        }

        public Criteria andCellnameLessThanOrEqualTo(String value) {
            addCriterion("cellName <=", value, "cellname");
            return (Criteria) this;
        }

        public Criteria andCellnameLike(String value) {
            addCriterion("cellName like", value, "cellname");
            return (Criteria) this;
        }

        public Criteria andCellnameNotLike(String value) {
            addCriterion("cellName not like", value, "cellname");
            return (Criteria) this;
        }

        public Criteria andCellnameIn(List<String> values) {
            addCriterion("cellName in", values, "cellname");
            return (Criteria) this;
        }

        public Criteria andCellnameNotIn(List<String> values) {
            addCriterion("cellName not in", values, "cellname");
            return (Criteria) this;
        }

        public Criteria andCellnameBetween(String value1, String value2) {
            addCriterion("cellName between", value1, value2, "cellname");
            return (Criteria) this;
        }

        public Criteria andCellnameNotBetween(String value1, String value2) {
            addCriterion("cellName not between", value1, value2, "cellname");
            return (Criteria) this;
        }

        public Criteria andCellfloorIsNull() {
            addCriterion("cellFloor is null");
            return (Criteria) this;
        }

        public Criteria andCellfloorIsNotNull() {
            addCriterion("cellFloor is not null");
            return (Criteria) this;
        }

        public Criteria andCellfloorEqualTo(Integer value) {
            addCriterion("cellFloor =", value, "cellfloor");
            return (Criteria) this;
        }

        public Criteria andCellfloorNotEqualTo(Integer value) {
            addCriterion("cellFloor <>", value, "cellfloor");
            return (Criteria) this;
        }

        public Criteria andCellfloorGreaterThan(Integer value) {
            addCriterion("cellFloor >", value, "cellfloor");
            return (Criteria) this;
        }

        public Criteria andCellfloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("cellFloor >=", value, "cellfloor");
            return (Criteria) this;
        }

        public Criteria andCellfloorLessThan(Integer value) {
            addCriterion("cellFloor <", value, "cellfloor");
            return (Criteria) this;
        }

        public Criteria andCellfloorLessThanOrEqualTo(Integer value) {
            addCriterion("cellFloor <=", value, "cellfloor");
            return (Criteria) this;
        }

        public Criteria andCellfloorIn(List<Integer> values) {
            addCriterion("cellFloor in", values, "cellfloor");
            return (Criteria) this;
        }

        public Criteria andCellfloorNotIn(List<Integer> values) {
            addCriterion("cellFloor not in", values, "cellfloor");
            return (Criteria) this;
        }

        public Criteria andCellfloorBetween(Integer value1, Integer value2) {
            addCriterion("cellFloor between", value1, value2, "cellfloor");
            return (Criteria) this;
        }

        public Criteria andCellfloorNotBetween(Integer value1, Integer value2) {
            addCriterion("cellFloor not between", value1, value2, "cellfloor");
            return (Criteria) this;
        }

        public Criteria andCellcustomeridIsNull() {
            addCriterion("cellCustomerId is null");
            return (Criteria) this;
        }

        public Criteria andCellcustomeridIsNotNull() {
            addCriterion("cellCustomerId is not null");
            return (Criteria) this;
        }

        public Criteria andCellcustomeridEqualTo(Integer value) {
            addCriterion("cellCustomerId =", value, "cellcustomerid");
            return (Criteria) this;
        }

        public Criteria andCellcustomeridNotEqualTo(Integer value) {
            addCriterion("cellCustomerId <>", value, "cellcustomerid");
            return (Criteria) this;
        }

        public Criteria andCellcustomeridGreaterThan(Integer value) {
            addCriterion("cellCustomerId >", value, "cellcustomerid");
            return (Criteria) this;
        }

        public Criteria andCellcustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("cellCustomerId >=", value, "cellcustomerid");
            return (Criteria) this;
        }

        public Criteria andCellcustomeridLessThan(Integer value) {
            addCriterion("cellCustomerId <", value, "cellcustomerid");
            return (Criteria) this;
        }

        public Criteria andCellcustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("cellCustomerId <=", value, "cellcustomerid");
            return (Criteria) this;
        }

        public Criteria andCellcustomeridIn(List<Integer> values) {
            addCriterion("cellCustomerId in", values, "cellcustomerid");
            return (Criteria) this;
        }

        public Criteria andCellcustomeridNotIn(List<Integer> values) {
            addCriterion("cellCustomerId not in", values, "cellcustomerid");
            return (Criteria) this;
        }

        public Criteria andCellcustomeridBetween(Integer value1, Integer value2) {
            addCriterion("cellCustomerId between", value1, value2, "cellcustomerid");
            return (Criteria) this;
        }

        public Criteria andCellcustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("cellCustomerId not between", value1, value2, "cellcustomerid");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameIsNull() {
            addCriterion("cellCustomerName is null");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameIsNotNull() {
            addCriterion("cellCustomerName is not null");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameEqualTo(String value) {
            addCriterion("cellCustomerName =", value, "cellcustomername");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameNotEqualTo(String value) {
            addCriterion("cellCustomerName <>", value, "cellcustomername");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameGreaterThan(String value) {
            addCriterion("cellCustomerName >", value, "cellcustomername");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("cellCustomerName >=", value, "cellcustomername");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameLessThan(String value) {
            addCriterion("cellCustomerName <", value, "cellcustomername");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameLessThanOrEqualTo(String value) {
            addCriterion("cellCustomerName <=", value, "cellcustomername");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameLike(String value) {
            addCriterion("cellCustomerName like", value, "cellcustomername");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameNotLike(String value) {
            addCriterion("cellCustomerName not like", value, "cellcustomername");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameIn(List<String> values) {
            addCriterion("cellCustomerName in", values, "cellcustomername");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameNotIn(List<String> values) {
            addCriterion("cellCustomerName not in", values, "cellcustomername");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameBetween(String value1, String value2) {
            addCriterion("cellCustomerName between", value1, value2, "cellcustomername");
            return (Criteria) this;
        }

        public Criteria andCellcustomernameNotBetween(String value1, String value2) {
            addCriterion("cellCustomerName not between", value1, value2, "cellcustomername");
            return (Criteria) this;
        }

        public Criteria andCellareaIsNull() {
            addCriterion("cellArea is null");
            return (Criteria) this;
        }

        public Criteria andCellareaIsNotNull() {
            addCriterion("cellArea is not null");
            return (Criteria) this;
        }

        public Criteria andCellareaEqualTo(Double value) {
            addCriterion("cellArea =", value, "cellarea");
            return (Criteria) this;
        }

        public Criteria andCellareaNotEqualTo(Double value) {
            addCriterion("cellArea <>", value, "cellarea");
            return (Criteria) this;
        }

        public Criteria andCellareaGreaterThan(Double value) {
            addCriterion("cellArea >", value, "cellarea");
            return (Criteria) this;
        }

        public Criteria andCellareaGreaterThanOrEqualTo(Double value) {
            addCriterion("cellArea >=", value, "cellarea");
            return (Criteria) this;
        }

        public Criteria andCellareaLessThan(Double value) {
            addCriterion("cellArea <", value, "cellarea");
            return (Criteria) this;
        }

        public Criteria andCellareaLessThanOrEqualTo(Double value) {
            addCriterion("cellArea <=", value, "cellarea");
            return (Criteria) this;
        }

        public Criteria andCellareaIn(List<Double> values) {
            addCriterion("cellArea in", values, "cellarea");
            return (Criteria) this;
        }

        public Criteria andCellareaNotIn(List<Double> values) {
            addCriterion("cellArea not in", values, "cellarea");
            return (Criteria) this;
        }

        public Criteria andCellareaBetween(Double value1, Double value2) {
            addCriterion("cellArea between", value1, value2, "cellarea");
            return (Criteria) this;
        }

        public Criteria andCellareaNotBetween(Double value1, Double value2) {
            addCriterion("cellArea not between", value1, value2, "cellarea");
            return (Criteria) this;
        }

        public Criteria andCellmoneyIsNull() {
            addCriterion("cellMoney is null");
            return (Criteria) this;
        }

        public Criteria andCellmoneyIsNotNull() {
            addCriterion("cellMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCellmoneyEqualTo(Double value) {
            addCriterion("cellMoney =", value, "cellmoney");
            return (Criteria) this;
        }

        public Criteria andCellmoneyNotEqualTo(Double value) {
            addCriterion("cellMoney <>", value, "cellmoney");
            return (Criteria) this;
        }

        public Criteria andCellmoneyGreaterThan(Double value) {
            addCriterion("cellMoney >", value, "cellmoney");
            return (Criteria) this;
        }

        public Criteria andCellmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cellMoney >=", value, "cellmoney");
            return (Criteria) this;
        }

        public Criteria andCellmoneyLessThan(Double value) {
            addCriterion("cellMoney <", value, "cellmoney");
            return (Criteria) this;
        }

        public Criteria andCellmoneyLessThanOrEqualTo(Double value) {
            addCriterion("cellMoney <=", value, "cellmoney");
            return (Criteria) this;
        }

        public Criteria andCellmoneyIn(List<Double> values) {
            addCriterion("cellMoney in", values, "cellmoney");
            return (Criteria) this;
        }

        public Criteria andCellmoneyNotIn(List<Double> values) {
            addCriterion("cellMoney not in", values, "cellmoney");
            return (Criteria) this;
        }

        public Criteria andCellmoneyBetween(Double value1, Double value2) {
            addCriterion("cellMoney between", value1, value2, "cellmoney");
            return (Criteria) this;
        }

        public Criteria andCellmoneyNotBetween(Double value1, Double value2) {
            addCriterion("cellMoney not between", value1, value2, "cellmoney");
            return (Criteria) this;
        }

        public Criteria andCelltotalIsNull() {
            addCriterion("cellTotal is null");
            return (Criteria) this;
        }

        public Criteria andCelltotalIsNotNull() {
            addCriterion("cellTotal is not null");
            return (Criteria) this;
        }

        public Criteria andCelltotalEqualTo(Double value) {
            addCriterion("cellTotal =", value, "celltotal");
            return (Criteria) this;
        }

        public Criteria andCelltotalNotEqualTo(Double value) {
            addCriterion("cellTotal <>", value, "celltotal");
            return (Criteria) this;
        }

        public Criteria andCelltotalGreaterThan(Double value) {
            addCriterion("cellTotal >", value, "celltotal");
            return (Criteria) this;
        }

        public Criteria andCelltotalGreaterThanOrEqualTo(Double value) {
            addCriterion("cellTotal >=", value, "celltotal");
            return (Criteria) this;
        }

        public Criteria andCelltotalLessThan(Double value) {
            addCriterion("cellTotal <", value, "celltotal");
            return (Criteria) this;
        }

        public Criteria andCelltotalLessThanOrEqualTo(Double value) {
            addCriterion("cellTotal <=", value, "celltotal");
            return (Criteria) this;
        }

        public Criteria andCelltotalIn(List<Double> values) {
            addCriterion("cellTotal in", values, "celltotal");
            return (Criteria) this;
        }

        public Criteria andCelltotalNotIn(List<Double> values) {
            addCriterion("cellTotal not in", values, "celltotal");
            return (Criteria) this;
        }

        public Criteria andCelltotalBetween(Double value1, Double value2) {
            addCriterion("cellTotal between", value1, value2, "celltotal");
            return (Criteria) this;
        }

        public Criteria andCelltotalNotBetween(Double value1, Double value2) {
            addCriterion("cellTotal not between", value1, value2, "celltotal");
            return (Criteria) this;
        }

        public Criteria andCellpointIsNull() {
            addCriterion("cellPoint is null");
            return (Criteria) this;
        }

        public Criteria andCellpointIsNotNull() {
            addCriterion("cellPoint is not null");
            return (Criteria) this;
        }

        public Criteria andCellpointEqualTo(Double value) {
            addCriterion("cellPoint =", value, "cellpoint");
            return (Criteria) this;
        }

        public Criteria andCellpointNotEqualTo(Double value) {
            addCriterion("cellPoint <>", value, "cellpoint");
            return (Criteria) this;
        }

        public Criteria andCellpointGreaterThan(Double value) {
            addCriterion("cellPoint >", value, "cellpoint");
            return (Criteria) this;
        }

        public Criteria andCellpointGreaterThanOrEqualTo(Double value) {
            addCriterion("cellPoint >=", value, "cellpoint");
            return (Criteria) this;
        }

        public Criteria andCellpointLessThan(Double value) {
            addCriterion("cellPoint <", value, "cellpoint");
            return (Criteria) this;
        }

        public Criteria andCellpointLessThanOrEqualTo(Double value) {
            addCriterion("cellPoint <=", value, "cellpoint");
            return (Criteria) this;
        }

        public Criteria andCellpointIn(List<Double> values) {
            addCriterion("cellPoint in", values, "cellpoint");
            return (Criteria) this;
        }

        public Criteria andCellpointNotIn(List<Double> values) {
            addCriterion("cellPoint not in", values, "cellpoint");
            return (Criteria) this;
        }

        public Criteria andCellpointBetween(Double value1, Double value2) {
            addCriterion("cellPoint between", value1, value2, "cellpoint");
            return (Criteria) this;
        }

        public Criteria andCellpointNotBetween(Double value1, Double value2) {
            addCriterion("cellPoint not between", value1, value2, "cellpoint");
            return (Criteria) this;
        }

        public Criteria andCesubdistrictidIsNull() {
            addCriterion("ceSubdistrictId is null");
            return (Criteria) this;
        }

        public Criteria andCesubdistrictidIsNotNull() {
            addCriterion("ceSubdistrictId is not null");
            return (Criteria) this;
        }

        public Criteria andCesubdistrictidEqualTo(Integer value) {
            addCriterion("ceSubdistrictId =", value, "cesubdistrictid");
            return (Criteria) this;
        }

        public Criteria andCesubdistrictidNotEqualTo(Integer value) {
            addCriterion("ceSubdistrictId <>", value, "cesubdistrictid");
            return (Criteria) this;
        }

        public Criteria andCesubdistrictidGreaterThan(Integer value) {
            addCriterion("ceSubdistrictId >", value, "cesubdistrictid");
            return (Criteria) this;
        }

        public Criteria andCesubdistrictidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ceSubdistrictId >=", value, "cesubdistrictid");
            return (Criteria) this;
        }

        public Criteria andCesubdistrictidLessThan(Integer value) {
            addCriterion("ceSubdistrictId <", value, "cesubdistrictid");
            return (Criteria) this;
        }

        public Criteria andCesubdistrictidLessThanOrEqualTo(Integer value) {
            addCriterion("ceSubdistrictId <=", value, "cesubdistrictid");
            return (Criteria) this;
        }

        public Criteria andCesubdistrictidIn(List<Integer> values) {
            addCriterion("ceSubdistrictId in", values, "cesubdistrictid");
            return (Criteria) this;
        }

        public Criteria andCesubdistrictidNotIn(List<Integer> values) {
            addCriterion("ceSubdistrictId not in", values, "cesubdistrictid");
            return (Criteria) this;
        }

        public Criteria andCesubdistrictidBetween(Integer value1, Integer value2) {
            addCriterion("ceSubdistrictId between", value1, value2, "cesubdistrictid");
            return (Criteria) this;
        }

        public Criteria andCesubdistrictidNotBetween(Integer value1, Integer value2) {
            addCriterion("ceSubdistrictId not between", value1, value2, "cesubdistrictid");
            return (Criteria) this;
        }

        public Criteria andCellstateIsNull() {
            addCriterion("cellState is null");
            return (Criteria) this;
        }

        public Criteria andCellstateIsNotNull() {
            addCriterion("cellState is not null");
            return (Criteria) this;
        }

        public Criteria andCellstateEqualTo(Integer value) {
            addCriterion("cellState =", value, "cellstate");
            return (Criteria) this;
        }

        public Criteria andCellstateNotEqualTo(Integer value) {
            addCriterion("cellState <>", value, "cellstate");
            return (Criteria) this;
        }

        public Criteria andCellstateGreaterThan(Integer value) {
            addCriterion("cellState >", value, "cellstate");
            return (Criteria) this;
        }

        public Criteria andCellstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cellState >=", value, "cellstate");
            return (Criteria) this;
        }

        public Criteria andCellstateLessThan(Integer value) {
            addCriterion("cellState <", value, "cellstate");
            return (Criteria) this;
        }

        public Criteria andCellstateLessThanOrEqualTo(Integer value) {
            addCriterion("cellState <=", value, "cellstate");
            return (Criteria) this;
        }

        public Criteria andCellstateIn(List<Integer> values) {
            addCriterion("cellState in", values, "cellstate");
            return (Criteria) this;
        }

        public Criteria andCellstateNotIn(List<Integer> values) {
            addCriterion("cellState not in", values, "cellstate");
            return (Criteria) this;
        }

        public Criteria andCellstateBetween(Integer value1, Integer value2) {
            addCriterion("cellState between", value1, value2, "cellstate");
            return (Criteria) this;
        }

        public Criteria andCellstateNotBetween(Integer value1, Integer value2) {
            addCriterion("cellState not between", value1, value2, "cellstate");
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