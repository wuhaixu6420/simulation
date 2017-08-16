package com.wox.simulation.entity.group;

import java.util.ArrayList;
import java.util.List;

public class CombinationDetailsExample {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CombinationDetailsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }
        
        public Criteria andCombinationNameIsNull() {
            addCriterion("combination_name is null");
            return (Criteria) this;
        }

        public Criteria andCombinationNameIsNotNull() {
            addCriterion("combination_name is not null");
            return (Criteria) this;
        }

        public Criteria andCombinationNameEqualTo(String value) {
            addCriterion("combination_name =", value, "combination_name");
            return (Criteria) this;
        }

        public Criteria andCombinationNameNotEqualTo(String value) {
            addCriterion("combination_name <>", value, "combination_name");
            return (Criteria) this;
        }

        public Criteria andCombinationNameGreaterThan(String value) {
            addCriterion("combination_name >", value, "combination_name");
            return (Criteria) this;
        }

        public Criteria andCombinationNameGreaterThanOrEqualTo(String value) {
            addCriterion("combination_name >=", value, "combination_name");
            return (Criteria) this;
        }

        public Criteria andCombinationNameLessThan(String value) {
            addCriterion("combination_name <", value, "combination_name");
            return (Criteria) this;
        }

        public Criteria andCombinationNameLessThanOrEqualTo(String value) {
            addCriterion("combination_name <=", value, "combination_name");
            return (Criteria) this;
        }

        public Criteria andCombinationNameIn(List<String> values) {
            addCriterion("combination_name in", values, "combination_name");
            return (Criteria) this;
        }

        public Criteria andCombinationNameNotIn(List<String> values) {
            addCriterion("combination_name not in", values, "combination_name");
            return (Criteria) this;
        }

        public Criteria andCombinationNameBetween(String value1, String value2) {
            addCriterion("combination_name between", value1, value2, "combination_name");
            return (Criteria) this;
        }

        public Criteria andCombinationNameNotBetween(String value1, String value2) {
            addCriterion("combination_name not between", value1, value2, "combination_name");
            return (Criteria) this;
        }
        
        public Criteria andCombinationSynopsisIsNull() {
            addCriterion("combination_synopsis is null");
            return (Criteria) this;
        }

        public Criteria andCombinationSynopsisIsNotNull() {
            addCriterion("combination_synopsis is not null");
            return (Criteria) this;
        }

        public Criteria andCombinationSynopsisEqualTo(String value) {
            addCriterion("combination_synopsis =", value, "combination_synopsis");
            return (Criteria) this;
        }

        public Criteria andCombinationSynopsisNotEqualTo(String value) {
            addCriterion("combination_synopsis <>", value, "combination_synopsis");
            return (Criteria) this;
        }

        public Criteria andCombinationSynopsisGreaterThan(String value) {
            addCriterion("combination_synopsis >", value, "combination_synopsis");
            return (Criteria) this;
        }

        public Criteria andCombinationSynopsisGreaterThanOrEqualTo(String value) {
            addCriterion("combination_synopsis >=", value, "combination_synopsis");
            return (Criteria) this;
        }

        public Criteria andCombinationSynopsisLessThan(String value) {
            addCriterion("combination_synopsis <", value, "combination_synopsis");
            return (Criteria) this;
        }

        public Criteria andCombinationSynopsisLessThanOrEqualTo(String value) {
            addCriterion("combination_synopsis <=", value, "combination_synopsis");
            return (Criteria) this;
        }

        public Criteria andCombinationSynopsisIn(List<String> values) {
            addCriterion("combination_synopsis in", values, "combination_synopsis");
            return (Criteria) this;
        }

        public Criteria andCombinationSynopsisNotIn(List<String> values) {
            addCriterion("combination_synopsis not in", values, "combination_synopsis");
            return (Criteria) this;
        }

        public Criteria andCombinationSynopsisBetween(String value1, String value2) {
            addCriterion("combination_synopsis between", value1, value2, "combination_synopsis");
            return (Criteria) this;
        }

        public Criteria andCombinationSynopsisNotBetween(String value1, String value2) {
            addCriterion("combination_synopsis not between", value1, value2, "combination_synopsis");
            return (Criteria) this;
        }
        
        public Criteria andCombinationBalanceIsNull() {
            addCriterion("combination_balance is null");
            return (Criteria) this;
        }

        public Criteria andCombinationBalanceIsNotNull() {
            addCriterion("combination_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCombinationBalanceEqualTo(String value) {
            addCriterion("combination_balance =", value, "combination_balance");
            return (Criteria) this;
        }

        public Criteria andCombinationBalanceNotEqualTo(String value) {
            addCriterion("combination_balance <>", value, "combination_balance");
            return (Criteria) this;
        }

        public Criteria andCombinationBalanceGreaterThan(String value) {
            addCriterion("combination_balance >", value, "combination_balance");
            return (Criteria) this;
        }

        public Criteria andCombinationBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("combination_balance >=", value, "combination_balance");
            return (Criteria) this;
        }

        public Criteria andCombinationBalanceLessThan(String value) {
            addCriterion("combination_balance <", value, "combination_balance");
            return (Criteria) this;
        }

        public Criteria andCombinationBalanceLessThanOrEqualTo(String value) {
            addCriterion("combination_balance <=", value, "combination_balance");
            return (Criteria) this;
        }

        public Criteria andCombinationBalanceIn(List<String> values) {
            addCriterion("combination_balance in", values, "combination_balance");
            return (Criteria) this;
        }

        public Criteria andCombinationBalanceNotIn(List<String> values) {
            addCriterion("combination_balance not in", values, "combination_balance");
            return (Criteria) this;
        }

        public Criteria andCombinationBalanceBetween(String value1, String value2) {
            addCriterion("combination_balance between", value1, value2, "combination_balance");
            return (Criteria) this;
        }

        public Criteria andCombinationBalanceNotBetween(String value1, String value2) {
            addCriterion("combination_balance not between", value1, value2, "combination_balance");
            return (Criteria) this;
        }
        
        public Criteria andTotalProfitIsNull() {
            addCriterion("total_profit is null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIsNotNull() {
            addCriterion("total_profit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitEqualTo(String value) {
            addCriterion("total_profit =", value, "total_profit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotEqualTo(String value) {
            addCriterion("total_profit <>", value, "total_profit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThan(String value) {
            addCriterion("total_profit >", value, "total_profit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThanOrEqualTo(String value) {
            addCriterion("total_profit >=", value, "total_profit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThan(String value) {
            addCriterion("total_profit <", value, "total_profit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThanOrEqualTo(String value) {
            addCriterion("total_profit <=", value, "total_profit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIn(List<String> values) {
            addCriterion("total_profit in", values, "total_profit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotIn(List<String> values) {
            addCriterion("total_profit not in", values, "total_profit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBetween(String value1, String value2) {
            addCriterion("total_profit between", value1, value2, "total_profit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotBetween(String value1, String value2) {
            addCriterion("total_profit not between", value1, value2, "total_profit");
            return (Criteria) this;
        }
        
        public Criteria andMonthProfitIsNull() {
            addCriterion("month_profit is null");
            return (Criteria) this;
        }

        public Criteria andMonthProfitIsNotNull() {
            addCriterion("month_profit is not null");
            return (Criteria) this;
        }

        public Criteria andMonthProfitEqualTo(String value) {
            addCriterion("month_profit =", value, "month_profit");
            return (Criteria) this;
        }

        public Criteria andMonthProfitNotEqualTo(String value) {
            addCriterion("month_profit <>", value, "month_profit");
            return (Criteria) this;
        }

        public Criteria andMonthProfitGreaterThan(String value) {
            addCriterion("month_profit >", value, "month_profit");
            return (Criteria) this;
        }

        public Criteria andMonthProfitGreaterThanOrEqualTo(String value) {
            addCriterion("month_profit >=", value, "month_profit");
            return (Criteria) this;
        }

        public Criteria andMonthProfitLessThan(String value) {
            addCriterion("month_profit <", value, "month_profit");
            return (Criteria) this;
        }

        public Criteria andMonthProfitLessThanOrEqualTo(String value) {
            addCriterion("month_profit <=", value, "month_profit");
            return (Criteria) this;
        }

        public Criteria andMonthProfitIn(List<String> values) {
            addCriterion("month_profit in", values, "month_profit");
            return (Criteria) this;
        }

        public Criteria andMonthProfitNotIn(List<String> values) {
            addCriterion("month_profit not in", values, "month_profit");
            return (Criteria) this;
        }

        public Criteria andMonthProfitBetween(String value1, String value2) {
            addCriterion("month_profit between", value1, value2, "month_profit");
            return (Criteria) this;
        }

        public Criteria andMonthProfitNotBetween(String value1, String value2) {
            addCriterion("month_profit not between", value1, value2, "month_profit");
            return (Criteria) this;
        }
        
        public Criteria andWeekProfitIsNull() {
            addCriterion("week_profit is null");
            return (Criteria) this;
        }

        public Criteria andWeekProfitIsNotNull() {
            addCriterion("week_profit is not null");
            return (Criteria) this;
        }

        public Criteria andWeekProfitEqualTo(String value) {
            addCriterion("week_profit =", value, "week_profit");
            return (Criteria) this;
        }

        public Criteria andWeekProfitNotEqualTo(String value) {
            addCriterion("week_profit <>", value, "week_profit");
            return (Criteria) this;
        }

        public Criteria andWeekProfitGreaterThan(String value) {
            addCriterion("week_profit >", value, "week_profit");
            return (Criteria) this;
        }

        public Criteria andWeekProfitGreaterThanOrEqualTo(String value) {
            addCriterion("week_profit >=", value, "week_profit");
            return (Criteria) this;
        }

        public Criteria andWeekProfitLessThan(String value) {
            addCriterion("week_profit <", value, "week_profit");
            return (Criteria) this;
        }

        public Criteria andWeekProfitLessThanOrEqualTo(String value) {
            addCriterion("week_profit <=", value, "week_profit");
            return (Criteria) this;
        }

        public Criteria andWeekProfitIn(List<String> values) {
            addCriterion("week_profit in", values, "week_profit");
            return (Criteria) this;
        }

        public Criteria andWeekProfitNotIn(List<String> values) {
            addCriterion("week_profit not in", values, "week_profit");
            return (Criteria) this;
        }

        public Criteria andWeekProfitBetween(String value1, String value2) {
            addCriterion("week_profit between", value1, value2, "week_profit");
            return (Criteria) this;
        }

        public Criteria andWeekProfitNotBetween(String value1, String value2) {
            addCriterion("week_profit not between", value1, value2, "week_profit");
            return (Criteria) this;
        }
        
        public Criteria andTodayProfitIsNull() {
            addCriterion("today_profit is null");
            return (Criteria) this;
        }

        public Criteria andTodayProfitIsNotNull() {
            addCriterion("today_profit is not null");
            return (Criteria) this;
        }

        public Criteria andTodayProfitEqualTo(String value) {
            addCriterion("today_profit =", value, "today_profit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitNotEqualTo(String value) {
            addCriterion("today_profit <>", value, "today_profit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitGreaterThan(String value) {
            addCriterion("today_profit >", value, "today_profit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitGreaterThanOrEqualTo(String value) {
            addCriterion("today_profit >=", value, "today_profit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitLessThan(String value) {
            addCriterion("today_profit <", value, "today_profit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitLessThanOrEqualTo(String value) {
            addCriterion("today_profit <=", value, "today_profit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitIn(List<String> values) {
            addCriterion("today_profit in", values, "today_profit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitNotIn(List<String> values) {
            addCriterion("today_profit not in", values, "today_profit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitBetween(String value1, String value2) {
            addCriterion("today_profit between", value1, value2, "today_profit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitNotBetween(String value1, String value2) {
            addCriterion("today_profit not between", value1, value2, "today_profit");
            return (Criteria) this;
        }
        
        public Criteria andTotalMarketValueIsNull() {
            addCriterion("total_market_value is null");
            return (Criteria) this;
        }

        public Criteria andTotalMarketValueIsNotNull() {
            addCriterion("total_market_value is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMarketValueEqualTo(String value) {
            addCriterion("total_market_value =", value, "total_market_value");
            return (Criteria) this;
        }

        public Criteria andTotalMarketValueNotEqualTo(String value) {
            addCriterion("total_market_value <>", value, "total_market_value");
            return (Criteria) this;
        }

        public Criteria andTotalMarketValueGreaterThan(String value) {
            addCriterion("total_market_value >", value, "total_market_value");
            return (Criteria) this;
        }

        public Criteria andTotalMarketValueGreaterThanOrEqualTo(String value) {
            addCriterion("total_market_value >=", value, "total_market_value");
            return (Criteria) this;
        }

        public Criteria andTotalMarketValueLessThan(String value) {
            addCriterion("total_market_value <", value, "total_market_value");
            return (Criteria) this;
        }

        public Criteria andTotalMarketValueLessThanOrEqualTo(String value) {
            addCriterion("total_market_value <=", value, "total_market_value");
            return (Criteria) this;
        }

        public Criteria andTotalMarketValueIn(List<String> values) {
            addCriterion("total_market_value in", values, "total_market_value");
            return (Criteria) this;
        }

        public Criteria andTotalMarketValueNotIn(List<String> values) {
            addCriterion("total_market_value not in", values, "total_market_value");
            return (Criteria) this;
        }

        public Criteria andTotalMarketValueBetween(String value1, String value2) {
            addCriterion("total_market_value between", value1, value2, "total_market_value");
            return (Criteria) this;
        }

        public Criteria andTotalMarketValueNotBetween(String value1, String value2) {
            addCriterion("total_market_value not between", value1, value2, "total_market_value");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
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