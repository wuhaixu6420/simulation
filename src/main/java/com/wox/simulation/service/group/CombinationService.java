package com.wox.simulation.service.group;

import com.wox.simulation.exception.CombinationException;
import com.wox.simulation.util.DataResult;

/**
 * 
 * 描述：操作组合
 * @author wuhaixu
 * @created 2017年8月16日 下午1:33:15
 * @since
 */
public interface CombinationService {

	/**
	 * 
	 * 描述：根据标志位，查询对应收益率
	 * @author wuhaixu
	 * @created 2017年8月16日 下午1:42:11
	 * @since 
	 * @param falg	0：总收益，1：月收益，2：周收益，3：今日收益
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	DataResult<?> getCombinationDetailsPageList(String falg, String pageNo, String pageSize) throws CombinationException;
	
	/**
	 * 
	 * 描述：根据用户id，查询该用户对应的组合。如果有组合id的情况，直接查询该组合详情
	 * @author wuhaixu
	 * @created 2017年8月16日 下午1:45:05
	 * @since 
	 * @param userid
	 * @param combinationId
	 * @return
	 */
	DataResult<?> getCombinationDetailsByUserId(String userid, String combinationId) throws CombinationException;
	
	/**
	 * 
	 * 描述：创建组合
	 * @author wuhaixu
	 * @created 2017年8月16日 下午1:51:01
	 * @since 
	 * @param userid
	 * @param combinationName
	 * @param combinationSynopsis
	 * @return
	 */
	DataResult<?> createCombination(String userid, String combinationName, String combinationSynopsis) throws CombinationException;
	
}
