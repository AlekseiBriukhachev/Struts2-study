<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <link rel="stylesheet" href="view/style/style.css">
</head>
<body>

    <div align="center">
        <h2>Welcome</h2>
        <a href="view/addProduct.jsp">
            <button class="actionBtn">Add New Product</button>
        </a>
    </div>
    <table width="750" class="productTable" align="center">
        <thead>
            <tr>
                <th>Product ID</th>
                <th>Product Name</th>
                <th>Product Category</th>
                <th>Product Price</th>
                <th colspan="2">Actions</th>
            </tr>
        </thead>
        <s:iterator value="products" var="product">
            <tr>
                <td><s:property value="#product.id"/> </td>
                <td><s:property value="#product.name"/> </td>
                <td><s:property value="#product.category"/> </td>
                <td><s:property value="#product.price"/> </td>
                <td>
                    <a href="updateDataAction?id=<s:property value="#product.id"/>">
                        <button class="actionBtn">Update</button>
                    </a>
                </td>
                <td>
                    <a href="deleteAction?id=<s:property value="#product.id"/>">
                        <button class="actionBtn">Delete</button>
                    </a>
                </td>
            </tr>
        </s:iterator>
    </table>

</body>
</html>
