<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/19 0019
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp" %>
<html>

<head>

    <meta charset="utf-8" />
    <c:set var="size" value="${fn:length(product)}"/>
    <c:set var="length" value="${fn:length(serve)}"/>
    <title>${serve[length-1].title}${product[size-1].title}</title>
    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
            text-decoration: none;
            font-family: "微软雅黑";
        }

        header {
            height: 482px;
            overflow: hidden;
        }

        #banner {
            <%--background: url(${ctxStatic}/frontImg/content/banner4.png) no-repeat top;--%>
            height: 400px;
            width: auto;
        }

        article {
            height: auto;
            width: auto;
            padding: 0 364px 0 364px;
        }

        #art_nav {
            font-size: 18px;
            height: 80px;
            border-bottom: solid #e3e3e3 1px;
            line-height: 100px;
        }

        #art_nav a {
            color: #0068b7;
        }

        #content_tit {
            font-size: 26px;
            padding-top: 26px;
            width: 1195px;
            margin: 0 auto 42px auto;
        }

        #content_tit p {
            margin-bottom: 30px;
        }

        #content_txt {
            font-size: 16px;
            color: #343434;
            width: 1195px;
            margin: 0 auto 0 auto;
        }

        footer {
            height: 391px;
            background-color: #2a2c38;
            text-align: center;
            color: #FFFFFF;
        }
        footer a {
            color: #FFFFFF;
        }
    </style>

    <script type="text/javascript">
      $(function(){

        })

    </script>
</head>

<body>

<header>
    <%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/layouts/default.jsp" %>
    <div id="banner">
        <img src="${ctxStatic}/frontImg/content/banner4.png"/>
    </div>
</header>
<article>
    <%--<c:set var="size" value="${fn:length(product)}"/>--%>
    <div id="art_nav">

        <c:set var="size" value="${fn:length(product)}"/>
        <c:set var="length" value="${fn:length(serve)}"/>
        ${serve[length-1].navParent}${product[size-1].navParent}&gt;

        <a href="javascript:void(0)">${serve[length-1].title}${product[size-1].title}</a>
    </div>
    <div id="content_tit">
        <p>${product[size-1].title}${serve[length-1].title}</p>
        <img src="${product[size-1].picPath}${serve[length-1].picPath}" />

    </div>
    <div id="content_txt">
        <p style="line-height: 30px;">
            &nbsp;&nbsp;&nbsp;&nbsp;${serve[length-1].context}${product[size-1].context}</p>
        <br />
    </div>
</article>
<%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/footer.jsp" %>
</body>

</html>