<%--
  Created by IntelliJ IDEA.
  User: Soly
  Date: 11/5/2026
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>order form</title>
</head>
<body>

<form method="POST" action="${pageContext.request.contextPath}/order/add">

    <label>
        ustomerName:
        <input type="text" name="customerName">
    </label>

    <label>
        quantirty:
        <input type="number" name="quantity">
    </label>

    <label>
        food:
        <select name="foodId">
            <c:forEach var="food" items="${foods}">
                <option value="${food.id}"  >${food.name}</option>
            </c:forEach>
        </select>
    </label>

    <button>Submit</button>

</form>

</body>
</html>
