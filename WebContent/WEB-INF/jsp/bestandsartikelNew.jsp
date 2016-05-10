<%@ include file="header.jsp"%>
		<h2>Neuer Bestandsartikel...</h2>

		<form:form method="POST" modelAttribute="Bestandsartikel">
			<form:input type="hidden" path="BestandsartikelId" id="BestandsartikelId" />
			<table>
				<tr>
					<td><label for="Artikelstamm"></label></td>
					<td><form:input path="Artikelstamm" placeholder="Artikelstamm"
							id="Artikelstamm" /></td>
					<td><form:errors path="Artikelstamm" class="error" /></td>
				</tr>

				<tr>
					<td><label for="Anzahl"></label></td>
					<td><form:password path="Anzahl"
							placeholder="Anzahl" id="Anzahl" /></td>
					<td><form:errors path="Anzahl" class="error" /></td>
				</tr>

				<tr>
					<td colspan="3"><c:choose>
							<c:when test="${edit}">
								<input type="submit" value="Update" class="button" />
							</c:when>
							<c:otherwise>
								<input type="submit" value="Register" class="button" />
							</c:otherwise>
						</c:choose> <a href="<c:url value='/menu/userList' />"><button
								class="button">Accountlist</button></a></td>
				</tr>
			</table>
		</form:form>
		<br /> <br />
		<script type="text/javascript">				
			document.title = 'Neuen Bestandsartikel anlegen';
		</script>
<%@ include file="footer.jsp"%>