<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${cp}/static/style.css">
<title>Bestandsartikel</title>

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
		<h2>Bestandsartikel</h2>
		<table class="table table-hover">
			<tr>
				<td>ID</td>
				<td>Artikelstamm</td>
				<td>Anzahl</td>
				<td>Lager</td>
				<td>Wareneingang</td>
				<td>Warenausgang</td>
				<td></td>
			</tr>
			<c:forEach items="${Bestandsartikel}" var="value">
				<tr>
					<td>${value.BestandsartikelId}</td>
					<td>${value.Artikelstamm}</td>
					<td>${value.Anzahl}</td>
					<td>${value.Lager}</td>
					<td>${value.Wareneingang}</td>
					<td>${value.Warenausgang}</td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/menu/bestandsartikelNew' />">
			<button class="button">Bestandsartikel hinzufügen</button>
		</a>
	</div>
</body>
</html>