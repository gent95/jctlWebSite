<%@ taglib prefix="shiro" uri="/WEB-INF/tlds/shiros.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fns" uri="/WEB-INF/tlds/fns.tld" %>
<%@ taglib prefix="fnc" uri="/WEB-INF/tlds/fnc.tld" %>
<c:set var="ctx" value="${pageContext.request.contextPath}${fns:getFrontPath()}"/>
<%--前台固定路径--%>
<c:set var="frontPath" value="${pageContext.request.contextPath}"/>

<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static"/>
<c:set var="ctxJsp" value="${pageContext.request.contextPath}"/>

<c:set var="ctxImg" value="http://61.149.204.178:8085"/>

<c:set var="ctxStaticFront" value="${ctxStatic}/modules/cms/front"/>
<c:set var="ctxStaticTheme" value="${ctxStaticFront}/themes/${site.theme}"/>
<c:set var="urlSuffix" value="${fns:getUrlSuffix()}"/>
<link rel="SHORTCUT ICON" href="http://61.149.204.178:8085/logo.ico"/>
<link rel="SHORTCUT ICON" href="${ctxStatic}/images/logo.ico"/>