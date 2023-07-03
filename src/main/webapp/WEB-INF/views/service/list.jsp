<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>All Service Types</title>
</head>
<body>
<h1>Serwisy Pojazdów</h1>
<h2><a href="form">Dodaj kolejnego rodzaj serwisu</a></h2><br>
<table>
    <tr>
        <th>Lp.</th>
        <th>Type</th>
    </tr>
    <c:forEach items="${services}" var="service">
        <tr>
            <td>${service.id}</td>
            <td>${service.kind}</td>

            <td><a href="remove?id=${service.id}" onclick="return confirm('Are you sure?')">Remove</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>