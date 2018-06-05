<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: dingzhu
  Date: 2018/6/5 0005
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html
        xmlns:th="http://www.thymeleaf.org">
<head>
    <title>${title}</title>
</head>
<body>
${list.size()}
<div>
    <p>Counting to nine:</p>
    <% for (int i = 1; i < 10; i++) { %>
    <p>This number is <%= i %>.</p>
    <% } %>
    <p>OK.</p>
</div>
</body>

</html>
