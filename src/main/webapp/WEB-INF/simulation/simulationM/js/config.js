/**
 * 全局变量
 * 吴海旭
 * 2017年8月18日17:27:59
 */
var config = {
	//跨域使用url
	crossDomainUrl : 'http://127.0.0.1:8080',
	//unicode解中文
	unicodeToChinese : function(data){
	    if(data == '') return '请输入十六进制unicode';
	    data = data.split("\\u");
	    var str ='';
	    for(var i=0;i<data.length;i++)
	    {
	        str+=String.fromCharCode(parseInt(data[i],16).toString(10));
	    }
	    return str;
	}
}
