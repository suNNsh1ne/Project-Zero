<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${cp}/static/login.css">
<title>JSP Page</title>
</head>
<body>
	<div style="text-align: center" id="login">
	<h1>Bitte melden Sie sich an:</h1>
		<form action="loginCheck.htm" method="post">
			<br /><input type="text" name="username" placeholder="Username" class="input_field"> 
			<br /><input type="password" name="password" placeholder="Passwort" class="input_field">
			<a href="">Passwort vergessen?</a> 
			<br /><input type="submit" value="Login" class="button">
		</form>
		<form>
			<input type="submit" value="Generieren" class="button">
		</form>		
	</div>
	<br />

</body>
</html>
