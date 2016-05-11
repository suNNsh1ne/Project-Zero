<%@ include file="header.jsp"%>
<!-- Source : http://www.jqueryscript.net/table/Simple-jQuery-Plugin-For-Html-Table-Live-Search.html -->

<script type="text/javascript" src="${cp}/static/js/html-table-search.js"></script>
<script type="text/javascript" src="${cp}/static/js/livesearch.js"></script>

		<h2>Warenausgang</h2>
		<table class="table table-hover search-table">
		<thead>
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
		</thead>
			<c:forEach items="${Warenausgang}" var="value">
			</tbody>
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
			</tbody>
			</c:forEach>
		</table>
		<br />
		
		<script type="text/javascript">				
			document.title = 'Warenausgang';
		</script>
<%@ include file="footer.jsp"%>