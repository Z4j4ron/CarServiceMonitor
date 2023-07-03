<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit Vehicle</title>

</head>
<body>

<h3>Edycja Pojazdu</h3>

<form:form method="post" modelAttribute="vehicle">

    <div>Marka: <form:input path="brand"/><form:errors path="brand"/></div>
    <div>Model: <form:input path="version"/><form:errors path="version"/></div>
    <div>Rok Produkcji: <form:input path="productionYear"/><form:errors path="productionYear"/></div>
    <div>Pojemność Silnika: <form:input path="engineCapacity"/><form:errors path="engineCapacity"/></div>
    <div>Przebieg: <form:input path="mileage"/><form:errors path="mileage"/></div>
    <div>Ostatni Serwis: <form:input path="lastService" type="date"/><form:errors path="lastService"/></div>
    <form:hidden path="id"/>
    <input type="submit" value="Zapisz">
</form:form>

</body>
</html>