<%@ include file="header.jsp"%>
		<h2>Neuer Artikel...</h2>

		<form:form method="POST" modelAttribute="Artikelstamm">
			<form:input type="hidden" path="artikelstammId" id="artikelstammId" />
			<table>
				<tr>
					<td><label for="bezeichnung"></label></td>
					<td><form:input path="bezeichnung" placeholder="bezeichnung"
							id="bezeichnung" /></td>
					<td><form:errors path="bezeichnung" class="error" /></td>
				</tr>

				<tr>
					<td><label for="Beschreibung"></label></td>
					<td><form:input path="Beschreibung"
							placeholder="Beschreibung" id="Beschreibung" /></td>
					<td><form:errors path="Beschreibung" class="error" /></td>
				</tr>

				<tr>
					<td><label for="kategorie"></label></td>
					<td><form:input path="kategorie" placeholder="kategorie"
							id="kategorie" /></td>
					<td><form:errors path="kategorie" class="error" /></td>
				</tr>

				<tr>
					<td><label for="Attribute"></label></td>
					<td><form:input path="Attribute" placeholder="Attribute"
							id="Attribute" /></td>
					<td><form:errors path="Attribute" class="error" /></td>
				</tr>

				<tr>
					<td><label for="Preis"></label></td>
					<td><form:input path="Preis" placeholder="Preis"
							id="Preis" /></td>
					<td><form:errors path="Preis" class="error" /></td>
				</tr>
				<c:choose>
				<c:when test="${add}">
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
					<td><label for="Bestandsartikel"></label></td>
					<td><form:select path="bestandsartikel">
					<form:option value="-" label ="--bestandsartikel auswaehlen"/>
					<form:options items="${Bestandsartikel}" itemValue="bezeichnung" itemLabel="bezeichnung"/>
					</form:select>
					</td>
					<td><form:errors path="bestandsartikel" class="error" /></td>
					</tr>
					</c:when>
				</c:choose>
				<tr>
					<td colspan="3"><c:choose>
							<c:when test="${edit}">
								<input type="submit" value="Update" class="button" />
							</c:when>
							<c:otherwise>
								<input type="submit" value="Register" class="button" />
							</c:otherwise>
						</c:choose></td>
				</tr>
			</table>
		</form:form>
		<br /> <br />
		
		<script type="text/javascript">				
			document.title = 'Neuen Artikel anlegen';
		</script>
<%@ include file="footer.jsp"%>