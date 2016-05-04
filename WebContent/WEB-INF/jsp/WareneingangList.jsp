<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${cp}/static/style.css">
<title>Wareneinagng</title>

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
		<h2>Wareneinagng</h2>
		<table class="table table-hover">
			<tr>
				<td>ID</td>
				<td>Lieferanten</td>
				<td>Bestandsartikel</td>
				<td>Anzahl</td>
				<td>Eingangs_Datum</td>
				<td></td>
			</tr>
			<c:forEach items="${Wareneinagng}" var="value">
				<tr>
					<td>${value.wareneingangId}</td>
					<td>${value.Lieferanten}</td>
					<td>${value.Bestandsartikel}</td>
					<td>${value.Anzahl}</td>
					<td>${value.Eingangs_Datum}</td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/menu/mitarbeiterNew' />">
			<button class="button">Mitarbeiter hinzufügen</button>
		</a>
	</div>
</body>
</html>