<%@ include file="header.jsp"%>
		<h2>Neuer Bestandsartikel...</h2>

		<form:form method="POST" modelAttribute="Bestandsartikel">
			<form:input type="hidden" path="BestandsartikelId" id="BestandsartikelId" />
			<table>
				<tr>
					<td><label for="anzahl"></label></td>
					<td><form:input path="anzahl"
							placeholder="anzahl" id="anzahl" /></td>
					<td><form:errors path="anzahl" class="error" /></td>
				</tr>

				<tr>
					<td colspan="3"><c:choose>
							<c:when test="${edit}">
								<input type="submit" value="Update" class="button" />
							</c:when>
							<c:otherwise>
								<input type="submit" value="Register" class="button" />
							</c:otherwise>
						</c:choose> </td>
				</tr>
			</table>
		</form:form>
		<br /> <br />
		<script type="text/javascript">				
			document.title = 'Neuen Bestandsartikel anlegen';
		</script>
<%@ include file="footer.jsp"%>