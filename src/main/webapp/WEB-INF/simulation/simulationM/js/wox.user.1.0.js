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
	},
	ajax : function(ApiUrl, dataParam, callback){
		$.ajax({
			url : ApiUrl,
			type: "get",
			dataType : 'jsonp',
			jsonp: "callback",
			data : dataParam,
            success : callback
		});
	},
	login : function(dataParam){
		var url = config.crossDomainUrl + user.API.login;
		user.ajax(url, dataParam, function(result){
			console.log(result);
			console.log(config.unicodeToChinese(result.data));
		});
	},
	found : function(dataParam){
		var url = config.crossDomainUrl + user.API.found;
		user.ajax(url, dataParam, function(result){
			console.log(result);
		});
	}
}
