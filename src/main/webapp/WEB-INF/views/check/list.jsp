<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Vehicle select</title>
</head>
<body>
<h1>Pojazdy</h1>
<h2><a href="http://localhost:8080/vehicle/list">Wróć do listy pojazdów</a></h2><br>
<h2><a href="http://localhost:8080/service/form">Dodaj nowy rodzaj serwisu</a></h2><br>

<h3><label modelAttribute="vehicle">${vehicle.brand} ${vehicle.version} ${vehicle.engineCapacity} ${vehicle.productionYear}</label>
</h3>
<table>
    <tr>
        <th>Lp. |</th>
        <th>Rodzaj Serwisu |</th>
        <th>Przebieg |</th>
        <th>Data Serwisu |</th>
        <th>Cena</th>
    </tr>
    <c:forEach items="${checks}" var="check">
        <tr>
            <td>${check.id}</td>
            <td>${check.serviceType}</td>
            <td>${check.mileage}</td>
            <td>${check.serviceDate}</td>
            <td>${check.price}</td>
            <td><a href="remove?id=${check.id}" onclick="return confirm('Are you sure?')">Usuń</a></td>
        </tr>
    </c:forEach>
</table>
<h3>Łączny koszt utrzymania pojazdu:</h3>
<h3><label modelAttribute="sum">${sum}</label>
</body>
</html>