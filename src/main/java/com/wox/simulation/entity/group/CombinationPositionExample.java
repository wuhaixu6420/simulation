package com.wox.simulation.entity.group;

import java.util.ArrayList;
import java.util.List;

public class CombinationPositionExample {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CombinationPositionExample() {
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
        
        public Criteria andCombinationIdIsNull() {
            addCriterion("combination_id is null");
            return (Criteria) this;
        }

        public Criteria andCombinationIdIsNotNull() {
            addCriterion("combination_id is not null");
            return (Criteria) this;
        }

        public Criteria andCombinationIdEqualTo(String value) {
            addCriterion("combination_id =", value, "combination_id");
            return (Criteria) this;
        }

        public Criteria andCombinationIdNotEqualTo(String value) {
            addCriterion("combination_id <>", value, "combination_id");
            return (Criteria) this;
        }

        public Criteria andCombinationIdGreaterThan(String value) {
            addCriterion("combination_id >", value, "combination_id");
            return (Criteria) this;
        }

        public Criteria andCombinationIdGreaterThanOrEqualTo(String value) {
            addCriterion("combination_id >=", value, "combination_id");
            return (Criteria) this;
        }

        public Criteria andCombinationIdLessThan(String value) {
            addCriterion("combination_id <", value, "combination_id");
            return (Criteria) this;
        }

        public Criteria andCombinationIdLessThanOrEqualTo(String value) {
            addCriterion("combination_id <=", value, "combination_id");
            return (Criteria) this;
        }

        public Criteria andCombinationIdIn(List<String> values) {
            addCriterion("combination_id in", values, "combination_id");
            return (Criteria) this;
        }

        public Criteria andCombinationIdNotIn(List<String> values) {
            addCriterion("combination_id not in", values, "combination_id");
            return (Criteria) this;
        }

        public Criteria andCombinationIdBetween(String value1, String value2) {
            addCriterion("combination_id between", value1, value2, "combination_id");
            return (Criteria) this;
        }

        public Criteria andCombinationIdNotBetween(String value1, String value2) {
            addCriterion("combination_id not between", value1, value2, "combination_id");
            return (Criteria) this;
        }
        
