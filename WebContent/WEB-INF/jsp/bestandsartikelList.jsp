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
    <h2>List of Bestandsartikel</h2>  
    <table>
        <tr>
            <td>ID</td><td>Artikelstamm</td><td>Anzahl</td><td>Lager</td><td>Wareneingang</td><td>Warenausgang</td><td></td>
        </tr>
        <c:forEach items="${Bestandsartikel}" var="best">
            <tr>
            <td>${best.BestandsartikelId}</td>
            <td>${best.Artikelstamm}</td>
            <td>${best.Anzahl}</td>
            <td>${best.Lager}</td>
            <td>${best.Wareneingang}</td>
            <td>${best.Warenausgang}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/menu/bestandsartikelNew' />">Add New Artikelstamm</a>
</body>
</html>