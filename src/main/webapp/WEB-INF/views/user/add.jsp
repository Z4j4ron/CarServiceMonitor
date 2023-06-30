<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add user</title>
</head>
<body>

<h3>Dodaj użytkownika</h3>

<form:form method="post" modelAttribute="user">

    <div>User name/login: <form:input path="name"/><form:errors path="name"/></div><br>
    <div>E-mail: <form:input path="email" type="email"/><form:errors path="email"/></div><br>
    <div>Password: <form:input path="password"/><form:errors path="password"/></div><br>

    <input type="submit" value="Dodaj użytkownika">
</form:form>

</body>
</html>