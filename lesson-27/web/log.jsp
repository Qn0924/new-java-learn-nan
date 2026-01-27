<%--
  Created by IntelliJ IDEA.
  User: 21289
  Date: 2026/1/26
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String error1=(String)request.getAttribute("error1");
        String error2=(String)request.getAttribute("error2");
        if(error1==null){
            error1="";
        }
        if(error2==null){
            error2="";
        }
    %>
    <form action="/log" method="get">
      <table>
        <tr>
          <td>用户名：</td>
          <td>
            <input type="text" name="username"/><%=error1%>
          </td>
        </tr>
        <tr>
          <td>密码：</td>
            <td>
                <input type="password" name="password"/><%=error2%>
            </td>
        </tr>
          <tr>
              <td>
                  <input type="submit" value="登录"/>
              </td>
          </tr>
      </table>
    </form>
</body>
</html>
