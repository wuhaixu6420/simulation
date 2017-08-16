package com.wox.simulation.web.group;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
	@RequestMapping(value = "/ranking", method=RequestMethod.GET)
	@ResponseBody
	public DataResult<?> combinationRanking(HttpServletRequest request){
		String falg = request.getParameter("falg");
		if(ObjectUtil.isEmpty(falg)){
			return new DataResult<String>(false, "没有查询标志");
		}
		String pageNo = request.getParameter("pageNo");
		if(ObjectUtil.isEmpty(pageNo)){
			return new DataResult<String>(false, "没有查询页码");
		}
		String pageSize = request.getParameter("pageSize");
		if(ObjectUtil.isEmpty(pageSize)){
			return new DataResult<String>(false, "没有查询页数");
		}
		DataResult<?> dataResult = null;
		try {
			dataResult = combinationService.getCombinationDetailsPageList(falg, pageNo, pageSize);
		} catch (CombinationException e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		} catch (Exception e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		}
		return dataResult;
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
	@RequestMapping(value = "/inquiry", method=RequestMethod.GET)
	@ResponseBody
	public DataResult<?> userCombination(HttpServletRequest request){
		String userid = request.getParameter("userid");
		if(ObjectUtil.isEmpty(userid)){
			return new DataResult<String>(false, "没有用户id");
		}
		String combinationId = request.getParameter("combinationId");
		DataResult<?> dataResult = null;
		try {
			dataResult = combinationService.getCombinationDetailsByUserId(userid, combinationId);
		} catch (CombinationException e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		} catch (Exception e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		}
		return dataResult;
	}
	
	@RequestMapping(value = "/found", method=RequestMethod.GET)
	@ResponseBody
	public DataResult<?> creatCombination(HttpServletRequest request){
		String userid = request.getParameter("userid");
		if(ObjectUtil.isEmpty(userid)){
			return new DataResult<String>(false, "没有用户id");
		}
		String combinationName = request.getParameter("combinationName");
		if(ObjectUtil.isEmpty(combinationName)){
			return new DataResult<String>(false, "没有组合名称");
		}
		String combinationSynopsis = request.getParameter("combinationSynopsis");
		if(ObjectUtil.isEmpty(combinationSynopsis)){
			return new DataResult<String>(false, "没有组合简介");
		}
		DataResult<?> dataResult = null;
		try {
			dataResult = combinationService.createCombination(userid, combinationName, combinationSynopsis);
		} catch (CombinationException e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		} catch (Exception e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		}
		return dataResult;
	}

}
