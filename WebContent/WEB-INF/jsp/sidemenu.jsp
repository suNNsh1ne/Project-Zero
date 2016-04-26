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
			<li><a href="<c:url value='/' />"><span><img src="<c:url value="static/images/home.png"/>"/></span></a></li>
			<li class=''><a href="<c:url value='/list' />"><span><img src="<c:url value="static/images/userlist.png"/>"/></span></a>
			<li><a href="<c:url value='/register' />"><span><img src="<c:url value="static/images/addnewuser.png"/>"/></span></a></li>
			<li class='last'><a href="<c:url value='/register' />"><span><img src="<c:url value="static/images/articlelist.png"/>"/></span></a></li>
		</ul>
	</div>
</body>
</html>
