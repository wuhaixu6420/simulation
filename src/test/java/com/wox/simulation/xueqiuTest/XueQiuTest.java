package com.wox.simulation.xueqiuTest;

import org.junit.Test;

import com.wox.simulation.commonTest.BaseConstant;
import com.wox.simulation.util.HttpRespon;
import com.wox.simulation.util.HttpUtil;

public class XueQiuTest extends BaseConstant{

	/**
	 * 个股行情：
	 * https://xueqiu.com/v4/stock/quotec.json?code=SH000001&_=1501471854391
	 * 
	 * 个股分钟线：
	 * https://xueqiu.com/stock/forchart/stocklist.json?symbol=SH000001&period=1d&one_min=1&_=1501471853496
	 * 
	 * 个股十分线：
	 * https://xueqiu.com/stock/forchart/stocklist.json?symbol=SH000001&period=5d&_=1501471853757
	 * 
	 * 个股详情资料：今开，昨收，最高，最低，成交量等
	 * https://xueqiu.com/v4/stock/quote.json?code=SH000001&_=1501471853388
	 * 
	 * 个股行情五档：
	 * https://xueqiu.com/stock/pankou.json?symbol=SZ000728&_=1501472548400
	 * 
	 */
	
	
	/**
	 * 
	 * 描述：个股详情行情
	 * @author wuhaixu
	 * @created 2017年8月4日 下午2:17:23
	 * @since
	 */
	@Test
	public void largeStock(){
		String url = "https://xueqiu.com/v4/stock/quote.json";
		String param = "code=SZ000728,SH000001&_=1501828078164";
		HttpRespon httpRespon = HttpUtil.sendGet(url, param, charsetNameGBK);
		/**
		 * 用程序出现异常，但是浏览器访问没有问题
		 */
		
		System.out.println(httpRespon.getContent());
		/*
		 * {"SZ000728":{"symbol":"SZ000728","exchange":"SZ","code":"000728","name":"国元证券","current":"13.92","percentage":"0.51","change":"0.07","open":"13.81","high":"14.35","low":"13.66","close":"13.92","last_close":"13.85","high52week":"17.25","low52week":"10.45","volume":"9.4345134E7","lot_volume":"943451.34","volumeAverage":"63985080","marketCapital":"4.1010408E10","eps":"0.12","pe_ttm":"28.611","pe_lyr":"29.1805","beta":"0.0","totalShares":"2946150000","time":"Fri Aug 04 14:40:36 +0800 2017","afterHours":"0.0","afterHoursPct":"0.0","afterHoursChg":"0.0","updateAt":"1493967789758","dividend":"0.3","yield":"3.35","turnover_rate":"3.20%","instOwn":"0.0","rise_stop":"15.24","fall_stop":"12.47","currency_unit":"CNY","amount":"1.326838199E9","net_assets":"7.1157","hasexist":"","has_warrant":"0","type":"11","flag":"1","rest_day":"","amplitude":"4.98%","market_status":"交易中","lot_size":"100","min_order_quantity":"0","max_order_quantity":"0","tick_size":"0.01","kzz_stock_symbol":"","kzz_stock_name":"","kzz_stock_current":"0.0","kzz_convert_price":"0.0","kzz_covert_value":"0.0","kzz_cpr":"0.0","kzz_putback_price":"0.0","kzz_convert_time":"","kzz_redempt_price":"0.0","kzz_straight_price":"0.0","kzz_stock_percent":"","pb":"1.96","benefit_before_tax":"0.0","benefit_after_tax":"0.0","convert_bond_ratio":"","totalissuescale":"","outstandingamt":"","maturitydate":"","remain_year":"","convertrate":"0.0","interestrtmemo":"","release_date":"","circulation":"0.0","par_value":"0.0","due_time":"0.0","value_date":"","due_date":"","publisher":"","redeem_type":"T","issue_type":"3","bond_type":"","warrant":"","sale_rrg":"","rate":"","after_hour_vol":"0","float_shares":"2946150000","float_market_capital":"4.1010408E10","disnext_pay_date":"","convert_rate":"0.0","volume_ratio":"1.3","percent5m":"-0.93","pankou_ratio":"47.14%","psr":"11.52"},"SH000001":{"symbol":"SH000001","exchange":"SH","code":"000001","name":"上证指数","current":"3267.05","percentage":"-0.18","change":"-5.88","open":"3269.32","high":"3287.19","low":"3266.88","close":"3267.05","last_close":"3272.93","high52week":"3305.43","low52week":"2959.05","volume":"2.44830167E10","lot_volume":"2.44830167E10","volumeAverage":"33269612703","marketCapital":"3.1660990648394E13","eps":"0.0","pe_ttm":"","pe_lyr":"","beta":"0.0","totalShares":"7472301116","time":"Fri Aug 04 14:40:22 +0800 2017","afterHours":"0.0","afterHoursPct":"0.0","afterHoursChg":"0.0","afterHoursTime":"Wed Oct 19 21:59:01 -0400 2011","updateAt":"1493976615034","dividend":"","yield":"0.0","turnover_rate":"","instOwn":"0.0","rise_stop":"0.0","fall_stop":"0.0","currency_unit":"CNY","amount":"2.531351355272E11","net_assets":"0.0","hasexist":"","has_warrant":"0","type":"12","flag":"1","rest_day":"","amplitude":"0.62%","market_status":"交易中","lot_size":"1","min_order_quantity":"0","max_order_quantity":"0","tick_size":"0.01","kzz_stock_symbol":"","kzz_stock_name":"","kzz_stock_current":"0.0","kzz_convert_price":"0.0","kzz_covert_value":"0.0","kzz_cpr":"0.0","kzz_putback_price":"0.0","kzz_convert_time":"","kzz_redempt_price":"0.0","kzz_straight_price":"0.0","kzz_stock_percent":"","pb":"0.0","benefit_before_tax":"0.0","benefit_after_tax":"0.0","convert_bond_ratio":"","totalissuescale":"","outstandingamt":"","maturitydate":"","remain_year":"","convertrate":"0.0","interestrtmemo":"","release_date":"","circulation":"0.0","par_value":"0.0","due_time":"0.0","value_date":"","due_date":"","publisher":"","redeem_type":"","issue_type":"","bond_type":"","warrant":"","sale_rrg":"","rate":"","after_hour_vol":"0","float_shares":"2568300000000","float_market_capital":"2.6782378586846E13","disnext_pay_date":"","convert_rate":"0.0","volume_ratio":"1.14","percent5m":"-0.17","pankou_ratio":"0.0%","psr":"","rise_count":"451","flat_count":"143","fall_count":"771"}}
		 * {"SZ000728":{"symbol":"SZ000728","exchange":"SZ","code":"000728","name":"国元证券","current":"13.92","percentage":"0.51","change":"0.07","open":"13.81","high":"14.35","low":"13.66","close":"13.92","last_close":"13.85","high52week":"17.25","low52week":"10.45","volume":"9.4345134E7","lot_volume":"943451.34","volumeAverage":"63985080","marketCapital":"4.1010408E10","eps":"0.12","pe_ttm":"28.611","pe_lyr":"29.1805","beta":"0.0","totalShares":"2946150000","time":"Fri Aug 04 14:40:36 +0800 2017","afterHours":"0.0","afterHoursPct":"0.0","afterHoursChg":"0.0","updateAt":"1493967789758","dividend":"0.3","yield":"3.35","turnover_rate":"3.20%","instOwn":"0.0","rise_stop":"15.24","fall_stop":"12.47","currency_unit":"CNY","amount":"1.326838199E9","net_assets":"7.1157","hasexist":"","has_warrant":"0","type":"11","flag":"1","rest_day":"","amplitude":"4.98%","market_status":"交易中","lot_size":"100","min_order_quantity":"0","max_order_quantity":"0","tick_size":"0.01","kzz_stock_symbol":"","kzz_stock_name":"","kzz_stock_current":"0.0","kzz_convert_price":"0.0","kzz_covert_value":"0.0","kzz_cpr":"0.0","kzz_putback_price":"0.0","kzz_convert_time":"","kzz_redempt_price":"0.0","kzz_straight_price":"0.0","kzz_stock_percent":"","pb":"1.96","benefit_before_tax":"0.0","benefit_after_tax":"0.0","convert_bond_ratio":"","totalissuescale":"","outstandingamt":"","maturitydate":"","remain_year":"","convertrate":"0.0","interestrtmemo":"","release_date":"","circulation":"0.0","par_value":"0.0","due_time":"0.0","value_date":"","due_date":"","publisher":"","redeem_type":"T","issue_type":"3","bond_type":"","warrant":"","sale_rrg":"","rate":"","after_hour_vol":"0","float_shares":"2946150000","float_market_capital":"4.1010408E10","disnext_pay_date":"","convert_rate":"0.0","volume_ratio":"1.3","percent5m":"-0.93","pankou_ratio":"47.14%","psr":"11.52"}
		 * 
		 * {
		"SZ000728": {
			"symbol": "SZ000728",股票标志
			"exchange": "SZ",股票市场
			"code": "000728",股票代码
			"name": "国元证券",股票名称
			"current": "13.92",当前股价
			"percentage": "0.51",涨跌值
			"change": "0.07",涨跌百分比
			"open": "13.81",今日开盘价
			"high": "14.35",今日最高
			"low": "13.66",今日最低
			"close": "13.92",
			"last_close": "13.85",昨收
			"high52week": "17.25",52周最高
			"low52week": "10.45",52这周最低
			"volume": "9.4345134E7",成交量(股)
			"lot_volume": "943451.34",
			"volumeAverage": "63985080",
			"marketCapital": "4.1010408E10",
			"eps": "0.12",每股收益
			"pe_ttm": "28.611",
			"pe_lyr": "29.1805",
			"beta": "0.0",
			"totalShares": "2946150000",
			"time": "Fri Aug 04 14:40:36 +0800 2017",
			"afterHours": "0.0",
			"afterHoursPct": "0.0",
			"afterHoursChg": "0.0",
			"updateAt": "1493967789758",
			"dividend": "0.3",
			"yield": "3.35",
			"turnover_rate": "3.20%",
			"instOwn": "0.0",
			"rise_stop": "15.24",
			"fall_stop": "12.47",
			"currency_unit": "CNY",
			"amount": "1.326838199E9",
			"net_assets": "7.1157",
			"hasexist": "",
			"has_warrant": "0",
			"type": "11",
			"flag": "1",
			"rest_day": "",
			"amplitude": "4.98%",
			"market_status": "交易中",
			"lot_size": "100",
			"min_order_quantity": "0",
			"max_order_quantity": "0",
			"tick_size": "0.01",
			"kzz_stock_symbol": "",
			"kzz_stock_name": "",
			"kzz_stock_current": "0.0",
			"kzz_convert_price": "0.0",
			"kzz_covert_value": "0.0",
			"kzz_cpr": "0.0",
			"kzz_putback_price": "0.0",
			"kzz_convert_time": "",
			"kzz_redempt_price": "0.0",
			"kzz_straight_price": "0.0",
			"kzz_stock_percent": "",
			"pb": "1.96",
			"benefit_before_tax": "0.0",
			"benefit_after_tax": "0.0",
			"convert_bond_ratio": "",
			"totalissuescale": "",
			"outstandingamt": "",
			"maturitydate": "",
			"remain_year": "",
			"convertrate": "0.0",
			"interestrtmemo": "",
			"release_date": "",
			"circulation": "0.0",
			"par_value": "0.0",
			"due_time": "0.0",
			"value_date": "",
			"due_date": "",
			"publisher": "",
			"redeem_type": "T",
			"issue_type": "3",
			"bond_type": "",
			"warrant": "",
			"sale_rrg": "",
			"rate": "",
			"after_hour_vol": "0",
			"float_shares": "2946150000",
			"float_market_capital": "4.1010408E10",
			"disnext_pay_date": "",
			"convert_rate": "0.0",
			"volume_ratio": "1.3",
			"percent5m": "-0.93",
			"pankou_ratio": "47.14%",
			"psr": "11.52"
		}
		 * 
		 */
	}
	
