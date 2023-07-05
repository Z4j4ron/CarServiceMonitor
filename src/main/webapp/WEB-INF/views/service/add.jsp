<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Service Type</title>
</head>
<body>

<h3>Dodaj Serwis</h3>

<form:form method="post" modelAttribute="service">
    <div>Rodzaj serwisu: <form:input path="kind"/><form:errors path="kind"/></div><br>
    <input type="submit" value="Dodaj serwis">
</form:form>
<h2><a href="http://localhost:8080/service/list">Rodzaje serwisów</a></h2><br>
<h2><a href="http://localhost:8080/vehicle/list">Przejdź do listy pojazdów</a></h2><br>
<h2><a href="http://localhost:8080/check/form">Przypisz serwis do pojazdu</a></h2><br>
</body>
</html>