/**
 * 新浪API等先关问题
 * 跨域问题，暂时放弃使用ajax
 * 吴海旭
 * 2017年8月21日14:39:56
 */
var sina = {
	//链接使用
	URL : {
		//雪球api调用链接
		sinaUrl : 'http://hq.sinajs.cn',
		//个股行情链接
		largeOftenStock : '/list'
	},
	//行情指数
	tradeStock : function(){
		var url = sina.URL.sinaUrl + sina.URL.largeOftenStock;
		var param = '=s_sh000001,s_sz399001,s_sz399006';
		config.ajaxGet(url, param, function(result){
			console.log(result);
		});
	}
}
