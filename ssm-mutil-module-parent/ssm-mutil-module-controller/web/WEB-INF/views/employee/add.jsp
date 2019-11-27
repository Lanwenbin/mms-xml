
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee list</title>
</head>
<body>
    <form method="post" action="/emp/insert">
        <input type="text" name="username"/>
        <input type="text" name="salary"/>
        <input type="date" name="hiredate"/>
        <input type="submit" value="insert"/>
    </form>


</body>
</html>
