package com.hnu.entity.cht;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DirectorAllInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DirectorAllInfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidIsNull() {
            addCriterion("captaincircleid is null");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidIsNotNull() {
            addCriterion("captaincircleid is not null");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidEqualTo(String value) {
            addCriterion("captaincircleid =", value, "captaincircleid");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidNotEqualTo(String value) {
            addCriterion("captaincircleid <>", value, "captaincircleid");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidGreaterThan(String value) {
            addCriterion("captaincircleid >", value, "captaincircleid");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidGreaterThanOrEqualTo(String value) {
            addCriterion("captaincircleid >=", value, "captaincircleid");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidLessThan(String value) {
            addCriterion("captaincircleid <", value, "captaincircleid");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidLessThanOrEqualTo(String value) {
            addCriterion("captaincircleid <=", value, "captaincircleid");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidLike(String value) {
            addCriterion("captaincircleid like", value, "captaincircleid");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidNotLike(String value) {
            addCriterion("captaincircleid not like", value, "captaincircleid");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidIn(List<String> values) {
            addCriterion("captaincircleid in", values, "captaincircleid");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidNotIn(List<String> values) {
            addCriterion("captaincircleid not in", values, "captaincircleid");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidBetween(String value1, String value2) {
            addCriterion("captaincircleid between", value1, value2, "captaincircleid");
            return (Criteria) this;
        }

        public Criteria andCaptaincircleidNotBetween(String value1, String value2) {
            addCriterion("captaincircleid not between", value1, value2, "captaincircleid");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidIsNull() {
            addCriterion("factorycircleid is null");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidIsNotNull() {
            addCriterion("factorycircleid is not null");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidEqualTo(String value) {
            addCriterion("factorycircleid =", value, "factorycircleid");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidNotEqualTo(String value) {
            addCriterion("factorycircleid <>", value, "factorycircleid");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidGreaterThan(String value) {
            addCriterion("factorycircleid >", value, "factorycircleid");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidGreaterThanOrEqualTo(String value) {
            addCriterion("factorycircleid >=", value, "factorycircleid");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidLessThan(String value) {
            addCriterion("factorycircleid <", value, "factorycircleid");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidLessThanOrEqualTo(String value) {
            addCriterion("factorycircleid <=", value, "factorycircleid");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidLike(String value) {
            addCriterion("factorycircleid like", value, "factorycircleid");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidNotLike(String value) {
            addCriterion("factorycircleid not like", value, "factorycircleid");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidIn(List<String> values) {
            addCriterion("factorycircleid in", values, "factorycircleid");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidNotIn(List<String> values) {
            addCriterion("factorycircleid not in", values, "factorycircleid");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidBetween(String value1, String value2) {
            addCriterion("factorycircleid between", value1, value2, "factorycircleid");
            return (Criteria) this;
        }

        public Criteria andFactorycircleidNotBetween(String value1, String value2) {
            addCriterion("factorycircleid not between", value1, value2, "factorycircleid");
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

        public Criteria andAgentmobileIsNull() {
            addCriterion("agentmobile is null");
            return (Criteria) this;
        }

        public Criteria andAgentmobileIsNotNull() {
            addCriterion("agentmobile is not null");
            return (Criteria) this;
        }

        public Criteria andAgentmobileEqualTo(String value) {
            addCriterion("agentmobile =", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileNotEqualTo(String value) {
            addCriterion("agentmobile <>", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileGreaterThan(String value) {
            addCriterion("agentmobile >", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileGreaterThanOrEqualTo(String value) {
            addCriterion("agentmobile >=", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileLessThan(String value) {
            addCriterion("agentmobile <", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileLessThanOrEqualTo(String value) {
            addCriterion("agentmobile <=", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileLike(String value) {
            addCriterion("agentmobile like", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileNotLike(String value) {
            addCriterion("agentmobile not like", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileIn(List<String> values) {
            addCriterion("agentmobile in", values, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileNotIn(List<String> values) {
            addCriterion("agentmobile not in", values, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileBetween(String value1, String value2) {
            addCriterion("agentmobile between", value1, value2, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileNotBetween(String value1, String value2) {
            addCriterion("agentmobile not between", value1, value2, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentnameIsNull() {
            addCriterion("agentname is null");
            return (Criteria) this;
        }

        public Criteria andAgentnameIsNotNull() {
            addCriterion("agentname is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnameEqualTo(String value) {
            addCriterion("agentname =", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotEqualTo(String value) {
            addCriterion("agentname <>", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThan(String value) {
            addCriterion("agentname >", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThanOrEqualTo(String value) {
            addCriterion("agentname >=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThan(String value) {
            addCriterion("agentname <", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThanOrEqualTo(String value) {
            addCriterion("agentname <=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLike(String value) {
            addCriterion("agentname like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotLike(String value) {
            addCriterion("agentname not like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameIn(List<String> values) {
            addCriterion("agentname in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotIn(List<String> values) {
            addCriterion("agentname not in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameBetween(String value1, String value2) {
            addCriterion("agentname between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotBetween(String value1, String value2) {
            addCriterion("agentname not between", value1, value2, "agentname");
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