        public Criteria andStockNameIsNull() {
            addCriterion("stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("stock_name =", value, "stock_name");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("stock_name <>", value, "stock_name");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("stock_name >", value, "stock_name");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_name >=", value, "stock_name");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("stock_name <", value, "stock_name");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("stock_name <=", value, "stock_name");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("stock_name in", values, "stock_name");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("stock_name not in", values, "stock_name");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("stock_name between", value1, value2, "stock_name");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("stock_name not between", value1, value2, "stock_name");
            return (Criteria) this;
        }
        
        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stock_code");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stock_code");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stock_code");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stock_code");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stock_code");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stock_code");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stock_code");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stock_code");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stock_code");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stock_code");
            return (Criteria) this;
        }
        
        public Criteria andStockMarketIsNull() {
            addCriterion("stock_market is null");
            return (Criteria) this;
        }

        public Criteria andStockMarketIsNotNull() {
            addCriterion("stock_market is not null");
            return (Criteria) this;
        }

        public Criteria andStockMarketEqualTo(String value) {
            addCriterion("stock_market =", value, "stock_market");
            return (Criteria) this;
        }

        public Criteria andStockMarketNotEqualTo(String value) {
            addCriterion("stock_market <>", value, "stock_market");
            return (Criteria) this;
        }

        public Criteria andStockMarketGreaterThan(String value) {
            addCriterion("stock_market >", value, "stock_market");
            return (Criteria) this;
        }

        public Criteria andStockMarketGreaterThanOrEqualTo(String value) {
            addCriterion("stock_market >=", value, "stock_market");
            return (Criteria) this;
        }

        public Criteria andStockMarketLessThan(String value) {
            addCriterion("stock_market <", value, "stock_market");
            return (Criteria) this;
        }

        public Criteria andStockMarketLessThanOrEqualTo(String value) {
            addCriterion("stock_market <=", value, "stock_market");
            return (Criteria) this;
        }

        public Criteria andStockMarketIn(List<String> values) {
            addCriterion("stock_market in", values, "stock_market");
            return (Criteria) this;
        }

        public Criteria andStockMarketNotIn(List<String> values) {
            addCriterion("stock_market not in", values, "stock_market");
            return (Criteria) this;
        }

        public Criteria andStockMarketBetween(String value1, String value2) {
            addCriterion("stock_market between", value1, value2, "stock_market");
            return (Criteria) this;
        }

        public Criteria andStockMarketNotBetween(String value1, String value2) {
            addCriterion("stock_market not between", value1, value2, "stock_market");
            return (Criteria) this;
        }
        
        public Criteria andUsableStockNumIsNull() {
            addCriterion("usable_stock_num is null");
            return (Criteria) this;
        }

        public Criteria andUsableStockNumIsNotNull() {
            addCriterion("usable_stock_num is not null");
            return (Criteria) this;
        }

        public Criteria andUsableStockNumEqualTo(String value) {
            addCriterion("usable_stock_num =", value, "usable_stock_num");
            return (Criteria) this;
        }

        public Criteria andUsableStockNumNotEqualTo(String value) {
            addCriterion("usable_stock_num <>", value, "usable_stock_num");
            return (Criteria) this;
        }

        public Criteria andUsableStockNumGreaterThan(String value) {
            addCriterion("usable_stock_num >", value, "usable_stock_num");
            return (Criteria) this;
        }

        public Criteria andUsableStockNumGreaterThanOrEqualTo(String value) {
            addCriterion("usable_stock_num >=", value, "usable_stock_num");
            return (Criteria) this;
        }

        public Criteria andUsableStockNumLessThan(String value) {
            addCriterion("usable_stock_num <", value, "usable_stock_num");
            return (Criteria) this;
        }

        public Criteria andUsableStockNumLessThanOrEqualTo(String value) {
            addCriterion("usable_stock_num <=", value, "usable_stock_num");
            return (Criteria) this;
        }

        public Criteria andUsableStockNumIn(List<String> values) {
            addCriterion("usable_stock_num in", values, "usable_stock_num");
            return (Criteria) this;
        }

        public Criteria andUsableStockNumNotIn(List<String> values) {
            addCriterion("usable_stock_num not in", values, "usable_stock_num");
            return (Criteria) this;
        }

        public Criteria andUsableStockNumBetween(String value1, String value2) {
            addCriterion("usable_stock_num between", value1, value2, "usable_stock_num");
            return (Criteria) this;
        }

        public Criteria andUsableStockNumNotBetween(String value1, String value2) {
            addCriterion("usable_stock_num not between", value1, value2, "usable_stock_num");
            return (Criteria) this;
        }
        
        public Criteria andPositionStockNumIsNull() {
            addCriterion("position_stock_num is null");
            return (Criteria) this;
        }

        public Criteria andPositionStockNumIsNotNull() {
            addCriterion("position_stock_num is not null");
            return (Criteria) this;
        }

        public Criteria andPositionStockNumEqualTo(String value) {
            addCriterion("position_stock_num =", value, "position_stock_num");
            return (Criteria) this;
        }

        public Criteria andPositionStockNumNotEqualTo(String value) {
            addCriterion("position_stock_num <>", value, "position_stock_num");
            return (Criteria) this;
        }

        public Criteria andPositionStockNumGreaterThan(String value) {
            addCriterion("position_stock_num >", value, "position_stock_num");
            return (Criteria) this;
        }

        public Criteria andPositionStockNumGreaterThanOrEqualTo(String value) {
            addCriterion("position_stock_num >=", value, "position_stock_num");
            return (Criteria) this;
        }

        public Criteria andPositionStockNumLessThan(String value) {
            addCriterion("position_stock_num <", value, "position_stock_num");
            return (Criteria) this;
        }

        public Criteria andPositionStockNumLessThanOrEqualTo(String value) {
            addCriterion("position_stock_num <=", value, "position_stock_num");
            return (Criteria) this;
        }

        public Criteria andPositionStockNumIn(List<String> values) {
            addCriterion("position_stock_num in", values, "position_stock_num");
            return (Criteria) this;
        }

        public Criteria andPositionStockNumNotIn(List<String> values) {
            addCriterion("position_stock_num not in", values, "position_stock_num");
            return (Criteria) this;
        }

        public Criteria andPositionStockNumBetween(String value1, String value2) {
            addCriterion("position_stock_num between", value1, value2, "position_stock_num");
            return (Criteria) this;
        }

        public Criteria andPositionStockNumNotBetween(String value1, String value2) {
            addCriterion("position_stock_num not between", value1, value2, "position_stock_num");
            return (Criteria) this;
        }
        
        public Criteria andInitialPositionIsNull() {
            addCriterion("initial_position is null");
            return (Criteria) this;
        }

        public Criteria andInitialPositionIsNotNull() {
            addCriterion("initial_position is not null");
            return (Criteria) this;
        }

        public Criteria andInitialPositionEqualTo(String value) {
            addCriterion("initial_position =", value, "initial_position");
            return (Criteria) this;
        }

        public Criteria andInitialPositionNotEqualTo(String value) {
            addCriterion("initial_position <>", value, "initial_position");
            return (Criteria) this;
        }

        public Criteria andInitialPositionGreaterThan(String value) {
            addCriterion("initial_position >", value, "initial_position");
            return (Criteria) this;
        }

        public Criteria andInitialPositionGreaterThanOrEqualTo(String value) {
            addCriterion("initial_position >=", value, "initial_position");
            return (Criteria) this;
        }

        public Criteria andInitialPositionLessThan(String value) {
            addCriterion("initial_position <", value, "initial_position");
            return (Criteria) this;
        }

        public Criteria andInitialPositionLessThanOrEqualTo(String value) {
            addCriterion("initial_position <=", value, "initial_position");
            return (Criteria) this;
        }

        public Criteria andInitialPositionIn(List<String> values) {
            addCriterion("initial_position in", values, "initial_position");
            return (Criteria) this;
        }

        public Criteria andInitialPositionNotIn(List<String> values) {
            addCriterion("initial_position not in", values, "initial_position");
            return (Criteria) this;
        }

        public Criteria andInitialPositionBetween(String value1, String value2) {
            addCriterion("initial_position between", value1, value2, "initial_position");
            return (Criteria) this;
        }

        public Criteria andInitialPositionNotBetween(String value1, String value2) {
            addCriterion("initial_position not between", value1, value2, "initial_position");
            return (Criteria) this;
        }
        
        public Criteria andEndPositionIsNull() {
            addCriterion("end_position is null");
            return (Criteria) this;
        }

        public Criteria andEndPositionIsNotNull() {
            addCriterion("end_position is not null");
            return (Criteria) this;
        }

        public Criteria andEndPositionEqualTo(String value) {
            addCriterion("end_position =", value, "end_position");
            return (Criteria) this;
        }

        public Criteria andEndPositionNotEqualTo(String value) {
            addCriterion("end_position <>", value, "end_position");
            return (Criteria) this;
        }

        public Criteria andEndPositionGreaterThan(String value) {
            addCriterion("end_position >", value, "end_position");
            return (Criteria) this;
        }

        public Criteria andEndPositionGreaterThanOrEqualTo(String value) {
            addCriterion("end_position >=", value, "end_position");
            return (Criteria) this;
        }

        public Criteria andEndPositionLessThan(String value) {
            addCriterion("end_position <", value, "end_position");
            return (Criteria) this;
        }

        public Criteria andEndPositionLessThanOrEqualTo(String value) {
            addCriterion("end_position <=", value, "end_position");
            return (Criteria) this;
        }

        public Criteria andEndPositionIn(List<String> values) {
            addCriterion("end_position in", values, "end_position");
            return (Criteria) this;
        }

        public Criteria andEndPositionNotIn(List<String> values) {
            addCriterion("end_position not in", values, "end_position");
            return (Criteria) this;
        }

        public Criteria andEndPositionBetween(String value1, String value2) {
            addCriterion("end_position between", value1, value2, "end_position");
            return (Criteria) this;
        }

        public Criteria andEndPositionNotBetween(String value1, String value2) {
            addCriterion("end_position not between", value1, value2, "end_position");
            return (Criteria) this;
        }
        
        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(String value) {
            addCriterion("cost_price =", value, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(String value) {
            addCriterion("cost_price <>", value, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(String value) {
            addCriterion("cost_price >", value, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(String value) {
            addCriterion("cost_price >=", value, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(String value) {
            addCriterion("cost_price <", value, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(String value) {
            addCriterion("cost_price <=", value, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<String> values) {
            addCriterion("cost_price in", values, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<String> values) {
            addCriterion("cost_price not in", values, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(String value1, String value2) {
            addCriterion("cost_price between", value1, value2, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(String value1, String value2) {
            addCriterion("cost_price not between", value1, value2, "cost_price");
            return (Criteria) this;
        }
        
        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(String value) {
            addCriterion("market_price =", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(String value) {
            addCriterion("market_price <>", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(String value) {
            addCriterion("market_price >", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(String value) {
            addCriterion("market_price >=", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(String value) {
            addCriterion("market_price <", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(String value) {
            addCriterion("market_price <=", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<String> values) {
            addCriterion("market_price in", values, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<String> values) {
            addCriterion("market_price not in", values, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(String value1, String value2) {
            addCriterion("market_price between", value1, value2, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(String value1, String value2) {
            addCriterion("market_price not between", value1, value2, "market_price");
            return (Criteria) this;
        }
        
        public Criteria andProfitLossAmountIsNull() {
            addCriterion("profit_loss_amount is null");
            return (Criteria) this;
        }

        public Criteria andProfitLossAmountIsNotNull() {
            addCriterion("profit_loss_amount is not null");
            return (Criteria) this;
        }

        public Criteria andProfitLossAmountEqualTo(String value) {
            addCriterion("profit_loss_amount =", value, "profit_loss_amount");
            return (Criteria) this;
        }

        public Criteria andProfitLossAmountNotEqualTo(String value) {
            addCriterion("profit_loss_amount <>", value, "profit_loss_amount");
            return (Criteria) this;
        }

        public Criteria andProfitLossAmountGreaterThan(String value) {
            addCriterion("profit_loss_amount >", value, "profit_loss_amount");
            return (Criteria) this;
        }

        public Criteria andProfitLossAmountGreaterThanOrEqualTo(String value) {
            addCriterion("profit_loss_amount >=", value, "profit_loss_amount");
            return (Criteria) this;
        }

        public Criteria andProfitLossAmountLessThan(String value) {
            addCriterion("profit_loss_amount <", value, "profit_loss_amount");
            return (Criteria) this;
        }

        public Criteria andProfitLossAmountLessThanOrEqualTo(String value) {
            addCriterion("profit_loss_amount <=", value, "profit_loss_amount");
            return (Criteria) this;
        }

        public Criteria andProfitLossAmountIn(List<String> values) {
            addCriterion("profit_loss_amount in", values, "profit_loss_amount");
            return (Criteria) this;
        }

        public Criteria andProfitLossAmountNotIn(List<String> values) {
            addCriterion("profit_loss_amount not in", values, "profit_loss_amount");
            return (Criteria) this;
        }

        public Criteria andProfitLossAmountBetween(String value1, String value2) {
            addCriterion("profit_loss_amount between", value1, value2, "profit_loss_amount");
            return (Criteria) this;
        }

        public Criteria andProfitLossAmountNotBetween(String value1, String value2) {
            addCriterion("profit_loss_amount not between", value1, value2, "profit_loss_amount");
            return (Criteria) this;
        }
        
        public Criteria andProfitLossRatioIsNull() {
            addCriterion("profit_loss_ratio is null");
            return (Criteria) this;
        }

        public Criteria andProfitLossRatioIsNotNull() {
            addCriterion("profit_loss_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andProfitLossRatioEqualTo(String value) {
            addCriterion("profit_loss_ratio =", value, "profit_loss_ratio");
            return (Criteria) this;
        }

        public Criteria andProfitLossRatioNotEqualTo(String value) {
            addCriterion("profit_loss_ratio <>", value, "profit_loss_ratio");
            return (Criteria) this;
        }

        public Criteria andProfitLossRatioGreaterThan(String value) {
            addCriterion("profit_loss_ratio >", value, "profit_loss_ratio");
            return (Criteria) this;
        }

        public Criteria andProfitLossRatioGreaterThanOrEqualTo(String value) {
            addCriterion("profit_loss_ratio >=", value, "profit_loss_ratio");
            return (Criteria) this;
        }

        public Criteria andProfitLossRatioLessThan(String value) {
            addCriterion("profit_loss_ratio <", value, "profit_loss_ratio");
            return (Criteria) this;
        }

        public Criteria andProfitLossRatioLessThanOrEqualTo(String value) {
            addCriterion("profit_loss_ratio <=", value, "profit_loss_ratio");
            return (Criteria) this;
        }

        public Criteria andProfitLossRatioIn(List<String> values) {
            addCriterion("profit_loss_ratio in", values, "profit_loss_ratio");
            return (Criteria) this;
        }

        public Criteria andProfitLossRatioNotIn(List<String> values) {
            addCriterion("profit_loss_ratio not in", values, "profit_loss_ratio");
            return (Criteria) this;
        }

        public Criteria andProfitLossRatioBetween(String value1, String value2) {
            addCriterion("profit_loss_ratio between", value1, value2, "profit_loss_ratio");
            return (Criteria) this;
        }

        public Criteria andProfitLossRatioNotBetween(String value1, String value2) {
            addCriterion("profit_loss_ratio not between", value1, value2, "profit_loss_ratio");
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