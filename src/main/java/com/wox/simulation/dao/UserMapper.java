package com.wox.simulation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wox.core.feature.orm.mybatis.Page;
import com.wox.core.generic.GenericDao;
import com.wox.simulation.entity.User;
import com.wox.simulation.entity.UserExample;

/**
 * 
 * 描述：用户Dao
 * @author wuhaixu
 * @created 2017年8月16日 下午5:52:14
 * @since
 */
public interface UserMapper extends GenericDao<User, Long> {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 用户登录验证查询
     * 
     * @param record
     * @return
     */
    User authentication(@Param("record") User record);

    /**
     * 分页条件查询
     * 
     * @param page
     * @param example
     * @return
     */
    List<User> selectByExampleAndPage(Page<User> page, UserExample example);
}