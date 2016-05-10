<%@ include file="header.jsp"%>
		<h2>Neues Lager...</h2>

		<form:form method="POST" modelAttribute="Lager">
			<form:input type="hidden" path="LagerId" id="LagerId" />
			<table>
				<tr>
					<td><label for="name"></label></td>
					<td><form:input path="name" placeholder="Name"
							id="name" /></td>
					<td><form:errors path="name" class="error" /></td>
				</tr>

				<tr>
					<td><label for="Ort"></label></td>
					<td><form:input path="Ort" placeholder="Ort"
							id="Ort" /></td>
					<td><form:errors path="Ort" class="error" /></td>
				</tr>
				
				<tr>
					<td><label for="Kapazität"></label></td>
					<td><form:input path="Kapazität" placeholder="Kapazität"
							id="Kapazität" /></td>
					<td><form:errors path="Kapazität" class="error" /></td>
				</tr>
				
				<tr>
					<td><label for="Auslastung"></label></td>
					<td><form:input path="Auslastung" placeholder="Auslastung"
							id="Auslastung" /></td>
					<td><form:errors path="Auslastung" class="error" /></td>
				</tr>

				<tr>
					<td colspan="3"><c:choose>
							<c:when test="${edit}">
								<input type="submit" value="Update" class="button" />
							</c:when>
							<c:otherwise>
								<input type="submit" value="Register" class="button" />
							</c:otherwise>
						</c:choose> <a href="<c:url value='/userList' />"><button
								class="button">Accountlist</button></a></td>
				</tr>
			</table>
		</form:form>
		<br /> <br />
<%@ include file="footer.jsp"%>