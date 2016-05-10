<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${cp}/static/style.css">
<title>Artikel</title>

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
		<h2>Artikel</h2>
		<table class="table table-hover">
			<tr>
				<td>ID</td>
				<td>Bezeichnung</td>
				<td>Kategorie</td>
				<td>Attribute</td>
				<td>Anzahl</td>
				<td>Preis</td>
				<td></td>
			</tr>
			<c:forEach items="${Artikelstamm}" var="value">
				<tr>
				<c:if test="value"></c:if>
					<td>${value.ArtikelstammId}</td>
					<td>${value.Bezeichnung}</td>
					<td>${value.Kategorie}</td>
					<td>${value.Attribute}</td>
					<td>${value.Anzahl}</td>
					<td>${value.Preis}</td>
					<td>${value.Lieferant.Ansprechpartner)}</td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/menu/artikelstammNew' />">
			<button class="button">Artikel hinzufügen</button>
		</a>
	</div>
</body>
</html>