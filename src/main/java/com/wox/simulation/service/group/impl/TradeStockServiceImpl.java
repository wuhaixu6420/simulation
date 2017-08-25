package com.wox.simulation.service.group.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.wox.simulation.dao.group.CombinationDetailsMapper;
import com.wox.simulation.dao.group.CombinationTransactionMapper;
import com.wox.simulation.entity.group.CombinationDetails;
import com.wox.simulation.entity.group.CombinationDetailsExample;
import com.wox.simulation.entity.group.CombinationTransaction;
import com.wox.simulation.exception.TradeStockException;
import com.wox.simulation.service.BaseService;
import com.wox.simulation.service.group.TradeStockService;
import com.wox.simulation.util.DataResult;
import com.wox.simulation.util.HttpRespon;
import com.wox.simulation.util.HttpUtil;
import com.wox.simulation.util.ObjectUtil;

@Service
public class TradeStockServiceImpl extends BaseService implements TradeStockService {
	
	private static Logger logger = LoggerFactory.getLogger(TradeStockServiceImpl.class);

	/**
	 * 查询股票使用
	 */
	private final static String XUEQIU_URL = "https://xueqiu.com/stock/search.json";
	
	/**
	 * 雪球cookie使用
	 */
	private final static String XUEQIU_COOKIE = "xq_a_token=35967e90fece12b70f15096c72ae9b6982f628a7;";
	
//	String cookie = 
//	"aliyungf_tc=AQAAAJYnAFACdwMAui3nZVNWTziy/PVx; " + 
//	"xq_a_token=35967e90fece12b70f15096c72ae9b6982f628a7; " ;  查询股票信息使用
//	"xq_a_token.sig=-qUrmkra84xJqFAD2ZukbCZ1FMA; " + 
//	"xq_r_token=04a34d441044eea56430a435d6c270f709b923ae; " + 
//	"xq_r_token.sig=jIYThmOvEthGQpyKL58Zz9dXhE8; " + 
//	"u=751503645706016; " + 
//	"device_id=4b6db5cc5993afcd93bdfe12a2acf374; " + 
//	"Hm_lvt_1db88642e346389874251b5a1eded6e3=1503645102; " + 
//	"Hm_lpvt_1db88642e346389874251b5a1eded6e3=1503645707";
	
	/**
	 * 组合详情Dao
	 */
	@Resource
	private CombinationDetailsMapper combinationDetailsMapper;
	
	/**
	 * 交易记录Dao
	 */
	@Resource
	private CombinationTransactionMapper combinationTransactionMapper;
	
	@Override
	public DataResult<?> stockDeal(String combinationId, String type, String stockName, 
			String stockCode, String market, String num, String price)
			throws TradeStockException, Exception {
		logger.info("买卖交易： combinationId = " + combinationId + "; type = " + type + 
				"; stockName " + stockName + "; stockCode = " + stockCode + "; market = " + market + 
				"; num = " + num + "; price = " + price);
		//查询当前组合是否存在
		CombinationDetailsExample combinationDetailsExample = new CombinationDetailsExample();
		combinationDetailsExample.createCriteria().andIdEqualTo(Long.valueOf(combinationId));
		//查询
		List<CombinationDetails> combinationDetailsList = combinationDetailsMapper.selectByExample(combinationDetailsExample);
		if(ObjectUtil.isEmpty(combinationDetailsList) || combinationDetailsList.isEmpty()){
			return new DataResult<String>(false, "当前组合id，不存在组合");
		}
		//创建交易
		CombinationTransaction combinationTransaction = new CombinationTransaction();
		//组合id
		combinationTransaction.setCombinationId(combinationId);
		//股票代码
		combinationTransaction.setStockCode(stockCode);
		//股票市场
		combinationTransaction.setStockMarket(market);
		//股票名称
		combinationTransaction.setStockName(stockName);
		//买卖标志
		combinationTransaction.setBusinessSign(type);
		//买卖数量
		combinationTransaction.setBusinessNum(num);
		//买卖价格
		combinationTransaction.setBusinessPrice(price);
		//交易标志
		combinationTransaction.setTransactionSign(TRANSACTIONSIGN_ENTRUST);
		//交易时间
		combinationTransaction.setCreateTime(new Timestamp(new Date().getTime()));
		//更新时间
		combinationTransaction.setUpdateTime(new Timestamp(new Date().getTime()));
		//插入
		Integer count = combinationTransactionMapper.insert(combinationTransaction);
		if(count == 1){
			return new DataResult<String>(true, "委托成功");
		} else {
			throw new TradeStockException("委托失败");
		}
	}

	
	@Override
	public DataResult<?> queryStockInfo(String stockCode)
			throws TradeStockException, Exception {
		logger.info("查询股票信息： stockCode = " + stockCode);
		String param = "code=" + stockCode + "&size=5&_=" + new Date().getTime();
		//通过雪球查询股票信息
		HttpRespon httpRespon = HttpUtil.sendGet(XUEQIU_COOKIE, XUEQIU_URL, param, charsetNameUTF8);
		logger.info(httpRespon.getContent());
		return new DataResult<Object>(true, JSONObject.toJSON(httpRespon.getContent()));
	}


}
