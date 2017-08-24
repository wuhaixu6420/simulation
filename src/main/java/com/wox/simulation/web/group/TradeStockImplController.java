package com.wox.simulation.web.group;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wox.simulation.exception.TradeStockException;
import com.wox.simulation.service.group.TradeStockService;
import com.wox.simulation.util.DataResult;
import com.wox.simulation.util.ObjectUtil;
import com.wox.simulation.web.BaseController;

/**
 * 
 * 描述：组合接口模块
 * @author wuhaixu
 * @created 2017年8月16日 下午3:58:15
 * @since
 */
@Controller
@RequestMapping(value = "/trade")
public class TradeStockImplController extends BaseController {
	
	/**
	 * 交易买卖，撤销等
	 */
	@Resource
	private TradeStockService tradeStockService;
	
	/**
	 * 
	 * 描述：股票交易买卖
	 * @author wuhaixu
	 * @created 2017年8月24日 下午5:11:27
	 * @since 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/deal", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + CHARSET)
	@ResponseBody
	public String stockBusiness(HttpServletRequest request){
		DataResult<?> dataResult = null;
		String callback = request.getParameter("callback");
		//组合id
		String combinationId = request.getParameter("combinationId");
		if(ObjectUtil.isEmpty(combinationId) || "null".equals(combinationId)){
			dataResult = new DataResult<String>(false, "请输入组合id");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		//买卖标志
		String type = request.getParameter("type");
		if(ObjectUtil.isEmpty(type) || "null".equals(type)){
			dataResult = new DataResult<String>(false, "请输入买卖标志");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		//股票名称
		String stockName = request.getParameter("stockName");
		if(ObjectUtil.isEmpty(stockName) || "null".equals(stockName)){
			dataResult = new DataResult<String>(false, "请输入股票名称");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		//股票代码
		String stockCode = request.getParameter("stockCode");
		if(ObjectUtil.isEmpty(stockCode) || "null".equals(stockCode)){
			dataResult = new DataResult<String>(false, "请输入股票代码");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		//股票市场
		String market = request.getParameter("market");
		if(ObjectUtil.isEmpty(market) || "null".equals(market)){
			dataResult = new DataResult<String>(false, "请输入股票市场");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		//买卖股数
		String num = request.getParameter("num");
		if(ObjectUtil.isEmpty(num) || "null".equals(num)){
			dataResult = new DataResult<String>(false, "请输入买卖股数");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		//买卖价格
		String price = request.getParameter("price");
		if(ObjectUtil.isEmpty(price) || "null".equals(price)){
			dataResult = new DataResult<String>(false, "请输入买卖价格");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		
		try {
			dataResult = tradeStockService.stockDeal(combinationId, type, stockName, stockCode, market, num, price);
		} catch (TradeStockException e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		} catch (Exception e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		}
		return ObjectUtil.jsonp(callback, dataResult);
	}

}
