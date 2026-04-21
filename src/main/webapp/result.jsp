<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Result</title>
</head>
<body>
    <h2>Student Result</h2>

    <p>Roll No: <%= request.getAttribute("rollno") %></p>
    <p>Student Name: <%= request.getAttribute("studentname") %></p>

    <p>Subject 1: <%= request.getAttribute("sub1") %></p>
    <p>Subject 2: <%= request.getAttribute("sub2") %></p>
    <p>Subject 3: <%= request.getAttribute("sub3") %></p>
    <p>Subject 4: <%= request.getAttribute("sub4") %></p>
    <p>Subject 5: <%= request.getAttribute("sub5") %></p>

    <p>Average: <%= request.getAttribute("average") %></p>
    <p>Result: <%= request.getAttribute("result") %></p>

    <br>
    <a href="index.jsp">Go Back to Form</a>
</body>
</html>