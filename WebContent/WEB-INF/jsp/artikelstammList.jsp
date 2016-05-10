<%@ include file="header.jsp"%>
		<h2>Artikel</h2>
		<table class="table table-hover">
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
					<td>${value.ArtikelstammId}</td>
					<td>${value.Bezeichnung}</td>
					<td>${value.Kategorie}</td>
					<td>${value.Attribute}</td>
					<td>${value.Anzahl}</td>
					<td>${value.Preis}</td>
					<td><a href="<c:url value='/register' />" class="tooltip" data-tooltip="Add"><span class="fa fa-plus-square" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Edit"><span class="fa fa-pencil" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Delete"><span class="fa fa-minus-circle" aria-hidden="true"></span></a></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/menu/artikelstammNew' />">
			<button class="button">Artikel hinzufügen</button>
		</a>
		
		<script type="text/javascript">				
			document.title = 'Artikelstammliste';
		</script>
<%@ include file="footer.jsp"%>