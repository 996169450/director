package com.hnu.entity.cht;

import java.util.ArrayList;
import java.util.List;

public class CaptainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaptainExample() {
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

        public Criteria andUnionidIsNull() {
            addCriterion("unionid is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("unionid is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("unionid =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("unionid <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("unionid >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("unionid >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("unionid <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("unionid <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("unionid like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("unionid not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("unionid in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("unionid not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("unionid between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("unionid not between", value1, value2, "unionid");
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

        public Criteria andLockstatusIsNull() {
            addCriterion("lockstatus is null");
            return (Criteria) this;
        }

        public Criteria andLockstatusIsNotNull() {
            addCriterion("lockstatus is not null");
            return (Criteria) this;
        }

        public Criteria andLockstatusEqualTo(Byte value) {
            addCriterion("lockstatus =", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotEqualTo(Byte value) {
            addCriterion("lockstatus <>", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusGreaterThan(Byte value) {
            addCriterion("lockstatus >", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("lockstatus >=", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusLessThan(Byte value) {
            addCriterion("lockstatus <", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusLessThanOrEqualTo(Byte value) {
            addCriterion("lockstatus <=", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusIn(List<Byte> values) {
            addCriterion("lockstatus in", values, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotIn(List<Byte> values) {
            addCriterion("lockstatus not in", values, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusBetween(Byte value1, Byte value2) {
            addCriterion("lockstatus between", value1, value2, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("lockstatus not between", value1, value2, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andPhone1IsNull() {
            addCriterion("phone1 is null");
            return (Criteria) this;
        }

        public Criteria andPhone1IsNotNull() {
            addCriterion("phone1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone1EqualTo(String value) {
            addCriterion("phone1 =", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotEqualTo(String value) {
            addCriterion("phone1 <>", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1GreaterThan(String value) {
            addCriterion("phone1 >", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("phone1 >=", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1LessThan(String value) {
            addCriterion("phone1 <", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1LessThanOrEqualTo(String value) {
            addCriterion("phone1 <=", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1Like(String value) {
            addCriterion("phone1 like", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotLike(String value) {
            addCriterion("phone1 not like", value, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1In(List<String> values) {
            addCriterion("phone1 in", values, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotIn(List<String> values) {
            addCriterion("phone1 not in", values, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1Between(String value1, String value2) {
            addCriterion("phone1 between", value1, value2, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone1NotBetween(String value1, String value2) {
            addCriterion("phone1 not between", value1, value2, "phone1");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNull() {
            addCriterion("phone2 is null");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNotNull() {
            addCriterion("phone2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone2EqualTo(String value) {
            addCriterion("phone2 =", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotEqualTo(String value) {
            addCriterion("phone2 <>", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThan(String value) {
            addCriterion("phone2 >", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("phone2 >=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThan(String value) {
            addCriterion("phone2 <", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThanOrEqualTo(String value) {
            addCriterion("phone2 <=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Like(String value) {
            addCriterion("phone2 like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotLike(String value) {
            addCriterion("phone2 not like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2In(List<String> values) {
            addCriterion("phone2 in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotIn(List<String> values) {
            addCriterion("phone2 not in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Between(String value1, String value2) {
            addCriterion("phone2 between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotBetween(String value1, String value2) {
            addCriterion("phone2 not between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone3IsNull() {
            addCriterion("phone3 is null");
            return (Criteria) this;
        }

        public Criteria andPhone3IsNotNull() {
            addCriterion("phone3 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone3EqualTo(String value) {
            addCriterion("phone3 =", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3NotEqualTo(String value) {
            addCriterion("phone3 <>", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3GreaterThan(String value) {
            addCriterion("phone3 >", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3GreaterThanOrEqualTo(String value) {
            addCriterion("phone3 >=", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3LessThan(String value) {
            addCriterion("phone3 <", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3LessThanOrEqualTo(String value) {
            addCriterion("phone3 <=", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3Like(String value) {
            addCriterion("phone3 like", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3NotLike(String value) {
            addCriterion("phone3 not like", value, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3In(List<String> values) {
            addCriterion("phone3 in", values, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3NotIn(List<String> values) {
            addCriterion("phone3 not in", values, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3Between(String value1, String value2) {
            addCriterion("phone3 between", value1, value2, "phone3");
            return (Criteria) this;
        }

        public Criteria andPhone3NotBetween(String value1, String value2) {
            addCriterion("phone3 not between", value1, value2, "phone3");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyname is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyname is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyname =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyname <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyname >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyname >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyname <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyname <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyname like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyname not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyname in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyname not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyname between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyname not between", value1, value2, "companyname");
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