<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="/static/js/security.js"></script>
<script src="https://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
</head>
<body>
<h3>test</h3>

<span id="password">*</span>

<span id="name">#</span>


<span>${public}</span>

<span>${modulus}</span>

<span>${private}</span>
<script type="text/javascript">
var exponent = '${public}';
var modulus = '${modulus}';
var key = RSAUtils.getKeyPair(exponent, '', modulus);
var pwd = '我爱你';
var jiami = RSAUtils.encryptedString(key, encodeURIComponent(pwd));
$("#password").html(jiami);

var jiemi = RSAUtils.decryptedString(key, jiami);
$("#name").html(jiemi);

</script>


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