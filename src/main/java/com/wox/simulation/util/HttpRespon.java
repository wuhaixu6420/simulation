package com.wox.simulation.util;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class HttpRespon {

	private String cookie;
	
	private String content;

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
