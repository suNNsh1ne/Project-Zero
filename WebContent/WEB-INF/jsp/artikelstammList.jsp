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
				<th>Anzahl</th>
				<th>Preis</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${Artikelstamm}" var="value">
				<tr>
				<c:if test="value"></c:if>
					<td>${value.ArtikelstammId}</td>
					<td>${value.Bezeichnung}</td>
					<td>${value.Kategorie}</td>
					<td>${value.Attribute}</td>
					<td>${value.Anzahl}</td>
					<td>${value.Preis}</td>
<<<<<<< HEAD
					<td>${value.Lieferant.Ansprechpartner)}</td>
=======
					<td><a href="<c:url value='/register' />" class="tooltip" data-tooltip="Add"><span class="fa fa-plus-square" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Edit"><span class="fa fa-pencil" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Delete"><span class="fa fa-minus-circle" aria-hidden="true"></span></a></td>
>>>>>>> refs/remotes/origin/master
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