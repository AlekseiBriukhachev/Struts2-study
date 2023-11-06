<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

    <h2>Registration Form</h2>

    <s:form action="registerAction">
        <s:textfield key="message.firstName" name="firstName"/>
        <s:textfield key="message.last.name" name="lastName"/>
        <s:radio key="message.gender" name="gender" list="{'Male', 'Female'}"/>
        <s:textfield key="message.age" name="age"/>
        <s:textfield key="message.email" name="email"/>
<%--        <s:textarea name="address" cols="30" rows="7" label="Address"/>--%>
<%--        <s:select list="colors" name="selectedColor"--%>
<%--                  headerKey="None" headerValue="Select a color" label="Favorite Color"/>--%>
<%--        <s:checkbox name="subscription" value="true" label="Subscribe to our newslatter"/>--%>
<%--        <s:checkboxlist list="hobbies" name="selectedHobbies" label="Hobbies"/>--%>
<%--        <s:reset value="Reset"/>--%>
        <s:submit key="message.register"/>
    </s:form>

    <s:url action="changeLocaleAction" var="urlEn">
        <s:param name="request_locale">en</s:param>
    </s:url>
    <a href="${urlEn}">English</a>
    <s:url action="changeLocaleAction" var="urlCz">
        <s:param name="request_locale">cz</s:param>
    </s:url>
    <a href="${urlCz}">Czech</a>

<%--    <table border="1" width="300">--%>
<%--        <tr>--%>
<%--            <th>Product ID</th>--%>
<%--            <th>Product Name</th>--%>
<%--            <th>Product Price</th>--%>
<%--        </tr>--%>
<%--        <s:iterator value="products" var="product">--%>
<%--            <tr>--%>
<%--                <td><s:property value="#product.productId"/></td>--%>
<%--                <td><s:property value="#product.productName"/></td>--%>
<%--                <td><s:property value="#product.productPrice"/></td>--%>
<%--            </tr>--%>
<%--        </s:iterator>--%>
    </table>


</body>
</html>
