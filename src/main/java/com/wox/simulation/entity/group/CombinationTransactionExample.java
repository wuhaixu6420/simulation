package com.wox.simulation.entity.group;

import java.util.ArrayList;
import java.util.List;

public class CombinationTransactionExample {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CombinationTransactionExample() {
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
        
        public Criteria andBusinessSignIsNull() {
            addCriterion("businessSign is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSignIsNotNull() {
            addCriterion("businessSign is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSignEqualTo(String value) {
            addCriterion("businessSign =", value, "businessSign");
            return (Criteria) this;
        }

        public Criteria andBusinessSignNotEqualTo(String value) {
            addCriterion("businessSign <>", value, "businessSign");
            return (Criteria) this;
        }

        public Criteria andBusinessSignGreaterThan(String value) {
            addCriterion("businessSign >", value, "businessSign");
            return (Criteria) this;
        }

        public Criteria andBusinessSignGreaterThanOrEqualTo(String value) {
            addCriterion("businessSign >=", value, "businessSign");
            return (Criteria) this;
        }

        public Criteria andBusinessSignLessThan(String value) {
            addCriterion("businessSign <", value, "businessSign");
            return (Criteria) this;
        }

        public Criteria andBusinessSignLessThanOrEqualTo(String value) {
            addCriterion("businessSign <=", value, "businessSign");
            return (Criteria) this;
        }

        public Criteria andBusinessSignIn(List<String> values) {
            addCriterion("businessSign in", values, "businessSign");
            return (Criteria) this;
        }

        public Criteria andBusinessSignNotIn(List<String> values) {
            addCriterion("businessSign not in", values, "businessSign");
            return (Criteria) this;
        }

        public Criteria andBusinessSignBetween(String value1, String value2) {
            addCriterion("businessSign between", value1, value2, "businessSign");
            return (Criteria) this;
        }

        public Criteria andBusinessSignNotBetween(String value1, String value2) {
            addCriterion("businessSign not between", value1, value2, "businessSign");
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
        
        public Criteria andBusinessNumIsNull() {
            addCriterion("business_num is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNumIsNotNull() {
            addCriterion("business_num is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNumEqualTo(String value) {
            addCriterion("business_num =", value, "business_num");
            return (Criteria) this;
        }

        public Criteria andBusinessNumNotEqualTo(String value) {
            addCriterion("business_num <>", value, "business_num");
            return (Criteria) this;
        }

        public Criteria andBusinessNumGreaterThan(String value) {
            addCriterion("business_num >", value, "business_num");
            return (Criteria) this;
        }

        public Criteria andBusinessNumGreaterThanOrEqualTo(String value) {
            addCriterion("business_num >=", value, "business_num");
            return (Criteria) this;
        }

        public Criteria andBusinessNumLessThan(String value) {
            addCriterion("business_num <", value, "business_num");
            return (Criteria) this;
        }

        public Criteria andBusinessNumLessThanOrEqualTo(String value) {
            addCriterion("business_num <=", value, "business_num");
            return (Criteria) this;
        }

        public Criteria andBusinessNumIn(List<String> values) {
            addCriterion("business_num in", values, "business_num");
            return (Criteria) this;
        }

        public Criteria andBusinessNumNotIn(List<String> values) {
            addCriterion("business_num not in", values, "business_num");
            return (Criteria) this;
        }

        public Criteria andBusinessNumBetween(String value1, String value2) {
            addCriterion("business_num between", value1, value2, "business_num");
            return (Criteria) this;
        }

        public Criteria andBusinessNumNotBetween(String value1, String value2) {
            addCriterion("business_num not between", value1, value2, "business_num");
            return (Criteria) this;
        }
        
        public Criteria andBusinessPriceIsNull() {
            addCriterion("business_price is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceIsNotNull() {
            addCriterion("business_price is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceEqualTo(String value) {
            addCriterion("business_price =", value, "business_price");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceNotEqualTo(String value) {
            addCriterion("business_price <>", value, "business_price");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceGreaterThan(String value) {
            addCriterion("business_price >", value, "business_price");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceGreaterThanOrEqualTo(String value) {
            addCriterion("business_price >=", value, "business_price");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceLessThan(String value) {
            addCriterion("business_price <", value, "business_price");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceLessThanOrEqualTo(String value) {
            addCriterion("business_price <=", value, "business_price");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceIn(List<String> values) {
            addCriterion("business_price in", values, "business_price");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceNotIn(List<String> values) {
            addCriterion("business_price not in", values, "business_price");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceBetween(String value1, String value2) {
            addCriterion("business_price between", value1, value2, "business_price");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceNotBetween(String value1, String value2) {
            addCriterion("business_price not between", value1, value2, "business_price");
            return (Criteria) this;
        }
        
        public Criteria andTransactionSignIsNull() {
            addCriterion("transaction_sign is null");
            return (Criteria) this;
        }

        public Criteria andTransactionSignIsNotNull() {
            addCriterion("transaction_sign is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionSignEqualTo(String value) {
            addCriterion("transaction_sign =", value, "transaction_sign");
            return (Criteria) this;
        }

        public Criteria andTransactionSignNotEqualTo(String value) {
            addCriterion("transaction_sign <>", value, "transaction_sign");
            return (Criteria) this;
        }

        public Criteria andTransactionSignGreaterThan(String value) {
            addCriterion("transaction_sign >", value, "transaction_sign");
            return (Criteria) this;
        }

        public Criteria andTransactionSignGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_sign >=", value, "transaction_sign");
            return (Criteria) this;
        }

        public Criteria andTransactionSignLessThan(String value) {
            addCriterion("transaction_sign <", value, "transaction_sign");
            return (Criteria) this;
        }

        public Criteria andTransactionSignLessThanOrEqualTo(String value) {
            addCriterion("transaction_sign <=", value, "transaction_sign");
            return (Criteria) this;
        }

        public Criteria andTransactionSignIn(List<String> values) {
            addCriterion("transaction_sign in", values, "transaction_sign");
            return (Criteria) this;
        }

        public Criteria andTransactionSignNotIn(List<String> values) {
            addCriterion("transaction_sign not in", values, "transaction_sign");
            return (Criteria) this;
        }

        public Criteria andTransactionSignBetween(String value1, String value2) {
            addCriterion("transaction_sign between", value1, value2, "transaction_sign");
            return (Criteria) this;
        }

        public Criteria andTransactionSignNotBetween(String value1, String value2) {
            addCriterion("transaction_sign not between", value1, value2, "transaction_sign");
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