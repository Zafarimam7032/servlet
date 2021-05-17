<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
h1{
  
 
  animation-name: example;
  animation-duration: 0.5s;
}

@keyframes example {
  from {outline: 5px solid black;}
  to {outline: 5px solid red;}

}
</style>
<body>
<form action="file" method="post">
<%
out.println("<h1> welcome mr :"+session.getAttribute("user")+"<h1>");
%>
<h1 style="direction:rtl;position: absolute; float: right;">hello this is session program that written by zafar </h1>

</form>

</body>
</html>