<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add vehicle</title>
</head>
<body>

<h3>Dodaj Pojazd</h3>

<form:form method="post" modelAttribute="vehicle">

    <div>Marka: <form:input path="brand"/><form:errors path="brand"/></div><br>
    <div>Model: <form:input path="version"/><form:errors path="version"/></div><br>
    <div>Rok produkcji: <form:input path="productionYear"/><form:errors path="productionYear"/></div><br>
    <div>Pojemność silnika: <form:input path="engineCapacity"/><form:errors path="engineCapacity"/></div><br>
    <div>Przebieg: <form:input path="mileage"/><form:errors path="mileage"/></div><br>
    <div>Data ostatniego serwisu: <form:input path="lastService" type="date"/><form:errors path="lastService"/></div><br>

    <input type="submit" value="Dodaj Pojazd">
</form:form>
<a href="list">Wróć do listy pojazdów</a>
</body>
</html>