package com.wox.simulation.dao.group;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wox.core.generic.GenericDao;
import com.wox.simulation.entity.group.CombinationHistoricaProfit;
import com.wox.simulation.entity.group.CombinationHistoricaProfitExample;

/**
 * 
 * 描述：组合历史收益Dao
 * @author wuhaixu
 * @created 2017年8月16日 上午11:02:58
 * @since
 */
public interface CombinationHistoricaProfitMapper extends GenericDao<CombinationHistoricaProfit, Long> {

	int countByExample(CombinationHistoricaProfitExample example);

	int deleteByExample(CombinationHistoricaProfitExample example);

	int deleteByPrimaryKey(Long id);

	int insert(CombinationHistoricaProfit record);

	int insertSelective(CombinationHistoricaProfit record);

	List<CombinationHistoricaProfit> selectByExample(CombinationHistoricaProfitExample example);

	CombinationHistoricaProfit selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") CombinationHistoricaProfit record, @Param("example") CombinationHistoricaProfitExample example);

	int updateByExample(@Param("record") CombinationHistoricaProfit record, @Param("example") CombinationHistoricaProfitExample example);

	int updateByPrimaryKeySelective(CombinationHistoricaProfit record);

	int updateByPrimaryKey(CombinationHistoricaProfit record);

}