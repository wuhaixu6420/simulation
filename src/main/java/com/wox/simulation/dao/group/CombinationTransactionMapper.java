package com.wox.simulation.dao.group;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wox.core.generic.GenericDao;
import com.wox.simulation.entity.group.CombinationTransaction;
import com.wox.simulation.entity.group.CombinationTransactionExample;

/**
 * 
 * 描述：组合交易记录Dao
 * @author wuhaixu
 * @created 2017年8月16日 上午11:03:43
 * @since
 */
public interface CombinationTransactionMapper extends GenericDao<CombinationTransaction, Long> {
	
	int countByExample(CombinationTransactionExample example);

	int deleteByExample(CombinationTransactionExample example);

	int deleteByPrimaryKey(Long id);

	int insert(CombinationTransaction record);

	int insertSelective(CombinationTransaction record);

	List<CombinationTransaction> selectByExample(CombinationTransactionExample example);

	CombinationTransaction selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") CombinationTransaction record, @Param("example") CombinationTransactionExample example);

	int updateByExample(@Param("record") CombinationTransaction record, @Param("example") CombinationTransactionExample example);

	int updateByPrimaryKeySelective(CombinationTransaction record);

	int updateByPrimaryKey(CombinationTransaction record);

}