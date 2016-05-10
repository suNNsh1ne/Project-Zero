<%@ include file="header.jsp"%>
		<h2>Neuer Mitarbeiter...</h2>

		<form:form method="POST" modelAttribute="Mitarbeiter">
			<form:input type="hidden" path="MitarbeiterId" id="MitarbeiterId" />
			<table>
				<tr>
					<td><label for="Name"></label></td>
					<td><form:input path="Name" placeholder="Name"
							id="Name" /></td>
					<td><form:errors path="Name" class="error" /></td>
				</tr>

				<tr>
					<td colspan="3"><c:choose>
							<c:when test="${edit}">
								<input type="submit" value="Update" class="button" />
							</c:when>
							<c:otherwise>
								<input type="submit" value="Register" class="button" />
							</c:otherwise>
						</c:choose> <a href="<c:url value='/mitarbeiterList' />"><button
								class="button">Mitarbeiterlist</button></a></td>
				</tr>
			</table>
		</form:form>
		<br /> <br />
		
		<script type="text/javascript">				
			document.title = 'Neuen Mitarbeiter anlegen';
		</script>
<%@ include file="footer.jsp"%>