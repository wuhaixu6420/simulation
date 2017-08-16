package com.wox.simulation.entity.group;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * 描述：组合详情
 * @author wuhaixu
 * @created 2017年8月15日 下午2:41:59
 * @since
 */
public class CombinationDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 组合id
	 */
	private Long id;
	
	/**
	 * 用户id
	 */
	private String userId;
	
	/**
	 * 组合名称
	 */
	private String combinationName;
	
	/**
	 * 组合简介
	 */
	private String combinationSynopsis;
	
	/**
	 * 组合余额
	 */
	private String combinationBalance;
	
	/**
	 * 总收益
	 */
	private String totalProfit;
	
	/**
	 * 月收益
	 */
	private String monthProfit;
	
	/**
	 * 周收益
	 */
	private String weekProfit;
	
	/**
	 * 今日收益
	 */
	private String todayProfit;
	
	/**
	 * 总市值
	 */
	private String totalMarketValue;
	
	/**
	 * 创建时间
	 */
	private Timestamp createTime;
	
	/**
	 * 更新时间
	 */
	private Timestamp updateTime;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCombinationName() {
		return combinationName;
	}

	public void setCombinationName(String combinationName) {
		this.combinationName = combinationName;
	}

	public String getCombinationSynopsis() {
		return combinationSynopsis;
	}

	public void setCombinationSynopsis(String combinationSynopsis) {
		this.combinationSynopsis = combinationSynopsis;
	}

	public String getCombinationBalance() {
		return combinationBalance;
	}

	public void setCombinationBalance(String combinationBalance) {
		this.combinationBalance = combinationBalance;
	}

	public String getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(String totalProfit) {
		this.totalProfit = totalProfit;
	}

	public String getMonthProfit() {
		return monthProfit;
	}

	public void setMonthProfit(String monthProfit) {
		this.monthProfit = monthProfit;
	}

	public String getWeekProfit() {
		return weekProfit;
	}

	public void setWeekProfit(String weekProfit) {
		this.weekProfit = weekProfit;
	}

	public String getTodayProfit() {
		return todayProfit;
	}

	public void setTodayProfit(String todayProfit) {
		this.todayProfit = todayProfit;
	}

	public String getTotalMarketValue() {
		return totalMarketValue;
	}

	public void setTotalMarketValue(String totalMarketValue) {
		this.totalMarketValue = totalMarketValue;
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
