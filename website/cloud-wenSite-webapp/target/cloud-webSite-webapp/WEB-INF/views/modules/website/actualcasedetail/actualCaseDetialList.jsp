<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>案例详情管理</title>
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
		<li class="active"><a href="${ctx}/website/actualcasedetail/actualCaseDetial/">案例详情列表</a></li>
		<shiro:hasPermission name="website:actualcasedetail:actualCaseDetial:edit"><li><a href="${ctx}/website/actualcasedetail/actualCaseDetial/form">案例详情添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="actualCaseDetial" action="${ctx}/website/actualcasedetail/actualCaseDetial/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>序号</th>
				<th>所属案例</th>
				<th>详情</th>
				<th>添加时间</th>
				<th>添加人</th>
				<th>修改时间</th>
				<th>修改人</th>
				<shiro:hasPermission name="website:actualcasedetail:actualCaseDetial:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="actualCaseDetial">
			<tr>
				<td><a href="${ctx}/website/actualcasedetail/actualCaseDetial/form?id=${actualCaseDetial.id}">
					${actualCaseDetial.id}
				</a></td>
				<td>
					${actualCaseDetial.actualCaseListId}
				</td>
				<td>
					${actualCaseDetial.text}
				</td>
				<td>
					<fmt:formatDate value="${actualCaseDetial.addTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${actualCaseDetial.addUserId}
				</td>
				<td>
					<fmt:formatDate value="${actualCaseDetial.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${actualCaseDetial.updateUserId}
				</td>
				<shiro:hasPermission name="website:actualcasedetail:actualCaseDetial:edit"><td>
    				<a href="${ctx}/website/actualcasedetail/actualCaseDetial/form?id=${actualCaseDetial.id}">修改</a>
					<a href="${ctx}/website/actualcasedetail/actualCaseDetial/delete?id=${actualCaseDetial.id}" onclick="return confirmx('确认要删除该案例详情吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>