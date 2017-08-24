package com.wox.simulation.service.group.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wox.core.feature.orm.mybatis.Page;
import com.wox.simulation.dao.UserMapper;
import com.wox.simulation.dao.group.CombinationDetailsMapper;
import com.wox.simulation.dao.group.CombinationPositionMapper;
import com.wox.simulation.entity.User;
import com.wox.simulation.entity.UserExample;
import com.wox.simulation.entity.group.CombinationDetails;
import com.wox.simulation.entity.group.CombinationDetailsExample;
import com.wox.simulation.entity.group.CombinationPosition;
import com.wox.simulation.entity.group.CombinationPositionExample;
import com.wox.simulation.exception.CombinationException;
import com.wox.simulation.service.group.CombinationService;
import com.wox.simulation.util.DataResult;
import com.wox.simulation.util.ObjectUtil;

@Service
public class CombinationServiceImpl implements CombinationService {
	
	private static Logger logger = LoggerFactory.getLogger(CombinationServiceImpl.class);

	/**
	 * 组合详情Dao
	 */
	@Resource
	private CombinationDetailsMapper combinationDetailsMapper;
	
	/**
	 * 组合持仓Dao
	 */
	@Resource
	private CombinationPositionMapper combinationPositionMapper;
	
	/**
	 * 用户Dao
	 */
	@Resource
	private UserMapper userMapper;
	
	@Override
	public DataResult<?> getCombinationDetailsPageList(
			String falg, String pageNo, String pageSize) throws CombinationException {
		logger.info("组合查询入参： falg = " + falg + ";pageNo = " + pageNo + ";pageSize = " + pageSize);
		//排序参数值
		String order = "";
		if("0".equals(falg)){
			order = "total_profit desc";
		} else if("1".equals(falg)){
			order = "month_profit desc";
		} else if("2".equals(falg)){
			order = "week_profit desc";
		} else if("3".equals(falg)){
			order = "today_profit desc";
		} else {
			logger.info("falg 参数传入异常");
			throw new CombinationException("组合查询：falg 参数传入异常");
		}
		//创建分页条件
		Page<CombinationDetails> page = new Page<>(Integer.valueOf(pageNo), Integer.valueOf(pageSize));
		
		CombinationDetailsExample combinationDetailsExample = new CombinationDetailsExample();
		//创建排序条件
		combinationDetailsExample.setOrderByClause(order);
		//查询组合
		List<CombinationDetails> combinationDetailsList = combinationDetailsMapper.selectByExampleAndPage(page, combinationDetailsExample);
		if(ObjectUtil.isEmpty(combinationDetailsList) || combinationDetailsList.isEmpty()){
			logger.info("组合查询：当前查询数据空值");
			throw new CombinationException("组合查询：当前查询数据空值");
		}
		return new DataResult<List<CombinationDetails>>(true, combinationDetailsList);
	}

	@Override
	public DataResult<?> getCombinationDetailsByUserId(String userid, String combinationId) throws CombinationException {
		logger.info("用户查询组合入参： userid = " + userid + ";combinationId = " + combinationId);
		//查询全部
		CombinationDetailsExample combinationDetailsExample = new CombinationDetailsExample();
		//判断是否存在组合id
		if(ObjectUtil.isEmpty(combinationId)){
			combinationDetailsExample.createCriteria().andUserIdEqualTo(userid);
		} else {
			combinationDetailsExample.createCriteria().andUserIdEqualTo(userid).andIdEqualTo(Long.valueOf(combinationId));
		}
		//查询组合
		List<CombinationDetails> combinationDetailsList = combinationDetailsMapper.selectByExample(combinationDetailsExample);
		if(ObjectUtil.isEmpty(combinationDetailsList) || combinationDetailsList.isEmpty()){
			logger.info("用户查询组合：当前查询数据空值");
			throw new CombinationException("用户查询组合：当前查询数据空值");
		}
		//创建存放组合详情空间	 alibaba	json
		JSONArray jsonArray = new JSONArray();
		//防止一个用户多个组合的情况
		for(CombinationDetails combinationDetails : combinationDetailsList){
			//组合id
			String combinationPositionId = combinationDetails.getId().toString();
			//使用组合id，查询组合持仓详情
			CombinationPositionExample combinationPositionExample = new CombinationPositionExample();
			combinationPositionExample.createCriteria().andCombinationIdEqualTo(combinationPositionId);
			//查询当前组合持仓情况
			List<CombinationPosition> combinationPositionList = combinationPositionMapper.selectByExample(combinationPositionExample);
			if(ObjectUtil.isEmpty(combinationPositionList) || combinationPositionList.isEmpty()){
				logger.info("用户查询组合：当前组合没有持仓情况");
			}
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("combinationDetails", combinationDetails);
			jsonObject.put("positionList", combinationPositionList);
			//一个组合，多条持仓记录
			jsonArray.add(jsonObject);
		}
		//TODO 使用用户id查询用户资料
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("user", "");
		jsonObject.put("result", jsonArray);
		
		return new DataResult<JSONObject>(true, jsonObject);
	}

	@Override
	public DataResult<?> createCombination(String userid,
			String combinationName, String combinationSynopsis) throws CombinationException {
		logger.info("创建组合入参： userid = " + userid + ";combinationName = " + combinationName + ";combinationSynopsis = " + combinationSynopsis);
		//TODO 判断是否存在该用户，不存在则显示无法创建
		//查询该用户id是否存在用户
		UserExample userExample = new UserExample();
		userExample.createCriteria().andIdEqualTo(Long.valueOf(userid));
		//查询
		List<User> userList = userMapper.selectByExample(userExample);
		//判断用户是否存在
		if(ObjectUtil.isEmpty(userList) || userList.isEmpty()){
			return new DataResult<String>(false, "该用户不存在");
		}
		//组合余额（初始资金）默认1,000,000
		//1.1版本可以从后台获取初始资金
		String combinationBalance = "1000000";
		CombinationDetails combinationDetails = new CombinationDetails();
		//用户id
		combinationDetails.setUserId(userid);
		//组合名称
		combinationDetails.setCombinationName(combinationName);
		//组合简介
		combinationDetails.setCombinationSynopsis(combinationSynopsis);
		//组合余额
		combinationDetails.setCombinationBalance(combinationBalance);
		//组合总市值
		combinationDetails.setTotalMarketValue(combinationBalance);
		//创建时间
		combinationDetails.setCreateTime(new Timestamp(new Date().getTime()));
		//更新时间
		combinationDetails.setUpdateTime(new Timestamp(new Date().getTime()));
		//插入组合
		int count = combinationDetailsMapper.insert(combinationDetails);
		if(count == 1){
			return new DataResult<String>(true, "组合创建成功");
		} else {
			return new DataResult<String>(false, "组合创建失败");
		}
	}

}
