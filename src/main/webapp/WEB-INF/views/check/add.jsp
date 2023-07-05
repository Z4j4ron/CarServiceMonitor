<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Service</title>
</head>
<body>

<h3>Dodaj przegląd pojazdu</h3>

<form:form method="post" modelAttribute="check">

    <div>Pojazd: <form:select path="vehicle.id" items="${vehicles}" itemLabel="brand" itemValue="id"/><form:errors path="vehicle"/></div><br>
    <div>Rodzaj zdarzenia: <form:select path="serviceType.id" items="${services}" itemLabel="kind" itemValue="id" /><form:errors path="serviceType"/></div><br>
    <div>Przebieg: <form:input path="mileage"/><form:errors path="mileage"/></div><br>
    <div>Data Serwisu: <form:input path="serviceDate" placeholder="dd/mm/rrrr"/><form:errors path="serviceDate"/></div><br>
    <div>Koszt Serwisu: <form:input path="price"/><form:errors path="price"/></div><br>

    <input type="submit" value="Dodaj wizytę w warsztacie">
</form:form>

</body>
</html>