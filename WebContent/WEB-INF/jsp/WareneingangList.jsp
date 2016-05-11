<%@ include file="header.jsp"%>
<!-- Source : http://www.jqueryscript.net/table/Simple-jQuery-Plugin-For-Html-Table-Live-Search.html -->

		<h2>Wareneinagng</h2>
		
		<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.3.min.js"></script>
		<script type="text/javascript" src="${cp}/static/js/html-table-search.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$('table.search-table').tableSearch({
					searchText:'Search Table',
					searchPlaceHolder:'Input Value'
				});
			});
		</script>
		
		<table class="table table-hover search-table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Lieferanten</th>
				<th>Bestandsartikel</th>
				<th>Anzahl</th>
				<th>Eingangs_Datum</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
			<c:forEach items="${Wareneinagng}" var="value">
			<tbody>
				<tr>
					<td>${value.wareneingangId}</td>
					<td>${value.Lieferanten}</td>
					<td>${value.Bestandsartikel}</td>
					<td>${value.Anzahl}</td>
					<td>${value.Eingangs_Datum}</td>
					<td><button class="table_button tooltip" data-tooltip="Bearbeiten"><a href="<c:url value='/home' />" ><span class="fa fa-pencil" aria-hidden="true"></span></a></button></td>
					<td><form method="POST" action="wareneingangDel"><input type="hidden" id="wareneingangId" name="wareneingangId" value="${value.wareneingangId}"/><input class="table_button tooltip" data-tooltip="Löschen" type="submit"><span class="fa fa-minus-circle" aria-hidden="true"></span></form></td>
				</tr>
			</tbody>
			</c:forEach>
		</table>
		<br />
		
		<script type="text/javascript">				
			document.title = 'Wareneingang';
		</script>
<%@ include file="footer.jsp"%>