package com.wox.simulation.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wox.simulation.dao.UserMapper;
import com.wox.simulation.entity.User;
import com.wox.simulation.entity.UserExample;
import com.wox.simulation.exception.UserException;
import com.wox.simulation.service.UserService;
import com.wox.simulation.util.DataResult;
import com.wox.simulation.util.MD5Utils;
import com.wox.simulation.util.ObjectUtil;
import com.wox.simulation.util.RSAUtils;

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
	public DataResult<?> authentication(String username, String password) throws UserException, Exception {
		logger.info("用户检查： username = " + username + ";password = " + password);
		UserExample userExample = new UserExample();
		//考虑password是前端加密传值
		//前端RSA加密，所以后端进行解密
		//明文密码--->使用RSA解密前端加密的密文
		//js前端传值，是密码的反值，需要翻转密码
		String expressPassword = StringUtils.reverse(RSAUtils.decrypt(password));
//		//密文密码--->使用MD5加密明文
//		String ciphertextPassword = MD5Utils.getEncryptedPwd(expressPassword);
		//通过账户查询用户，然后那查询的用户密码  和解密后的进行对比
		userExample.createCriteria().andUsernameEqualTo(username);
		//查询用户
		List<User> userList = userMapper.selectByExample(userExample);
		if(ObjectUtil.isEmpty(userList) || userList.isEmpty()){
			return new DataResult<String>(false, "当前账户，不存在用户。");
		}
		//获取用户信息
		User user = userList.get(0);
		if(MD5Utils.validPassword(expressPassword, user.getPassword())){
			//用户id唯一，用户唯一
			//防止密码丢失
			user.setPassword("******");
			return new DataResult<User>(true, user);
		} else {
			return new DataResult<String>(true, "密码错误");
		}
	}

	@Override
	public DataResult<?> createUser(String name, String username,
			String password) throws UserException, Exception {
		logger.info("用户创建：name = " + name + " username = " + username + ";password = " + password);
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo(username);
		//检查该用户会否已经存在
		List<User> userList = userMapper.selectByExample(userExample);
		if(ObjectUtil.isNotEmpty(userList) && !userList.isEmpty()){
			return new DataResult<String>(false, "该用户已经存在");
		}
		//创建用户
		User user = new User();
		//昵称
		user.setName(name);
		//用户名
		user.setUsername(username);
		//前端RSA加密，所以后端进行解密
		//明文密码--->使用RSA解密前端加密的密文
		String expressPassword = StringUtils.reverse(RSAUtils.decrypt(password));
		//密文密码--->使用MD5加密明文
		String ciphertextPassword = MD5Utils.getEncryptedPwd(expressPassword);
		//密码
		user.setPassword(ciphertextPassword);
		//插入用户
		int count = userMapper.insert(user);
		if(count == 1){
			return new DataResult<String>(true, "用户创建成功");
		} else {
			throw new UserException("用户创建失败");
		}
	}

	@Override
	public DataResult<?> login(String username, String password) throws UserException, Exception {
		//先验证用户
		DataResult<?> dataResult = authentication(username, password);
		if(dataResult.isType()){
			//如果成功，登录
			//检查考虑是否进行用户登录
			//TODO
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			Subject subject = SecurityUtils.getSubject();
			subject.login(token);
		}
		return dataResult;
	}

}
