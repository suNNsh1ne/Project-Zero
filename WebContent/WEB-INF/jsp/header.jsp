<!-- Dieses Dokument wird in jeder JSP am Anfang, welche das Menü hat included. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${cp}/static/css/style.css">
<script type="text/javascript" src="${cp}/static/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${cp}/static/js/custom.js"></script>
<title>Project Zer0</title>
</head>
<body>
<div id="tooltip_cloud"></div>
	<%@ include file="sidemenu.jsp"%>
	<div class="content">