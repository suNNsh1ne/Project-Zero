
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${cp}/static/style.css">
<title>Bestandsartikel Registration Form</title>
</head>

<body>
	<div id="main">
		<h2>Neuer Bestandsartikel...</h2>

		<form:form method="POST" modelAttribute="Bestandsartikel">
			<form:input type="hidden" path="BestandsartikelId" id="BestandsartikelId" />
			<table>
				<tr>
					<td><label for="Artikelstamm"></label></td>
					<td><form:input path="Artikelstamm" placeholder="Artikelstamm"
							id="Artikelstamm" /></td>
					<td><form:errors path="Artikelstamm" class="error" /></td>
				</tr>

				<tr>
					<td><label for="Anzahl"></label></td>
					<td><form:password path="Anzahl"
							placeholder="Anzahl" id="Anzahl" /></td>
					<td><form:errors path="Anzahl" class="error" /></td>
				</tr>

				<tr>
					<td colspan="3"><c:choose>
							<c:when test="${edit}">
								<input type="submit" value="Update" class="button" />
							</c:when>
							<c:otherwise>
								<input type="submit" value="Register" class="button" />
							</c:otherwise>
						</c:choose> <a href="<c:url value='/menu/userList' />"><button
								class="button">Accountlist</button></a></td>
				</tr>
			</table>
		</form:form>
		<br /> <br />
	</div>
</body>
</html>