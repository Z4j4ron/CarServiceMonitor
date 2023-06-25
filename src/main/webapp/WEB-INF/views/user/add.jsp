<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add user</title>
</head>
<body>

<h3>Add User</h3>

<form:form method="post" modelAttribute="user">

    <div>User name/login: <form:input path="name"/><form:errors path="name"/></div><br>
    <div>E-mail: <form:input path="email" type="email"/><form:errors path="email"/></div><br>
    <div>Password: <form:input path="lastName"/><form:errors path="lastName"/></div><br>

    <input type="submit" value="Add author">
</form:form>

</body>
</html>