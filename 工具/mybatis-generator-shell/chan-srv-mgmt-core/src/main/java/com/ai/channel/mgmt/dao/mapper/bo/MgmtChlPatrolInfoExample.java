package com.ai.channel.mgmt.dao.mapper.bo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MgmtChlPatrolInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgmtChlPatrolInfoExample() {
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

        public Criteria andPatrolIdIsNull() {
            addCriterion("PATROL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatrolIdIsNotNull() {
            addCriterion("PATROL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolIdEqualTo(Long value) {
            addCriterion("PATROL_ID =", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdNotEqualTo(Long value) {
            addCriterion("PATROL_ID <>", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdGreaterThan(Long value) {
            addCriterion("PATROL_ID >", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PATROL_ID >=", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdLessThan(Long value) {
            addCriterion("PATROL_ID <", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdLessThanOrEqualTo(Long value) {
            addCriterion("PATROL_ID <=", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdIn(List<Long> values) {
            addCriterion("PATROL_ID in", values, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdNotIn(List<Long> values) {
            addCriterion("PATROL_ID not in", values, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdBetween(Long value1, Long value2) {
            addCriterion("PATROL_ID between", value1, value2, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdNotBetween(Long value1, Long value2) {
            addCriterion("PATROL_ID not between", value1, value2, "patrolId");
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

        public Criteria andChannelCodeIsNull() {
            addCriterion("CHANNEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("CHANNEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("CHANNEL_CODE =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("CHANNEL_CODE <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("CHANNEL_CODE >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CODE >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("CHANNEL_CODE <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CODE <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("CHANNEL_CODE like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("CHANNEL_CODE not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("CHANNEL_CODE in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("CHANNEL_CODE not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("CHANNEL_CODE between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_CODE not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("CHANNEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("CHANNEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("CHANNEL_NAME =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("CHANNEL_NAME <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("CHANNEL_NAME >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("CHANNEL_NAME <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("CHANNEL_NAME like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("CHANNEL_NAME not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("CHANNEL_NAME in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("CHANNEL_NAME not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelAddressIsNull() {
            addCriterion("CHANNEL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andChannelAddressIsNotNull() {
            addCriterion("CHANNEL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andChannelAddressEqualTo(String value) {
            addCriterion("CHANNEL_ADDRESS =", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressNotEqualTo(String value) {
            addCriterion("CHANNEL_ADDRESS <>", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressGreaterThan(String value) {
            addCriterion("CHANNEL_ADDRESS >", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ADDRESS >=", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressLessThan(String value) {
            addCriterion("CHANNEL_ADDRESS <", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ADDRESS <=", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressLike(String value) {
            addCriterion("CHANNEL_ADDRESS like", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressNotLike(String value) {
            addCriterion("CHANNEL_ADDRESS not like", value, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressIn(List<String> values) {
            addCriterion("CHANNEL_ADDRESS in", values, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressNotIn(List<String> values) {
            addCriterion("CHANNEL_ADDRESS not in", values, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressBetween(String value1, String value2) {
            addCriterion("CHANNEL_ADDRESS between", value1, value2, "channelAddress");
            return (Criteria) this;
        }

        public Criteria andChannelAddressNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_ADDRESS not between", value1, value2, "channelAddress");
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

        public Criteria andPatrolUserAccountIsNull() {
            addCriterion("PATROL_USER_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountIsNotNull() {
            addCriterion("PATROL_USER_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountEqualTo(String value) {
            addCriterion("PATROL_USER_ACCOUNT =", value, "patrolUserAccount");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountNotEqualTo(String value) {
            addCriterion("PATROL_USER_ACCOUNT <>", value, "patrolUserAccount");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountGreaterThan(String value) {
            addCriterion("PATROL_USER_ACCOUNT >", value, "patrolUserAccount");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("PATROL_USER_ACCOUNT >=", value, "patrolUserAccount");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountLessThan(String value) {
            addCriterion("PATROL_USER_ACCOUNT <", value, "patrolUserAccount");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountLessThanOrEqualTo(String value) {
            addCriterion("PATROL_USER_ACCOUNT <=", value, "patrolUserAccount");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountLike(String value) {
            addCriterion("PATROL_USER_ACCOUNT like", value, "patrolUserAccount");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountNotLike(String value) {
            addCriterion("PATROL_USER_ACCOUNT not like", value, "patrolUserAccount");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountIn(List<String> values) {
            addCriterion("PATROL_USER_ACCOUNT in", values, "patrolUserAccount");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountNotIn(List<String> values) {
            addCriterion("PATROL_USER_ACCOUNT not in", values, "patrolUserAccount");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountBetween(String value1, String value2) {
            addCriterion("PATROL_USER_ACCOUNT between", value1, value2, "patrolUserAccount");
            return (Criteria) this;
        }

        public Criteria andPatrolUserAccountNotBetween(String value1, String value2) {
            addCriterion("PATROL_USER_ACCOUNT not between", value1, value2, "patrolUserAccount");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameIsNull() {
            addCriterion("PATROL_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameIsNotNull() {
            addCriterion("PATROL_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameEqualTo(String value) {
            addCriterion("PATROL_USER_NAME =", value, "patrolUserName");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameNotEqualTo(String value) {
            addCriterion("PATROL_USER_NAME <>", value, "patrolUserName");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameGreaterThan(String value) {
            addCriterion("PATROL_USER_NAME >", value, "patrolUserName");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("PATROL_USER_NAME >=", value, "patrolUserName");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameLessThan(String value) {
            addCriterion("PATROL_USER_NAME <", value, "patrolUserName");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameLessThanOrEqualTo(String value) {
            addCriterion("PATROL_USER_NAME <=", value, "patrolUserName");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameLike(String value) {
            addCriterion("PATROL_USER_NAME like", value, "patrolUserName");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameNotLike(String value) {
            addCriterion("PATROL_USER_NAME not like", value, "patrolUserName");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameIn(List<String> values) {
            addCriterion("PATROL_USER_NAME in", values, "patrolUserName");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameNotIn(List<String> values) {
            addCriterion("PATROL_USER_NAME not in", values, "patrolUserName");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameBetween(String value1, String value2) {
            addCriterion("PATROL_USER_NAME between", value1, value2, "patrolUserName");
            return (Criteria) this;
        }

        public Criteria andPatrolUserNameNotBetween(String value1, String value2) {
            addCriterion("PATROL_USER_NAME not between", value1, value2, "patrolUserName");
            return (Criteria) this;
        }

        public Criteria andPatrolStateIsNull() {
            addCriterion("PATROL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPatrolStateIsNotNull() {
            addCriterion("PATROL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolStateEqualTo(String value) {
            addCriterion("PATROL_STATE =", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateNotEqualTo(String value) {
            addCriterion("PATROL_STATE <>", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateGreaterThan(String value) {
            addCriterion("PATROL_STATE >", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateGreaterThanOrEqualTo(String value) {
            addCriterion("PATROL_STATE >=", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateLessThan(String value) {
            addCriterion("PATROL_STATE <", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateLessThanOrEqualTo(String value) {
            addCriterion("PATROL_STATE <=", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateLike(String value) {
            addCriterion("PATROL_STATE like", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateNotLike(String value) {
            addCriterion("PATROL_STATE not like", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateIn(List<String> values) {
            addCriterion("PATROL_STATE in", values, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateNotIn(List<String> values) {
            addCriterion("PATROL_STATE not in", values, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateBetween(String value1, String value2) {
            addCriterion("PATROL_STATE between", value1, value2, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateNotBetween(String value1, String value2) {
            addCriterion("PATROL_STATE not between", value1, value2, "patrolState");
            return (Criteria) this;
        }

        public Criteria andSignInAddressIsNull() {
            addCriterion("SIGN_IN_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andSignInAddressIsNotNull() {
            addCriterion("SIGN_IN_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSignInAddressEqualTo(String value) {
            addCriterion("SIGN_IN_ADDRESS =", value, "signInAddress");
            return (Criteria) this;
        }

        public Criteria andSignInAddressNotEqualTo(String value) {
            addCriterion("SIGN_IN_ADDRESS <>", value, "signInAddress");
            return (Criteria) this;
        }

        public Criteria andSignInAddressGreaterThan(String value) {
            addCriterion("SIGN_IN_ADDRESS >", value, "signInAddress");
            return (Criteria) this;
        }

        public Criteria andSignInAddressGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_IN_ADDRESS >=", value, "signInAddress");
            return (Criteria) this;
        }

        public Criteria andSignInAddressLessThan(String value) {
            addCriterion("SIGN_IN_ADDRESS <", value, "signInAddress");
            return (Criteria) this;
        }

        public Criteria andSignInAddressLessThanOrEqualTo(String value) {
            addCriterion("SIGN_IN_ADDRESS <=", value, "signInAddress");
            return (Criteria) this;
        }

        public Criteria andSignInAddressLike(String value) {
            addCriterion("SIGN_IN_ADDRESS like", value, "signInAddress");
            return (Criteria) this;
        }

        public Criteria andSignInAddressNotLike(String value) {
            addCriterion("SIGN_IN_ADDRESS not like", value, "signInAddress");
            return (Criteria) this;
        }

        public Criteria andSignInAddressIn(List<String> values) {
            addCriterion("SIGN_IN_ADDRESS in", values, "signInAddress");
            return (Criteria) this;
        }

        public Criteria andSignInAddressNotIn(List<String> values) {
            addCriterion("SIGN_IN_ADDRESS not in", values, "signInAddress");
            return (Criteria) this;
        }

        public Criteria andSignInAddressBetween(String value1, String value2) {
            addCriterion("SIGN_IN_ADDRESS between", value1, value2, "signInAddress");
            return (Criteria) this;
        }

        public Criteria andSignInAddressNotBetween(String value1, String value2) {
            addCriterion("SIGN_IN_ADDRESS not between", value1, value2, "signInAddress");
            return (Criteria) this;
        }

        public Criteria andSignInTimeIsNull() {
            addCriterion("SIGN_IN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSignInTimeIsNotNull() {
            addCriterion("SIGN_IN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSignInTimeEqualTo(Timestamp value) {
            addCriterion("SIGN_IN_TIME =", value, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeNotEqualTo(Timestamp value) {
            addCriterion("SIGN_IN_TIME <>", value, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeGreaterThan(Timestamp value) {
            addCriterion("SIGN_IN_TIME >", value, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SIGN_IN_TIME >=", value, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeLessThan(Timestamp value) {
            addCriterion("SIGN_IN_TIME <", value, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("SIGN_IN_TIME <=", value, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeIn(List<Timestamp> values) {
            addCriterion("SIGN_IN_TIME in", values, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeNotIn(List<Timestamp> values) {
            addCriterion("SIGN_IN_TIME not in", values, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SIGN_IN_TIME between", value1, value2, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SIGN_IN_TIME not between", value1, value2, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatIsNull() {
            addCriterion("SIGN_IN_LNGLAT is null");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatIsNotNull() {
            addCriterion("SIGN_IN_LNGLAT is not null");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatEqualTo(String value) {
            addCriterion("SIGN_IN_LNGLAT =", value, "signInLnglat");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatNotEqualTo(String value) {
            addCriterion("SIGN_IN_LNGLAT <>", value, "signInLnglat");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatGreaterThan(String value) {
            addCriterion("SIGN_IN_LNGLAT >", value, "signInLnglat");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_IN_LNGLAT >=", value, "signInLnglat");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatLessThan(String value) {
            addCriterion("SIGN_IN_LNGLAT <", value, "signInLnglat");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatLessThanOrEqualTo(String value) {
            addCriterion("SIGN_IN_LNGLAT <=", value, "signInLnglat");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatLike(String value) {
            addCriterion("SIGN_IN_LNGLAT like", value, "signInLnglat");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatNotLike(String value) {
            addCriterion("SIGN_IN_LNGLAT not like", value, "signInLnglat");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatIn(List<String> values) {
            addCriterion("SIGN_IN_LNGLAT in", values, "signInLnglat");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatNotIn(List<String> values) {
            addCriterion("SIGN_IN_LNGLAT not in", values, "signInLnglat");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatBetween(String value1, String value2) {
            addCriterion("SIGN_IN_LNGLAT between", value1, value2, "signInLnglat");
            return (Criteria) this;
        }

        public Criteria andSignInLnglatNotBetween(String value1, String value2) {
            addCriterion("SIGN_IN_LNGLAT not between", value1, value2, "signInLnglat");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressIsNull() {
            addCriterion("SIGN_OUT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressIsNotNull() {
            addCriterion("SIGN_OUT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressEqualTo(String value) {
            addCriterion("SIGN_OUT_ADDRESS =", value, "signOutAddress");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressNotEqualTo(String value) {
            addCriterion("SIGN_OUT_ADDRESS <>", value, "signOutAddress");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressGreaterThan(String value) {
            addCriterion("SIGN_OUT_ADDRESS >", value, "signOutAddress");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_OUT_ADDRESS >=", value, "signOutAddress");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressLessThan(String value) {
            addCriterion("SIGN_OUT_ADDRESS <", value, "signOutAddress");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressLessThanOrEqualTo(String value) {
            addCriterion("SIGN_OUT_ADDRESS <=", value, "signOutAddress");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressLike(String value) {
            addCriterion("SIGN_OUT_ADDRESS like", value, "signOutAddress");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressNotLike(String value) {
            addCriterion("SIGN_OUT_ADDRESS not like", value, "signOutAddress");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressIn(List<String> values) {
            addCriterion("SIGN_OUT_ADDRESS in", values, "signOutAddress");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressNotIn(List<String> values) {
            addCriterion("SIGN_OUT_ADDRESS not in", values, "signOutAddress");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressBetween(String value1, String value2) {
            addCriterion("SIGN_OUT_ADDRESS between", value1, value2, "signOutAddress");
            return (Criteria) this;
        }

        public Criteria andSignOutAddressNotBetween(String value1, String value2) {
            addCriterion("SIGN_OUT_ADDRESS not between", value1, value2, "signOutAddress");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeIsNull() {
            addCriterion("SIGN_OUT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeIsNotNull() {
            addCriterion("SIGN_OUT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeEqualTo(Timestamp value) {
            addCriterion("SIGN_OUT_TIME =", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeNotEqualTo(Timestamp value) {
            addCriterion("SIGN_OUT_TIME <>", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeGreaterThan(Timestamp value) {
            addCriterion("SIGN_OUT_TIME >", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("SIGN_OUT_TIME >=", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeLessThan(Timestamp value) {
            addCriterion("SIGN_OUT_TIME <", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("SIGN_OUT_TIME <=", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeIn(List<Timestamp> values) {
            addCriterion("SIGN_OUT_TIME in", values, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeNotIn(List<Timestamp> values) {
            addCriterion("SIGN_OUT_TIME not in", values, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SIGN_OUT_TIME between", value1, value2, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("SIGN_OUT_TIME not between", value1, value2, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatIsNull() {
            addCriterion("SIGN_OUT_LNGLAT is null");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatIsNotNull() {
            addCriterion("SIGN_OUT_LNGLAT is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatEqualTo(String value) {
            addCriterion("SIGN_OUT_LNGLAT =", value, "signOutLnglat");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatNotEqualTo(String value) {
            addCriterion("SIGN_OUT_LNGLAT <>", value, "signOutLnglat");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatGreaterThan(String value) {
            addCriterion("SIGN_OUT_LNGLAT >", value, "signOutLnglat");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_OUT_LNGLAT >=", value, "signOutLnglat");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatLessThan(String value) {
            addCriterion("SIGN_OUT_LNGLAT <", value, "signOutLnglat");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatLessThanOrEqualTo(String value) {
            addCriterion("SIGN_OUT_LNGLAT <=", value, "signOutLnglat");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatLike(String value) {
            addCriterion("SIGN_OUT_LNGLAT like", value, "signOutLnglat");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatNotLike(String value) {
            addCriterion("SIGN_OUT_LNGLAT not like", value, "signOutLnglat");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatIn(List<String> values) {
            addCriterion("SIGN_OUT_LNGLAT in", values, "signOutLnglat");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatNotIn(List<String> values) {
            addCriterion("SIGN_OUT_LNGLAT not in", values, "signOutLnglat");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatBetween(String value1, String value2) {
            addCriterion("SIGN_OUT_LNGLAT between", value1, value2, "signOutLnglat");
            return (Criteria) this;
        }

        public Criteria andSignOutLnglatNotBetween(String value1, String value2) {
            addCriterion("SIGN_OUT_LNGLAT not between", value1, value2, "signOutLnglat");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Timestamp value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Timestamp value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Timestamp value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Timestamp value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Timestamp> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Timestamp> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Timestamp value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Timestamp value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Timestamp value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Timestamp value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Timestamp> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Timestamp> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkIsNull() {
            addCriterion("PATROL_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkIsNotNull() {
            addCriterion("PATROL_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkEqualTo(String value) {
            addCriterion("PATROL_REMARK =", value, "patrolRemark");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkNotEqualTo(String value) {
            addCriterion("PATROL_REMARK <>", value, "patrolRemark");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkGreaterThan(String value) {
            addCriterion("PATROL_REMARK >", value, "patrolRemark");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PATROL_REMARK >=", value, "patrolRemark");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkLessThan(String value) {
            addCriterion("PATROL_REMARK <", value, "patrolRemark");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkLessThanOrEqualTo(String value) {
            addCriterion("PATROL_REMARK <=", value, "patrolRemark");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkLike(String value) {
            addCriterion("PATROL_REMARK like", value, "patrolRemark");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkNotLike(String value) {
            addCriterion("PATROL_REMARK not like", value, "patrolRemark");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkIn(List<String> values) {
            addCriterion("PATROL_REMARK in", values, "patrolRemark");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkNotIn(List<String> values) {
            addCriterion("PATROL_REMARK not in", values, "patrolRemark");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkBetween(String value1, String value2) {
            addCriterion("PATROL_REMARK between", value1, value2, "patrolRemark");
            return (Criteria) this;
        }

        public Criteria andPatrolRemarkNotBetween(String value1, String value2) {
            addCriterion("PATROL_REMARK not between", value1, value2, "patrolRemark");
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

        public Criteria andChannelManagerIdIsNull() {
            addCriterion("CHANNEL_MANAGER_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdIsNotNull() {
            addCriterion("CHANNEL_MANAGER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER_ID =", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdNotEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER_ID <>", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdGreaterThan(String value) {
            addCriterion("CHANNEL_MANAGER_ID >", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER_ID >=", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdLessThan(String value) {
            addCriterion("CHANNEL_MANAGER_ID <", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER_ID <=", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdLike(String value) {
            addCriterion("CHANNEL_MANAGER_ID like", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdNotLike(String value) {
            addCriterion("CHANNEL_MANAGER_ID not like", value, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdIn(List<String> values) {
            addCriterion("CHANNEL_MANAGER_ID in", values, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdNotIn(List<String> values) {
            addCriterion("CHANNEL_MANAGER_ID not in", values, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_MANAGER_ID between", value1, value2, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_MANAGER_ID not between", value1, value2, "channelManagerId");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameIsNull() {
            addCriterion("CHANNEL_MANAGER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameIsNotNull() {
            addCriterion("CHANNEL_MANAGER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER_NAME =", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameNotEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER_NAME <>", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameGreaterThan(String value) {
            addCriterion("CHANNEL_MANAGER_NAME >", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER_NAME >=", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameLessThan(String value) {
            addCriterion("CHANNEL_MANAGER_NAME <", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER_NAME <=", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameLike(String value) {
            addCriterion("CHANNEL_MANAGER_NAME like", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameNotLike(String value) {
            addCriterion("CHANNEL_MANAGER_NAME not like", value, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameIn(List<String> values) {
            addCriterion("CHANNEL_MANAGER_NAME in", values, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameNotIn(List<String> values) {
            addCriterion("CHANNEL_MANAGER_NAME not in", values, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameBetween(String value1, String value2) {
            addCriterion("CHANNEL_MANAGER_NAME between", value1, value2, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNameNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_MANAGER_NAME not between", value1, value2, "channelManagerName");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneIsNull() {
            addCriterion("CHANNEL_MANAGER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneIsNotNull() {
            addCriterion("CHANNEL_MANAGER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER_PHONE =", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneNotEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER_PHONE <>", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneGreaterThan(String value) {
            addCriterion("CHANNEL_MANAGER_PHONE >", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER_PHONE >=", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneLessThan(String value) {
            addCriterion("CHANNEL_MANAGER_PHONE <", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER_PHONE <=", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneLike(String value) {
            addCriterion("CHANNEL_MANAGER_PHONE like", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneNotLike(String value) {
            addCriterion("CHANNEL_MANAGER_PHONE not like", value, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneIn(List<String> values) {
            addCriterion("CHANNEL_MANAGER_PHONE in", values, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneNotIn(List<String> values) {
            addCriterion("CHANNEL_MANAGER_PHONE not in", values, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneBetween(String value1, String value2) {
            addCriterion("CHANNEL_MANAGER_PHONE between", value1, value2, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChannelManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_MANAGER_PHONE not between", value1, value2, "channelManagerPhone");
            return (Criteria) this;
        }

        public Criteria andChlLongitudeIsNull() {
            addCriterion("CHL_LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andChlLongitudeIsNotNull() {
            addCriterion("CHL_LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andChlLongitudeEqualTo(BigDecimal value) {
            addCriterion("CHL_LONGITUDE =", value, "chlLongitude");
            return (Criteria) this;
        }

        public Criteria andChlLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("CHL_LONGITUDE <>", value, "chlLongitude");
            return (Criteria) this;
        }

        public Criteria andChlLongitudeGreaterThan(BigDecimal value) {
            addCriterion("CHL_LONGITUDE >", value, "chlLongitude");
            return (Criteria) this;
        }

        public Criteria andChlLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHL_LONGITUDE >=", value, "chlLongitude");
            return (Criteria) this;
        }

        public Criteria andChlLongitudeLessThan(BigDecimal value) {
            addCriterion("CHL_LONGITUDE <", value, "chlLongitude");
            return (Criteria) this;
        }

        public Criteria andChlLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHL_LONGITUDE <=", value, "chlLongitude");
            return (Criteria) this;
        }

        public Criteria andChlLongitudeIn(List<BigDecimal> values) {
            addCriterion("CHL_LONGITUDE in", values, "chlLongitude");
            return (Criteria) this;
        }

        public Criteria andChlLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("CHL_LONGITUDE not in", values, "chlLongitude");
            return (Criteria) this;
        }

        public Criteria andChlLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHL_LONGITUDE between", value1, value2, "chlLongitude");
            return (Criteria) this;
        }

        public Criteria andChlLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHL_LONGITUDE not between", value1, value2, "chlLongitude");
            return (Criteria) this;
        }

        public Criteria andChlLatitudeIsNull() {
            addCriterion("CHL_LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andChlLatitudeIsNotNull() {
            addCriterion("CHL_LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andChlLatitudeEqualTo(BigDecimal value) {
            addCriterion("CHL_LATITUDE =", value, "chlLatitude");
            return (Criteria) this;
        }

        public Criteria andChlLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("CHL_LATITUDE <>", value, "chlLatitude");
            return (Criteria) this;
        }

        public Criteria andChlLatitudeGreaterThan(BigDecimal value) {
            addCriterion("CHL_LATITUDE >", value, "chlLatitude");
            return (Criteria) this;
        }

        public Criteria andChlLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHL_LATITUDE >=", value, "chlLatitude");
            return (Criteria) this;
        }

        public Criteria andChlLatitudeLessThan(BigDecimal value) {
            addCriterion("CHL_LATITUDE <", value, "chlLatitude");
            return (Criteria) this;
        }

        public Criteria andChlLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHL_LATITUDE <=", value, "chlLatitude");
            return (Criteria) this;
        }

        public Criteria andChlLatitudeIn(List<BigDecimal> values) {
            addCriterion("CHL_LATITUDE in", values, "chlLatitude");
            return (Criteria) this;
        }

        public Criteria andChlLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("CHL_LATITUDE not in", values, "chlLatitude");
            return (Criteria) this;
        }

        public Criteria andChlLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHL_LATITUDE between", value1, value2, "chlLatitude");
            return (Criteria) this;
        }

        public Criteria andChlLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHL_LATITUDE not between", value1, value2, "chlLatitude");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNull() {
            addCriterion("WORK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNotNull() {
            addCriterion("WORK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeEqualTo(String value) {
            addCriterion("WORK_TYPE =", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotEqualTo(String value) {
            addCriterion("WORK_TYPE <>", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThan(String value) {
            addCriterion("WORK_TYPE >", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_TYPE >=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThan(String value) {
            addCriterion("WORK_TYPE <", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThanOrEqualTo(String value) {
            addCriterion("WORK_TYPE <=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLike(String value) {
            addCriterion("WORK_TYPE like", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotLike(String value) {
            addCriterion("WORK_TYPE not like", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIn(List<String> values) {
            addCriterion("WORK_TYPE in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotIn(List<String> values) {
            addCriterion("WORK_TYPE not in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeBetween(String value1, String value2) {
            addCriterion("WORK_TYPE between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotBetween(String value1, String value2) {
            addCriterion("WORK_TYPE not between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andSignInErrorIsNull() {
            addCriterion("SIGN_IN_ERROR is null");
            return (Criteria) this;
        }

        public Criteria andSignInErrorIsNotNull() {
            addCriterion("SIGN_IN_ERROR is not null");
            return (Criteria) this;
        }

        public Criteria andSignInErrorEqualTo(String value) {
            addCriterion("SIGN_IN_ERROR =", value, "signInError");
            return (Criteria) this;
        }

        public Criteria andSignInErrorNotEqualTo(String value) {
            addCriterion("SIGN_IN_ERROR <>", value, "signInError");
            return (Criteria) this;
        }

        public Criteria andSignInErrorGreaterThan(String value) {
            addCriterion("SIGN_IN_ERROR >", value, "signInError");
            return (Criteria) this;
        }

        public Criteria andSignInErrorGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_IN_ERROR >=", value, "signInError");
            return (Criteria) this;
        }

        public Criteria andSignInErrorLessThan(String value) {
            addCriterion("SIGN_IN_ERROR <", value, "signInError");
            return (Criteria) this;
        }

        public Criteria andSignInErrorLessThanOrEqualTo(String value) {
            addCriterion("SIGN_IN_ERROR <=", value, "signInError");
            return (Criteria) this;
        }

        public Criteria andSignInErrorLike(String value) {
            addCriterion("SIGN_IN_ERROR like", value, "signInError");
            return (Criteria) this;
        }

        public Criteria andSignInErrorNotLike(String value) {
            addCriterion("SIGN_IN_ERROR not like", value, "signInError");
            return (Criteria) this;
        }

        public Criteria andSignInErrorIn(List<String> values) {
            addCriterion("SIGN_IN_ERROR in", values, "signInError");
            return (Criteria) this;
        }

        public Criteria andSignInErrorNotIn(List<String> values) {
            addCriterion("SIGN_IN_ERROR not in", values, "signInError");
            return (Criteria) this;
        }

        public Criteria andSignInErrorBetween(String value1, String value2) {
            addCriterion("SIGN_IN_ERROR between", value1, value2, "signInError");
            return (Criteria) this;
        }

        public Criteria andSignInErrorNotBetween(String value1, String value2) {
            addCriterion("SIGN_IN_ERROR not between", value1, value2, "signInError");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorIsNull() {
            addCriterion("SIGN_OUT_ERROR is null");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorIsNotNull() {
            addCriterion("SIGN_OUT_ERROR is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorEqualTo(String value) {
            addCriterion("SIGN_OUT_ERROR =", value, "signOutError");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorNotEqualTo(String value) {
            addCriterion("SIGN_OUT_ERROR <>", value, "signOutError");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorGreaterThan(String value) {
            addCriterion("SIGN_OUT_ERROR >", value, "signOutError");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_OUT_ERROR >=", value, "signOutError");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorLessThan(String value) {
            addCriterion("SIGN_OUT_ERROR <", value, "signOutError");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorLessThanOrEqualTo(String value) {
            addCriterion("SIGN_OUT_ERROR <=", value, "signOutError");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorLike(String value) {
            addCriterion("SIGN_OUT_ERROR like", value, "signOutError");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorNotLike(String value) {
            addCriterion("SIGN_OUT_ERROR not like", value, "signOutError");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorIn(List<String> values) {
            addCriterion("SIGN_OUT_ERROR in", values, "signOutError");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorNotIn(List<String> values) {
            addCriterion("SIGN_OUT_ERROR not in", values, "signOutError");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorBetween(String value1, String value2) {
            addCriterion("SIGN_OUT_ERROR between", value1, value2, "signOutError");
            return (Criteria) this;
        }

        public Criteria andSignOutErrorNotBetween(String value1, String value2) {
            addCriterion("SIGN_OUT_ERROR not between", value1, value2, "signOutError");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoIsNull() {
            addCriterion("INITIATOR_NO is null");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoIsNotNull() {
            addCriterion("INITIATOR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoEqualTo(String value) {
            addCriterion("INITIATOR_NO =", value, "initiatorNo");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoNotEqualTo(String value) {
            addCriterion("INITIATOR_NO <>", value, "initiatorNo");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoGreaterThan(String value) {
            addCriterion("INITIATOR_NO >", value, "initiatorNo");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoGreaterThanOrEqualTo(String value) {
            addCriterion("INITIATOR_NO >=", value, "initiatorNo");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoLessThan(String value) {
            addCriterion("INITIATOR_NO <", value, "initiatorNo");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoLessThanOrEqualTo(String value) {
            addCriterion("INITIATOR_NO <=", value, "initiatorNo");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoLike(String value) {
            addCriterion("INITIATOR_NO like", value, "initiatorNo");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoNotLike(String value) {
            addCriterion("INITIATOR_NO not like", value, "initiatorNo");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoIn(List<String> values) {
            addCriterion("INITIATOR_NO in", values, "initiatorNo");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoNotIn(List<String> values) {
            addCriterion("INITIATOR_NO not in", values, "initiatorNo");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoBetween(String value1, String value2) {
            addCriterion("INITIATOR_NO between", value1, value2, "initiatorNo");
            return (Criteria) this;
        }

        public Criteria andInitiatorNoNotBetween(String value1, String value2) {
            addCriterion("INITIATOR_NO not between", value1, value2, "initiatorNo");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameIsNull() {
            addCriterion("INITIATOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameIsNotNull() {
            addCriterion("INITIATOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameEqualTo(String value) {
            addCriterion("INITIATOR_NAME =", value, "initiatorName");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameNotEqualTo(String value) {
            addCriterion("INITIATOR_NAME <>", value, "initiatorName");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameGreaterThan(String value) {
            addCriterion("INITIATOR_NAME >", value, "initiatorName");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("INITIATOR_NAME >=", value, "initiatorName");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameLessThan(String value) {
            addCriterion("INITIATOR_NAME <", value, "initiatorName");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameLessThanOrEqualTo(String value) {
            addCriterion("INITIATOR_NAME <=", value, "initiatorName");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameLike(String value) {
            addCriterion("INITIATOR_NAME like", value, "initiatorName");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameNotLike(String value) {
            addCriterion("INITIATOR_NAME not like", value, "initiatorName");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameIn(List<String> values) {
            addCriterion("INITIATOR_NAME in", values, "initiatorName");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameNotIn(List<String> values) {
            addCriterion("INITIATOR_NAME not in", values, "initiatorName");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameBetween(String value1, String value2) {
            addCriterion("INITIATOR_NAME between", value1, value2, "initiatorName");
            return (Criteria) this;
        }

        public Criteria andInitiatorNameNotBetween(String value1, String value2) {
            addCriterion("INITIATOR_NAME not between", value1, value2, "initiatorName");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNull() {
            addCriterion("WORK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNotNull() {
            addCriterion("WORK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNameEqualTo(String value) {
            addCriterion("WORK_NAME =", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotEqualTo(String value) {
            addCriterion("WORK_NAME <>", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThan(String value) {
            addCriterion("WORK_NAME >", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_NAME >=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThan(String value) {
            addCriterion("WORK_NAME <", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThanOrEqualTo(String value) {
            addCriterion("WORK_NAME <=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLike(String value) {
            addCriterion("WORK_NAME like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotLike(String value) {
            addCriterion("WORK_NAME not like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameIn(List<String> values) {
            addCriterion("WORK_NAME in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotIn(List<String> values) {
            addCriterion("WORK_NAME not in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameBetween(String value1, String value2) {
            addCriterion("WORK_NAME between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotBetween(String value1, String value2) {
            addCriterion("WORK_NAME not between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIsNull() {
            addCriterion("PLAN_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIsNotNull() {
            addCriterion("PLAN_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeEqualTo(Timestamp value) {
            addCriterion("PLAN_START_TIME =", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotEqualTo(Timestamp value) {
            addCriterion("PLAN_START_TIME <>", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeGreaterThan(Timestamp value) {
            addCriterion("PLAN_START_TIME >", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("PLAN_START_TIME >=", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLessThan(Timestamp value) {
            addCriterion("PLAN_START_TIME <", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("PLAN_START_TIME <=", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIn(List<Timestamp> values) {
            addCriterion("PLAN_START_TIME in", values, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotIn(List<Timestamp> values) {
            addCriterion("PLAN_START_TIME not in", values, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PLAN_START_TIME between", value1, value2, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PLAN_START_TIME not between", value1, value2, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeIsNull() {
            addCriterion("PLAN_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeIsNotNull() {
            addCriterion("PLAN_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeEqualTo(Timestamp value) {
            addCriterion("PLAN_END_TIME =", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotEqualTo(Timestamp value) {
            addCriterion("PLAN_END_TIME <>", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeGreaterThan(Timestamp value) {
            addCriterion("PLAN_END_TIME >", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("PLAN_END_TIME >=", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeLessThan(Timestamp value) {
            addCriterion("PLAN_END_TIME <", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("PLAN_END_TIME <=", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeIn(List<Timestamp> values) {
            addCriterion("PLAN_END_TIME in", values, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotIn(List<Timestamp> values) {
            addCriterion("PLAN_END_TIME not in", values, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PLAN_END_TIME between", value1, value2, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PLAN_END_TIME not between", value1, value2, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andMissionTypeIsNull() {
            addCriterion("MISSION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMissionTypeIsNotNull() {
            addCriterion("MISSION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMissionTypeEqualTo(String value) {
            addCriterion("MISSION_TYPE =", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeNotEqualTo(String value) {
            addCriterion("MISSION_TYPE <>", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeGreaterThan(String value) {
            addCriterion("MISSION_TYPE >", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MISSION_TYPE >=", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeLessThan(String value) {
            addCriterion("MISSION_TYPE <", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeLessThanOrEqualTo(String value) {
            addCriterion("MISSION_TYPE <=", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeLike(String value) {
            addCriterion("MISSION_TYPE like", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeNotLike(String value) {
            addCriterion("MISSION_TYPE not like", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeIn(List<String> values) {
            addCriterion("MISSION_TYPE in", values, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeNotIn(List<String> values) {
            addCriterion("MISSION_TYPE not in", values, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeBetween(String value1, String value2) {
            addCriterion("MISSION_TYPE between", value1, value2, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeNotBetween(String value1, String value2) {
            addCriterion("MISSION_TYPE not between", value1, value2, "missionType");
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