<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>test</h3>
<script src="https://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript">
	//js源生定时器
	window.setInterval(xueqiuTest,1000); 
	
	function xueqiuTest(){
		var url = "https://xueqiu.com/stock/pankou.json?symbol=SZ000728&_=1501472548400";
		$.get(url,function(result){
			console.log(result);
		});
	}
</script>
</body>
</html>