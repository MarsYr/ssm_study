<%--
  Created by IntelliJ IDEA.
  User: MarsYr
  Date: 2021/1/25
  Time: 21:55
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
    <script type="text/javascript" src="js/jquery-3.5.1.js"></script>
    <script>
        $(function () {
            loadData();
            $("#query").click(function () {
                loadData();
            })
        })

        function loadData() {
            $.ajax({
                url: "student/findStudents.do",
                type: "get",
                dataType: "json",
                success: function (data) {
                    $("#info").empty();
                    $.each(data, function (i, n) {
                        $("#info").append("<tr>")
                            .append("<td>" + n.name + "</td>")
                            .append("<td>" + n.age + "</td>")
                            .append("</tr")
                    })
                }
            })
        }
    </script>
</head>
<body>
    <div align="center">
        <table>
            <thead>
            <tr>
                <th>姓名</th>
                <th>年龄</th>
            </tr>
            </thead>

            <tbody id="info">
            </tbody>
        </table>
        <input type="button" id="query" value="查询">
    </div>
</body>
</html>
