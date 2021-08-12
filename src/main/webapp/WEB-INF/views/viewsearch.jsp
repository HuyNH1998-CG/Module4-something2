<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Seach</title>
</head>
<body>
<a href="/home">Home</a>
<table>
        <tr>
            <td>${student.name}</td>
            <td>${student.dob}</td>
            <td>${student.address}</td>
            <td>${student.phone}</td>
            <td>${student.email}</td>
            <td>${student.classroom}</td>
        </tr>
</table>
</body>
<form action="/search" method="post">
    <input type="text" name="name" placeholder="input name here">
    <button type="submit">Search</button>
</form>
</html>
