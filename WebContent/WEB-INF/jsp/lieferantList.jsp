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
<title>Lieferanten</title>
</head>
<body>
<div id="tooltip_cloud"></div>
	<%@ include file="sidemenu.jsp"%>
	<div class="content">
		<h2>Lieferanten</h2>
		<table class="table table-hover">
			<tr>
				<th>ID</th>
				<th>Ansprechpartner</th>
				<th>Addresse</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${Lieferant}" var="value">
				<tr>
					<td>${value.lieferantenId}</td>
					<td>${value.Ansprechpartner}</td>
					<td>${value.Addresse}</td>
					<td><a href="<c:url value='/register' />" class="tooltip" data-tooltip="Add"><span class="fa fa-plus-square" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Edit"><span class="fa fa-pencil" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Delete"><span class="fa fa-minus-circle" aria-hidden="true"></span></a></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/menu/mitarbeiterNew' />">
			<button class="button">Lieferant hinzufügen</button>
		</a>
	</div>
</body>
</html>