package com.wox.simulation.web.group;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wox.simulation.exception.CombinationException;
import com.wox.simulation.service.group.CombinationService;
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
@RequestMapping(value = "/combination")
public class CombinationImplController extends BaseController {
	
	@Resource
	private CombinationService combinationService;
	
	/**
	 * 
	 * 描述：根据标志位，查询对应收益率组合
	 * @author wuhaixu
	 * @created 2017年8月16日 下午4:23:18
	 * @since 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/ranking", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + CHARSET)
	@ResponseBody
	public String combinationRanking(HttpServletRequest request){
		DataResult<?> dataResult = null;
		String callback = request.getParameter("callback");
		String falg = request.getParameter("falg");
		if(ObjectUtil.isEmpty(falg) || "null".equals(falg)){
			dataResult = new DataResult<String>(false, "没有查询标志");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		String pageNo = request.getParameter("pageNo");
		if(ObjectUtil.isEmpty(pageNo) || "null".equals(pageNo)){
			dataResult = new DataResult<String>(false, "没有查询页码");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		String pageSize = request.getParameter("pageSize");
		if(ObjectUtil.isEmpty(pageSize) || "null".equals(pageSize)){
			dataResult = new DataResult<String>(false, "没有查询页数");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		try {
			dataResult = combinationService.getCombinationDetailsPageList(falg, pageNo, pageSize);
		} catch (CombinationException e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		} catch (Exception e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		}
		return ObjectUtil.jsonp(callback, dataResult);
	}
	
	/**
	 * 
	 * 描述：根据用户id，或者加上组合id，查询对应组合信息
	 * @author wuhaixu
	 * @created 2017年8月16日 下午4:26:32
	 * @since 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/inquiry", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + CHARSET)
	@ResponseBody
	public String userCombination(HttpServletRequest request){
		DataResult<?> dataResult = null;
		String callback = request.getParameter("callback");
		String userid = request.getParameter("userid");
		if(ObjectUtil.isEmpty(userid) || "null".equals(userid)){
			dataResult = new DataResult<String>(false, "没有用户id");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		String combinationId = request.getParameter("combinationId");
		try {
			dataResult = combinationService.getCombinationDetailsByUserId(userid, combinationId);
		} catch (CombinationException e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		} catch (Exception e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		}
		return ObjectUtil.jsonp(callback, dataResult);
	}
	
	/**
	 * 
	 * 描述：创建组合
	 * @author wuhaixu
	 * @created 2017年8月24日 下午5:10:04
	 * @since 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/found", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + CHARSET)
	@ResponseBody
	public String creatCombination(HttpServletRequest request){
		DataResult<?> dataResult = null;
		String callback = request.getParameter("callback");
		String userid = request.getParameter("userid");
		if(ObjectUtil.isEmpty(userid) || "null".equals(userid)){
			dataResult = new DataResult<String>(false, "没有用户id");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		try {
			Long.valueOf(userid);
		} catch (NumberFormatException e) {
			dataResult = new DataResult<String>(false, "用户id异常");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		String combinationName = request.getParameter("combinationName");
		if(ObjectUtil.isEmpty(combinationName) || "null".equals(combinationName)){
			dataResult = new DataResult<String>(false, "没有组合名称");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		String combinationSynopsis = request.getParameter("combinationSynopsis");
		if(ObjectUtil.isEmpty(combinationSynopsis) || "null".equals(combinationSynopsis)){
			dataResult = new DataResult<String>(false, "没有组合简介");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		try {
			dataResult = combinationService.createCombination(userid, combinationName, combinationSynopsis);
		} catch (CombinationException e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		} catch (Exception e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		}
		return ObjectUtil.jsonp(callback, dataResult);
	}
	
	/**
	 * 
	 * 描述：股票交易买卖
	 * @author wuhaixu
	 * @created 2017年8月24日 下午5:11:27
	 * @since 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/trade", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + CHARSET)
	@ResponseBody
	public String stockBusiness(HttpServletRequest request){
		DataResult<?> dataResult = null;
		String callback = request.getParameter("callback");
		String userid = request.getParameter("userid");
		if(ObjectUtil.isEmpty(userid) || "null".equals(userid)){
			dataResult = new DataResult<String>(false, "没有用户id");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		return null;
	}

}
