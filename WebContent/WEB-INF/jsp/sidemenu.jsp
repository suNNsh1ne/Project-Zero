<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="de.szut.ProjectZer0.model.User"%>

<c:set var="cp"	value="${pageContext.request.servletContext.contextPath}" />
	<div id='cssmenu'>
		<ul>
			<li><a href="<c:url value='/home' />"><span><img src="<c:url value="static/images/home-3-48.png"/>"/></span></a></li>
			<li><a href="<c:url value='/userlist' />"><span><img src="<c:url value="static/images/list-2-48.png"/>"/></span></a>
			<li class='last'><a href="<c:url value='/login' />"><span><img src="<c:url value="static/images/login-48.png"/>"/></span></a></li>
			<li><a href="<c:url value='/logout' />"><span><img src="<c:url value="static/images/logout-48.png"/>"/></span></a></li>			
		</ul>
		
		<ul>
			<li><div class="logged_in_as">Eingeloggt: <%User loggedInUser = (User)request.getSession().getAttribute("user");
			out.print(loggedInUser.getUsername());%></div></li>
		</ul>
	</div>
