<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Product</title>
    <link rel="stylesheet" href="view/style/style.css">
</head>
<body>

<div align="center">
    <h2>Update Product</h2>
    <s:form action="updateAction" class="formTable">
        <s:textfield name="id" label="Product ID" class="formTextField" readonly="true"/>
        <s:textfield name="name" label="Product NAme" class="formTextField"/>
        <S:textfield name="category" label="Product Category" class="formTextField"/>
        <s:textfield name="price" label="Product Price" class="formTextField"/>
        <s:submit value="Update Product" class="actionBtn"/>
    </s:form>
</div>

</body>
</html>
