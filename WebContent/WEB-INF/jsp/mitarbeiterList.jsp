<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${cp}/static/style.css">
<title>Mitarbeiter</title>

<style>
tr:first-child {
	font-weight: bold;
	background-color: #C6C9C4;
}
</style>

</head>


<body>
	<%@ include file="sidemenu.jsp"%>
	<div class="content">
		<h2>Mitarbeiter</h2>
		<table class="table table-hover">
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Lager</td>
				<td></td>
			</tr>
			<c:forEach items="${Mitarbeiter}" var="value">
				<tr>
					<td>${value.mitarbeiterId}</td>
					<td>${value.Name}</td>
					<td>${value.Lager}</td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/mitarbeiterNew' />">
			<button class="button">Mitarbeiter hinzufügen</button>
		</a>
	</div>
</body>
</html>