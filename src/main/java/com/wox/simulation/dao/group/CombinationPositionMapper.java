package com.wox.simulation.dao.group;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wox.core.generic.GenericDao;
import com.wox.simulation.entity.group.CombinationPosition;
import com.wox.simulation.entity.group.CombinationPositionExample;

/**
 * 
 * 描述：组合持仓Dao
 * @author wuhaixu
 * @created 2017年8月16日 上午11:03:32
 * @since
 */
public interface CombinationPositionMapper extends GenericDao<CombinationPosition, Long> {
	
	int countByExample(CombinationPositionExample example);

	int deleteByExample(CombinationPositionExample example);

	int deleteByPrimaryKey(Long id);

	int insert(CombinationPosition record);

	int insertSelective(CombinationPosition record);

	List<CombinationPosition> selectByExample(CombinationPositionExample example);

	CombinationPosition selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") CombinationPosition record, @Param("example") CombinationPositionExample example);

	int updateByExample(@Param("record") CombinationPosition record, @Param("example") CombinationPositionExample example);

	int updateByPrimaryKeySelective(CombinationPosition record);

	int updateByPrimaryKey(CombinationPosition record);

}