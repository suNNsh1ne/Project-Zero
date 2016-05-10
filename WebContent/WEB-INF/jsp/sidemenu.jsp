<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="de.szut.ProjectZer0.model.User"%>

<c:set var="cp"	value="${pageContext.request.servletContext.contextPath}" />
	<div id="cssmenu">
		<ul>
			<li><div class="logged_in_as">Eingeloggt: <%User loggedInUser = (User) request.getSession().getAttribute("user");
			out.print("Test");%></div></li>
			<li><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Home"><span class="fa fa-home" aria-hidden="true"></span></a></li>
			<li><a href="<c:url value='/userlist' />" class="tooltip" data-tooltip="Benutzer"><span class="fa fa-users" aria-hidden="true"></span></a></li>
			<li><a href="<c:url value='/lieferantList' />" class="tooltip" data-tooltip="Lieferanten"><span class="fa fa-list" aria-hidden="true"></span></a></li>
			<li><a href="<c:url value='/artikelstammList' />" class="tooltip" data-tooltip="Artikel"><span class="fa fa-clone" aria-hidden="true"></span></a></li>
			<li><a href="<c:url value='/bestandsartikelList' />" class="tooltip" data-tooltip="Bestandsartikel"><span class="fa fa-cube" aria-hidden="true"></span></a></li>
			<li><a href="<c:url value='/lagerList' />" class="tooltip" data-tooltip="Lager"><span class="fa fa-cubes" aria-hidden="true"></span></a></li>
			<li><a href="<c:url value='/wareneingangList' />" class="tooltip" data-tooltip="Wareneingang"><span class="fa fa-sign-in" aria-hidden="true"></span></a></li>
			<li><a href="<c:url value='/warenausgangList' />" class="tooltip" data-tooltip="Warenausgang"><span class="fa fa-sign-out" aria-hidden="true"></span></a></li>
			<li class='last'><a href="<c:url value='/login' />" class="tooltip" data-tooltip="Logout"><span class="fa fa-power-off" aria-hidden="true"></span></a></li>		
		</ul>
	</div>
