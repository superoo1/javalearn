<%--
  Created by IntelliJ IDEA.
  User: paic1
  Date: 2018/11/14
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page   contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <% System.out.println(response.getStatus()); %>
  <form action = "/test" method = "GET">

    <input type ="text" name = "username" />
    <br/>
    <input type ="password" name = "password" />

    <br/>
    <input type ="submit" />

  </form>
  </body>
</html>
