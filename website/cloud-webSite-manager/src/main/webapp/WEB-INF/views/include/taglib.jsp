<%@ taglib prefix="shiro" uri="/WEB-INF/tlds/shiros.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fns" uri="/WEB-INF/tlds/fns.tld" %>
<%@ taglib prefix="fnc" uri="/WEB-INF/tlds/fnc.tld" %>
<%@ taglib prefix="sys" tagdir="/WEB-INF/tags/sys" %>
<%@ taglib prefix="act" tagdir="/WEB-INF/tags/act" %>
<%@ taglib prefix="cms" tagdir="/WEB-INF/tags/cms" %>
<%--后台路径--%>
<c:set var="ctx" value="${pageContext.request.contextPath}${fns:getAdminPath()}"/>
<%--前台路径--%>
<c:set var="front" value="${pageContext.request.contextPath}${fns:getFrontPath()}"/>

<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static"/>

<c:set var="img" value="${pageContext.request.contextPath}/static/upload"/>

<c:set var="imgCtx" value="http://61.149.204.178:8085/"/>