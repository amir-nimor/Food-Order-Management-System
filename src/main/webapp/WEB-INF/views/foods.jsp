<%--
  Created by IntelliJ IDEA.
  User: Soly
  Date: 11/5/2026
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>menu</title>
</head>
<body>

<c:forEach var="food" items="${foods}">
    <li>${food.toString()}</li>
</c:forEach>

</body>
</html>
