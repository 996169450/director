package com.hnu.entity.cht;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DirectorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DirectorExample() {
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

        public Criteria andTjidIsNull() {
            addCriterion("tjid is null");
            return (Criteria) this;
        }

        public Criteria andTjidIsNotNull() {
            addCriterion("tjid is not null");
            return (Criteria) this;
        }

        public Criteria andTjidEqualTo(Integer value) {
            addCriterion("tjid =", value, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidNotEqualTo(Integer value) {
            addCriterion("tjid <>", value, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidGreaterThan(Integer value) {
            addCriterion("tjid >", value, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tjid >=", value, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidLessThan(Integer value) {
            addCriterion("tjid <", value, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidLessThanOrEqualTo(Integer value) {
            addCriterion("tjid <=", value, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidIn(List<Integer> values) {
            addCriterion("tjid in", values, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidNotIn(List<Integer> values) {
            addCriterion("tjid not in", values, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidBetween(Integer value1, Integer value2) {
            addCriterion("tjid between", value1, value2, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidNotBetween(Integer value1, Integer value2) {
            addCriterion("tjid not between", value1, value2, "tjid");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andAgenttjidIsNull() {
            addCriterion("agenttjid is null");
            return (Criteria) this;
        }

        public Criteria andAgenttjidIsNotNull() {
            addCriterion("agenttjid is not null");
            return (Criteria) this;
        }

        public Criteria andAgenttjidEqualTo(Integer value) {
            addCriterion("agenttjid =", value, "agenttjid");
            return (Criteria) this;
        }

        public Criteria andAgenttjidNotEqualTo(Integer value) {
            addCriterion("agenttjid <>", value, "agenttjid");
            return (Criteria) this;
        }

        public Criteria andAgenttjidGreaterThan(Integer value) {
            addCriterion("agenttjid >", value, "agenttjid");
            return (Criteria) this;
        }

        public Criteria andAgenttjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("agenttjid >=", value, "agenttjid");
            return (Criteria) this;
        }

        public Criteria andAgenttjidLessThan(Integer value) {
            addCriterion("agenttjid <", value, "agenttjid");
            return (Criteria) this;
        }

        public Criteria andAgenttjidLessThanOrEqualTo(Integer value) {
            addCriterion("agenttjid <=", value, "agenttjid");
            return (Criteria) this;
        }

        public Criteria andAgenttjidIn(List<Integer> values) {
            addCriterion("agenttjid in", values, "agenttjid");
            return (Criteria) this;
        }

        public Criteria andAgenttjidNotIn(List<Integer> values) {
            addCriterion("agenttjid not in", values, "agenttjid");
            return (Criteria) this;
        }

        public Criteria andAgenttjidBetween(Integer value1, Integer value2) {
            addCriterion("agenttjid between", value1, value2, "agenttjid");
            return (Criteria) this;
        }

        public Criteria andAgenttjidNotBetween(Integer value1, Integer value2) {
            addCriterion("agenttjid not between", value1, value2, "agenttjid");
            return (Criteria) this;
        }

        public Criteria andParkIsNull() {
            addCriterion("park is null");
            return (Criteria) this;
        }

        public Criteria andParkIsNotNull() {
            addCriterion("park is not null");
            return (Criteria) this;
        }

        public Criteria andParkEqualTo(String value) {
            addCriterion("park =", value, "park");
            return (Criteria) this;
        }

        public Criteria andParkNotEqualTo(String value) {
            addCriterion("park <>", value, "park");
            return (Criteria) this;
        }

        public Criteria andParkGreaterThan(String value) {
            addCriterion("park >", value, "park");
            return (Criteria) this;
        }

        public Criteria andParkGreaterThanOrEqualTo(String value) {
            addCriterion("park >=", value, "park");
            return (Criteria) this;
        }

        public Criteria andParkLessThan(String value) {
            addCriterion("park <", value, "park");
            return (Criteria) this;
        }

        public Criteria andParkLessThanOrEqualTo(String value) {
            addCriterion("park <=", value, "park");
            return (Criteria) this;
        }

        public Criteria andParkLike(String value) {
            addCriterion("park like", value, "park");
            return (Criteria) this;
        }

        public Criteria andParkNotLike(String value) {
            addCriterion("park not like", value, "park");
            return (Criteria) this;
        }

        public Criteria andParkIn(List<String> values) {
            addCriterion("park in", values, "park");
            return (Criteria) this;
        }

        public Criteria andParkNotIn(List<String> values) {
            addCriterion("park not in", values, "park");
            return (Criteria) this;
        }

        public Criteria andParkBetween(String value1, String value2) {
            addCriterion("park between", value1, value2, "park");
            return (Criteria) this;
        }

        public Criteria andParkNotBetween(String value1, String value2) {
            addCriterion("park not between", value1, value2, "park");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIsNull() {
            addCriterion("registtime is null");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIsNotNull() {
            addCriterion("registtime is not null");
            return (Criteria) this;
        }

        public Criteria andRegisttimeEqualTo(Date value) {
            addCriterion("registtime =", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotEqualTo(Date value) {
            addCriterion("registtime <>", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeGreaterThan(Date value) {
            addCriterion("registtime >", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registtime >=", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLessThan(Date value) {
            addCriterion("registtime <", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLessThanOrEqualTo(Date value) {
            addCriterion("registtime <=", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIn(List<Date> values) {
            addCriterion("registtime in", values, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotIn(List<Date> values) {
            addCriterion("registtime not in", values, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeBetween(Date value1, Date value2) {
            addCriterion("registtime between", value1, value2, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotBetween(Date value1, Date value2) {
            addCriterion("registtime not between", value1, value2, "registtime");
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