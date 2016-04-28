<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>All Users</title>
 
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>
 
</head>
 
 
<body>
    <h2>List of Mitarbeiter</h2>  
    <table>
        <tr>
            <td>ID</td><td>Name</td><td>Lager</td> <td></td>
        </tr>
        <c:forEach items="${Mitarbeiter}" var="mitarbeiter">
            <tr>
            <td>${mitarbeiter.mitarbeiterId}</td>
            <td>${mitarbeiter.Name}</td>
            <td>${mitarbeiter.Lager}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/menu/userNew' />">Add New Account</a>
</body>
</html>