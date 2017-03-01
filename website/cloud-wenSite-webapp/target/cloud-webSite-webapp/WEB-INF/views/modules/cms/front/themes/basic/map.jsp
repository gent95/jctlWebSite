<%--
  Created by IntelliJ IDEA.
  User: dream
  Date: 2016/12/19
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp" %>
<html>
<head>
    <title>集萃通联</title>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=6wZKTph0LMlmZfSrAdGgwgueYF3qVOoZ"></script>
</head>
<body>
<%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/layouts/default.jsp" %>
<div style="font-family:'Microsoft YaHei UI'">

    <div id="tittle" style="width:1920px; height:82px;">
        <div id="nav" style="width:1120px; height:82px; margin:0 auto;"></div>
        <div id="logo" style="width:164px; width:82px;"></div>
        <div id="nav_r"></div>
    </div>
    <div id="banner" style="background-image: url('${ctxStatic}/frontImg/banner6.png')">
    </div>
    <div id="center" style=" width:1920px; height:902px;">
        <div id="addres" style="width:1200px; height:367px; margin:0 auto; color:#1f1f1f;">
            <div style="width:1200px; height:80px; border-bottom:1px solid #e3e3e3">
                <div style="float:left; color:#343434; font-size:18px; margin-top:30px">联系我们&gt;</div>
                <div style="float:left; color:#0068b7; font-size:18px; margin-top:30px">公司地址&地图</div>
            </div>
            <div style="width:1000px; height:80px; border:1px solid #fff">
                <div style="font-size:26px; margin-top:20px">公司地址&地图</div>
            </div>
            <div style="width:1000px; height:36px;">
                <div style="font-weight:bold; float:left">公司地址：</div>
                <div style=" float:left">北京市丰台区马家堡路23号供销弘泰大厦</div>
            </div>
            <div style="width:1000px; height:36px;">
                <div style="font-weight:bold; float:left">联系人：</div>
                <div style=" float:left">集萃通联</div>
            </div>
            <div style="width:1000px; height:36px;">
                <div style="font-weight:bold; float:left">联系电话：</div>
                <div style=" float:left">010-1524-2258</div>
            </div>
            <div style="width:1000px; height:36px;">
                <div style="font-weight:bold; float:left">传真：</div>
                <div style=" float:left">010-1524-2258</div>
            </div>
            <div style="width:1000px; height:36px;">
                <div style="font-weight:bold; float:left">E-mail：</div>
                <div style=" float:left">5489750245@163.com</div>
            </div>

        </div>
        <div id="map" style="width:1200px; height:494px; margin:0 auto; border:1px solid #CCC"></div>
    </div>

</div>
<footer>
    <%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/footer.jsp" %>
</footer>
</body>

</html>
<script type="text/javascript">
    var map = new BMap.Map("map");
    map.centerAndZoom(new BMap.Point(116.391738, 39.871366), 18);
    map.enableScrollWheelZoom(true); //启用滚轮放大缩小，默认禁用
    map.enableContinuousZoom(); //启用地图惯性拖拽，默认禁用
    var localSearch = new BMap.LocalSearch(map);
    localSearch.enableAutoViewport(); //允许自动调节窗体大小
    var sContent = "<p style='font-size:16px; color:#ff8f13; margin-top:10px'>北京集萃通联科技有限公司</p>" +
            "<p style='font-size:16px; color:#2e2e2e'>北京市丰台区马家堡路23号院供销弘泰大厦</p>";
    var point = new BMap.Point(116.391738, 39.871366); //默认
    var infoWindow = new BMap.InfoWindow(sContent); // 创建信息窗口对象
    map.openInfoWindow(infoWindow, point);
</script>
