<%@ include file="header.jsp"%>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<!-- Source : http://www.jqueryscript.net/table/Simple-jQuery-Plugin-For-Html-Table-Live-Search.html -->

<script type="text/javascript" src="${cp}/static/js/html-table-search.js"></script>
<script type="text/javascript" src="${cp}/static/js/livesearch.js"></script>



<h1>Benutzerliste</h1>


<table class="table table-hover search-table">
	<thead>
	<tr>
		<th>Name</th>
		<th>Password</th>
		<th>ID</th>
		<th>PermissionPriority</th>
		<th></th>
		<th></th>
		<th></th>
	</tr>
	</thead>
	<c:forEach items="${User}" var="user">
	<tbody>
		<tr>
			<td class="searchable">${user.username}</td>
			<td class="searchable">${user.password}</td>
			<td class="searchable">${user.userId}</td>
			<td class="searchable">${user.permissionPriority}</td>
			<td><button class="table_button tooltip" data-tooltip="Hinzufügen"><a href="<c:url value='/register' />"><span class="fa fa-plus-square" aria-hidden="true"></span></a></button></td>
			<td><button class="table_button tooltip" data-tooltip="Bearbeiten"><a href="<c:url value='/home' />"><span class="fa fa-pencil" aria-hidden="true"></span></a></td>
			<td><button class="table_button tooltip" data-tooltip="Löschen"><a href="<c:url value='/userDel' />"><span class="fa fa-minus-circle" aria-hidden="true"></span></a></td>
		</tr>
	</tbody>
	</c:forEach>
</table>
<a href="<c:url value='/register' />"><button class="button">Add New Account</button></a> 

<script type="text/javascript">				
	document.title = 'Benutzerliste';
</script>
<%@ include file="footer.jsp"%>