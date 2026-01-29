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
  String username=(String) session.getAttribute("username");
  if(username==null){
    response.sendRedirect("log.jsp");
  }
%>
<span>欢迎回来，<%=username%></span><a href="/logout">退出登录</a>
<a href="data.jsp">数据页面</a>
</body>
</html>
