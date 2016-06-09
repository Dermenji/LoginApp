<%@ page import="org.dermenji.dto.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Login Successful</h3>

<jsp:useBean id="user" class="org.dermenji.dto.User" scope="request">
    <jsp:setProperty name="user" property="*" value="newUser"></jsp:setProperty>
</jsp:useBean>

Hello <jsp:getProperty name="user" property="userName"></jsp:getProperty>
</body>
</html>
