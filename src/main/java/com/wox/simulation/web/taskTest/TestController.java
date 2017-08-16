package com.wox.simulation.web.taskTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * 描述：测试使用，调用页面
 * @author wuhaixu
 * @created 2017年8月7日 下午3:44:49
 * @since
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
	
//	@RequestMapping(value = "", method = RequestMethod.GET)
	@RequestMapping(method = RequestMethod.GET)
	public String testweqwe(){
		return "test/info";
	}
}
