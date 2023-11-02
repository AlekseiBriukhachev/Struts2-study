<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

    <h2>Welcome</h2>

    <s:label value="First Name:"/>
    <s:property value="firstName"/><br/>

    <s:label value="Last Name:"/>
    <s:property value="lastName"/><br/>

    <s:label value="Gender:"/>
    <s:property value="gender"/><br/>

    <s:label value="Age:"/>
    <s:property value="age"/><br/>

    <s:label value="Email:"/>
    <s:property value="email"/><br/>

    <s:label value="Address:"/>
    <s:property value="address"/><br/>

    <s:label value="Favorite Color:"/>
    <s:property value="selectedColor"/><br/>

    <s:if test="%{subscription}">
        <div><s:label value="Subscribe:"/> You are subscriber</div>
    </s:if>
    <s:else>
        <div><s:label value="Subscribe:"/> You aren't subscriber</div>
    </s:else>

    <s:label value="Hobbies:"/>
    <s:property value="selectedHobbies"/><br/>


</body>
</html>
