<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="de.szut.ProjectZer0.model.User"%>

<c:set var="cp"	value="${pageContext.request.servletContext.contextPath}" />
	<div id="cssmenu">
		<ul>
			<li><div class="logged_in_as">Eingeloggt: <%User loggedInUser = (User) request.getSession().getAttribute("user");
			out.print("Test");%></div></li>
			<li><a href="<c:url value='/home' />" class="tooltip" data-tooltip="Home"><span class="fa fa-home" aria-hidden="true"></span></a></li>
			<li><a href="<c:url value='/userlist' />" class="tooltip" data-tooltip="Userlist"><span class="fa fa-list" aria-hidden="true"></span></a></li>
			<li class='last'><a href="<c:url value='/login' />" class="tooltip" data-tooltip="Logout"><span class="fa fa-power-off" aria-hidden="true"></span></a></li>		
		</ul>
	</div>
