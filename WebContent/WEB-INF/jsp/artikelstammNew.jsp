<%@ include file="header.jsp"%>
		<h2>Neuer Artikel...</h2>

		<form:form method="POST" modelAttribute="Artikelstamm">
			<form:input type="hidden" path="ArtikelstammId" id="ArtikelstammId" />
			<table>
				<tr>
					<td><label for="Bezeichnung"></label></td>
					<td><form:input path="Bezeichnung" placeholder="Bezeichnung"
							id="Bezeichnung" /></td>
					<td><form:errors path="Bezeichnung" class="error" /></td>
				</tr>

				<tr>
					<td><label for="Beschreibung"></label></td>
					<td><form:input path="Beschreibung"
							placeholder="Beschreibung" id="Beschreibung" /></td>
					<td><form:errors path="Beschreibung" class="error" /></td>
				</tr>

				<tr>
					<td><label for="Kategorie"></label></td>
					<td><form:input path="Kategorie" placeholder="Kategorie"
							id="Kategorie" /></td>
					<td><form:errors path="Kategorie" class="error" /></td>
				</tr>

				<tr>
					<td><label for="Attribute"></label></td>
					<td><form:input path="Attribute" placeholder="Attribute"
							id="Attribute" /></td>
					<td><form:errors path="Attribute" class="error" /></td>
				</tr>

				<tr>
					<td><label for="Anzahl"></label></td>
					<td><form:input path="Anzahl" placeholder="Anzahl"
							id="Anzahl" /></td>
					<td><form:errors path="Anzahl" class="error" /></td>
				</tr>

				<tr>
					<td><label for="Preis"></label></td>
					<td><form:input path="Preis" placeholder="Preis"
							id="Preis" /></td>
					<td><form:errors path="Preis" class="error" /></td>
				</tr>

				<tr>
					<td><label for="Lieferanten"></label></td>
					<td><form:select path="lieferantZuweisung">
						<form:option value="-" label ="--Lieferanten auswaehlen"/>
						<form:options items="${Lieferanten}" itemValue="Ansprechpartner" itemLabel="Ansprechpartner"/>
					</form:select>
					</td>
					<td><form:errors path="lieferantZuweisung" class="error" /></td>
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
			document.title = 'Neuen Artikel anlegen';
		</script>
<%@ include file="footer.jsp"%>