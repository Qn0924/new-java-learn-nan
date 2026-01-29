<%@ page import="com.test.Account" %><%--
  Created by IntelliJ IDEA.
  User: 21289
  Date: 2026/1/27
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>添加数据</h1>
<%
  Account account=(Account) session.getAttribute("account");
  String username="";
  if(account==null){
    response.sendRedirect("login.jsp");
  }else{
    username=account.getUsername();
    String type=account.getType();
    if(!type.equals("admin")){
      response.sendRedirect("error.jsp");
    }
  }
%>
欢迎回来，<%=username%>
</body>
</html>
