<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${cp}/static/css/style.css">
<title>JSP Page</title>
</head>
<body>
	<div id="login">
	<h1>Bitte melden Sie sich an:</h1>
		<form action="loginCheck" method="post">
			<br /><input type="text" name="username" placeholder="Username" class="input_field"> 
			<br /><input type="password" name="password" placeholder="Passwort" class="input_field">
			<span class="forgot_password"><a href="">Passwort vergessen?</a></span>
			<br /><input type="submit" value="Login" class="button">
		</form>	
	</div>
	<br />
</body>
</html>