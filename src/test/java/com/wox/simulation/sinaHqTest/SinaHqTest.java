package com.wox.simulation.sinaHqTest;

import org.junit.Test;

import com.wox.simulation.commonTest.BaseConstant;
import com.wox.simulation.util.HttpRespon;
import com.wox.simulation.util.HttpUtil;

public class SinaHqTest extends BaseConstant{

	/**
	 * 分时线的查询：
	 * http://image.sinajs.cn/newchart/min/n/sh000001.gif
	 * 
	 * 日K线查询：
	 * http://image.sinajs.cn/newchart/daily/n/sh000001.gif
	 * 
	 * 周K线查询：
	 * http://image.sinajs.cn/newchart/weekly/n/sh000001.gif
	 * 
	 * 月K线查询：
	 * http://image.sinajs.cn/newchart/monthly/n/sh000001.gif
	 * 
	 * 上证指数查询：
	 * http://hq.sinajs.cn/list=s_sh000001
	 * 
	 * 个股查询：
	 * http://hq.sinajs.cn/list=sh601006
	 */
	
	/**
	 * 
	 * 描述：上证指数
	 * @author wuhaixu
	 * @created 2017年8月4日 下午1:56:01
	 * @since
	 */
	@Test
	public void marketIndex(){
		String url = "http://hq.sinajs.cn/list=s_sh000001,s_sz399001";
		String param = "";
		HttpRespon httpRespon = HttpUtil.sendGet(url, param, charsetNameGBK);
		
		System.out.println(httpRespon.getContent());
		/*
		 * var hq_str_s_sh000001="上证指数,3281.5080,8.5794,0.26,2038388,20873958";var hq_str_s_sz399001="深证成指,10424.90,-11.270,-0.11,174872669,20639690";
		 * 
		 * 建议使用JavaScript
		 * var hq_str_s_sh000001="上证指数,3281.5080,8.5794,0.26,2038388,20873958";
		 * 指数名称, 当前点数   , 当前价格, 涨跌率, 成交量（手）, 成交额（万元）
		 * 上证指数, 3281.5080, 8.5794,  0.26,   2038388,     20873958
		 * 
		 */
	}
	
	/**
	 * 
	 * 描述：个股行情
	 * @author wuhaixu
	 * @created 2017年8月4日 下午2:17:23
	 * @since
	 */
	@Test
	public void largeStock(){
		String url = "http://hq.sinajs.cn/list=sh601006,sz000728";
		String param = "";
		HttpRespon httpRespon = HttpUtil.sendGet(url, param, charsetNameGBK);
		
		System.out.println(httpRespon.getContent());
		/*
		 * var hq_str_sh601006="大秦铁路,8.730,8.740,8.790,8.900,8.700,8.790,8.800,36541121,322201159.000,302400,8.790,224200,8.780,186500,8.770,199400,8.760,316900,8.750,66429,8.800,206595,8.810,396400,8.820,322000,8.830,1105330,8.840,2017-08-04,14:07:37,00";var hq_str_sz000728="国元证券,13.810,13.850,14.070,14.350,13.660,14.070,14.080,83320502,1172138881.510,20400,14.070,82550,14.060,210103,14.050,70250,14.040,169750,14.030,35955,14.080,14700,14.090,77750,14.100,69600,14.110,82050,14.120,2017-08-04,14:07:36,00";
		 * 
		 * var hq_str_sh601006="大秦铁路,8.730,8.740,8.790,8.900,8.700,8.790,8.800,36541121,322201159.000,302400,8.790,224200,8.780,186500,8.770,199400,8.760,316900,8.750,66429,8.800,206595,8.810,396400,8.820,322000,8.830,1105330,8.840,2017-08-04,14:07:37,00";
		 * 0		1		2	3		4	5		6	7		8		9				10	11		12		13	14		15	16		17		18	19		20	21		22	  23	24		25	26		27	  28	  29	30			31	  32
		 * 大秦铁路,8.730,8.740,8.790,8.900,8.700,8.790,8.800,36541121,322201159.000,302400,8.790,224200,8.780,186500,8.770,199400,8.760,316900,8.750,66429,8.800,206595,8.810,396400,8.820,322000,8.830,1105330,8.840,2017-08-04,14:07:37,00
		 * 0：名称			1：今日开盘价	2：昨日收盘价	3：当前价格		4：今日最高价	5：今日最低价
		 * 6：买一价格		7：卖一价格		8：成交股数		9：成交金额		10：买一股数		11：买一价格
		 * 12：买二股数		13：买二价格		14：买三股数		15：买三股数		16：买四股数		17：买四价格
		 * 18：买五股数		19：买五价格		20：卖一股数		21：卖一价格		22：卖二股数		23：卖二价格
		 * 24：卖三股数		25：卖三价格		26：卖四股数		27：卖四价格		28：卖五股数		29：卖五价格
		 * 30：当前日期		31：当前时间		32：未知
		 * 
		 */
	}
	
	
	
}
