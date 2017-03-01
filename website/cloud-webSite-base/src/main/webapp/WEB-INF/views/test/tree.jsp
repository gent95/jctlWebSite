<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>jquery实现多级树形分类可折叠菜单特效代码</title>

<!--图标样式-->
<link rel="stylesheet" type="text/css" href="${ctxStatic}/bootstrap/2.3.1/css_default/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${ctxStatic}/js/jsTree/css/style.css" />
<script type="text/javascript" src="${ctxStatic}/js/jsTree/tree.js"></script>
<script type="text/javascript" src="${ctxStatic}/js/jctl/ajax/ajaxTree.js"></script>


</head>
<body>
<div class="mainWrap">
	<div class="slideMain">
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-4">
					<div class="tree well" style="position: fixed;bottom: 70px;overflow-y: scroll;top: 50px;width:30%;">
						<ul id="ul_tree">
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>





</body>
</html>