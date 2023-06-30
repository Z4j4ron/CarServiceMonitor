<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All users</title>
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
            <td><a href="add.jsp">Dodaj kolejny pojazd</a></td>
                <%--            <td><a href="edit?id=${user.id}">Edit</a></td>--%>
                <%--            <td><a href="remove?id=${user.id}" onclick="return confirm('Are you sure?')">Remove</a></td>--%>
        </tr>
    </c:forEach>
</table>

</body>
</html>