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
    <h2>List of Lieferant</h2>  
    <table>
        <tr>
            <td>ID</td><td>Adresse</td><td>Ansprechpartner</td><td>Wareneingang</td><td></td>
        </tr>
        <c:forEach items="${Lieferant}" var="lieferant">
            <tr>
            <td>${lieferant.lieferantenId}</td>
            <td>${lieferant.Adresse}</td>
            <td>${lieferant.Ansprechpartner}</td>
            <td>${lieferant.Wareneingang}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/menu/bestandsartikelNew' />">Add New Artikelstamm</a>
</body>
</html>