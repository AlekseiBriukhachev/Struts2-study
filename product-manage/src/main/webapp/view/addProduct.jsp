<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="S" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Product</title>
    <link rel="stylesheet" href="style/style.css">
</head>
<body>

    <div align="center">
        <h2>Add New Product</h2>
        <s:form action="addAction" class="formTable">
            <s:textfield name="id" label="Product ID" class="formTextField"/>
            <s:textfield name="name" label="Product NAme" class="formTextField"/>
            <S:textfield name="category" label="Product Category" class="formTextField"/>
            <s:textfield name="price" label="Product Price" class="formTextField"/>
            <s:submit value="Add Product" class="actionBtn"/>
        </s:form>
    </div>

</body>
</html>
