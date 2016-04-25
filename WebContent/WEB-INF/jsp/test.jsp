<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="cp" value="${pageContext.request.ServletContext.contextPath}"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Test Page: Menu</h1>
	<form action="user">
		<input type="submit" value="User Table">
	</form>
	<form action="mitarbeiter">
		<input type="submit" value="Mitarbeiter Table">
	</form>
	<form action="artikelstamm">
		<input type="submit" value="Artikelstamm Table">
	</form>
	<form action="bestandsartikel">
		<input type="submit" value="Bestandsartikel Table">
	</form>
	<form action="lieferant">
		<input type="submit" value="Lieferant Table">
	</form>
</body>
</html>