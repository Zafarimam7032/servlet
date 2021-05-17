<%@page import="jspFormVo.normalVo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <% normalVo norVo=new normalVo(); 

out.println("<form action='abc'>");

out.println("<input type='text' name='name'>");
norVo.setName(request.get );
out.println("<input type='submit' value='Submit'>");
 session.setAttribute("obj", norVo);

		out.println("</form>");
%> --%>
<jsp:useBean id="nomal" scope= "page | request | session | application"   class="jspFormVo.normalVo"></jsp:useBean>

<form action='abc'>

<input type='text' name='name'>
<jsp:setProperty property="Name"  name="nomal"  />
<input type='submit' value='Submit'>
</form>
</body>
</html>