<%@page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<title>404 - 页面不存在</title>
	<%@include file="/WEB-INF/views/include/head.jsp" %>
</head>

<style>
	.footer{
		position: relative;
		bottom:0px ;
	}
	.logo{
		text-align: center;
		margin-top: 10%;
	}
	.logo p{
		font-size: 30px;
		color: white;
		margin-top: 30px;
		margin-bottom: 30px;
	}
	.search{
		text-align: center;
		margin-bottom: 30px;
	}
	.search > span > input{
		width: 380px;
		height: 42px;
		margin: 0px;
	}
	.se{
		margin-top: -10px;
		margin-left:-10px;
	}
	.rtu {
		text-align: center;
	}
	.rtu a{
		color: #0bbbee;
		margin-right: 100px;
		font-size: 24px;
		border-bottom: 1px solid #0bbbee;
	}
	input::-webkit-input-placeholder { /* WebKit browsers */
		font-size: 20px;
	}
	input:-moz-placeholder { /* Mozilla Firefox 4 to 18 */
		font-size: 20px;
	}
	input::-moz-placeholder { /* Mozilla Firefox 19+ */
		font-size: 20px;
	}
	input:-ms-input-placeholder { /* Internet Explorer 10+ */
		font-size: 20px;
	}

</style>
<script type="application/javascript" src="${ctxStatic}/jquery/jquery-1.8.3.min.js"></script>
<script type="application/javascript">
	var rootPath = getRootPath();
	$(function(){
		$(".rtu").children().eq(1).attr("href",rootPath);
	});
	$(document).keypress(function(e) {
		// 回车键事件
		if(e.which == 13) {
			alert("ssss");
		}
	});
	function  Insearch(){
		alert("bt");
	}
	/*获取前台路径*/
	function getRootPath() {
		var curWwwPath = window.document.location.href;
		var pathName = window.document.location.pathname;
		var pos = curWwwPath.indexOf(pathName);
		var localhostPath = curWwwPath.substring(0, pos);
		if ("localhost".indexOf(localhostPath) || "192.168".indexOf(localhostPath)) {
			return localhostPath;
		}

		var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
		return (localhostPath + projectName);
	}
</script>
<body style="background: #1a3c57">
<div class="logo">
	<img  src="/static/frontImg/error/404.png">
	<p>很遗憾，您搜索的页面找不到了！</p>
</div>

<div class="search">
	<span><input type="text"  placeholder="本站搜索" /></span>
	<span class="se"><img src="/static/frontImg/error/sou.png" onclick="Insearch()"/></span>
</div>
<div class="rtu">
	<a href="#" onclick="history.go(-1)">返回上一页</a>
	<a href="#" style="margin-right: 0px;">返回首页</a>
</div>

<img class="footer" src="/static/frontImg/error/earth.png">
</body>
</html>