package com.wox.simulation.service;

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
	
	/**
	 * 
	 * 描述：登录检查
	 * @author wuhaixu
	 * @created 2017年8月16日21:06:43
	 * @since 
	 * @param username
	 * @param password
	 * @return
	 * @throws UserException
	 * @throws Exception 
	 */
	DataResult<?> authentication(String username, String password) throws UserException, Exception;
	
	/**
	 * 
	 * 描述：创建用户
	 * @author wuhaixu
	 * @created 2017年8月17日 下午3:05:04
	 * @since 
	 * @param name
	 * @param username
	 * @param password
	 * @return
	 * @throws UserException
	 * @throws Exception 
	 */
	DataResult<?> createUser(String name, String username, String password) throws UserException, Exception;
}
