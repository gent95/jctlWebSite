<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp" %>
<html>
<head>
    <title>集萃通联</title>
    <script type="application/javascript" src="${ctxStatic}/jquery/jquery-1.8.3.min.js"></script>
    <script type="application/javascript">
        $(function () {
            var con=$("[name='con']").val();

            $(".context").html(con);
        });
    </script>
</head>
<body>
<div style="font-family:'Microsoft YaHei UI'; ">
    <%@ include file="/WEB-INF/views/web/default/default.jsp" %>
    <%--<div id="banner" style=" width:1920px; height:400px">--%>
        <%--<img src="${ctxStatic}/frontImg/homepage/banner.png" />--%>
    <%--</div>--%>
    <div id="center" style=" width:1200px; margin:0 auto" >
        <div id="hang" style=" width:1200px; height:80px; border-bottom:1px solid #e3e3e3">
            <div style="font-size:18px; color:#343434; float:left; margin-top:46px">技术支持&gt;</div>
            <div style="font-size:18px; color:#0068b7; float:left; margin-top:46px">资料下载</div>
        </div>
        <div style="width: 1200px; height: 80px;border-bottom: 1px dashed #e3e3e3; ">
            <div style=" width: 340px; height: 26px; font-size: 24px; color: #292929;  float: left; margin-top: 36px;">${resDow.name}</div>
            <a href="#"><div style=" width:103px; height:44px; background-color:#55a1db; border-radius:3px; float:left; margin-left: 750px; margin-top: 26px;  text-align:center; line-height:44px; color:#FFF">下载(${resDow.size})</div></a>
        </div>
        <div style="width: 1200px; height: 70px;">
            <div style="float: left; margin-top: 18px; font-size: 14px; color: #b5b5b5;">时间:<fmt:formatDate value="${resDow.addTime}" pattern="yyyy-MM-dd"/></div>
            <a href="#"><div style=" font-size:12px; color:#b0b0b0; margin-top:18px; float:left; margin-left:45px"><img src="${ctxStatic}/frontImg/content/eye.png"/>${resDow.browsecount}</div></a>
            <a href="#"><div style=" font-size:12px; color:#b0b0b0; margin-top:18px; float:left; margin-left:45px"><img src="${ctxStatic}/frontImg/content/down.png"/>${resDow.downloadcount}</div></a>
        </div>
        <div>
            <input type="hidden" value="${resDow.context}" name="con"/>
            <div class="context" style="width: 1200px; height: auto; font-size: 16px; color:#272626; line-height: 28px; text-indent: 2em;">
                ${resDow.context}

            </div>
            <br>
            <br>
            <br>
            <br>
        </div>
    </div>
    <footer>
        <%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/footer.jsp" %>
    </footer>
</div>
</body>
</html>

