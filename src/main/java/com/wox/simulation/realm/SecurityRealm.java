package com.wox.simulation.realm;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.wox.simulation.entity.User;
import com.wox.simulation.service.UserService;
import com.wox.simulation.util.DataResult;

/**
 * 用户身份验证,授权 Realm 组件
 * 
 * @author Y_Y
 * @since 2014年6月11日 上午11:35:28
 **/
@Component(value = "securityRealm")
public class SecurityRealm extends AuthorizingRealm {

	private static Logger logger = LoggerFactory.getLogger(SecurityRealm.class);

	@Resource
	private UserService userService;

	/**
	 * 权限检查
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		return null;
	}

	/**
	 * 登录验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
		AuthenticationInfo authenticationInfo = null;
		DataResult<?> dataResult = null;
		try {
			String username = String.valueOf(usernamePasswordToken.getUsername());
			// 从前端进来的密码是需要进行 RSA解密和MD5加密的
			String password = String.valueOf(usernamePasswordToken.getPassword());
			// 通过用户验证，查询用户信息
			dataResult = userService.authentication(username, password);
			if (dataResult.isType()) {
				User user = (User) dataResult.getData();
				authenticationInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
			} else {
				logger.info("用户验证失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return authenticationInfo;
	}

}
