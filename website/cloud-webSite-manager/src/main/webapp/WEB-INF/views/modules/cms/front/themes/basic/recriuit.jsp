<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/27 0027
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <title>产品介绍</title>
    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
            text-decoration: none;
            font-family: "微软雅黑";
        }
        article {
            height: auto;
            width: auto;
            padding: 0 364px 0 364px;
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
        #content_tit p a{
            margin-right: 53px;
            width:74px;
            height:42px;
        }

        #content_txt {
            font-size: 16px;
            color: #343434;
            width: 1195px;
            margin: 0 auto 0 auto;
        }
    </style>
</head>

<body>
<%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/layouts/default.jsp" %>
<img src="http://192.168.0.10:8085/1482832808094.png" />
<article>
    <div id="art_nav">
        关于我们&gt;
        <a href="#">招聘职位</a>
    </div>
    <div id="content_tit">
        <p><a href="#">全部</a><a href="#">设计</a><a href="#">运营</a></p>
    </div>
    <div id="content_txt">

    </div>
</article>
<%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/footer.jsp" %>
</body>

</html>