<%@ include file="header.jsp"%>
		<h2>Warenausgang</h2>
		<table class="table table-hover">
			<tr>
				<th>ID</th>
				<th>Lieferanten</th>
				<th>Bestandsartikel</th>
				<th>Anzahl</td>
				<th>Ausgangs_Datum</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${Warenausgang}" var="value">
				<tr>
					<td>${value.warenausgangId}</td>
					<td>${value.Lieferanten}</td>
					<td>${value.Bestandsartikel}</td>
					<td>${value.Anzahl}</td>
					<td>${value.Ausgangs_Datum}</td>
					<td><a href="<c:url value='/register' />" class="tooltip" data-tooltip="Add"><span class="fa fa-plus-square" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Edit"><span class="fa fa-pencil" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Delete"><span class="fa fa-minus-circle" aria-hidden="true"></span></a></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/menu/mitarbeiterNew' />">
			<button class="button">Mitarbeiter hinzufügen</button>
		</a>
<%@ include file="footer.jsp"%>