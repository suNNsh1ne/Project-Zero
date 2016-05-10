<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${cp}/static/css/style.css">
<script type="text/javascript" src="${cp}/static/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${cp}/static/js/custom.js"></script>
<title>Lieferanten registrieren</title>
</head>
<body>
<div id="tooltip_cloud"></div>
	<%@ include file="sidemenu.jsp"%>
	<div class="content">
		<h2>Neuer Lieferant...</h2>

		<form:form method="POST" modelAttribute="Lieferant">
			<form:input type="hidden" path="lieferantenId" id="lieferantenId" />
			<table>
				<tr>
					<td><label for="Adresse"></label></td>
					<td><form:input path="Adresse" placeholder="Adresse"
							id="Adresse" /></td>
					<td><form:errors path="Adresse" class="error" /></td>
				</tr>
				<tr>
					<td><label for="Ansprechpartner"></label></td>
					<td><form:input path="Ansprechpartner" placeholder="Ansprechpartner"
							id="Ansprechpartner" /></td>
					<td><form:errors path="Ansprechpartner" class="error" /></td>
				</tr>

				<tr>
					<td colspan="3"><c:choose>
							<c:when test="${edit}">
								<input type="submit" value="Update" class="button" />
							</c:when>
							<c:otherwise>
								<input type="submit" value="Register" class="button" />
							</c:otherwise>
						</c:choose> <a href="<c:url value='/userList' />"><button
								class="button">Accountlist</button></a></td>
				</tr>
			</table>
		</form:form>
		<br /> <br />
	</div>
</body>
</html>