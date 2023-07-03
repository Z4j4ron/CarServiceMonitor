<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All users</title>
</head>
<body>
    <h1>Użytkownicy</h1>
    <h2><a href="form">Dodaj kolejnego użytkownika</a></h2><br>
<table>
    <tr>
        <th>Lp.</th>
        <th>Name</th>
        <th>E-mail</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td><a href="edit?id=${user.id}">Edit</a></td>
            <td><a href="remove?id=${user.id}" onclick="return confirm('Are you sure?')">Remove</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>