<%--
  Created by IntelliJ IDEA.
  User: MarsYr
  Date: 2021/1/25
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
    <a href="addStudent.jsp">注册学生</a>
    </br>

    <a href="findStudents.jsp">查询所有学生</a>
    </br>
</body>
</html>
