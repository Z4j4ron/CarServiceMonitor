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

</body>
</html>