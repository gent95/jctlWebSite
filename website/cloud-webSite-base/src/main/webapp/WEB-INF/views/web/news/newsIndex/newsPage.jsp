<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/modules/cms/front/include/taglib.jsp" %>
<html>

<head>
    <link rel="stylesheet" href="${ctxStatic}/web/css/news/news.css">
    <script type="application/javascript" src="${ctxStatic}/jquery/jquery-1.8.3.min.js"></script>
    <script type="application/javascript" src="${ctxStatic}/web/js/news/newsIndex/newsIndex.js"></script>
    <script>
       $(function () {
           var ba = $("#banner").children().attr("src");
           if(ba == ""){
               $("#banner").remove();

           }
       })


    </script>
</head>

<body>
<header>
    <%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/layouts/default.jsp" %>
    <div id="banner">
        <img src="${news.banner}"/>
    </div>
</header>
<article>
    <div id="art_nav">
        ${news.parentNavName}&gt;${news.navName}
    </div>
    <div id="content_tit">
        <p align="center">${news.title}</p>
        <div id="content_pub">
            <table width="100%">
                <tr>
                    <td><acronym >时间:&nbsp;&nbsp;
                        <fmt:formatDate value="${news.addTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                    </acronym></td>
                    <td><acronym >文章来源:&nbsp;&nbsp;集萃通联</acronym></td>
                    <td><acronym >点击量:&nbsp;&nbsp;1685</acronym></td>
                </tr>
            </table>
        </div>
    </div>
    <div id="content">
        ${news.context}
    </div><br />
</article>
<%@ include file="/WEB-INF/views/modules/cms/front/themes/basic/footer.jsp" %>
</body>

</html>
