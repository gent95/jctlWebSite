<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>联盟伙伴</title>
    <%--<link rel="stylesheet" type="text/css" href="/static/js/layui/css/layui.css">--%>
    <%--<script type="application/javascript" src="/static/js/layui/layui.js"/>--%>
    <script src="${ctxStatic}/jquery/jquery-1.8.3.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="/static/js/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="/static/js/layui/css/global.css" media="all">
    <script src="/static/js/layui/layui.js" charset="utf-8"></script>
    <script src="/static/js/jctl/ajax/ajaxImg.js" charset="utf-8"></script>
    <script src="/static/js/front/js/alliancePartner.js" charset="utf-8"></script>
    <link rel="stylesheet" href="/static/js/front/css/style.css" media="all">
    <%--页面内style--%>
    <script>
        layui.use('element', function () {
            var element = layui.element();

            //监听导航点击
            element.on('nav(demo)', function (elem) {
                layer.msg(elem.text());
            });
        });
    </script>
</head>

<body>
<div class="banner">
    <ul>
        <li>
            <img src="../../../../../static/images/homepage/partner/partner.png"><br>
        </li>
    </ul>

</div>
<div class="breadcrumb">
    <span class="layui-breadcrumb">
      <a href="#">合作伙伴</a>
      <a href="#">合作伙伴展示</a>
      <a href="#">联盟伙伴</a>
    </span>
</div>
<fieldset class="layui-elem-field layui-field-title elem-field"></fieldset>

<%--<div class="partner-company">
    <div >
        <img src="../../../../../static/images/homepage/partner/sap.png"><br>
    </div>
    <div>
        <img src="../../../../../static/images/homepage/partner/accenture.png"><br>
    </div>
    <div >
        <img src="../../../../../static/images/homepage/partner/isoftstone.png"><br>
    </div>
</div>--%>
<table class="partner-company" width="990px">
    <tr>
        <th>
            <img src="../../../../../static/images/homepage/partner/sap.png">
        </th>
        <th>
            <img src="../../../../../static/images/homepage/partner/accenture.png">
        </th>
        <th>
            <img src="../../../../../static/images/homepage/partner/isoftstone.png">
        </th>
    </tr>
    <tr class="partner-title" style="color: #343434">
        <th>SAP SE</th>
        <th>埃森哲</th>
        <th>软通动力信息技术有限公司</th>
    </tr>
    <tr class="partner-title" style="color: #343434;width: 33%" >
        <td valign="top"> SAP SE于1972年在德国成立<br>，主要从事销售<br>软件产品及相关服务。公<br>司的核心业务是销<br>售软件授权解决方案<br>及相关服务<br>，以帮助各种规模的企业更好地管理<br>。公司的主要产品SAP-目前是<br>全世界排名第一<br>的ERP软件。SAP核心解决方案，其中<br>包括标准的业务应用
        </td>
        <td valign="top">这公司很好啊</td>
        <td valign="top"> 这公司很好啊</td>
    </tr>

</table>

</body>
</html>
