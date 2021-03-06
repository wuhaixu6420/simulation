/**
 * 用户相关文件
 * wuhaixu
 * 2017年8月18日17:26:30
 */
var user = {
	API : {
		//用户登录
		login : '/user/login',
		//用户注册
		found : '/user/found',
		//加密使用
		getRSA : '/user/getRSA'
	},
	rsa : function(callback){
		var url = config.crossDomainUrl + user.API.getRSA;
		var dataParam = "";
		config.ajaxJsonp(url, dataParam, callback);
	},
	login : function(dataParam, callback){
		var url = config.crossDomainUrl + user.API.login;
		config.ajaxJsonp(url, dataParam, callback);
	},
	found : function(dataParam, callback){
		var url = config.crossDomainUrl + user.API.found;
		config.ajaxJsonp(url, dataParamcallback);
	}
}
