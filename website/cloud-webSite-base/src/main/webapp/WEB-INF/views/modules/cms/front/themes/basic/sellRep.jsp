<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/19 0019
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp" %>
<html>

<head>
    <meta charset="utf-8" />
    <title>销售代表</title>
    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
            text-decoration: none;
            font-family: "微软雅黑";
        }

        header {
            height: 82px;
            overflow: hidden;
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

        #content_txt {
            width: 1200px;
            height: auto;
            margin: 0 auto 0 auto;
        }

        #content_tab div {
            float: left;
            text-align: center;
            color: #343434;
            width: 260px;
        }

        #content_tab{
            height: 300px;
        }

        .name{
            height: 40px;
            background-color:#2A2C38;
            opacity: 0.5;
            margin-top: 297px;
            color: #FFFFFF;
            text-align: center;
            line-height: 40px;
        }

        #peop_pic table td{
            height: 337px;
            width: 214px;
            overflow: hidden;
        }
        footer {
            height: 391px;
            background-color: #2a2c38;
            text-align: center;
            color: #FFFFFF;
        }

        #foot_tb {
            margin-bottom: 71px;
            padding-left: 473px;
            padding-top: 57px;
        }

        #foot_nav {
            border-top: #41434d solid 1px;
            padding-top: 30px;
            font-size: 14px;
        }

        #foot_copy {
            font-size: 12px;
        }

        footer a {
            color: #FFFFFF;
        }
    </style>
</head>

<body>
<header>
    <nav style="margin-top: 82px;"></nav>
</header>
<article>
    <div id="art_nav">
        产品介绍&gt;
        <a href="#">农业物联网监控系统</a>
    </div>

    <div id="content_txt">
        <div id="content_tab">
            <div style="margin-right: 158px;">
                <div style="font-size: 23px; color: #62ba69;margin: 87px auto 51px auto;">工作大有不同</div>
                <div>
                    岁月匆匆，思往事，惜流风，一切终无痕，相见欢，别离苦，何日再相逢？ 指尖轻触，推开那扇幸福的门，等待着那个深爱的人，
                </div>
            </div>

            <div style="margin-right: 158px;">
                <div style="font-size: 23px; color: #f6641d;margin: 87px auto 51px auto;">一起做出激动人心的产品</div>
                <div>
                    岁月匆匆，思往事，惜流风，一切终无痕，相见欢，别离苦，何日再相逢？ 指尖轻触，推开那扇幸福的门，等待着那个深爱的人，
                </div>
            </div>

            <div>
                <div style="font-size: 23px; color: #2380cf;margin: 87px auto 51px auto;">与聪明人一起做事</div>
                <div>
                    岁月匆匆，思往事，惜流风，一切终无痕，相见欢，别离苦，何日再相逢？ 指尖轻触，推开那扇幸福的门，等待着那个深爱的人，
                </div>
            </div>
        </div>

        <div id="peop_pic" style="margin:50px auto 43px auto; width: 1200px;">
            <div style="text-align: center; font-size: 25px;">销售代表</div>
            <table cellspacing="56px">
                <tr style="height: 337px; overflow: hidden;">
                    <td background="img/p-10.png">
                        <div class="name">steffen</div>
                    </td>
                    <td background="img/p-11.png">
                        <div class="name">steffen</div>
                    </td>
                    <td background="img/p-12.png">
                        <div class="name">steffen</div>
                    </td>
                    <td background="img/p-13.png">
                        <div class="name">steffen</div>
                    </td>
                </tr>
                <tr style="height: 337px; overflow: hidden;">
                    <td background="img/p-14.png">
                        <div class="name">steffen</div>
                    </td>
                    <td background="img/p-15.png">
                        <div class="name">steffen</div>
                    </td>
                    <td background="img/p-13.png">
                        <div class="name">steffen</div>
                    </td>
                    <td background="img/p-11.png">
                        <div class="name">steffen</div>
                    </td>
                </tr>
            </table>

        </div>
    </div>
</article>
<footer>
    <div id="foot_tb">
        <table width="993px" height="161px">
            <tr style="font-size:18px; font-weight: bold;">
                <td>
                    <a href="#">行业动态</a>
                </td>
                <td>
                    <a href="#">关于我们</a>
                </td>
                <td>
                    <a href="#">联系我们</a>
                </td>
                <td>
                    <a href="#">关注我们</a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="#">行业新闻</a>
                </td>
                <td>
                    <a href="#">网站简介</a>
                </td>
                <td>
                    <a href="#">技术支持</a>
                </td>
                <td rowspan="4">
                    <img src="${ctxStatic}/frontImg/homepage/erweima.png" />
                    <p style="font-size: 12px;">扫描关注<br />集萃通联官方微信</p>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="#">相关政策</a>
                </td>
                <td>
                    <a href="#">公司新闻</a>
                </td>
                <td>
                    <a href="#">销售代表</a>
                </td>

            </tr>
            <tr>
                <td>
                    <a href="#">展会活动</a>
                </td>
                <td>
                    <a href="#">招聘职位</a>
                </td>
                <td>
                    <a href="#">公司&地图</a>
                </td>
            </tr>
            <tr>
                <td colspan="4">
                    <a href="#">我们的想法</a>
                </td>
            </tr>
        </table>
    </div>
    <div id="foot_nav">
        <nav>
            <a href="#">法律声明</a>|
            <a href="#">隐私保护</a>|
            <a href="#">联系我们</a>
        </nav>
    </div>
    <div id="foot_copy">Copyright&copy;2016 北京集萃通联科技有限公司</div>
</footer>
</body>

</html>