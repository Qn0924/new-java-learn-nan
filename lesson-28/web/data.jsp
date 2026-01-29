<%@ page import="com.test.Account" %><%--
  Created by IntelliJ IDEA.
  User: 21289
  Date: 2026/1/27
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>数据页面</h1>
    <%
        Account account=(Account) session.getAttribute("account");
        String username="";
        if(account==null){
            response.sendRedirect("login.jsp");
        }else{
            username=account.getUsername();
            String type=account.getType();
            if(!(type.equals("user")||type.equals("admin"))){
                response.sendRedirect("error.jsp");
            }
        }
    %>
    <span>欢迎回来，<%=username%></span>
</body>
</html>
