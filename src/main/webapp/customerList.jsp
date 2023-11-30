<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/30/2023
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<c:url value = "/css/style.css"/>" >
</head>
<body>
<table class="table">
<tr><th colspan="3">Danh sách khách hàng</th></tr>
    <tr>
        <td>Tên</td>
        <td>Ngày sinh</td>
        <td>Địa chỉ</td>
    </tr>
    <c:forEach items="${customers}" var="customers">
        <tr>
            <td>${customers.getName()}</td>
            <td>${customers.getDateofBirt()}</td>
            <td>${customers.getAddress()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
