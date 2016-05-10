<!-- Dieses Dokument wird in jeder JSP am Anfang, welche das Menü hat included. -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

	
	<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" />
	<title>Project Zer0</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${cp}/static/css/style.css">
	<script type="text/javascript" src="${cp}/static/js/jquery-2.2.3.min.js"></script>
	<script type="text/javascript" src="${cp}/static/js/custom.js"></script>
	
	<link rel="shortcut icon" href="${cp}/static/images/favicon.ico" type="image/x-icon" />
	<link rel="apple-touch-icon" sizes="57x57" href="${cp}/static/images/apple-touch-icon-57x57.png">
	<link rel="apple-touch-icon" sizes="60x60" href="${cp}/static/images/apple-touch-icon-60x60.png">
	<link rel="apple-touch-icon" sizes="72x72" href="${cp}/static/images/apple-touch-icon-72x72.png">
	<link rel="apple-touch-icon" sizes="76x76" href="${cp}/static/images/apple-touch-icon-76x76.png">
	<link rel="apple-touch-icon" sizes="114x114" href="${cp}/static/images/apple-touch-icon-114x114.png">
	<link rel="apple-touch-icon" sizes="120x120" href="${cp}/static/images/apple-touch-icon-120x120.png">
	<link rel="apple-touch-icon" sizes="144x144" href="${cp}/static/images/apple-touch-icon-144x144.png">
	<link rel="apple-touch-icon" sizes="152x152" href="${cp}/static/images/apple-touch-icon-152x152.png">
	<link rel="apple-touch-icon" sizes="180x180" href="${cp}/static/images/apple-touch-icon-180x180.png">
	<link rel="icon" type="image/png" href="${cp}/static/images/favicon-16x16.png" sizes="16x16">
	<link rel="icon" type="image/png" href="${cp}/static/images/favicon-32x32.png" sizes="32x32">
	<link rel="icon" type="image/png" href="${cp}/static/images/favicon-96x96.png" sizes="96x96">
	<link rel="icon" type="image/png" href="${cp}/static/images/android-chrome-192x192.png" sizes="192x192">
	<meta name="msapplication-square70x70logo" content="${cp}/images/smalltile.png" />
	<meta name="msapplication-square150x150logo" content="${cp}/images/mediumtile.png" />
	<meta name="msapplication-wide310x150logo" content="${cp}/images/widetile.png" />
	<meta name="msapplication-square310x310logo" content="${cp}/images/largetile.png" />

</head>
<body>
<div id="tooltip_cloud"></div>
	<%@ include file="sidemenu.jsp"%>
	<div class="content">