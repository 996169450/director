package com.hnu.entity.circle;

import java.util.ArrayList;
import java.util.List;

public class CircleGroupViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CircleGroupViewExample() {
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

        public Criteria andCirclenameIsNull() {
            addCriterion("circlename is null");
            return (Criteria) this;
        }

        public Criteria andCirclenameIsNotNull() {
            addCriterion("circlename is not null");
            return (Criteria) this;
        }

        public Criteria andCirclenameEqualTo(String value) {
            addCriterion("circlename =", value, "circlename");
            return (Criteria) this;
        }

        public Criteria andCirclenameNotEqualTo(String value) {
            addCriterion("circlename <>", value, "circlename");
            return (Criteria) this;
        }

        public Criteria andCirclenameGreaterThan(String value) {
            addCriterion("circlename >", value, "circlename");
            return (Criteria) this;
        }

        public Criteria andCirclenameGreaterThanOrEqualTo(String value) {
            addCriterion("circlename >=", value, "circlename");
            return (Criteria) this;
        }

        public Criteria andCirclenameLessThan(String value) {
            addCriterion("circlename <", value, "circlename");
            return (Criteria) this;
        }

        public Criteria andCirclenameLessThanOrEqualTo(String value) {
            addCriterion("circlename <=", value, "circlename");
            return (Criteria) this;
        }

        public Criteria andCirclenameLike(String value) {
            addCriterion("circlename like", value, "circlename");
            return (Criteria) this;
        }

        public Criteria andCirclenameNotLike(String value) {
            addCriterion("circlename not like", value, "circlename");
            return (Criteria) this;
        }

        public Criteria andCirclenameIn(List<String> values) {
            addCriterion("circlename in", values, "circlename");
            return (Criteria) this;
        }

        public Criteria andCirclenameNotIn(List<String> values) {
            addCriterion("circlename not in", values, "circlename");
            return (Criteria) this;
        }

        public Criteria andCirclenameBetween(String value1, String value2) {
            addCriterion("circlename between", value1, value2, "circlename");
            return (Criteria) this;
        }

        public Criteria andCirclenameNotBetween(String value1, String value2) {
            addCriterion("circlename not between", value1, value2, "circlename");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(String value) {
            addCriterion("groupid =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(String value) {
            addCriterion("groupid <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(String value) {
            addCriterion("groupid >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("groupid >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(String value) {
            addCriterion("groupid <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(String value) {
            addCriterion("groupid <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLike(String value) {
            addCriterion("groupid like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotLike(String value) {
            addCriterion("groupid not like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<String> values) {
            addCriterion("groupid in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<String> values) {
            addCriterion("groupid not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(String value1, String value2) {
            addCriterion("groupid between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(String value1, String value2) {
            addCriterion("groupid not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("groupname is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("groupname is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("groupname =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("groupname <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("groupname >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("groupname >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("groupname <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("groupname <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("groupname like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("groupname not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("groupname in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("groupname not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("groupname between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("groupname not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andMembertjidIsNull() {
            addCriterion("membertjid is null");
            return (Criteria) this;
        }

        public Criteria andMembertjidIsNotNull() {
            addCriterion("membertjid is not null");
            return (Criteria) this;
        }

        public Criteria andMembertjidEqualTo(Integer value) {
            addCriterion("membertjid =", value, "membertjid");
            return (Criteria) this;
        }

        public Criteria andMembertjidNotEqualTo(Integer value) {
            addCriterion("membertjid <>", value, "membertjid");
            return (Criteria) this;
        }

        public Criteria andMembertjidGreaterThan(Integer value) {
            addCriterion("membertjid >", value, "membertjid");
            return (Criteria) this;
        }

        public Criteria andMembertjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("membertjid >=", value, "membertjid");
            return (Criteria) this;
        }

        public Criteria andMembertjidLessThan(Integer value) {
            addCriterion("membertjid <", value, "membertjid");
            return (Criteria) this;
        }

        public Criteria andMembertjidLessThanOrEqualTo(Integer value) {
            addCriterion("membertjid <=", value, "membertjid");
            return (Criteria) this;
        }

        public Criteria andMembertjidIn(List<Integer> values) {
            addCriterion("membertjid in", values, "membertjid");
            return (Criteria) this;
        }

        public Criteria andMembertjidNotIn(List<Integer> values) {
            addCriterion("membertjid not in", values, "membertjid");
            return (Criteria) this;
        }

        public Criteria andMembertjidBetween(Integer value1, Integer value2) {
            addCriterion("membertjid between", value1, value2, "membertjid");
            return (Criteria) this;
        }

        public Criteria andMembertjidNotBetween(Integer value1, Integer value2) {
            addCriterion("membertjid not between", value1, value2, "membertjid");
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