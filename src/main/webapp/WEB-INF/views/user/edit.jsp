<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit User</title>

</head>
<body>

<h3>Edycja Użytkownika</h3>

<form:form method="post" modelAttribute="user">

    <div>Name: <form:input path="name"/><form:errors path="name"/></div>
    <div>Email: <form:input path="email" type="email"/><form:errors path="email"/></div>
    <div>Password: <form:input path="password" type="password"/><form:errors path="password"/></div>
    <form:hidden path="id"/>
    <input type="submit" value="Zapisz">
</form:form>

</body>
</html>