package com.wox.simulation.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.wox.simulation.common.BaseConstant;


/**
 * 用户身份验证,授权 Realm 组件
 * 
 * @author Y_Y
 * @since 2014年6月11日 上午11:35:28
 **/
@Component(value = "securityRealm")
public class SecurityRealm extends AuthorizingRealm {
	
	private static Logger logger = LoggerFactory.getLogger(SecurityRealm.class);

    /**
     * 权限检查
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    	logger.info(Thread.currentThread().getStackTrace()[1].getMethodName() + BaseConstant.START);
        logger.info(Thread.currentThread().getStackTrace()[1].getMethodName() + BaseConstant.END);
        return null;
    }

    /**
     * 登录验证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
    	logger.info(Thread.currentThread().getStackTrace()[1].getMethodName() + BaseConstant.START);
        logger.info(Thread.currentThread().getStackTrace()[1].getMethodName() + BaseConstant.END);
        return null;
    }
    
}
