<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<c:set var="cp"
	value="${pageContext.request.servletContext.contextPath}" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${cp}/static/style.css">
    <title>All Users</title>
 
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>
 
</head>
 
 
<body>
<div id="main">
    <h2>List of users</h2>  
    <table class="table table-hover">
        <tr>
            <td>NAME</td><td>Password</td><td>ID</td><td>PermissionPriority</td><td></td>
        </tr>
        <c:forEach items="${User}" var="user">
            <tr>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.userId}</td>
            <td>${user.permissionPriority}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="<c:url value='/menu/userNew' />"><button class="button">Add New Account</button></a>
    <br/>
    <a href="<c:url value='/register' />">Add New Account</a>
    <a href="<c:url value='/login' />">Back to Login</a>
</div>
</body>
</html>