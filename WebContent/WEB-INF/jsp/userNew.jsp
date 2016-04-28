
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
 
<head>
	<c:set var="cp"
	   value="${pageContext.request.servletContext.contextPath}" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${cp}/static/style.css">
    <title>Account Registration Form</title> 
</head>
 
<body>
 	<div id="main">
    <h2>Registration Form</h2>
  
    <form:form method="POST" modelAttribute="User">
        <form:input type="hidden" path="userId" id="userId"/>
        <table>
            <tr>
                <td><label for="username"></label> </td>
                <td><form:input path="username" placeholder="Username" id="username"/></td>
                <td><form:errors path="username" class="error"/></td>
            </tr>
         
            <tr>
                <td><label for="password"></label> </td>
                <td><form:password path="password" placeholder="Password" id="password"/></td>
                <td><form:errors path="password" class="error"/></td>
            </tr>
            
            <tr>
                <td><label for="permissionPriority"></label> </td>
                <td><form:input path="permissionPriority" placeholder="permissionPriority" id="permissionPriority"/></td>
                <td><form:errors path="permissionPriority" class="error"/></td>
            </tr>
     
            <tr>
                <td colspan="3">
                    <c:choose>
                        <c:when test="${edit}">
                            <input type="submit" value="Update" class="button"/>
                        </c:when>
                        <c:otherwise>
                            <input type="submit" value="Register" class="button"/>
                        </c:otherwise>
                    </c:choose>
                    <a href="<c:url value='/menu/userList' />"><button class="button">Accountlist</button></a>
                </td>
            </tr>
        </table>
    </form:form>
    <br/>
    <br/>
    </div>
</body>
</html>