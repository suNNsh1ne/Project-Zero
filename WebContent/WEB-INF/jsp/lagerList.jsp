<%@ include file="header.jsp"%>
<!-- Source : http://www.jqueryscript.net/table/Simple-jQuery-Plugin-For-Html-Table-Live-Search.html -->

<script type="text/javascript" src="${cp}/static/js/html-table-search.js"></script>
<script type="text/javascript" src="${cp}/static/js/livesearch.js"></script>

		<h2>Lager</h2>
		<table class="table table-hover search-table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Ort</th>
				<th>Kapazität</th>
				<th>Auslastung</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>

		</thead>
			<tbody>
			<c:forEach items="${Lager}" var="value">
				<tr>
					<td class="searchable">${value.lagerID}</td>
					<td class="searchable">${value.name}</td>
					<td class="searchable">${value.ort}</td>
					<td class="searchable">${value.kapazität}</td>
					<td class="searchable">${value.auslastung}</td>
					<td><button class="table_button tooltip" data-tooltip="Hinzufügen"><a href="<c:url value='/register' />"><span class="fa fa-plus-square" aria-hidden="true"></span></a></button></td>
					<td><button class="table_button tooltip" data-tooltip="Bearbeiten"><a href="<c:url value='/home' />" ><span class="fa fa-pencil" aria-hidden="true"></span></a></button></td>
					<td><form method="POST" action="lagerDel"><input type="hidden" id="lagerID" name="lagerID" value="${value.lagerID}"/><input class="table_button tooltip" data-tooltip="Löschen" type="submit"><span class="fa fa-minus-circle" aria-hidden="true"></span></form></td>
				</tr>
			</tbody>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/lagerNew' />">
			<button class="button">Lager hinzufügen</button>
		</a>
		
		<script type="text/javascript">				
			document.title = 'Lagerliste';
		</script>
<%@ include file="footer.jsp"%>