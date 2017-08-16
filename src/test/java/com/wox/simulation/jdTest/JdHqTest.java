package com.wox.simulation.jdTest;

import org.junit.Test;

import com.wox.simulation.commonTest.BaseConstant;
import com.wox.simulation.util.HttpRespon;
import com.wox.simulation.util.HttpUtil;

public class JdHqTest extends BaseConstant{
	
	@Test
	public void stockMinLink(){
		String url = "https://gupiao.jd.com/stock/quote/min.html";
		String param = "callback=jQuery18306786479383738329_1501469462355&code=SZ300679&p=0&_=1501469462948";
		HttpRespon httpRespon = HttpUtil.sendGet(url, param, charsetNameUTF8);
		
		System.out.println(httpRespon);
		
	}
	
	@Test
	public void stockHqLink(){
		String url = "https://gupiao.jd.com/stock/summary.html?callback=jQuery1830006149417309174732_1501471117168&code=SH603133&_=1501471268590";
		String param = "";
		HttpRespon httpRespon = HttpUtil.sendGet(url, param, charsetNameUTF8);
		
		System.out.println(httpRespon);
	}
	
}
