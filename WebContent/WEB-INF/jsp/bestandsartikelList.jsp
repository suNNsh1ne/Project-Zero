<%@ include file="header.jsp"%>
<script type="text/javascript" src="${cp}/static/js/html-table-search.js"></script>
<script type="text/javascript" src="${cp}/static/js/livesearch.js"></script>

		<h2>Bestandsartikel</h2>
		<table class="table table-hover search-table">
			<tr>
				<th>ID</th>
				<th>Anzahl</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${Bestandsartikel}" var="value">
				<tr>
					<td>${value.bestandsartikelId}</td>
					<td>${value.anzahl}</td>
					<td><button class="table_button tooltip" data-tooltip="Hinzufügen"><a href="<c:url value='/register' />"><span class="fa fa-plus-square" aria-hidden="true"></span></a></button></td>
					<td><button class="table_button tooltip" data-tooltip="Bearbeiten"><a href="<c:url value='/home' />" ><span class="fa fa-pencil" aria-hidden="true"></span></a></button></td>
					<td><button class="table_button tooltip" data-tooltip="Löschen"><a href="<c:url value='/home' />" ><span class="fa fa-minus-circle" aria-hidden="true"></span></a></button></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/bestandsartikelNew' />">
			<button class="button">Bestandsartikel hinzufügen</button>
		</a>
		
		<script type="text/javascript">				
			document.title = 'Bestandsartikelliste';
		</script>
<%@ include file="footer.jsp"%>