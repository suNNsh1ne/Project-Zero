<%@ include file="header.jsp"%>
		<h2>Wareneinagng</h2>
		<table class="table table-hover">
			<tr>
				<th>ID</th>
				<th>Lieferanten</th>
				<th>Bestandsartikel</th>
				<th>Anzahl</th>
				<th>Eingangs_Datum</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${Wareneinagng}" var="value">
				<tr>
					<td>${value.wareneingangId}</td>
					<td>${value.Lieferanten}</td>
					<td>${value.Bestandsartikel}</td>
					<td>${value.Anzahl}</td>
					<td>${value.Eingangs_Datum}</td>
					<td><a href="<c:url value='/register' />" class="tooltip" data-tooltip="Add"><span class="fa fa-plus-square" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Edit"><span class="fa fa-pencil" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Delete"><span class="fa fa-minus-circle" aria-hidden="true"></span></a></td>
				</tr>
			</c:forEach>
		</table>
		<br />
		
		<script type="text/javascript">				
			document.title = 'Wareneingang';
		</script>
<%@ include file="footer.jsp"%>