	/**
	 * 
	 * 描述：个股时时行情
	 * @author wuhaixu
	 * @created 2017年8月4日 下午2:17:23
	 * @since
	 */
	@Test
	public void largeOftenStock(){
		String url = "https://xueqiu.com/v4/stock/quotec.json";
		String param = "code=SH000001,SZ399001&_=1501471854391";
		HttpRespon httpRespon = HttpUtil.sendGet(url, param, charsetNameGBK);
		
		System.out.println(httpRespon.getContent());
		/*
		 * {"SH000001":["3269.53","-3.40","-0.10","Fri Aug 04 14:23:53 +0800 2017"],"SZ399001":["10385.66","-50.51","-0.48","Fri Aug 04 14:23:57 +0800 2017"]}
		 * 		0		  1			2		3		4
		 * {"SH000001":["3271.75","-1.18","-0.04","Fri Aug 04 14:22:32 +0800 2017"]}
		 * 0：股票代码		1：当前股价		2：涨跌值		3：涨跌百分比
		 * 
		 */
	}
	
	@Test
	public void fiveMarket(){
		String url = "https://xueqiu.com/stock/pankou.json";
		String param = "symbol=SZ000728&_=1501472548400";
		
		HttpRespon httpRespon = HttpUtil.sendGet(url, param, charsetNameGBK);
		
		System.out.println(httpRespon.getContent());
		
		/*
		 * {
			"symbol": "SZ000728",
			"time": "Aug 7, 2017 2:49:39 PM",
			"bp1": 13.81,买一价格
			"bc1": 898,买一股数（手）
			"bp2": 13.8,买二价格
			"bc2": 1900,买二股数（手）
			"bp3": 13.79,买三价格
			"bc3": 943,买三股数（手）
			"bp4": 13.78,买四价格
			"bc4": 822,买四股数（手）
			"bp5": 13.77,买五价格
			"bc5": 2314,买五股数（手）
			"bp6": 0,
			"bc6": 0,
			"bp7": 0,
			"bc7": 0,
			"bp8": 0,
			"bc8": 0,
			"bp9": 0,
			"bc9": 0,
			"bp10": 0,
			"bc10": 0,
			"current": 13.82,当前价
			"sp1": 13.82,卖一价格
			"sc1": 612,卖一股数（手）
			"sp2": 13.83,卖二价格
			"sc2": 393,卖二股数（手）
			"sp3": 13.84,卖三价格
			"sc3": 197,卖三股数（手）
			"sp4": 13.85,卖四价格
			"sc4": 552,卖四股数（手）
			"sp5": 13.86,卖五价格
			"sc5": 697,卖五股数（手）
			"sp6": 0,
			"sc6": 0,
			"sp7": 0,
			"sc7": 0,
			"sp8": 0,
			"sc8": 0,
			"sp9": 0,
			"sc9": 0,
			"sp10": 0,
			"sc10": 0,
			"buypct": 73.72,买入比
			"sellpct": 26.28,卖出比
			"diff": 4426,委托差
			"ratio": 47.45 委托比
			}
		 */
	}
	
	
	
	
	
	
}
