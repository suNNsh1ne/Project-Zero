<%@ include file="header.jsp"%>
		<h2>Mitarbeiter</h2>
		<table class="table table-hover">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Lager</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${Mitarbeiter}" var="value">
				<tr>
					<td>${value.mitarbeiterId}</td>
					<td>${value.Name}</td>
					<td>${value.Lager}</td>
					<td><a href="<c:url value='/register' />" class="tooltip" data-tooltip="Add"><span class="fa fa-plus-square" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Edit"><span class="fa fa-pencil" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Delete"><span class="fa fa-minus-circle" aria-hidden="true"></span></a></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/menu/mitarbeiterNew' />">
			<button class="button">Mitarbeiter hinzufügen</button>
		</a>
		<script type="text/javascript">				
			document.title = 'Mitarbeiterliste';
		</script>
<%@ include file="footer.jsp"%>