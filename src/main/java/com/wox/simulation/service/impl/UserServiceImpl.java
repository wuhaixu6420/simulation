package com.wox.simulation.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wox.simulation.dao.UserMapper;
import com.wox.simulation.entity.User;
import com.wox.simulation.entity.UserExample;
import com.wox.simulation.exception.UserException;
import com.wox.simulation.service.UserService;
import com.wox.simulation.util.DataResult;
import com.wox.simulation.util.ObjectUtil;

/**
 * 
 * 描述：用户
 * @author wuhaixu
 * @created 2017年8月16日 下午5:56:43
 * @since
 */
@Service
public class UserServiceImpl implements UserService{
	
	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	/**
	 * 用户Dao
	 */
	@Resource
	private UserMapper userMapper;
	
	@Override
	public DataResult<?> checkUser(String userid) throws UserException {
		logger.info("用户查询： userid = " + userid);
		UserExample userExample = new UserExample();
		//这里对用户id做了转化，也是因为mysql的原因，直接使用userid
		userExample.createCriteria().andIdEqualTo(Long.valueOf(userid));
		//查询用户信息
		List<User> userList = userMapper.selectByExample(userExample);
		if(ObjectUtil.isEmpty(userList) || userList.isEmpty()){
			return new DataResult<String>(false, "当前用户id，不存在用户。");
		}
		//用户id唯一，用户唯一
		return new DataResult<User>(true, userList.get(0));
	}

	@Override
	public DataResult<?> authentication(String username, String password) throws UserException {
		logger.info("用户检查： username = " + username + ";password = " + password);
		UserExample userExample = new UserExample();
		//考虑password是前端加密传值
		//需要考虑前端使用rsa进行加密，所以需要添加rsa加密接口
		userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
		//查询用户
		List<User> userList = userMapper.selectByExample(userExample);
		if(ObjectUtil.isEmpty(userList) || userList.isEmpty()){
			return new DataResult<String>(false, "当前用户id，不存在用户。");
		}
		//用户id唯一，用户唯一
		return new DataResult<User>(true, userList.get(0));
	}

}
