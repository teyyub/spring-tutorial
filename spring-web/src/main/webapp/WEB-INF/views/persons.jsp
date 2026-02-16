<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Persons List</title>
</head>
<body>
<h1>Persons List</h1>
<ul>
    <c:forEach var="p" items="${persons}">
        <li>${p.name} (${p.age} yaş)</li>
    </c:forEach>
</ul>
</body>
</html>
