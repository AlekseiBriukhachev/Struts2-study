<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
    <link rel="stylesheet" href="style/style.css">
</head>
<body>

    <div align="center">
        <h2>Login</h2>
        <s:form action="loginAction" class="loginForm">
            <s:textfield name="username" label="Usre Name" class="formTextField"/>
            <s:password name="password" label="Password" class="formTextField"/>
            <s:submit value="Login" class="actionBtn"/>
        </s:form>
    </div>

</body>
</html>
