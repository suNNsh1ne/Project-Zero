<%@ include file="header.jsp"%>
		<h2>Bestandsartikel</h2>
		<table class="table table-hover">
			<tr>
				<th>ID</th>
				<th>Artikelstamm</th>
				<th>Anzahl</th>
				<th>Lager</th>
				<th>Wareneingang</th>
				<th>Warenausgang</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${Bestandsartikel}" var="value">
				<tr>
					<td>${value.BestandsartikelId}</td>
					<td>${value.Artikelstamm}</td>
					<td>${value.Anzahl}</td>
					<td>${value.Lager}</td>
					<td>${value.Wareneingang}</td>
					<td>${value.Warenausgang}</td>
					<td><a href="<c:url value='/register' />" class="tooltip" data-tooltip="Add"><span class="fa fa-plus-square" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Edit"><span class="fa fa-pencil" aria-hidden="true"></span></a></td>
					<td><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Delete"><span class="fa fa-minus-circle" aria-hidden="true"></span></a></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/menu/bestandsartikelNew' />">
			<button class="button">Bestandsartikel hinzufügen</button>
		</a>
<%@ include file="footer.jsp"%>