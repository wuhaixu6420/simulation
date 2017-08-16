package com.wox.simulation.dao.group;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wox.core.feature.orm.mybatis.Page;
import com.wox.core.generic.GenericDao;
import com.wox.simulation.entity.group.CombinationDetails;
import com.wox.simulation.entity.group.CombinationDetailsExample;

/**
 * 
 * 描述：组合详情Dao
 * @author wuhaixu
 * @created 2017年8月16日 上午11:02:35
 * @since
 */
public interface CombinationDetailsMapper extends GenericDao<CombinationDetails, Long> {
	
	int countByExample(CombinationDetailsExample example);

	int deleteByExample(CombinationDetailsExample example);

	int deleteByPrimaryKey(Long id);

	int insert(CombinationDetails record);

	int insertSelective(CombinationDetails record);

	List<CombinationDetails> selectByExample(CombinationDetailsExample example);

	CombinationDetails selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") CombinationDetails record, @Param("example") CombinationDetailsExample example);

	int updateByExample(@Param("record") CombinationDetails record, @Param("example") CombinationDetailsExample example);

	int updateByPrimaryKeySelective(CombinationDetails record);

	int updateByPrimaryKey(CombinationDetails record);
	
	List<CombinationDetails> selectByExampleAndPage(Page<CombinationDetails> page, CombinationDetailsExample example);

}