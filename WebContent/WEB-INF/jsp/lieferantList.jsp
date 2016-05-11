<%@ include file="header.jsp"%>
<script type="text/javascript" src="${cp}/static/js/html-table-search.js"></script>
<script type="text/javascript" src="${cp}/static/js/livesearch.js"></script>

		<h2>Lieferanten</h2>
		<table class="table table-hover search-table">
			<tr>
				<th>ID</th>
				<th>Addresse</th>
				<th>Ansprechpartner</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${Lieferant}" var="value">
				<tr>
					<td>${value.lieferantenId}</td>
					<td>${value.adresse}</td>
					<td>${value.ansprechpartner}</td>
					<td><a href="<c:url value='/register' />" class="tooltip" data-tooltip="Add"><span class="fa fa-plus-square" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Edit"><span class="fa fa-pencil" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Delete"><span class="fa fa-minus-circle" aria-hidden="true"></span></a></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/lieferantNew' />">
			<button class="button">Lieferant hinzufügen</button>
		</a>
		
		<script type="text/javascript">				
			document.title = 'Lieferantenliste';
		</script>
<%@ include file="footer.jsp"%>