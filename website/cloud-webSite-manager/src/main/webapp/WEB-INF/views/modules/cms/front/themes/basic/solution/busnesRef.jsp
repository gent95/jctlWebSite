
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>${solution.navList.name}</title>
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
            margin-bottom: 42px;
        }

        #content_tit p {
            margin-bottom:30px;
        }

        #content_txt {
            font-size: 16px;
            color: #343434;
        }


    </style>
</head>

<body>
<header>
   <%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/layouts/default.jsp" %>
    <div id="banner" style="background: <c:if test="${type=='智慧农业'}">url(${ctxStatic}/frontImg/solution/nongyeBanner.png) no-repeat top</c:if>
            <c:if test="${type=='智慧园区'}">url(${ctxStatic}/frontImg/solution/yuanquBanner.png) no-repeat top</c:if>
            <c:if test="${type=='智慧社区'}">url(${ctxStatic}/frontImg/solution/shequBanner.png) no-repeat top</c:if>
            "></div>
</header>
<article>
    <div id="art_nav">
        ${type}&gt;

        <a href="javascript:void(0)"> ${solution.navList.name}</a>
    </div>
    <div id="content_tit">
        <p> ${solution.title}</p>
        <img src="${solution.picPath}" />
    </div>
    <div id="content_txt">
        <p style="line-height: 30px;">
            &nbsp;&nbsp;&nbsp;&nbsp;${solution.content}</p>
        <br />
    </div>
</article>

<%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/footer.jsp" %>
</body>

</html>
