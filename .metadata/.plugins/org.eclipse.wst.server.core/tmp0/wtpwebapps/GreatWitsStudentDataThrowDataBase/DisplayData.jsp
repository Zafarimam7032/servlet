<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tbody>
			<tr>
				<th>Customer id</th>
				<th>Customer Name</th>
				<th>Customer Email</th>
				<th>Customer Phone Number</th>
			</tr>
			<%
			//HttpSession sess=request.getSession();
			ResultSet rst=(ResultSet)request.getAttribute("resultSet");
			while(rst.next())
			{
				out.println("<tr>");
				out.println("<td>"+rst.getInt(1)+"</td>");
				out.println("<td>"+rst.getString(2)+"</td>");
				out.println("<td>"+rst.getString(3)+"</td>");
				out.println("<td>"+rst.getLong(4)+"</td>");
				out.println("</tr>");
			}
			%>
		</tbody>
	</table>
</body>
</html>