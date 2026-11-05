<%--
  Created by IntelliJ IDEA.
  User: Soly
  Date: 11/5/2026
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>orders</title>
</head>
<body>

<c:forEach var="order" items="${orders}">
    <li>${order.toString()}</li>
</c:forEach>

</body>
</html>
