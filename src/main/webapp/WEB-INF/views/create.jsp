<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<form action="/create" method="post">
    <table>
        <tr>
            <td><input type="text" name="name" placeholder="Name"></td>
        </tr>
        <tr>
            <td><input type="text" name="dob" placeholder="Date of Birth"></td>
        </tr>
        <tr>
            <td><input type="text" name="address" placeholder="Address"></td>
        </tr>
        <tr>
            <td><input type="text" name="phone" placeholder="Phone"></td>
        </tr>
        <tr>
            <td><input type="text" name="email" placeholder="Email"></td>
        </tr>
        <tr>
            <td>
                <select name="classroom">
                    <c:forEach items="${classroom}" var="classroom">
                        <option value="${classroom.className}">${classroom.className}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <button type="submit">Create</button>
            </td>
        </tr>
    </table>
</form>
<a href="/home">Back</a>
</body>
</html>
