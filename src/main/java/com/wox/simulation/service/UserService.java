package com.wox.simulation.service;

import com.wox.simulation.entity.User;
import com.wox.simulation.exception.UserException;
import com.wox.simulation.util.DataResult;


/**
 * 
 * 描述：用户
 * @author wuhaixu
 * @created 2017年8月16日 下午5:56:43
 * @since
 */

public interface UserService {

	/**
	 * 
	 * 描述：通过用户id，检查用户是否存在，如果存在，返回该用户信息
	 * @author wuhaixu
	 * @created 2017年8月16日 下午5:59:58
	 * @since 
	 * @param userid
	 * @return
	 * @throws UserException
	 */
	DataResult<?> checkUser(String userid) throws UserException;
	
	DataResult<?> authentication(User user);
}
