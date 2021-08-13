<%--
  Created by IntelliJ IDEA.
  User: zhao
  Date: 2021/5/16
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>


    </title>
</head>
<body>
<%
    request.setAttribute("key","值");
%>
表达式输出的key值是：
<%=request.getAttribute("key")%></br>
EL表达式输出的key值是：${key}
</body>
</html>
