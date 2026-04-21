<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check Session</title>
</head>
<body>

<%
    String user = (String) session.getAttribute("user");

    if(user != null)
    {
%>
        <h2>Hello <%= user %>, your session is still active!</h2>
<%
    }
    else
    {
%>
        <h2>Session Expired!</h2>
<%
    }
%>

</body>
</html>