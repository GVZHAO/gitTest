<%--
  Created by IntelliJ IDEA.
  User: VZHAO
  Date: 2020/11/9
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2">
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>密码</th>
        <th>总价</th>
        <th>电话</th>
    </tr>
    <c:forEach items="${u}" var="u">
        <tr>
            <th>${u.uid}</th>
            <th>${u.uname}</th>
            <th>${u.upassword}</th>
            <th>${u.ublance}</th>
            <th>${u.utel}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
