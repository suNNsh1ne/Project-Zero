<%@ include file="header.jsp"%>
<!-- Source : http://www.jqueryscript.net/table/Simple-jQuery-Plugin-For-Html-Table-Live-Search.html -->

		<h2>Bestandsartikel</h2>
		
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
				<th>Anzahl</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
			<c:forEach items="${Bestandsartikel}" var="value">
			<tbody>
				<tr>
					<td class="searchable">${value.bestandsartikelId}</td>
					<td class="searchable">${value.anzahl}</td>
					<td><button class="table_button tooltip" data-tooltip="Bearbeiten"><a href="<c:url value='/home' />" ><span class="fa fa-pencil" aria-hidden="true"></span></a></button></td>
					<td><form method="POST" action="bestandsartikelDel"><input type="hidden" id="bestandsartikelId" name="bestandsartikelId" value="${value.bestandsartikelId}"/><input class="table_button tooltip" data-tooltip="Löschen" type="submit"><span class="fa fa-minus-circle" aria-hidden="true"></span></form></td>
				</tr>
			</tbody>
			</c:forEach>
		</table>
		<br /> <a href="<c:url value='/bestandsartikelNew' />">
			<button class="button">Bestandsartikel hinzufügen</button>
		</a>
		
		<script type="text/javascript">				
			document.title = 'Bestandsartikelliste';
		</script>
<%@ include file="footer.jsp"%>