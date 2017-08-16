package com.wox.simulation.entity.group;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * 描述：组合持仓
 * @author wuhaixu
 * @created 2017年8月15日 下午4:58:34
 * @since
 */
public class CombinationPosition implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 组合持仓id
	 */
	private Long id;
	
	/**
	 * 组合id
	 */
	private String combinationId;
	
	/**
	 * 股票名称
	 */
	private String stockName;
	
	/**
	 * 股票代码
	 */
	private String stockCode;
	
	/**
	 * 股票市场
	 */
	private String stockMarket;
	
	/**
	 * 可用股数
	 */
	private String usableStockNum;
	
	/**
	 * 持仓股数
	 */
	private String positionStockNum;
	
	/**
	 * 初始仓位
	 */
	private String initialPosition;
	
	/**
	 * 结束仓位
	 */
	private String endPosition;
	
	/**
	 * 成本价
	 */
	private String costPrice;
	
	/**
	 * 现价 
	 */
	private String marketPrice;
	
	/**
	 * 盈亏金额
	 */
	private String profitLossAmount;
	
	/**
	 * 盈亏比
	 */
	private String profitLossRatio;
	
	/**
	 * 创建时间
	 */
	private Timestamp createTime;
	
	/**
	 * 更新时间
	 */
	private Timestamp updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCombinationId() {
		return combinationId;
	}

	public void setCombinationId(String combinationId) {
		this.combinationId = combinationId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockMarket() {
		return stockMarket;
	}

	public void setStockMarket(String stockMarket) {
		this.stockMarket = stockMarket;
	}

	public String getUsableStockNum() {
		return usableStockNum;
	}

	public void setUsableStockNum(String usableStockNum) {
		this.usableStockNum = usableStockNum;
	}

	public String getPositionStockNum() {
		return positionStockNum;
	}

	public void setPositionStockNum(String positionStockNum) {
		this.positionStockNum = positionStockNum;
	}

	public String getInitialPosition() {
		return initialPosition;
	}

	public void setInitialPosition(String initialPosition) {
		this.initialPosition = initialPosition;
	}

	public String getEndPosition() {
		return endPosition;
	}

	public void setEndPosition(String endPosition) {
		this.endPosition = endPosition;
	}

	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public String getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getProfitLossAmount() {
		return profitLossAmount;
	}

	public void setProfitLossAmount(String profitLossAmount) {
		this.profitLossAmount = profitLossAmount;
	}

	public String getProfitLossRatio() {
		return profitLossRatio;
	}

	public void setProfitLossRatio(String profitLossRatio) {
		this.profitLossRatio = profitLossRatio;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
