<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home</title>
  </head>
  <body>
  <a href="/create">Create</a>
  <table>
    <c:forEach items="${students}" var="student" varStatus="loop">
      <tr>
        <td>${student.name}</td>
        <td>${student.dob}</td>
        <td>${student.address}</td>
        <td>${student.phone}</td>
        <td>${student.email}</td>
        <td>${student.classroom}</td>
        <td>
          <a href="/edit?index=${loop.index}">Edit</a>
          <a href="/delete?index=${loop.index}">Delete</a>
        </td>
      </tr>
    </c:forEach>
  </table>
  </body>
  <form action="/search" method="post">
    <input type="text" name="name" placeholder="input name here">
    <button type="submit">Search</button>
  </form>
</html>
