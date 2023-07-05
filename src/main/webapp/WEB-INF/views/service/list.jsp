<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>All Service Types</title>
</head>
<body>
<h1>Serwisy Pojazdów</h1>
<table>
    <tr>
        <th>Lp.</th>
        <th>Type</th>
    </tr>
    <c:forEach items="${services}" var="service">
        <tr>
            <td>${service.id}</td>
            <td>${service.kind}</td>

            <td><a href="remove?id=${service.id}" onclick="return confirm('Are you sure?')">Usuń</a></td>
        </tr>
    </c:forEach>
</table>
<h2><a href="form">Dodaj kolejny rodzaj serwisu</a></h2><br>
<h2><a href="http://localhost:8080/vehicle/list">Przejdź do listy pojazdów</a></h2><br>
<h2><a href="http://localhost:8080/check/form">Przypisz serwis do pojazdu</a></h2><br>
</body>
</html>