
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>club form</title>
</head>
<body>
<form:form method="post"
           modelAttribute="club">

    name of the club: <form:input path="name"/><br>
    <form:errors path="name"/><br>
    post code of the club: <form:input path="postCode"/><br>
    <form:errors path="postCode"/><br>


    <input type="submit" value="Save">

</form:form>
</body>
</html>
