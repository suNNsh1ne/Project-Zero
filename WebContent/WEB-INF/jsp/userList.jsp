<%@ include file="header.jsp"%>
		<h1>Benutzerliste</h1>
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
		
		<script type="text/javascript">				
			document.title = 'Benutzerliste';
		</script>
<%@ include file="footer.jsp"%>