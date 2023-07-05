<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All vehicles</title>
</head>
<body>
<h1>Pojazdy</h1>
<table>
    <tr>
        <th>Lp.</th>
        <th>Marka</th>
        <th>Model</th>
        <th>Rok produkcji</th>
        <th>Pojemność silnika</th>
        <th>Przebieg</th>
        <th>Data ostatniego serwisu</th>
    </tr>
    <c:forEach items="${vehicles}" var="vehicle">
        <tr>
            <td>${vehicle.id}</td>
            <td>${vehicle.brand}</td>
            <td>${vehicle.version}</td>
            <td>${vehicle.productionYear}</td>
            <td>${vehicle.engineCapacity}</td>
            <td>${vehicle.mileage}</td>
            <td>${vehicle.lastService}</td>
            <td><a href="edit?id=${vehicle.id}">Edit</a></td>
            <td><a href="remove?id=${vehicle.id}" onclick="return confirm('Are you sure?')">Usuń pojazd</a></td>
            <td><a href="http://localhost:8080/check/list?id=${vehicle.id}">Lista Serwisów Pojazdu</a></td>
        </tr>
    </c:forEach>
</table>
<a href="form">Dodaj kolejny pojazd</a><br>
<a href="http://localhost:8080/service/form">Dodaj rodzaj serwisu</a><br>
<a href="http://localhost:8080/check/form">Dodaj przegląd pojazdu</a><br>

</body>
</html>