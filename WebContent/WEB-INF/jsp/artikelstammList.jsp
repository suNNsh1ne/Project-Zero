<%@ include file="header.jsp"%>
<script type="text/javascript" src="${cp}/static/js/html-table-search.js"></script>
<script type="text/javascript" src="${cp}/static/js/livesearch.js"></script>

		<h2>Artikel</h2>
		<table class="table table-hover search-table">
			<tr>
				<th>ID</th>
				<th>Bezeichnung</th>
				<th>Kategorie</th>
				<th>Attribute</th>
				<th>Preis</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${Artikelstamm}" var="value">
				<tr>
				<c:if test="value"></c:if>
					<td>${value.artikelstammId}</td>
					<td>${value.bezeichnung}</td>
					<td>${value.kategorie}</td>
					<td>${value.attribute}</td>
					<td>${value.preis}</td>
					<td><button class="table_button tooltip" data-tooltip="Hinzufügen"><a href="<c:url value='/register' />"><span class="fa fa-plus-square" aria-hidden="true"></span></a></button></td>
					<td><button class="table_button tooltip" data-tooltip="Bearbeiten"><a href="<c:url value='/home' />" ><span class="fa fa-pencil" aria-hidden="true"></span></a></button></td>
					<td><button class="table_button tooltip" data-tooltip="Löschen"><a href="<c:url value='/home' />" ><span class="fa fa-minus-circle" aria-hidden="true"></span></a></button></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/artikelstammNew' />">
			<button class="button">Artikel hinzufügen</button>
		</a>
		
		<script type="text/javascript">				
			document.title = 'Artikelstammliste';
		</script>
<%@ include file="footer.jsp"%>