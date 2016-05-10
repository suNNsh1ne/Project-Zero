<%@ include file="header.jsp"%>
		<h2>Registration Form</h2>
		<form:form method="POST" modelAttribute="User">
			<form:input type="hidden" path="userId" id="userId" />
			<table>
				<tr>
					<td><label for="username"></label></td>
					<td><form:input path="username" placeholder="Username" id="username" /></td>
					<td><form:errors path="username" cssClass="error" /></td>
				</tr>

				<tr>
					<td><label for="password"></label></td>
					<td><form:input path="password" placeholder="Password" id="password" /></td>
					<td><form:errors path="password" cssClass="error" /></td>
				</tr>

				<tr>
					<td><label for="permissionPriority"></label></td>
					<td><form:input path="permissionPriority" placeholder="permissionPriority" id="permissionPriority" /></td>
					<td><form:errors path="permissionPriority" cssClass="error" /></td>
				</tr>

				<tr>
					<td colspan="3"><c:choose>
							<c:when test="${edit}">
								<input type="submit" value="Update" class="button" />
							</c:when>
							<c:otherwise>
								<input type="submit" value="Register" class="button" />
							</c:otherwise>
						</c:choose></td>
						<td>
						
						</td>
				</tr>
			</table>
		</form:form>
		<a href="<c:url value='/list' />"><button class="button">Back to List</button></a>
		
		<script type="text/javascript">				
			document.title = 'Neuen Benutzer hinzufügen';
		</script>
<%@ include file="footer.jsp"%>