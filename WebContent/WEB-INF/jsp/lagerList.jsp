<%@ include file="header.jsp"%>
<script type="text/javascript" src="${cp}/static/js/html-table-search.js"></script>
<script type="text/javascript" src="${cp}/static/js/livesearch.js"></script>

		<h2>Lager</h2>
		<table class="table table-hover search-table">
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
			<c:forEach items="${Lager}" var="value">
				<tr>
					<td>${value.lagerID}</td>
					<td>${value.name}</td>
					<td>${value.ort}</td>
					<td>${value.kapazität}</td>
					<td>${value.auslastung}</td>
					<td><a href="<c:url value='/register' />" class="tooltip" data-tooltip="Add"><span class="fa fa-plus-square" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Edit"><span class="fa fa-pencil" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Delete"><span class="fa fa-minus-circle" aria-hidden="true"></span></a></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/lagerNew' />">
			<button class="button">Lager hinzufügen</button>
		</a>
		
		<script type="text/javascript">				
			document.title = 'Lagerliste';
		</script>
<%@ include file="footer.jsp"%>