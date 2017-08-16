package com.wox.simulation.entity.group;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * 描述：组合历史收益
 * @author wuhaixu
 * @created 2017年8月15日 下午4:58:34
 * @since
 */
public class CombinationHistoricaProfit implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 组合历史收益记录id
	 */
	private Long id;
	
	/**
	 * 组合id
	 */
	private String combinationId;
	
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
