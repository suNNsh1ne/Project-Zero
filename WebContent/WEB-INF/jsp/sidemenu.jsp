<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${cp}/static/sidemenu.css">
<title>JSP Page</title>
</head>
<body>
	<div id='cssmenu'>
		<ul>
			<li><a href="<c:url value='/home' />"><span><img src="<c:url value="static/images/home-3-48.png"/>"/></span></a></li>
			<li><a href="<c:url value='/userlist' />"><span><img src="<c:url value="static/images/list-2-48.png"/>"/></span></a>
			<li class='last'><a href="<c:url value='/login' />"><span><img src="<c:url value="static/images/login-48.png"/>"/></span></a></li>
			<li><a href="<c:url value='/logout' />"><span><img src="<c:url value="static/images/logout-48.png"/>"/></span></a></li>			
		</ul>
		
		<ul>
			<li><div class="logged_in_as">Eingeloggt: Fabian Lange</div></li>
		</ul>
	</div>
</body>
</html>
