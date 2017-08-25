package com.wox.simulation.service.group;

import com.wox.simulation.exception.TradeStockException;
import com.wox.simulation.util.DataResult;


/**
 * 
 * 描述：股票买卖，撤销等
 * @author wuhaixu
 * @created 2017年8月24日17:40:51
 * @since
 */
public interface TradeStockService {

	/**
	 * 
	 * 描述：买卖股票，存放在交易历史中
	 * @author wuhaixu
	 * @created 2017年8月24日 下午5:47:55
	 * @since 
	 * @param combinationId	组合id
	 * @param type	买卖标志
	 * @param stockCode	股票代码
	 * @param market	股票市场
	 * @param num	买卖数量
	 * @param price	买卖价格
	 * @return
	 * @throws TradeStockException
	 * @throws Exception
	 */
	DataResult<?> stockDeal(String combinationId, String type, String stockName, String stockCode, String market, String num, String price) throws TradeStockException, Exception;
	
	/**
	 * 
	 * 描述：查询股票信息
	 * @author wuhaixu
	 * @created 2017年8月25日 下午2:27:02
	 * @since 
	 * @param stockCode
	 * @return
	 * @throws TradeStockException
	 * @throws Exception
	 */
	DataResult<?> queryStockInfo(String stockCode) throws TradeStockException, Exception;
}
