<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<form method="post">
    <table>
        <tr>
            <td><input type="text" name="name" placeholder="Name" value="${student.name}"></td>
        </tr>
        <tr>
            <td><input type="text" name="dob" placeholder="Date of Birth" value="${student.dob}"></td>
        </tr>
        <tr>
            <td><input type="text" name="address" placeholder="Address" value="${student.address}"></td>
        </tr>
        <tr>
            <td><input type="text" name="phone" placeholder="Phone" value="${student.phone}"></td>
        </tr>
        <tr>
            <td><input type="text" name="email" placeholder="Email" value="${student.email}"></td>
        </tr>
        <tr>
            <td>
                <select name="classroom">
                    <option value="${student.classroom}" selected hidden>${student.classroom}</option>
                    <c:forEach items="${classroom}" var="classroom">
                        <option value="${classroom.className}">${classroom.className}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <button type="submit">Edit</button>
            </td>
        </tr>
    </table>
</form>
<a href="/home">Back</a>
</body>
</html>
