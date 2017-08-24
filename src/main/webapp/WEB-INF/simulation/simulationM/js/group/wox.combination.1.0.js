/**
 * 组合使用
 */
var group = {
	API : {
		//收益率排行
		ranking : '/combination/ranking',
		//查询单个组合
		inquiry : '/combination/inquiry',
		//创建
		found : '/combination/found'
	},
	//创建组合
	found : function(dataParam, callback){
		var url = config.crossDomainUrl + group.API.found;
		config.ajaxJsonp(url, dataParam, callback);
	},
	//查询收益率排行
	queryRanking : function(dataParam, callback){
		var url = config.crossDomainUrl + group.API.ranking;
		config.ajaxJsonp(url, dataParam, callback);
	},
	//查询单个组合详情
	queryInquiry : function(dataParam, callback){
		var url = config.crossDomainUrl + group.API.inquiry;
		config.ajaxJsonp(url, dataParam, callback);
	}
}
