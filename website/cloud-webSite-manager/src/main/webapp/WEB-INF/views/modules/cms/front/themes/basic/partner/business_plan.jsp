<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp" %>

<html>
	<head>
		<meta charset="UTF-8">
		<title>企业业务解决方案伙伴计划</title>
	</head>
	<style>
		*{ padding: 0px; margin: 0px;}
		.nav_img{height: 400px; background-image: url(${ctxStatic}/frontImg/partner/jihuaBanner.png);}
		.part_lines{border-bottom: 1px solid #e3e3e3; margin-left: 358px; margin-right: 358px; height: 82px;}
		.partner{height:434px;}
		.breadcrumb > li + li:before {
			    color: #CCCCCC;
			    content: ">";
			    padding: 0 5px;
			    float: left;
			}
			.breadcrumb> li{
				float: left;
			}
			.breadcrumb> li> a{font-family:MicrosoftYaHei ; font-size:18px; color: #343434; text-decoration: none;}
			.partner{height: 290px; margin-top: 30px;margin-left: 385px;}
			.partner> div{float: left; height: 225px;}
			.context_s{width: 710px;margin-left:32px; word-break: break-all; word-wrap: break-word;line-height: 29px; letter-spacing:2px;font-family:MicrosoftYaHei ; font-size:18px; color: #343434;}
			.line{border-bottom: 1px solid #e3e3e3; margin-left: 358px; margin-right: 358px; }
			.renzheng> div >div{ float: left; margin-right: 46px; width:265px; height:338px;word-break: break-all; word-wrap: break-word;}
			.renzheng> div > div> p{margin-top:107px; margin-left: 60px; margin-right: 60px;line-height: 29px; letter-spacing:1px;font-family:MicrosoftYaHei ; font-size:16px; color: #343434; }
			.renzheng> div{ margin-left: 358px; margin-bottom: 53px;}
			.renzheng> p{ text-align: center;font-family:MicrosoftYaHei ; font-size:26px; color: #343434;margin-top: 30px; margin-bottom: 30px;}

	</style>
	<body>
		<div>
			<%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/layouts/default.jsp" %>
		<div class="nav_img"></div>
		<div>
				<div class="part_lines" >
					<ol class="breadcrumb" style="list-style: none; padding-top: 45px;">
								<li><a href="#">合作伙伴</a></li>
								<li class="active" style="color: #0068b7;font-family:MicrosoftYaHei ; font-size:18px; ">企业业务解决方案伙伴计划</li>
						</ol>
				</div>
		</div>
			<div class="partner">
			<div style="background-image: url(${ctxStatic}/frontImg/partner/006.png); width: 400px;"></div>
			<div class="context_s">爱国文化安宏伟韩国人更好玩而毫无二回头我去人头狗求我二球过去热帖未如期我饿爱国文化安宏伟韩,国人更好玩而毫无二回头我去人头狗求我二
				球过去热帖未如期我饿爱国文化安宏伟韩国人更好玩而毫无二回头我去人头狗求我二球过去热帖未如期我饿爱国文化安宏伟韩国da.m,
				人更好玩而毫无二回头我去人头狗求我二球过去热帖未c,如期我饿爱国文化安宏伟韩国人更好玩而毫无二回,头我去人头狗求我二球过去热帖未如期我饿</div>
		</div>
		<div class="line"></div>
		<div class="renzheng" style="height: 483px;">
			<p style="text-align: center;">技术认证种类</p>
			<div>
				<div style="background-image:url(${ctxStatic}/frontImg/partner/01.png);">
					<p>为偶尔会轻微而华为软件das额无人区IQ位二</p>
				</div>
				<div style="background-image:url(${ctxStatic}/frontImg/partner/02.png);">
					<p>为偶尔会轻微而华为软件das额无人区IQ位二</p>
				</div>
				<div style="background-image:url(${ctxStatic}/frontImg/partner/03.png);">
					<p>为偶尔会轻微而华为软件das额无人区IQ位二</p>
				</div>
				<div style="background-image:url(${ctxStatic}/frontImg/partner/04.png);">
					<p>为偶尔会轻微而华为软件das额无人区IQ位二</p>
				</div>
			</div>
		</div>

			<%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/footer.jsp" %>
		</div>
	</body>
</html>
