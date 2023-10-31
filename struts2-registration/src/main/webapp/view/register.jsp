<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

    <h2>Registration Form</h2>

    <s:form action="registerAction">
        <s:textfield name="firstName" label="First Name"/>
        <s:textfield name="lastName" label="Last Name"/>
        <s:radio name="gender" list="{'Male', 'Female'}" label="Gender"/>
        <s:textfield name="age" label="Age"/>
        <s:textfield name="email" label="Email"/>
        <s:textarea name="address" cols="30" rows="7" label="Address"/>
        <s:select multiple="true" list="{'Blue', 'Red', 'Green', 'White'}" name="selectedColor"
                  headerKey="None" headerValue="Select a color" label="Favorite Color"/>
        <s:reset value="Reset"/>
        <s:submit value="Register"/>
    </s:form>

</body>
</html>
