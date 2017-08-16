package com.wox.simulation.entity.group;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * 描述：组合交易记录
 * @author wuhaixu
 * @created 2017年8月15日 下午4:58:34
 * @since
 */
public class CombinationTransaction implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 组合交易记录id
	 */
	private Long id;
	
	/**
	 * 组合id
	 */
	private String combinationId;
	
	/**
	 * 买卖标志
	 */
	private String businessSign;
	
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
	 * 买卖股数
	 */
	private String businessNum;
	
	/**
	 * 买卖价格
	 */
	private String businessPrice;
	
	/**
	 * 交易标志
	 */
	private String transactionSign;
	
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

	public String getBusinessSign() {
		return businessSign;
	}

	public void setBusinessSign(String businessSign) {
		this.businessSign = businessSign;
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

	public String getBusinessNum() {
		return businessNum;
	}

	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}

	public String getBusinessPrice() {
		return businessPrice;
	}

	public void setBusinessPrice(String businessPrice) {
		this.businessPrice = businessPrice;
	}

	public String getTransactionSign() {
		return transactionSign;
	}

	public void setTransactionSign(String transactionSign) {
		this.transactionSign = transactionSign;
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
