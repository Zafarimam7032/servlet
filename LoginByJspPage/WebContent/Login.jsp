<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="log" method="post">
<input type="text" name="user" placeholder="enter the user main"><br>
<input type="password" name="pass" placeholder="enter the Password"><br>
<input type="submit" value="login"> 
</form>
<%
/* response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); */
if(session.getAttribute("user")==null)
{
	response.sendRedirect("Login.jsp");
}
%>
</body>
</html>