<%@ include file="header.jsp"%>
		<h2>Neues Lager...</h2>

		<form:form method="POST" modelAttribute="Lager">
			<form:input type="hidden" path="LagerID" id="LagerID" />
			<table>
				<tr>
					<td><label for="name"></label></td>
					<td><form:input path="name" placeholder="Name" id="name" /></td>
					<td><form:errors path="name" class="error" /></td>
				</tr>

				<tr>
					<td><label for="ort"></label></td>
					<td><form:input path="ort" placeholder="Ort" id="ort" /></td>
					<td><form:errors path="ort" class="error" /></td>
				</tr>
				
				<tr>
					<td><label for="kapazität"></label></td>
					<td><form:input path="kapazität" placeholder="Kapazität" id="kapazität" /></td>
					<td><form:errors path="kapazität" class="error" /></td>
				</tr>
				
				<tr>
					<td><label for="auslastung"></label></td>
					<td><form:input path="auslastung" placeholder="Auslastung" id="auslastung" /></td>
					<td><form:errors path="auslastung" class="error" /></td>
				</tr>

				<tr>
					<td colspan="3"><c:choose>
							<c:when test="${edit}">
								<input type="submit" value="Update" class="button" />
							</c:when>
							<c:otherwise>
								<input type="submit" value="Register" class="button" />
							</c:otherwise>
						</c:choose> <a href="<c:url value='/userList' />"><button class="button">Accountlist</button></a></td>
				</tr>
			</table>
		</form:form>
		<br /> <br />
		
		<script type="text/javascript">				
			document.title = 'Neues Lager';
		</script>
		
<%@ include file="footer.jsp"%>