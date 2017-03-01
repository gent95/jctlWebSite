<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>案例列管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/website/actualcaselist/actualCaseList/">案例列列表</a></li>
		<shiro:hasPermission name="website:actualcaselist:actualCaseList:edit"><li><a href="${ctx}/website/actualcaselist/actualCaseList/form">案例列添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="actualCaseList" action="${ctx}/website/actualcaselist/actualCaseList/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>标题：</label>
				<form:input path="title" htmlEscape="false" maxlength="255" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>序号</th>
				<th>所属导航</th>
				<th>标题</th>
				<th>激活</th>
				<th>简介</th>
				<th>排序</th>
				<th>导图</th>
				<shiro:hasPermission name="website:actualcaselist:actualCaseList:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="actualCaseList">
			<tr>
				<td><a href="${ctx}/website/actualcaselist/actualCaseList/form?id=${actualCaseList.id}">
					${actualCaseList.id}
				</a></td>
				<td>
					${actualCaseList.navList.name}
				</td>
				<td>
					${actualCaseList.title}
				</td>
				<td>

					<c:choose>
						<c:when test="${actualCaseList.isShow == 1}">
							<a href="${ctx}/website/actualcaselist/actualCaseList/recommend?id=${actualCaseList.id}&isShow=${actualCaseList.isShow}"><img
									src='${ctxStatic}/images/default/dui.png'/></a>
						</c:when>
						<c:when test="${actualCaseList.isShow == 0}">
							<a href="${ctx}/website/actualcaselist/actualCaseList/recommend?id=${actualCaseList.id}&isShow=${actualCaseList.isShow}"> <img
									src='${ctxStatic}/images/default/cuo.png'/></a>
						</c:when>
					</c:choose>
				</td>
				<td>
					${actualCaseList.profiles}
				</td>
				<td>
					${actualCaseList.orderNum}
				</td>
				<td>
					<img src="${actualCaseList.picPath}" style="height: 50px;width: 80px" />
				</td>
				<shiro:hasPermission name="website:actualcaselist:actualCaseList:edit"><td>
					<a class="btn btn-primary" href="${ctx}/website/actualcasedetail/actualCaseDetial/form?actualCaseListId=${actualCaseList.id}">详情内容</a>
    				<a class="btn btn-primary" href="${ctx}/website/actualcaselist/actualCaseList/form?id=${actualCaseList.id}">修改</a>
					<a class="btn btn-primary" href="${ctx}/website/actualcaselist/actualCaseList/delete?id=${actualCaseList.id}" onclick="return confirmx('确认要删除该案例列吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>