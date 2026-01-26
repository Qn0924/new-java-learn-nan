<%--
  Created by IntelliJ IDEA.
  User: 21289
  Date: 2026/1/26
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Integer key=(Integer) request.getAttribute("key");
        String name=(String) request.getAttribute("name");
    %>
    <h1>Hello</h1>
    <h1><%=key%></h1>
    <h1><%=name%></h1>
</body>
</html>
