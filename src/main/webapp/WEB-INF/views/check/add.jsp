<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Service</title>
</head>
<body>

<h3>Dodaj przegląd pojazdu</h3>

<form:form method="post" modelAttribute="check">

    <div>Rodzaj zdarzenia: <form:select path="ServiceType" items="${services}" itemLabel="kind" itemValue="id"/><form:errors path="ServiceType"/></div><br>
    <div>Pojazd: <form:select path="Vehicle.id" items="${vehicles}" itemLabel="brand" itemValue="id"/><form:errors path="Vehicle"/></div><br>
    <div>Przebieg: <form:input path="mileage"/><form:errors path="mileage"/></div><br>
    <div>Password: <form:input path="price"/><form:errors path="price"/></div><br>

    <input type="submit" value="Dodaj wizytę w warsztacie">
</form:form>

</body>
</html>