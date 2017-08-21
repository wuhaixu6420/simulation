/**
 * 雪球网API等先关问题
 * 跨域问题，暂时放弃使用雪球
 * 吴海旭
 * 2017年8月21日14:05:43
 */
var snowball = {
	//链接使用
	URL : {
		//雪球api调用链接
		snowballUrl : 'https://xueqiu.com',
		//个股行情链接
		largeOftenStock : '/v4/stock/quotec.json'
	},
	//行情指数
	tradeStock : function(){
		var url = snowball.URL.snowballUrl + snowball.URL.largeOftenStock;
		var timestamp = Date.parse(new Date());
		var param = 'code=SH000001,SZ399001,SZ399006&_=' + timestamp;
		config.ajaxGet(url, param, function(result){
			console.log(result);
		});
	}
}
