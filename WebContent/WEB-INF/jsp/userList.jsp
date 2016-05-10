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
<title>All Users</title>
</head>
<body>
<div id="tooltip_cloud"></div>
	<%@ include file="sidemenu.jsp"%>
	<div class="content">
		<h1>List of users</h1>
		<table class="table table-hover">
			<tr>
				<th>Name</th>
				<th>Password</th>
				<th>ID</th>
				<th>PermissionPriority</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${User}" var="user">
				<tr>
					<td>${user.username}</td>
					<td>${user.password}</td>
					<td>${user.userId}</td>
					<td>${user.permissionPriority}</td>
					<td><a href="<c:url value='/register' />" class="tooltip" data-tooltip="Add"><span class="fa fa-plus-square" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Edit"><span class="fa fa-pencil" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Delete"><span class="fa fa-minus-circle" aria-hidden="true"></span></a></td>
				</tr>
			</c:forEach>
		</table>
		<a href="<c:url value='/register' />"><button class="button">Add New Account</button></a> 
		<a href="<c:url value='/login' />"><button class="button">Back to Login</button></a>
	</div>
</body>
</html>