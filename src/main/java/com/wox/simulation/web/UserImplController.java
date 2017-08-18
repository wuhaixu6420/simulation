package com.wox.simulation.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wox.simulation.exception.UserException;
import com.wox.simulation.service.UserService;
import com.wox.simulation.util.DataResult;
import com.wox.simulation.util.ObjectUtil;

/**
 * 
 * 描述：组合接口模块
 * @author wuhaixu
 * @created 2017年8月16日 下午3:58:15
 * @since
 */
@Controller
@RequestMapping(value = "/user")
public class UserImplController extends BaseController {
	
	@Resource
	private UserService userService;
	
	/**
	 * 
	 * 描述：用于用户登录使用
	 * @author wuhaixu
	 * @created 2017年8月17日 下午2:46:40
	 * @since 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	@ResponseBody
	public String userLogin(HttpServletRequest request){
		DataResult<?> dataResult = null;
		String callback = request.getParameter("callback");
		String username = request.getParameter("username");
		if(ObjectUtil.isEmpty(username)){
			dataResult = new DataResult<String>(false, "请输入用户名");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		String password = request.getParameter("password");
		if(ObjectUtil.isEmpty(password)){
			dataResult = new DataResult<String>(false, "请输入密码用户名");
			return ObjectUtil.jsonp(callback, dataResult);
		}
		try {
			dataResult = userService.authentication(username, password);
		} catch (UserException e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		} catch (Exception e){
			dataResult = new DataResult<String>(false, e.getMessage());
		}
		return ObjectUtil.jsonp(callback, dataResult);
	}
	
	/**
	 * 
	 * 描述：创建用户
	 * @author wuhaixu
	 * @created 2017年8月17日 下午3:15:57
	 * @since 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/found", method=RequestMethod.GET)
	@ResponseBody
	public DataResult<?> createUser(HttpServletRequest request){
		//昵称
		String name = request.getParameter("name");
		if(ObjectUtil.isEmpty(name)){
			return new DataResult<String>(false, "请输入昵称");
		}
		//用户名
		String username = request.getParameter("username");
		if(ObjectUtil.isEmpty(username)){
			return new DataResult<String>(false, "请输入用户名");
		}
		//密码
		String password = request.getParameter("password");
		if(ObjectUtil.isEmpty(password)){
			return new DataResult<String>(false, "请输入密码");
		}
		//确认密码
		String checkpassword = request.getParameter("checkpassword");
		if(ObjectUtil.isEmpty(checkpassword)){
			return new DataResult<String>(false, "请输入确认密码");
		}
		//密码是否相等
		if(!password.equals(checkpassword)){
			return new DataResult<String>(false, "密码与确认密码不相符");
		}
		DataResult<?> dataResult = null;
		try {
			//创建用户只是用密码
			dataResult = userService.createUser(name, username, password);
		} catch (UserException e) {
			dataResult = new DataResult<String>(false, e.getMessage());
		} catch (Exception e){
			dataResult = new DataResult<String>(false, e.getMessage());
		}
		return dataResult;
	}
	
}
