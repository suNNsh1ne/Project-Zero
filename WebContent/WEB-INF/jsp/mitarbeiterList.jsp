<%@ include file="header.jsp"%>
<!-- Source : http://www.jqueryscript.net/table/Simple-jQuery-Plugin-For-Html-Table-Live-Search.html -->

<script type="text/javascript" src="${cp}/static/js/html-table-search.js"></script>
<script type="text/javascript" src="${cp}/static/js/livesearch.js"></script>

		<h2>Mitarbeiter</h2>
		<table class="table table-hover search-table">
		<thead>
			<tr>
				<th class="searchable">ID</th>
				<th class="searchable">Name</th>
				<th class="searchable">Lager</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			</thead>
			<c:forEach items="${Mitarbeiter}" var="value">
			<tbody>
				<tr>
					<td>${value.mitarbeiterId}</td>
					<td>${value.Name}</td>
					<td>${value.Lager}</td>
					<td><button class="table_button tooltip" data-tooltip="Hinzufügen"><a href="<c:url value='/register' />"><span class="fa fa-plus-square" aria-hidden="true"></span></a></button></td>
					<td><button class="table_button tooltip" data-tooltip="Bearbeiten"><a href="<c:url value='/home' />" ><span class="fa fa-pencil" aria-hidden="true"></span></a></button></td>
					<td><form method="POST" action="mitarbeiterDel"><input type="hidden" id="mitarbeiterId" name="mitarbeiterId" value="${value.mitarbeiterId}"/><input class="table_button tooltip" data-tooltip="Löschen" type="submit"><span class="fa fa-minus-circle" aria-hidden="true"></span></form></td>
				</tr>
			</tbody>				
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/mitarbeiterNew' />">
			<button class="button">Mitarbeiter hinzufügen</button>
		</a>
		<script type="text/javascript">				
			document.title = 'Mitarbeiterliste';
		</script>
<%@ include file="footer.jsp"%>