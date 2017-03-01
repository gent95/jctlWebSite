<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
	<title>案例管理</title>
	<style>
		blockquote, body, button, dd, div, dl, dt, form, h1, h2, h3, h4, h5, h6, input, li, ol, p, pre, td, textarea, th, ul {
			margin: 0;
			padding: 0;
			-webkit-tap-highlight-color: rgba(0, 0, 0, 0)
		}
	</style>
	<link rel="stylesheet" href="${ctxStatic}/web/common/js/layui/css/layui.css" media="all">
	<link rel="stylesheet" href="${ctxStatic}/web/common/js/layui/css/global.css" media="all">
	<script src="${ctxStatic}/web/common/js/layui/layui.js" charset="utf-8"></script>
	<script src="${ctxStatic}/jquery/jquery-1.8.3.min.js" type="text/javascript"></script>
	<script src="${ctxStatic}/web/common/js/jctl/ajax/ajaxImg.js" charset="utf-8"></script>
	<script>
		layui.use(['form', 'layedit', 'laydate'], function () {
			var form = layui.form()
					, layedit = layui.layedit

			//创建一个编辑器
			var editIndex = layedit.build('news_content',{
				uploadImage:{
					url: '/admin/editUpload' //接口url
				}
			});
		});
	</script>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
	<legend>案例内容编辑</legend>
</fieldset>
<form class="form-horizontal" action="${ctx}/website/actualcasedetail/actualCaseDetial/save">
	<div class="control-group">
		<label class="control-label">内容：</label>
		<div class="controls">
			<div class="layui-form-item layui-form-text">
				<div class="layui-input-block">
            <textarea  class="layui-textarea layui-hide" name="context" lay-verify="content"
					   id="news_content"  >
                <c:choose>
					<c:when test="${actualCaseDetial.text != ''}">
						${actualCaseDetial.text}
					</c:when>
				</c:choose>
            </textarea>
				</div>
			</div>
		</div>

	</div>
	<c:choose>
		<c:when test="${actualCaseDetial.id != null}">
			<input type="hidden" name="id" value="${actualCaseDetial.id}">
		</c:when>
	</c:choose>

	<input type="hidden" name="newListId" value="${actualCaseDetial.actualCaseListId}">
	<div class="layui-form-item">
		<div class="layui-input-block">
			<button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
		</div>
	</div>
</form>

<div>
</div>
</body>
</html>