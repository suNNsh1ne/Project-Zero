<%@ include file="header.jsp"%>
<!-- Source : http://www.jqueryscript.net/table/Simple-jQuery-Plugin-For-Html-Table-Live-Search.html -->

<script type="text/javascript" src="${cp}/static/js/html-table-search.js"></script>
<script type="text/javascript" src="${cp}/static/js/livesearch.js"></script>
		<h2>Artikel</h2>
		<table class="table table-hover search-table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Bezeichnung</th>
				<th>Kategorie</th>
				<th>Attribute</th>
				<th>Preis</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
			<c:forEach items="${Artikelstamm}" var="value">
			<tbody>
				<tr>
				<c:if test="value"></c:if>
					<td class="searchable">${value.artikelstammId}</td>
					<td class="searchable">${value.bezeichnung}</td>
					<td class="searchable">${value.kategorie}</td>
					<td class="searchable">${value.attribute}</td>
					<td class="searchable">${value.preis}</td>
					<td><button class="table_button tooltip" data-tooltip="Hinzufügen"><a href="<c:url value='/register' />"><span class="fa fa-plus-square" aria-hidden="true"></span></a></button></td>
					<td><button class="table_button tooltip" data-tooltip="Bearbeiten"><a href="<c:url value='/home' />" ><span class="fa fa-pencil" aria-hidden="true"></span></a></button></td>
					<td><form method="POST" action="artikelstammDel"><input type="hidden" id="artikelstammId" name="artikelstammId" value="${value.artikelstammId}"/><input class="table_button tooltip" data-tooltip="Löschen" type="submit"><span class="fa fa-minus-circle" aria-hidden="true"></span></form></td>
				</tr>
			</tbody>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/artikelstammNew' />">
			<button class="button">Artikel hinzufügen</button>
		</a>
		
		<script type="text/javascript">				
			document.title = 'Artikelstammliste';
		</script>
<%@ include file="footer.jsp"%>