package com.wox.simulation.util;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class DataResult<T> {

	/*
	 * 标记返回值正常与否，true/false
	 */
	private boolean type;
	
	/*
	 * 用于记录返回信息
	 */
	private T data;
	
	public DataResult(boolean type, T data){
		this.type = type;
		this.data = data;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
