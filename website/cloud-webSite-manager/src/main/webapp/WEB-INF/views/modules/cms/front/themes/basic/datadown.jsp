<%--
  Created by IntelliJ IDEA.
  User: dream
  Date: 2016/12/19
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp" %>
<html>
<head>
    <title>资料下载详情</title>
</head>
<body>
<div style="font-family:'Microsoft YaHei UI'; ">
    <%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/layouts/default.jsp" %>
    <%--<div id="banner" style=" width:1920px; height:400px">--%>
        <%--<img src="${ctxStatic}/frontImg/homepage/banner.png" />--%>
    <%--</div>--%>
    <div id="center" style=" width:1200px; height:1052px; margin:0 auto" >
        <div id="hang" style=" width:1200px; height:80px; border-bottom:1px solid #e3e3e3">
            <div style="font-size:18px; color:#343434; float:left; margin-top:46px">技术支持&gt;</div>
            <div style="font-size:18px; color:#0068b7; float:left; margin-top:46px">资料下载</div>
        </div>
        <div style="width: 1200px; height: 80px;border-bottom: 1px dashed #e3e3e3; ">
            <div style=" width: 290px; height: 26px; font-size: 24px; color: #292929;  float: left; margin-top: 36px;">${resDow.name}</div>
            <a href="#"><div style=" width:103px; height:44px; background-color:#55a1db; border-radius:3px; float:left; margin-left: 800px; margin-top: 26px;  text-align:center; line-height:44px; color:#FFF">下载(${resDow.size})</div></a>
        </div>
        <div style="width: 1200px; height: 70px;">
            <div style="float: left; margin-top: 18px; font-size: 14px; color: #b5b5b5;">时间:<fmt:formatDate value="${resDow.addTime}" pattern="yyyy-MM-dd"/></div>
            <a href="#"><div style=" font-size:12px; color:#b0b0b0; margin-top:18px; float:left; margin-left:45px"><img src="${ctxStatic}/frontImg/content/eye.png"/>${resDow.browsecount}</div></a>
            <a href="#"><div style=" font-size:12px; color:#b0b0b0; margin-top:18px; float:left; margin-left:45px"><img src="${ctxStatic}/frontImg/content/down.png"/>${resDow.downloadcount}</div></a>
        </div>
        <div style="width: 1200px; height: 173px;">
            <div style="width: 1200px; height: auto; font-size: 16px; color:#272626; line-height: 28px; text-indent: 2em;">
                ${resDow.context}
            </div>
            <div style=" width: 1197px; height: 513px; margin: 0 auto 0 auto;">
                <img src="${resDow.picPath}" />
            </div>
            <div style="width: 1200px; height: auto; font-size: 16px; color:#272626; line-height: 28px; text-indent: 2em; margin-top: 24px;">
                ${resDow.context}
            </div>
        </div>
    </div>
    <footer>
        <%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/footer.jsp" %>
    </footer>
</div>
</body>
</html>

