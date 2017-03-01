
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>相关资料</title>
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
            background: url(img/banner7.png) no-repeat top;
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
            margin-bottom: 30px;
        }

        #content_txt {
            font-size: 16px;
            color: #343434;
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
    <%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/layouts/default.jsp" %>
</header>
<article>
    <div id="art_nav">
        智慧农业&gt;
        <a href="#">行业介绍</a>
    </div>
    <div id="content_tit">
        <p>行业介绍</p>
    </div>
    <div id="content_txt">
        <p style="line-height: 30px;">
            &nbsp;&nbsp;&nbsp;&nbsp;夜已深，漆黑一片，景物不可见。但山中并不宁静，猛兽咆哮，震动山河，万木摇颤，乱叶簌簌坠落。 群山万壑间，洪荒猛兽横行，太古遗种出没，各种可怕的声音在黑暗中此起彼伏，直欲裂开这天地。 山脉中，远远望去有一团柔和的光隐现，在这黑暗无尽的夜幕下与万山间犹如一点烛火在摇曳，随时会熄灭。 渐渐接近，可以看清那里有半截巨大的枯木，树干直径足有十几米，通体焦黑。除却半截主干外，它只剩下了一条柔弱的枝条，但却在散发着生机，枝叶晶莹如绿玉刻成，点点柔和的光扩散，将一个村子笼罩。 确切的说，这是一株雷击木，在很多年前曾经遭遇过通天的闪电，老柳树巨大的树冠与旺盛的生机被摧毁了。如今地表上只剩下八九米高的一段树桩，粗的惊人，而那仅有的一条柳枝如绿霞神链般，光晕弥漫，笼罩与守护住了整个村子，令这片栖居地朦朦胧胧，犹若一片仙乡，在这大荒中显得很神秘。 村中各户都是石屋，夜深人静，这里祥和而安谧，像是与外界的黑暗还有兽吼隔绝了。 “呜……” 一阵狂风吹过，一片巨大的乌云横空，遮住了整片夜空，挡住了那仅有的一点星华，山脉中更加黑暗了。 一声凶戾的禽鸣自高天传来，穿金裂石，竟源自那片乌云，细看它居然是一只庞大到不可思议的巨鸟，遮天蔽月，长也不知多少里。 路过石村，它俯视下方，两只眼睛宛若两轮血月般，凶气滔天，盯着老柳木看了片刻，最终飞向了山脉最深处。夜已深，漆黑一片，景物不可见。但山中并不宁静，猛兽咆哮，震动山河，万木摇颤，乱叶簌簌坠落。 群山万壑间，洪荒猛兽横行，太古遗种出没，各种可怕的声音在黑暗中此起彼伏，直欲裂开这天地。 山脉中，远远望去有一团柔和的光隐现，在这黑暗无尽的夜幕下与万山间犹如一点烛火在摇曳，随时会熄灭。 渐渐接近，可以看清那里有半截巨大的枯木，树干直径足有十几米，通体焦黑。除却半截主干外，它只剩下了一条柔弱的枝条，但却在散发着生机，枝叶晶莹如绿玉刻成，点点柔和的光扩散，将一个村子笼罩。 确切的说，这是一株雷击木，在很多年前曾经遭遇过通天的闪电，老柳树巨大的树冠与旺盛的生机被摧毁了。如今地表上只剩下八九米高的一段树桩，粗的惊人，而那仅有的一条柳枝如绿霞神链般，光晕弥漫，笼罩与守护住了整个村子，令这片栖居地朦朦胧胧，犹若一片仙乡，在这大荒中显得很神秘。 村中各户都是石屋，夜深人静，这里祥和而安谧，像是与外界的黑暗还有兽吼隔绝了。 “呜……” 一阵狂风吹过，一片巨大的乌云横空，遮住了整片夜空，挡住了那仅有的一点星华，山脉中更加黑暗了。 一声凶戾的禽鸣自高天传来，穿金裂石，竟源自那片乌云，细看它居然是一只庞大到不可思议的巨鸟，遮天蔽月，长也不知多少里。 路过石村，它俯视下方，两只眼睛宛若两轮血月般，凶气滔天，盯着老柳木看了片刻，最终飞向了山脉最深处。
            夜已深，漆黑一片，景物不可见。但山中并不宁静，猛兽咆哮，震动山河，万木摇颤，乱叶簌簌坠落。 群山万壑间，洪荒猛兽横行，太古遗种出没，各种可怕的声音在黑暗中此起彼伏，直欲裂开这天地。 山脉中，远远望去有一团柔和的光隐现，在这黑暗无尽的夜幕下与万山间犹如一点烛火在摇曳，随时会熄灭。 渐渐接近，可以看清那里有半截巨大的枯木，树干直径足有十几米，通体焦黑。除却半截主干外，它只剩下了一条柔弱的枝条，但却在散发着生机，枝叶晶莹如绿玉刻成，点点柔和的光扩散，将一个村子笼罩。 确切的说，这是一株雷击木，在很多年前曾经遭遇过通天的闪电，老柳树巨大的树冠与旺盛的生机被摧毁了。如今地表上只剩下八九米高的一段树桩，粗的惊人，而那仅有的一条柳枝如绿霞神链般，光晕弥漫，笼罩与守护住了整个村子，令这片栖居地朦朦胧胧，犹若一片仙乡，在这大荒中显得很神秘。 村中各户都是石屋，夜深人静，这里祥和而安谧，像是与外界的黑暗还有兽吼隔绝了。 “呜……” 一阵狂风吹过，一片巨大的乌云横空，遮住了整片夜空，挡住了那仅有的一点星华，山脉中更加黑暗了。 一声凶戾的禽鸣自高天传来，穿金裂石，竟源自那片乌云，细看它居然是一只庞大到不可思议的巨鸟，遮天蔽月，长也不知多少里。 路过石村，它俯视下方，两只眼睛宛若两轮血月般，凶气滔天，盯着老柳木看了片刻，最终飞向了山脉最深处。
        </p>
        <br />
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
                    <img src="img/erweima.png"/>
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
