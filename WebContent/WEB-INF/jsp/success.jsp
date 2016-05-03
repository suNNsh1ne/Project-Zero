<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
<head>
<c:set var="cp"
	   value="${pageContext.request.servletContext.contextPath}" />
    <meta http-equiv="Refresh" content="5;url=/ProjectZer0/home">
    <link rel="stylesheet" href="${cp}/static/style.css">
<title>Registration Confirmation Page</title>
</head>
<body>
<div id="registerSuccess">
    <h1>message : ${success}</h1>
    <br/>
    <br/>
    <a href="<c:url value='/login' />"><button class="button">Zurück zum Login</button></a>
</div>     
</body>
 
</html>	