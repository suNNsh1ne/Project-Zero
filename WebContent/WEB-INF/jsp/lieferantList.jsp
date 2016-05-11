<%@ include file="header.jsp"%>


		<h2>Lieferanten</h2>
		<table class="table table-hover search-table">
			<tr>
				<th>ID</th>
				<th>Addresse</th>
				<th>Ansprechpartner</th>
				<th>Artikelstämme</th>
				<th>Wareneingang</th>
				<th>Warenausgang</th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${Lieferant}" var="value">
				<tr>
					<td>${value.lieferantenId}</td>
					<td>${value.adresse}</td>
					<td>${value.ansprechpartner}</td>
					<td>${value.artikelstaemme}</td>
					<td>${value.wareneingang}</td>
					<td>${value.warenausgang}</td>
					<td><button class="table_button tooltip" data-tooltip="Bearbeiten"><a href="<c:url value='/home' />" ><span class="fa fa-pencil" aria-hidden="true"></span></a></button></td>
					<td><button class="table_button tooltip" data-tooltip="Löschen"><a href="<c:url value='/home' />" ><span class="fa fa-minus-circle" aria-hidden="true"></span></a></button></td>
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