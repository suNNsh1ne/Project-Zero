<%@ include file="header.jsp"%>
<script type="text/javascript" src="${cp}/static/js/html-table-search.js"></script>
<script type="text/javascript" src="${cp}/static/js/livesearch.js"></script>

		<h2>Mitarbeiter</h2>
		<table class="table table-hover search-table">
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
					<td><button class="table_button tooltip" data-tooltip="Hinzufügen"><a href="<c:url value='/register' />"><span class="fa fa-plus-square" aria-hidden="true"></span></a></button></td>
					<td><button class="table_button tooltip" data-tooltip="Bearbeiten"><a href="<c:url value='/home' />" ><span class="fa fa-pencil" aria-hidden="true"></span></a></button></td>
					<td><button class="table_button tooltip" data-tooltip="Löschen"><a href="<c:url value='/home' />" ><span class="fa fa-minus-circle" aria-hidden="true"></span></a></button></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/mitarbeiterNew' />">
			<button class="button">Mitarbeiter hinzufügen</button>
		</a>
		<script type="text/javascript">				
			document.title = 'Mitarbeiterliste';
		</script>
<%@ include file="footer.jsp"%>