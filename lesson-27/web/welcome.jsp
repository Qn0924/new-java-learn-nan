<%--
  Created by IntelliJ IDEA.
  User: 21289
  Date: 2026/1/27
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>系统首页</h1>
    <%
        String username=(String) request.getAttribute("username");
    %>
    <span>欢迎回来，<%=username%></span>
</body>
</html>
