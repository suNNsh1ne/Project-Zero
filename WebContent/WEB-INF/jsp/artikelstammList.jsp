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
    <h2>List of Artikelsatmm</h2>  
    <table>
        <tr>
            <td>ArtikelstammId</td><td>Bezeichnung</td><td>Kategorie</td><td>Attribute</td><td>Anzahl</td><td>Preis</td><td></td>
        </tr>
        <c:forEach items="${Artikelstamm}" var="art">
            <tr>
            <td>${art.ArtikelstammId}</td>
            <td>${art.Bezeichnung}</td>
            <td>${art.Kategorie}</td>
            <td>${art.Attribute}</td>
            <td>${art.Anzahl}</td>
            <td>${art.Preis}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/menu/artikelstammNew' />">Add New Artikelstamm</a>
</body>
</html>