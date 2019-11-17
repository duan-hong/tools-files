package com.ai.channel.mgmt.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class WoOrdInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WoOrdInfoExample() {
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

        public Criteria andWoIdIsNull() {
            addCriterion("WO_ID is null");
            return (Criteria) this;
        }

        public Criteria andWoIdIsNotNull() {
            addCriterion("WO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWoIdEqualTo(Long value) {
            addCriterion("WO_ID =", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdNotEqualTo(Long value) {
            addCriterion("WO_ID <>", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdGreaterThan(Long value) {
            addCriterion("WO_ID >", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WO_ID >=", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdLessThan(Long value) {
            addCriterion("WO_ID <", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdLessThanOrEqualTo(Long value) {
            addCriterion("WO_ID <=", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdIn(List<Long> values) {
            addCriterion("WO_ID in", values, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdNotIn(List<Long> values) {
            addCriterion("WO_ID not in", values, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdBetween(Long value1, Long value2) {
            addCriterion("WO_ID between", value1, value2, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdNotBetween(Long value1, Long value2) {
            addCriterion("WO_ID not between", value1, value2, "woId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdIsNull() {
            addCriterion("PROC_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcInstIdIsNotNull() {
            addCriterion("PROC_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcInstIdEqualTo(String value) {
            addCriterion("PROC_INST_ID =", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdNotEqualTo(String value) {
            addCriterion("PROC_INST_ID <>", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdGreaterThan(String value) {
            addCriterion("PROC_INST_ID >", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_INST_ID >=", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdLessThan(String value) {
            addCriterion("PROC_INST_ID <", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdLessThanOrEqualTo(String value) {
            addCriterion("PROC_INST_ID <=", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdLike(String value) {
            addCriterion("PROC_INST_ID like", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdNotLike(String value) {
            addCriterion("PROC_INST_ID not like", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdIn(List<String> values) {
            addCriterion("PROC_INST_ID in", values, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdNotIn(List<String> values) {
            addCriterion("PROC_INST_ID not in", values, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdBetween(String value1, String value2) {
            addCriterion("PROC_INST_ID between", value1, value2, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdNotBetween(String value1, String value2) {
            addCriterion("PROC_INST_ID not between", value1, value2, "procInstId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNull() {
            addCriterion("SYSTEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("SYSTEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(String value) {
            addCriterion("SYSTEM_ID =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(String value) {
            addCriterion("SYSTEM_ID <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(String value) {
            addCriterion("SYSTEM_ID >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(String value) {
            addCriterion("SYSTEM_ID <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLike(String value) {
            addCriterion("SYSTEM_ID like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotLike(String value) {
            addCriterion("SYSTEM_ID not like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<String> values) {
            addCriterion("SYSTEM_ID in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<String> values) {
            addCriterion("SYSTEM_ID not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID not between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andWoTypeIsNull() {
            addCriterion("WO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWoTypeIsNotNull() {
            addCriterion("WO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWoTypeEqualTo(String value) {
            addCriterion("WO_TYPE =", value, "woType");
            return (Criteria) this;
        }

        public Criteria andWoTypeNotEqualTo(String value) {
            addCriterion("WO_TYPE <>", value, "woType");
            return (Criteria) this;
        }

        public Criteria andWoTypeGreaterThan(String value) {
            addCriterion("WO_TYPE >", value, "woType");
            return (Criteria) this;
        }

        public Criteria andWoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WO_TYPE >=", value, "woType");
            return (Criteria) this;
        }

        public Criteria andWoTypeLessThan(String value) {
            addCriterion("WO_TYPE <", value, "woType");
            return (Criteria) this;
        }

        public Criteria andWoTypeLessThanOrEqualTo(String value) {
            addCriterion("WO_TYPE <=", value, "woType");
            return (Criteria) this;
        }

        public Criteria andWoTypeLike(String value) {
            addCriterion("WO_TYPE like", value, "woType");
            return (Criteria) this;
        }

        public Criteria andWoTypeNotLike(String value) {
            addCriterion("WO_TYPE not like", value, "woType");
            return (Criteria) this;
        }

        public Criteria andWoTypeIn(List<String> values) {
            addCriterion("WO_TYPE in", values, "woType");
            return (Criteria) this;
        }

        public Criteria andWoTypeNotIn(List<String> values) {
            addCriterion("WO_TYPE not in", values, "woType");
            return (Criteria) this;
        }

        public Criteria andWoTypeBetween(String value1, String value2) {
            addCriterion("WO_TYPE between", value1, value2, "woType");
            return (Criteria) this;
        }

        public Criteria andWoTypeNotBetween(String value1, String value2) {
            addCriterion("WO_TYPE not between", value1, value2, "woType");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNull() {
            addCriterion("OPER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNotNull() {
            addCriterion("OPER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOperTypeEqualTo(String value) {
            addCriterion("OPER_TYPE =", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotEqualTo(String value) {
            addCriterion("OPER_TYPE <>", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThan(String value) {
            addCriterion("OPER_TYPE >", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_TYPE >=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThan(String value) {
            addCriterion("OPER_TYPE <", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThanOrEqualTo(String value) {
            addCriterion("OPER_TYPE <=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLike(String value) {
            addCriterion("OPER_TYPE like", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotLike(String value) {
            addCriterion("OPER_TYPE not like", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeIn(List<String> values) {
            addCriterion("OPER_TYPE in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotIn(List<String> values) {
            addCriterion("OPER_TYPE not in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeBetween(String value1, String value2) {
            addCriterion("OPER_TYPE between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotBetween(String value1, String value2) {
            addCriterion("OPER_TYPE not between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Long value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Long value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Long value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Long value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Long> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Long> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Timestamp value) {
            addCriterion("APPLY_DATE =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Timestamp value) {
            addCriterion("APPLY_DATE <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Timestamp value) {
            addCriterion("APPLY_DATE >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("APPLY_DATE >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Timestamp value) {
            addCriterion("APPLY_DATE <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("APPLY_DATE <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Timestamp> values) {
            addCriterion("APPLY_DATE in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Timestamp> values) {
            addCriterion("APPLY_DATE not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("APPLY_DATE between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("APPLY_DATE not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdIsNull() {
            addCriterion("APPLY_OPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdIsNotNull() {
            addCriterion("APPLY_OPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdEqualTo(String value) {
            addCriterion("APPLY_OPER_ID =", value, "applyOperId");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdNotEqualTo(String value) {
            addCriterion("APPLY_OPER_ID <>", value, "applyOperId");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdGreaterThan(String value) {
            addCriterion("APPLY_OPER_ID >", value, "applyOperId");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_OPER_ID >=", value, "applyOperId");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdLessThan(String value) {
            addCriterion("APPLY_OPER_ID <", value, "applyOperId");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdLessThanOrEqualTo(String value) {
            addCriterion("APPLY_OPER_ID <=", value, "applyOperId");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdLike(String value) {
            addCriterion("APPLY_OPER_ID like", value, "applyOperId");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdNotLike(String value) {
            addCriterion("APPLY_OPER_ID not like", value, "applyOperId");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdIn(List<String> values) {
            addCriterion("APPLY_OPER_ID in", values, "applyOperId");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdNotIn(List<String> values) {
            addCriterion("APPLY_OPER_ID not in", values, "applyOperId");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdBetween(String value1, String value2) {
            addCriterion("APPLY_OPER_ID between", value1, value2, "applyOperId");
            return (Criteria) this;
        }

        public Criteria andApplyOperIdNotBetween(String value1, String value2) {
            addCriterion("APPLY_OPER_ID not between", value1, value2, "applyOperId");
            return (Criteria) this;
        }

        public Criteria andOperLevelIsNull() {
            addCriterion("OPER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andOperLevelIsNotNull() {
            addCriterion("OPER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andOperLevelEqualTo(String value) {
            addCriterion("OPER_LEVEL =", value, "operLevel");
            return (Criteria) this;
        }

        public Criteria andOperLevelNotEqualTo(String value) {
            addCriterion("OPER_LEVEL <>", value, "operLevel");
            return (Criteria) this;
        }

        public Criteria andOperLevelGreaterThan(String value) {
            addCriterion("OPER_LEVEL >", value, "operLevel");
            return (Criteria) this;
        }

        public Criteria andOperLevelGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_LEVEL >=", value, "operLevel");
            return (Criteria) this;
        }

        public Criteria andOperLevelLessThan(String value) {
            addCriterion("OPER_LEVEL <", value, "operLevel");
            return (Criteria) this;
        }

        public Criteria andOperLevelLessThanOrEqualTo(String value) {
            addCriterion("OPER_LEVEL <=", value, "operLevel");
            return (Criteria) this;
        }

        public Criteria andOperLevelLike(String value) {
            addCriterion("OPER_LEVEL like", value, "operLevel");
            return (Criteria) this;
        }

        public Criteria andOperLevelNotLike(String value) {
            addCriterion("OPER_LEVEL not like", value, "operLevel");
            return (Criteria) this;
        }

        public Criteria andOperLevelIn(List<String> values) {
            addCriterion("OPER_LEVEL in", values, "operLevel");
            return (Criteria) this;
        }

        public Criteria andOperLevelNotIn(List<String> values) {
            addCriterion("OPER_LEVEL not in", values, "operLevel");
            return (Criteria) this;
        }

        public Criteria andOperLevelBetween(String value1, String value2) {
            addCriterion("OPER_LEVEL between", value1, value2, "operLevel");
            return (Criteria) this;
        }

        public Criteria andOperLevelNotBetween(String value1, String value2) {
            addCriterion("OPER_LEVEL not between", value1, value2, "operLevel");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdIsNull() {
            addCriterion("UPDATE_DEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdIsNotNull() {
            addCriterion("UPDATE_DEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdEqualTo(String value) {
            addCriterion("UPDATE_DEPART_ID =", value, "updateDepartId");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdNotEqualTo(String value) {
            addCriterion("UPDATE_DEPART_ID <>", value, "updateDepartId");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdGreaterThan(String value) {
            addCriterion("UPDATE_DEPART_ID >", value, "updateDepartId");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DEPART_ID >=", value, "updateDepartId");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdLessThan(String value) {
            addCriterion("UPDATE_DEPART_ID <", value, "updateDepartId");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DEPART_ID <=", value, "updateDepartId");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdLike(String value) {
            addCriterion("UPDATE_DEPART_ID like", value, "updateDepartId");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdNotLike(String value) {
            addCriterion("UPDATE_DEPART_ID not like", value, "updateDepartId");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdIn(List<String> values) {
            addCriterion("UPDATE_DEPART_ID in", values, "updateDepartId");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdNotIn(List<String> values) {
            addCriterion("UPDATE_DEPART_ID not in", values, "updateDepartId");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdBetween(String value1, String value2) {
            addCriterion("UPDATE_DEPART_ID between", value1, value2, "updateDepartId");
            return (Criteria) this;
        }

        public Criteria andUpdateDepartIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DEPART_ID not between", value1, value2, "updateDepartId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdIsNull() {
            addCriterion("UPDATE_OPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdIsNotNull() {
            addCriterion("UPDATE_OPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdEqualTo(String value) {
            addCriterion("UPDATE_OPER_ID =", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdNotEqualTo(String value) {
            addCriterion("UPDATE_OPER_ID <>", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdGreaterThan(String value) {
            addCriterion("UPDATE_OPER_ID >", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_OPER_ID >=", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdLessThan(String value) {
            addCriterion("UPDATE_OPER_ID <", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_OPER_ID <=", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdLike(String value) {
            addCriterion("UPDATE_OPER_ID like", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdNotLike(String value) {
            addCriterion("UPDATE_OPER_ID not like", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdIn(List<String> values) {
            addCriterion("UPDATE_OPER_ID in", values, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdNotIn(List<String> values) {
            addCriterion("UPDATE_OPER_ID not in", values, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdBetween(String value1, String value2) {
            addCriterion("UPDATE_OPER_ID between", value1, value2, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_OPER_ID not between", value1, value2, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andFinishDateIsNull() {
            addCriterion("FINISH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFinishDateIsNotNull() {
            addCriterion("FINISH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFinishDateEqualTo(Timestamp value) {
            addCriterion("FINISH_DATE =", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotEqualTo(Timestamp value) {
            addCriterion("FINISH_DATE <>", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateGreaterThan(Timestamp value) {
            addCriterion("FINISH_DATE >", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("FINISH_DATE >=", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateLessThan(Timestamp value) {
            addCriterion("FINISH_DATE <", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("FINISH_DATE <=", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateIn(List<Timestamp> values) {
            addCriterion("FINISH_DATE in", values, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotIn(List<Timestamp> values) {
            addCriterion("FINISH_DATE not in", values, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("FINISH_DATE between", value1, value2, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("FINISH_DATE not between", value1, value2, "finishDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdIsNull() {
            addCriterion("CHL_FIRST_KIND_ID is null");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdIsNotNull() {
            addCriterion("CHL_FIRST_KIND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdEqualTo(String value) {
            addCriterion("CHL_FIRST_KIND_ID =", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdNotEqualTo(String value) {
            addCriterion("CHL_FIRST_KIND_ID <>", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdGreaterThan(String value) {
            addCriterion("CHL_FIRST_KIND_ID >", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHL_FIRST_KIND_ID >=", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdLessThan(String value) {
            addCriterion("CHL_FIRST_KIND_ID <", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdLessThanOrEqualTo(String value) {
            addCriterion("CHL_FIRST_KIND_ID <=", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdLike(String value) {
            addCriterion("CHL_FIRST_KIND_ID like", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdNotLike(String value) {
            addCriterion("CHL_FIRST_KIND_ID not like", value, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdIn(List<String> values) {
            addCriterion("CHL_FIRST_KIND_ID in", values, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdNotIn(List<String> values) {
            addCriterion("CHL_FIRST_KIND_ID not in", values, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdBetween(String value1, String value2) {
            addCriterion("CHL_FIRST_KIND_ID between", value1, value2, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlFirstKindIdNotBetween(String value1, String value2) {
            addCriterion("CHL_FIRST_KIND_ID not between", value1, value2, "chlFirstKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdIsNull() {
            addCriterion("CHL_SECOND_KIND_ID is null");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdIsNotNull() {
            addCriterion("CHL_SECOND_KIND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdEqualTo(String value) {
            addCriterion("CHL_SECOND_KIND_ID =", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdNotEqualTo(String value) {
            addCriterion("CHL_SECOND_KIND_ID <>", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdGreaterThan(String value) {
            addCriterion("CHL_SECOND_KIND_ID >", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHL_SECOND_KIND_ID >=", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdLessThan(String value) {
            addCriterion("CHL_SECOND_KIND_ID <", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdLessThanOrEqualTo(String value) {
            addCriterion("CHL_SECOND_KIND_ID <=", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdLike(String value) {
            addCriterion("CHL_SECOND_KIND_ID like", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdNotLike(String value) {
            addCriterion("CHL_SECOND_KIND_ID not like", value, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdIn(List<String> values) {
            addCriterion("CHL_SECOND_KIND_ID in", values, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdNotIn(List<String> values) {
            addCriterion("CHL_SECOND_KIND_ID not in", values, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdBetween(String value1, String value2) {
            addCriterion("CHL_SECOND_KIND_ID between", value1, value2, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlSecondKindIdNotBetween(String value1, String value2) {
            addCriterion("CHL_SECOND_KIND_ID not between", value1, value2, "chlSecondKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdIsNull() {
            addCriterion("CHL_THIRD_KIND_ID is null");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdIsNotNull() {
            addCriterion("CHL_THIRD_KIND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdEqualTo(String value) {
            addCriterion("CHL_THIRD_KIND_ID =", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdNotEqualTo(String value) {
            addCriterion("CHL_THIRD_KIND_ID <>", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdGreaterThan(String value) {
            addCriterion("CHL_THIRD_KIND_ID >", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHL_THIRD_KIND_ID >=", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdLessThan(String value) {
            addCriterion("CHL_THIRD_KIND_ID <", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdLessThanOrEqualTo(String value) {
            addCriterion("CHL_THIRD_KIND_ID <=", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdLike(String value) {
            addCriterion("CHL_THIRD_KIND_ID like", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdNotLike(String value) {
            addCriterion("CHL_THIRD_KIND_ID not like", value, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdIn(List<String> values) {
            addCriterion("CHL_THIRD_KIND_ID in", values, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdNotIn(List<String> values) {
            addCriterion("CHL_THIRD_KIND_ID not in", values, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdBetween(String value1, String value2) {
            addCriterion("CHL_THIRD_KIND_ID between", value1, value2, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlThirdKindIdNotBetween(String value1, String value2) {
            addCriterion("CHL_THIRD_KIND_ID not between", value1, value2, "chlThirdKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdIsNull() {
            addCriterion("CHL_FORTH_KIND_ID is null");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdIsNotNull() {
            addCriterion("CHL_FORTH_KIND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdEqualTo(String value) {
            addCriterion("CHL_FORTH_KIND_ID =", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdNotEqualTo(String value) {
            addCriterion("CHL_FORTH_KIND_ID <>", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdGreaterThan(String value) {
            addCriterion("CHL_FORTH_KIND_ID >", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHL_FORTH_KIND_ID >=", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdLessThan(String value) {
            addCriterion("CHL_FORTH_KIND_ID <", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdLessThanOrEqualTo(String value) {
            addCriterion("CHL_FORTH_KIND_ID <=", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdLike(String value) {
            addCriterion("CHL_FORTH_KIND_ID like", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdNotLike(String value) {
            addCriterion("CHL_FORTH_KIND_ID not like", value, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdIn(List<String> values) {
            addCriterion("CHL_FORTH_KIND_ID in", values, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdNotIn(List<String> values) {
            addCriterion("CHL_FORTH_KIND_ID not in", values, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdBetween(String value1, String value2) {
            addCriterion("CHL_FORTH_KIND_ID between", value1, value2, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlForthKindIdNotBetween(String value1, String value2) {
            addCriterion("CHL_FORTH_KIND_ID not between", value1, value2, "chlForthKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdIsNull() {
            addCriterion("CHL_KIND_ID is null");
            return (Criteria) this;
        }

        public Criteria andChlKindIdIsNotNull() {
            addCriterion("CHL_KIND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChlKindIdEqualTo(String value) {
            addCriterion("CHL_KIND_ID =", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdNotEqualTo(String value) {
            addCriterion("CHL_KIND_ID <>", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdGreaterThan(String value) {
            addCriterion("CHL_KIND_ID >", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHL_KIND_ID >=", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdLessThan(String value) {
            addCriterion("CHL_KIND_ID <", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdLessThanOrEqualTo(String value) {
            addCriterion("CHL_KIND_ID <=", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdLike(String value) {
            addCriterion("CHL_KIND_ID like", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdNotLike(String value) {
            addCriterion("CHL_KIND_ID not like", value, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdIn(List<String> values) {
            addCriterion("CHL_KIND_ID in", values, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdNotIn(List<String> values) {
            addCriterion("CHL_KIND_ID not in", values, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdBetween(String value1, String value2) {
            addCriterion("CHL_KIND_ID between", value1, value2, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindIdNotBetween(String value1, String value2) {
            addCriterion("CHL_KIND_ID not between", value1, value2, "chlKindId");
            return (Criteria) this;
        }

        public Criteria andChlKindNameIsNull() {
            addCriterion("CHL_KIND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChlKindNameIsNotNull() {
            addCriterion("CHL_KIND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChlKindNameEqualTo(String value) {
            addCriterion("CHL_KIND_NAME =", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameNotEqualTo(String value) {
            addCriterion("CHL_KIND_NAME <>", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameGreaterThan(String value) {
            addCriterion("CHL_KIND_NAME >", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHL_KIND_NAME >=", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameLessThan(String value) {
            addCriterion("CHL_KIND_NAME <", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameLessThanOrEqualTo(String value) {
            addCriterion("CHL_KIND_NAME <=", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameLike(String value) {
            addCriterion("CHL_KIND_NAME like", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameNotLike(String value) {
            addCriterion("CHL_KIND_NAME not like", value, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameIn(List<String> values) {
            addCriterion("CHL_KIND_NAME in", values, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameNotIn(List<String> values) {
            addCriterion("CHL_KIND_NAME not in", values, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameBetween(String value1, String value2) {
            addCriterion("CHL_KIND_NAME between", value1, value2, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andChlKindNameNotBetween(String value1, String value2) {
            addCriterion("CHL_KIND_NAME not between", value1, value2, "chlKindName");
            return (Criteria) this;
        }

        public Criteria andDeptId1IsNull() {
            addCriterion("DEPT_ID1 is null");
            return (Criteria) this;
        }

        public Criteria andDeptId1IsNotNull() {
            addCriterion("DEPT_ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptId1EqualTo(String value) {
            addCriterion("DEPT_ID1 =", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1NotEqualTo(String value) {
            addCriterion("DEPT_ID1 <>", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1GreaterThan(String value) {
            addCriterion("DEPT_ID1 >", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1GreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID1 >=", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1LessThan(String value) {
            addCriterion("DEPT_ID1 <", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1LessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID1 <=", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1Like(String value) {
            addCriterion("DEPT_ID1 like", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1NotLike(String value) {
            addCriterion("DEPT_ID1 not like", value, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1In(List<String> values) {
            addCriterion("DEPT_ID1 in", values, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1NotIn(List<String> values) {
            addCriterion("DEPT_ID1 not in", values, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1Between(String value1, String value2) {
            addCriterion("DEPT_ID1 between", value1, value2, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId1NotBetween(String value1, String value2) {
            addCriterion("DEPT_ID1 not between", value1, value2, "deptId1");
            return (Criteria) this;
        }

        public Criteria andDeptId2IsNull() {
            addCriterion("DEPT_ID2 is null");
            return (Criteria) this;
        }

        public Criteria andDeptId2IsNotNull() {
            addCriterion("DEPT_ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptId2EqualTo(String value) {
            addCriterion("DEPT_ID2 =", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2NotEqualTo(String value) {
            addCriterion("DEPT_ID2 <>", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2GreaterThan(String value) {
            addCriterion("DEPT_ID2 >", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2GreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID2 >=", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2LessThan(String value) {
            addCriterion("DEPT_ID2 <", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2LessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID2 <=", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2Like(String value) {
            addCriterion("DEPT_ID2 like", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2NotLike(String value) {
            addCriterion("DEPT_ID2 not like", value, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2In(List<String> values) {
            addCriterion("DEPT_ID2 in", values, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2NotIn(List<String> values) {
            addCriterion("DEPT_ID2 not in", values, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2Between(String value1, String value2) {
            addCriterion("DEPT_ID2 between", value1, value2, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId2NotBetween(String value1, String value2) {
            addCriterion("DEPT_ID2 not between", value1, value2, "deptId2");
            return (Criteria) this;
        }

        public Criteria andDeptId3IsNull() {
            addCriterion("DEPT_ID3 is null");
            return (Criteria) this;
        }

        public Criteria andDeptId3IsNotNull() {
            addCriterion("DEPT_ID3 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptId3EqualTo(String value) {
            addCriterion("DEPT_ID3 =", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3NotEqualTo(String value) {
            addCriterion("DEPT_ID3 <>", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3GreaterThan(String value) {
            addCriterion("DEPT_ID3 >", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3GreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID3 >=", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3LessThan(String value) {
            addCriterion("DEPT_ID3 <", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3LessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID3 <=", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3Like(String value) {
            addCriterion("DEPT_ID3 like", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3NotLike(String value) {
            addCriterion("DEPT_ID3 not like", value, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3In(List<String> values) {
            addCriterion("DEPT_ID3 in", values, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3NotIn(List<String> values) {
            addCriterion("DEPT_ID3 not in", values, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3Between(String value1, String value2) {
            addCriterion("DEPT_ID3 between", value1, value2, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId3NotBetween(String value1, String value2) {
            addCriterion("DEPT_ID3 not between", value1, value2, "deptId3");
            return (Criteria) this;
        }

        public Criteria andDeptId4IsNull() {
            addCriterion("DEPT_ID4 is null");
            return (Criteria) this;
        }

        public Criteria andDeptId4IsNotNull() {
            addCriterion("DEPT_ID4 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptId4EqualTo(String value) {
            addCriterion("DEPT_ID4 =", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4NotEqualTo(String value) {
            addCriterion("DEPT_ID4 <>", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4GreaterThan(String value) {
            addCriterion("DEPT_ID4 >", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4GreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID4 >=", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4LessThan(String value) {
            addCriterion("DEPT_ID4 <", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4LessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID4 <=", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4Like(String value) {
            addCriterion("DEPT_ID4 like", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4NotLike(String value) {
            addCriterion("DEPT_ID4 not like", value, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4In(List<String> values) {
            addCriterion("DEPT_ID4 in", values, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4NotIn(List<String> values) {
            addCriterion("DEPT_ID4 not in", values, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4Between(String value1, String value2) {
            addCriterion("DEPT_ID4 between", value1, value2, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId4NotBetween(String value1, String value2) {
            addCriterion("DEPT_ID4 not between", value1, value2, "deptId4");
            return (Criteria) this;
        }

        public Criteria andDeptId5IsNull() {
            addCriterion("DEPT_ID5 is null");
            return (Criteria) this;
        }

        public Criteria andDeptId5IsNotNull() {
            addCriterion("DEPT_ID5 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptId5EqualTo(String value) {
            addCriterion("DEPT_ID5 =", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5NotEqualTo(String value) {
            addCriterion("DEPT_ID5 <>", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5GreaterThan(String value) {
            addCriterion("DEPT_ID5 >", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5GreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID5 >=", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5LessThan(String value) {
            addCriterion("DEPT_ID5 <", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5LessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID5 <=", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5Like(String value) {
            addCriterion("DEPT_ID5 like", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5NotLike(String value) {
            addCriterion("DEPT_ID5 not like", value, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5In(List<String> values) {
            addCriterion("DEPT_ID5 in", values, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5NotIn(List<String> values) {
            addCriterion("DEPT_ID5 not in", values, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5Between(String value1, String value2) {
            addCriterion("DEPT_ID5 between", value1, value2, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId5NotBetween(String value1, String value2) {
            addCriterion("DEPT_ID5 not between", value1, value2, "deptId5");
            return (Criteria) this;
        }

        public Criteria andDeptId6IsNull() {
            addCriterion("DEPT_ID6 is null");
            return (Criteria) this;
        }

        public Criteria andDeptId6IsNotNull() {
            addCriterion("DEPT_ID6 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptId6EqualTo(String value) {
            addCriterion("DEPT_ID6 =", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6NotEqualTo(String value) {
            addCriterion("DEPT_ID6 <>", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6GreaterThan(String value) {
            addCriterion("DEPT_ID6 >", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6GreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID6 >=", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6LessThan(String value) {
            addCriterion("DEPT_ID6 <", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6LessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID6 <=", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6Like(String value) {
            addCriterion("DEPT_ID6 like", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6NotLike(String value) {
            addCriterion("DEPT_ID6 not like", value, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6In(List<String> values) {
            addCriterion("DEPT_ID6 in", values, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6NotIn(List<String> values) {
            addCriterion("DEPT_ID6 not in", values, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6Between(String value1, String value2) {
            addCriterion("DEPT_ID6 between", value1, value2, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptId6NotBetween(String value1, String value2) {
            addCriterion("DEPT_ID6 not between", value1, value2, "deptId6");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("DEPT_NAME =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("DEPT_NAME <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("DEPT_NAME >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("DEPT_NAME <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("DEPT_NAME like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("DEPT_NAME not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("DEPT_NAME in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("DEPT_NAME not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("DEPT_NAME between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeIsNull() {
            addCriterion("ADM_REG_PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeIsNotNull() {
            addCriterion("ADM_REG_PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeEqualTo(String value) {
            addCriterion("ADM_REG_PROVINCE_CODE =", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeNotEqualTo(String value) {
            addCriterion("ADM_REG_PROVINCE_CODE <>", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeGreaterThan(String value) {
            addCriterion("ADM_REG_PROVINCE_CODE >", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADM_REG_PROVINCE_CODE >=", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeLessThan(String value) {
            addCriterion("ADM_REG_PROVINCE_CODE <", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("ADM_REG_PROVINCE_CODE <=", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeLike(String value) {
            addCriterion("ADM_REG_PROVINCE_CODE like", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeNotLike(String value) {
            addCriterion("ADM_REG_PROVINCE_CODE not like", value, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeIn(List<String> values) {
            addCriterion("ADM_REG_PROVINCE_CODE in", values, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeNotIn(List<String> values) {
            addCriterion("ADM_REG_PROVINCE_CODE not in", values, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeBetween(String value1, String value2) {
            addCriterion("ADM_REG_PROVINCE_CODE between", value1, value2, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("ADM_REG_PROVINCE_CODE not between", value1, value2, "admRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeIsNull() {
            addCriterion("ADM_REG_CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeIsNotNull() {
            addCriterion("ADM_REG_CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeEqualTo(String value) {
            addCriterion("ADM_REG_CITY_CODE =", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeNotEqualTo(String value) {
            addCriterion("ADM_REG_CITY_CODE <>", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeGreaterThan(String value) {
            addCriterion("ADM_REG_CITY_CODE >", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADM_REG_CITY_CODE >=", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeLessThan(String value) {
            addCriterion("ADM_REG_CITY_CODE <", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeLessThanOrEqualTo(String value) {
            addCriterion("ADM_REG_CITY_CODE <=", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeLike(String value) {
            addCriterion("ADM_REG_CITY_CODE like", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeNotLike(String value) {
            addCriterion("ADM_REG_CITY_CODE not like", value, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeIn(List<String> values) {
            addCriterion("ADM_REG_CITY_CODE in", values, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeNotIn(List<String> values) {
            addCriterion("ADM_REG_CITY_CODE not in", values, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeBetween(String value1, String value2) {
            addCriterion("ADM_REG_CITY_CODE between", value1, value2, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCityCodeNotBetween(String value1, String value2) {
            addCriterion("ADM_REG_CITY_CODE not between", value1, value2, "admRegCityCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeIsNull() {
            addCriterion("ADM_REG_COUNTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeIsNotNull() {
            addCriterion("ADM_REG_COUNTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeEqualTo(String value) {
            addCriterion("ADM_REG_COUNTY_CODE =", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeNotEqualTo(String value) {
            addCriterion("ADM_REG_COUNTY_CODE <>", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeGreaterThan(String value) {
            addCriterion("ADM_REG_COUNTY_CODE >", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADM_REG_COUNTY_CODE >=", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeLessThan(String value) {
            addCriterion("ADM_REG_COUNTY_CODE <", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("ADM_REG_COUNTY_CODE <=", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeLike(String value) {
            addCriterion("ADM_REG_COUNTY_CODE like", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeNotLike(String value) {
            addCriterion("ADM_REG_COUNTY_CODE not like", value, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeIn(List<String> values) {
            addCriterion("ADM_REG_COUNTY_CODE in", values, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeNotIn(List<String> values) {
            addCriterion("ADM_REG_COUNTY_CODE not in", values, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeBetween(String value1, String value2) {
            addCriterion("ADM_REG_COUNTY_CODE between", value1, value2, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCountyCodeNotBetween(String value1, String value2) {
            addCriterion("ADM_REG_COUNTY_CODE not between", value1, value2, "admRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeIsNull() {
            addCriterion("ADM_REG_TOWN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeIsNotNull() {
            addCriterion("ADM_REG_TOWN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeEqualTo(String value) {
            addCriterion("ADM_REG_TOWN_CODE =", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeNotEqualTo(String value) {
            addCriterion("ADM_REG_TOWN_CODE <>", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeGreaterThan(String value) {
            addCriterion("ADM_REG_TOWN_CODE >", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADM_REG_TOWN_CODE >=", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeLessThan(String value) {
            addCriterion("ADM_REG_TOWN_CODE <", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeLessThanOrEqualTo(String value) {
            addCriterion("ADM_REG_TOWN_CODE <=", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeLike(String value) {
            addCriterion("ADM_REG_TOWN_CODE like", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeNotLike(String value) {
            addCriterion("ADM_REG_TOWN_CODE not like", value, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeIn(List<String> values) {
            addCriterion("ADM_REG_TOWN_CODE in", values, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeNotIn(List<String> values) {
            addCriterion("ADM_REG_TOWN_CODE not in", values, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeBetween(String value1, String value2) {
            addCriterion("ADM_REG_TOWN_CODE between", value1, value2, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegTownCodeNotBetween(String value1, String value2) {
            addCriterion("ADM_REG_TOWN_CODE not between", value1, value2, "admRegTownCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeIsNull() {
            addCriterion("ADM_REG_VILLAGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeIsNotNull() {
            addCriterion("ADM_REG_VILLAGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeEqualTo(String value) {
            addCriterion("ADM_REG_VILLAGE_CODE =", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeNotEqualTo(String value) {
            addCriterion("ADM_REG_VILLAGE_CODE <>", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeGreaterThan(String value) {
            addCriterion("ADM_REG_VILLAGE_CODE >", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADM_REG_VILLAGE_CODE >=", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeLessThan(String value) {
            addCriterion("ADM_REG_VILLAGE_CODE <", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeLessThanOrEqualTo(String value) {
            addCriterion("ADM_REG_VILLAGE_CODE <=", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeLike(String value) {
            addCriterion("ADM_REG_VILLAGE_CODE like", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeNotLike(String value) {
            addCriterion("ADM_REG_VILLAGE_CODE not like", value, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeIn(List<String> values) {
            addCriterion("ADM_REG_VILLAGE_CODE in", values, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeNotIn(List<String> values) {
            addCriterion("ADM_REG_VILLAGE_CODE not in", values, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeBetween(String value1, String value2) {
            addCriterion("ADM_REG_VILLAGE_CODE between", value1, value2, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegVillageCodeNotBetween(String value1, String value2) {
            addCriterion("ADM_REG_VILLAGE_CODE not between", value1, value2, "admRegVillageCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeIsNull() {
            addCriterion("ADM_REG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeIsNotNull() {
            addCriterion("ADM_REG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeEqualTo(String value) {
            addCriterion("ADM_REG_CODE =", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeNotEqualTo(String value) {
            addCriterion("ADM_REG_CODE <>", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeGreaterThan(String value) {
            addCriterion("ADM_REG_CODE >", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADM_REG_CODE >=", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeLessThan(String value) {
            addCriterion("ADM_REG_CODE <", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeLessThanOrEqualTo(String value) {
            addCriterion("ADM_REG_CODE <=", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeLike(String value) {
            addCriterion("ADM_REG_CODE like", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeNotLike(String value) {
            addCriterion("ADM_REG_CODE not like", value, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeIn(List<String> values) {
            addCriterion("ADM_REG_CODE in", values, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeNotIn(List<String> values) {
            addCriterion("ADM_REG_CODE not in", values, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeBetween(String value1, String value2) {
            addCriterion("ADM_REG_CODE between", value1, value2, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andAdmRegCodeNotBetween(String value1, String value2) {
            addCriterion("ADM_REG_CODE not between", value1, value2, "admRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeIsNull() {
            addCriterion("BUSI_REG_PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeIsNotNull() {
            addCriterion("BUSI_REG_PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeEqualTo(String value) {
            addCriterion("BUSI_REG_PROVINCE_CODE =", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeNotEqualTo(String value) {
            addCriterion("BUSI_REG_PROVINCE_CODE <>", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeGreaterThan(String value) {
            addCriterion("BUSI_REG_PROVINCE_CODE >", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_PROVINCE_CODE >=", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeLessThan(String value) {
            addCriterion("BUSI_REG_PROVINCE_CODE <", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_PROVINCE_CODE <=", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeLike(String value) {
            addCriterion("BUSI_REG_PROVINCE_CODE like", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeNotLike(String value) {
            addCriterion("BUSI_REG_PROVINCE_CODE not like", value, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeIn(List<String> values) {
            addCriterion("BUSI_REG_PROVINCE_CODE in", values, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeNotIn(List<String> values) {
            addCriterion("BUSI_REG_PROVINCE_CODE not in", values, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeBetween(String value1, String value2) {
            addCriterion("BUSI_REG_PROVINCE_CODE between", value1, value2, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("BUSI_REG_PROVINCE_CODE not between", value1, value2, "busiRegProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeIsNull() {
            addCriterion("BUSI_REG_CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeIsNotNull() {
            addCriterion("BUSI_REG_CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeEqualTo(String value) {
            addCriterion("BUSI_REG_CITY_CODE =", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeNotEqualTo(String value) {
            addCriterion("BUSI_REG_CITY_CODE <>", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeGreaterThan(String value) {
            addCriterion("BUSI_REG_CITY_CODE >", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_CITY_CODE >=", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeLessThan(String value) {
            addCriterion("BUSI_REG_CITY_CODE <", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_CITY_CODE <=", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeLike(String value) {
            addCriterion("BUSI_REG_CITY_CODE like", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeNotLike(String value) {
            addCriterion("BUSI_REG_CITY_CODE not like", value, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeIn(List<String> values) {
            addCriterion("BUSI_REG_CITY_CODE in", values, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeNotIn(List<String> values) {
            addCriterion("BUSI_REG_CITY_CODE not in", values, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeBetween(String value1, String value2) {
            addCriterion("BUSI_REG_CITY_CODE between", value1, value2, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCityCodeNotBetween(String value1, String value2) {
            addCriterion("BUSI_REG_CITY_CODE not between", value1, value2, "busiRegCityCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeIsNull() {
            addCriterion("BUSI_REG_COUNTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeIsNotNull() {
            addCriterion("BUSI_REG_COUNTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeEqualTo(String value) {
            addCriterion("BUSI_REG_COUNTY_CODE =", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeNotEqualTo(String value) {
            addCriterion("BUSI_REG_COUNTY_CODE <>", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeGreaterThan(String value) {
            addCriterion("BUSI_REG_COUNTY_CODE >", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_COUNTY_CODE >=", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeLessThan(String value) {
            addCriterion("BUSI_REG_COUNTY_CODE <", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_COUNTY_CODE <=", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeLike(String value) {
            addCriterion("BUSI_REG_COUNTY_CODE like", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeNotLike(String value) {
            addCriterion("BUSI_REG_COUNTY_CODE not like", value, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeIn(List<String> values) {
            addCriterion("BUSI_REG_COUNTY_CODE in", values, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeNotIn(List<String> values) {
            addCriterion("BUSI_REG_COUNTY_CODE not in", values, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeBetween(String value1, String value2) {
            addCriterion("BUSI_REG_COUNTY_CODE between", value1, value2, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCountyCodeNotBetween(String value1, String value2) {
            addCriterion("BUSI_REG_COUNTY_CODE not between", value1, value2, "busiRegCountyCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeIsNull() {
            addCriterion("BUSI_REG_AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeIsNotNull() {
            addCriterion("BUSI_REG_AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeEqualTo(String value) {
            addCriterion("BUSI_REG_AREA_CODE =", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeNotEqualTo(String value) {
            addCriterion("BUSI_REG_AREA_CODE <>", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeGreaterThan(String value) {
            addCriterion("BUSI_REG_AREA_CODE >", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_AREA_CODE >=", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeLessThan(String value) {
            addCriterion("BUSI_REG_AREA_CODE <", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_AREA_CODE <=", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeLike(String value) {
            addCriterion("BUSI_REG_AREA_CODE like", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeNotLike(String value) {
            addCriterion("BUSI_REG_AREA_CODE not like", value, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeIn(List<String> values) {
            addCriterion("BUSI_REG_AREA_CODE in", values, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeNotIn(List<String> values) {
            addCriterion("BUSI_REG_AREA_CODE not in", values, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeBetween(String value1, String value2) {
            addCriterion("BUSI_REG_AREA_CODE between", value1, value2, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegAreaCodeNotBetween(String value1, String value2) {
            addCriterion("BUSI_REG_AREA_CODE not between", value1, value2, "busiRegAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeIsNull() {
            addCriterion("BUSI_REG_GRID_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeIsNotNull() {
            addCriterion("BUSI_REG_GRID_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeEqualTo(String value) {
            addCriterion("BUSI_REG_GRID_CODE =", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeNotEqualTo(String value) {
            addCriterion("BUSI_REG_GRID_CODE <>", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeGreaterThan(String value) {
            addCriterion("BUSI_REG_GRID_CODE >", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_GRID_CODE >=", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeLessThan(String value) {
            addCriterion("BUSI_REG_GRID_CODE <", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_GRID_CODE <=", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeLike(String value) {
            addCriterion("BUSI_REG_GRID_CODE like", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeNotLike(String value) {
            addCriterion("BUSI_REG_GRID_CODE not like", value, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeIn(List<String> values) {
            addCriterion("BUSI_REG_GRID_CODE in", values, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeNotIn(List<String> values) {
            addCriterion("BUSI_REG_GRID_CODE not in", values, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeBetween(String value1, String value2) {
            addCriterion("BUSI_REG_GRID_CODE between", value1, value2, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegGridCodeNotBetween(String value1, String value2) {
            addCriterion("BUSI_REG_GRID_CODE not between", value1, value2, "busiRegGridCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeIsNull() {
            addCriterion("BUSI_REG_MICRO_AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeIsNotNull() {
            addCriterion("BUSI_REG_MICRO_AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeEqualTo(String value) {
            addCriterion("BUSI_REG_MICRO_AREA_CODE =", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeNotEqualTo(String value) {
            addCriterion("BUSI_REG_MICRO_AREA_CODE <>", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeGreaterThan(String value) {
            addCriterion("BUSI_REG_MICRO_AREA_CODE >", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_MICRO_AREA_CODE >=", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeLessThan(String value) {
            addCriterion("BUSI_REG_MICRO_AREA_CODE <", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_MICRO_AREA_CODE <=", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeLike(String value) {
            addCriterion("BUSI_REG_MICRO_AREA_CODE like", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeNotLike(String value) {
            addCriterion("BUSI_REG_MICRO_AREA_CODE not like", value, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeIn(List<String> values) {
            addCriterion("BUSI_REG_MICRO_AREA_CODE in", values, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeNotIn(List<String> values) {
            addCriterion("BUSI_REG_MICRO_AREA_CODE not in", values, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeBetween(String value1, String value2) {
            addCriterion("BUSI_REG_MICRO_AREA_CODE between", value1, value2, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegMicroAreaCodeNotBetween(String value1, String value2) {
            addCriterion("BUSI_REG_MICRO_AREA_CODE not between", value1, value2, "busiRegMicroAreaCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeIsNull() {
            addCriterion("BUSI_REG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeIsNotNull() {
            addCriterion("BUSI_REG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeEqualTo(String value) {
            addCriterion("BUSI_REG_CODE =", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeNotEqualTo(String value) {
            addCriterion("BUSI_REG_CODE <>", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeGreaterThan(String value) {
            addCriterion("BUSI_REG_CODE >", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_CODE >=", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeLessThan(String value) {
            addCriterion("BUSI_REG_CODE <", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_CODE <=", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeLike(String value) {
            addCriterion("BUSI_REG_CODE like", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeNotLike(String value) {
            addCriterion("BUSI_REG_CODE not like", value, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeIn(List<String> values) {
            addCriterion("BUSI_REG_CODE in", values, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeNotIn(List<String> values) {
            addCriterion("BUSI_REG_CODE not in", values, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeBetween(String value1, String value2) {
            addCriterion("BUSI_REG_CODE between", value1, value2, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andBusiRegCodeNotBetween(String value1, String value2) {
            addCriterion("BUSI_REG_CODE not between", value1, value2, "busiRegCode");
            return (Criteria) this;
        }

        public Criteria andChannelClassIsNull() {
            addCriterion("CHANNEL_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andChannelClassIsNotNull() {
            addCriterion("CHANNEL_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andChannelClassEqualTo(String value) {
            addCriterion("CHANNEL_CLASS =", value, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassNotEqualTo(String value) {
            addCriterion("CHANNEL_CLASS <>", value, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassGreaterThan(String value) {
            addCriterion("CHANNEL_CLASS >", value, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CLASS >=", value, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassLessThan(String value) {
            addCriterion("CHANNEL_CLASS <", value, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CLASS <=", value, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassLike(String value) {
            addCriterion("CHANNEL_CLASS like", value, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassNotLike(String value) {
            addCriterion("CHANNEL_CLASS not like", value, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassIn(List<String> values) {
            addCriterion("CHANNEL_CLASS in", values, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassNotIn(List<String> values) {
            addCriterion("CHANNEL_CLASS not in", values, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassBetween(String value1, String value2) {
            addCriterion("CHANNEL_CLASS between", value1, value2, "channelClass");
            return (Criteria) this;
        }

        public Criteria andChannelClassNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_CLASS not between", value1, value2, "channelClass");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIsNull() {
            addCriterion("APPLY_REASON is null");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIsNotNull() {
            addCriterion("APPLY_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andApplyReasonEqualTo(String value) {
            addCriterion("APPLY_REASON =", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotEqualTo(String value) {
            addCriterion("APPLY_REASON <>", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonGreaterThan(String value) {
            addCriterion("APPLY_REASON >", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_REASON >=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLessThan(String value) {
            addCriterion("APPLY_REASON <", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLessThanOrEqualTo(String value) {
            addCriterion("APPLY_REASON <=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLike(String value) {
            addCriterion("APPLY_REASON like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotLike(String value) {
            addCriterion("APPLY_REASON not like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIn(List<String> values) {
            addCriterion("APPLY_REASON in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotIn(List<String> values) {
            addCriterion("APPLY_REASON not in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonBetween(String value1, String value2) {
            addCriterion("APPLY_REASON between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotBetween(String value1, String value2) {
            addCriterion("APPLY_REASON not between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameIsNull() {
            addCriterion("ADM_REG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameIsNotNull() {
            addCriterion("ADM_REG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameEqualTo(String value) {
            addCriterion("ADM_REG_NAME =", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameNotEqualTo(String value) {
            addCriterion("ADM_REG_NAME <>", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameGreaterThan(String value) {
            addCriterion("ADM_REG_NAME >", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADM_REG_NAME >=", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameLessThan(String value) {
            addCriterion("ADM_REG_NAME <", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameLessThanOrEqualTo(String value) {
            addCriterion("ADM_REG_NAME <=", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameLike(String value) {
            addCriterion("ADM_REG_NAME like", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameNotLike(String value) {
            addCriterion("ADM_REG_NAME not like", value, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameIn(List<String> values) {
            addCriterion("ADM_REG_NAME in", values, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameNotIn(List<String> values) {
            addCriterion("ADM_REG_NAME not in", values, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameBetween(String value1, String value2) {
            addCriterion("ADM_REG_NAME between", value1, value2, "admRegName");
            return (Criteria) this;
        }

        public Criteria andAdmRegNameNotBetween(String value1, String value2) {
            addCriterion("ADM_REG_NAME not between", value1, value2, "admRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameIsNull() {
            addCriterion("BUSI_REG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameIsNotNull() {
            addCriterion("BUSI_REG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameEqualTo(String value) {
            addCriterion("BUSI_REG_NAME =", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameNotEqualTo(String value) {
            addCriterion("BUSI_REG_NAME <>", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameGreaterThan(String value) {
            addCriterion("BUSI_REG_NAME >", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_NAME >=", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameLessThan(String value) {
            addCriterion("BUSI_REG_NAME <", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameLessThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_NAME <=", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameLike(String value) {
            addCriterion("BUSI_REG_NAME like", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameNotLike(String value) {
            addCriterion("BUSI_REG_NAME not like", value, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameIn(List<String> values) {
            addCriterion("BUSI_REG_NAME in", values, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameNotIn(List<String> values) {
            addCriterion("BUSI_REG_NAME not in", values, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameBetween(String value1, String value2) {
            addCriterion("BUSI_REG_NAME between", value1, value2, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andBusiRegNameNotBetween(String value1, String value2) {
            addCriterion("BUSI_REG_NAME not between", value1, value2, "busiRegName");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagIsNull() {
            addCriterion("SYNC_CRM_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagIsNotNull() {
            addCriterion("SYNC_CRM_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagEqualTo(String value) {
            addCriterion("SYNC_CRM_FLAG =", value, "syncCrmFlag");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagNotEqualTo(String value) {
            addCriterion("SYNC_CRM_FLAG <>", value, "syncCrmFlag");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagGreaterThan(String value) {
            addCriterion("SYNC_CRM_FLAG >", value, "syncCrmFlag");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SYNC_CRM_FLAG >=", value, "syncCrmFlag");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagLessThan(String value) {
            addCriterion("SYNC_CRM_FLAG <", value, "syncCrmFlag");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagLessThanOrEqualTo(String value) {
            addCriterion("SYNC_CRM_FLAG <=", value, "syncCrmFlag");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagLike(String value) {
            addCriterion("SYNC_CRM_FLAG like", value, "syncCrmFlag");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagNotLike(String value) {
            addCriterion("SYNC_CRM_FLAG not like", value, "syncCrmFlag");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagIn(List<String> values) {
            addCriterion("SYNC_CRM_FLAG in", values, "syncCrmFlag");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagNotIn(List<String> values) {
            addCriterion("SYNC_CRM_FLAG not in", values, "syncCrmFlag");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagBetween(String value1, String value2) {
            addCriterion("SYNC_CRM_FLAG between", value1, value2, "syncCrmFlag");
            return (Criteria) this;
        }

        public Criteria andSyncCrmFlagNotBetween(String value1, String value2) {
            addCriterion("SYNC_CRM_FLAG not between", value1, value2, "syncCrmFlag");
            return (Criteria) this;
        }

        public Criteria andWoTitleIsNull() {
            addCriterion("WO_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andWoTitleIsNotNull() {
            addCriterion("WO_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andWoTitleEqualTo(String value) {
            addCriterion("WO_TITLE =", value, "woTitle");
            return (Criteria) this;
        }

        public Criteria andWoTitleNotEqualTo(String value) {
            addCriterion("WO_TITLE <>", value, "woTitle");
            return (Criteria) this;
        }

        public Criteria andWoTitleGreaterThan(String value) {
            addCriterion("WO_TITLE >", value, "woTitle");
            return (Criteria) this;
        }

        public Criteria andWoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("WO_TITLE >=", value, "woTitle");
            return (Criteria) this;
        }

        public Criteria andWoTitleLessThan(String value) {
            addCriterion("WO_TITLE <", value, "woTitle");
            return (Criteria) this;
        }

        public Criteria andWoTitleLessThanOrEqualTo(String value) {
            addCriterion("WO_TITLE <=", value, "woTitle");
            return (Criteria) this;
        }

        public Criteria andWoTitleLike(String value) {
            addCriterion("WO_TITLE like", value, "woTitle");
            return (Criteria) this;
        }

        public Criteria andWoTitleNotLike(String value) {
            addCriterion("WO_TITLE not like", value, "woTitle");
            return (Criteria) this;
        }

        public Criteria andWoTitleIn(List<String> values) {
            addCriterion("WO_TITLE in", values, "woTitle");
            return (Criteria) this;
        }

        public Criteria andWoTitleNotIn(List<String> values) {
            addCriterion("WO_TITLE not in", values, "woTitle");
            return (Criteria) this;
        }

        public Criteria andWoTitleBetween(String value1, String value2) {
            addCriterion("WO_TITLE between", value1, value2, "woTitle");
            return (Criteria) this;
        }

        public Criteria andWoTitleNotBetween(String value1, String value2) {
            addCriterion("WO_TITLE not between", value1, value2, "woTitle");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeIsNull() {
            addCriterion("WO_BIG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeIsNotNull() {
            addCriterion("WO_BIG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeEqualTo(String value) {
            addCriterion("WO_BIG_TYPE =", value, "woBigType");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeNotEqualTo(String value) {
            addCriterion("WO_BIG_TYPE <>", value, "woBigType");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeGreaterThan(String value) {
            addCriterion("WO_BIG_TYPE >", value, "woBigType");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WO_BIG_TYPE >=", value, "woBigType");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeLessThan(String value) {
            addCriterion("WO_BIG_TYPE <", value, "woBigType");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeLessThanOrEqualTo(String value) {
            addCriterion("WO_BIG_TYPE <=", value, "woBigType");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeLike(String value) {
            addCriterion("WO_BIG_TYPE like", value, "woBigType");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeNotLike(String value) {
            addCriterion("WO_BIG_TYPE not like", value, "woBigType");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeIn(List<String> values) {
            addCriterion("WO_BIG_TYPE in", values, "woBigType");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeNotIn(List<String> values) {
            addCriterion("WO_BIG_TYPE not in", values, "woBigType");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeBetween(String value1, String value2) {
            addCriterion("WO_BIG_TYPE between", value1, value2, "woBigType");
            return (Criteria) this;
        }

        public Criteria andWoBigTypeNotBetween(String value1, String value2) {
            addCriterion("WO_BIG_TYPE not between", value1, value2, "woBigType");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIsNull() {
            addCriterion("BUSI_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIsNotNull() {
            addCriterion("BUSI_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiCodeEqualTo(String value) {
            addCriterion("BUSI_CODE =", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotEqualTo(String value) {
            addCriterion("BUSI_CODE <>", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeGreaterThan(String value) {
            addCriterion("BUSI_CODE >", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_CODE >=", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLessThan(String value) {
            addCriterion("BUSI_CODE <", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_CODE <=", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLike(String value) {
            addCriterion("BUSI_CODE like", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotLike(String value) {
            addCriterion("BUSI_CODE not like", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIn(List<String> values) {
            addCriterion("BUSI_CODE in", values, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotIn(List<String> values) {
            addCriterion("BUSI_CODE not in", values, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeBetween(String value1, String value2) {
            addCriterion("BUSI_CODE between", value1, value2, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotBetween(String value1, String value2) {
            addCriterion("BUSI_CODE not between", value1, value2, "busiCode");
            return (Criteria) this;
        }

        public Criteria andAssigneeIsNull() {
            addCriterion("ASSIGNEE is null");
            return (Criteria) this;
        }

        public Criteria andAssigneeIsNotNull() {
            addCriterion("ASSIGNEE is not null");
            return (Criteria) this;
        }

        public Criteria andAssigneeEqualTo(String value) {
            addCriterion("ASSIGNEE =", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeNotEqualTo(String value) {
            addCriterion("ASSIGNEE <>", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeGreaterThan(String value) {
            addCriterion("ASSIGNEE >", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGNEE >=", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeLessThan(String value) {
            addCriterion("ASSIGNEE <", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeLessThanOrEqualTo(String value) {
            addCriterion("ASSIGNEE <=", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeLike(String value) {
            addCriterion("ASSIGNEE like", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeNotLike(String value) {
            addCriterion("ASSIGNEE not like", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeIn(List<String> values) {
            addCriterion("ASSIGNEE in", values, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeNotIn(List<String> values) {
            addCriterion("ASSIGNEE not in", values, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeBetween(String value1, String value2) {
            addCriterion("ASSIGNEE between", value1, value2, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeNotBetween(String value1, String value2) {
            addCriterion("ASSIGNEE not between", value1, value2, "assignee");
            return (Criteria) this;
        }

        public Criteria andProTerminationDateIsNull() {
            addCriterion("PRO_TERMINATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProTerminationDateIsNotNull() {
            addCriterion("PRO_TERMINATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProTerminationDateEqualTo(Timestamp value) {
            addCriterion("PRO_TERMINATION_DATE =", value, "proTerminationDate");
            return (Criteria) this;
        }

        public Criteria andProTerminationDateNotEqualTo(Timestamp value) {
            addCriterion("PRO_TERMINATION_DATE <>", value, "proTerminationDate");
            return (Criteria) this;
        }

        public Criteria andProTerminationDateGreaterThan(Timestamp value) {
            addCriterion("PRO_TERMINATION_DATE >", value, "proTerminationDate");
            return (Criteria) this;
        }

        public Criteria andProTerminationDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("PRO_TERMINATION_DATE >=", value, "proTerminationDate");
            return (Criteria) this;
        }

        public Criteria andProTerminationDateLessThan(Timestamp value) {
            addCriterion("PRO_TERMINATION_DATE <", value, "proTerminationDate");
            return (Criteria) this;
        }

        public Criteria andProTerminationDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("PRO_TERMINATION_DATE <=", value, "proTerminationDate");
            return (Criteria) this;
        }

        public Criteria andProTerminationDateIn(List<Timestamp> values) {
            addCriterion("PRO_TERMINATION_DATE in", values, "proTerminationDate");
            return (Criteria) this;
        }

        public Criteria andProTerminationDateNotIn(List<Timestamp> values) {
            addCriterion("PRO_TERMINATION_DATE not in", values, "proTerminationDate");
            return (Criteria) this;
        }

        public Criteria andProTerminationDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PRO_TERMINATION_DATE between", value1, value2, "proTerminationDate");
            return (Criteria) this;
        }

        public Criteria andProTerminationDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PRO_TERMINATION_DATE not between", value1, value2, "proTerminationDate");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagIsNull() {
            addCriterion("TERMINATION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagIsNotNull() {
            addCriterion("TERMINATION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagEqualTo(String value) {
            addCriterion("TERMINATION_FLAG =", value, "terminationFlag");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagNotEqualTo(String value) {
            addCriterion("TERMINATION_FLAG <>", value, "terminationFlag");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagGreaterThan(String value) {
            addCriterion("TERMINATION_FLAG >", value, "terminationFlag");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINATION_FLAG >=", value, "terminationFlag");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagLessThan(String value) {
            addCriterion("TERMINATION_FLAG <", value, "terminationFlag");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagLessThanOrEqualTo(String value) {
            addCriterion("TERMINATION_FLAG <=", value, "terminationFlag");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagLike(String value) {
            addCriterion("TERMINATION_FLAG like", value, "terminationFlag");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagNotLike(String value) {
            addCriterion("TERMINATION_FLAG not like", value, "terminationFlag");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagIn(List<String> values) {
            addCriterion("TERMINATION_FLAG in", values, "terminationFlag");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagNotIn(List<String> values) {
            addCriterion("TERMINATION_FLAG not in", values, "terminationFlag");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagBetween(String value1, String value2) {
            addCriterion("TERMINATION_FLAG between", value1, value2, "terminationFlag");
            return (Criteria) this;
        }

        public Criteria andTerminationFlagNotBetween(String value1, String value2) {
            addCriterion("TERMINATION_FLAG not between", value1, value2, "terminationFlag");
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