<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>WEB-v2.0</title>
<!-- 导航栏 -->
<link rel="stylesheet" type="text/css" href="/static/css/navbox.css">
<!-- 轮播css -->
<link rel="stylesheet" type="text/css" href="/static/css/slide_container.css">
</head>
<body>
	
	<!-- 导航栏 开始 -->
	<%@ include file="common/navig.jsp" %>
	<!-- 导航栏 结束 -->
	
	<!-- 轮播 开始 -->
    <!-- <div class="slide_container">
      <ul class="rslides" id="slider">
        <li>
          <img src="/static/img/1.jpg" alt="">
          <p class="caption">标题1</p>
        </li>
        <li>
          <img src="/static/img/2.jpg" alt="">
          <p class="caption">标题2</p>
        </li>
        <li>
          <img src="/static/img/3.jpg" alt="">
          <p class="caption">标题3</p>
        </li>
      </ul>
    </div>
     -->
	<!-- 轮播 结束 -->
	
	<!-- 正文 开始 -->
	<div class="row" style="background-color: #ccc;">
		<div class="col-md-3">.col-md-3</div>
		<div class="col-md-3">.col-md-3</div>
		<div class="col-md-3">.col-md-3</div>
		<div class="col-md-3">.col-md-3</div>
		<!-- 产品 开始 -->
		<!-- 产品 结束 -->
		
		<!-- 新闻 开始 -->
		<!-- 新闻 结束 -->
	</div>
	<!-- 正文 结束 -->
	
	<!-- 版权说明 开始 -->
	<%@ include file="common/footer.jsp" %>
	<!-- 版权说明 结束 -->
<script src="https://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/ResponsiveSlides.js/1.54/responsiveslides.min.js"></script>
<script>
	$(function () {
		
		/*
			当使用jsp的时候，可以使用include导入
			将该jquery方法，转化为.js文件
		*/
		//导航栏
		$(".drop-menu-effect").each(function(){
			var $this = $(this);
			var theMenu = $this.find(".submenu");
			var tarHeight = theMenu.height();
			theMenu.css({height:0});
			$this.hover(
				function(){
					$(this).addClass("mj_hover_menu");
					theMenu.stop().show().animate({height:tarHeight},400);
				},
				function(){
					$(this).removeClass("mj_hover_menu");
					theMenu.stop().animate({height:0},400,function(){
						$(this).css({display:"none"});
					});
				}
			);
		});
	
		//轮播
		$("#slider").responsiveSlides({
			auto: true,
			pager: false,
			nav: true,
			speed: 500,
			// 对应外层div的class : slide_container
			namespace: "slide"
			});
		});
</script>
</body>
</html>