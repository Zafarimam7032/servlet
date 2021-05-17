<%@page import="java.util.Iterator"%>
<%@page import="com.grwt.std.data.zafar.StudentVo"%>
<%@page import="  static com.grwt.std.data.zafar.StudentDataInseart.arrobj"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Student Data</h1>
	<table border="1">
		<tr>
			<th>Student Name</th>
			<th>Department</th>
			<th>City</th>
			<th>Phone Number</th>
			<th>Email</th>
		</tr>
		
		<%
		StudentVo std;
		Iterator<StudentVo> ir=arrobj.iterator();
		while(ir.hasNext())
		{	
			
			 std=ir.next();
			 out.println("<tr>");
			 out.print("<td>"+std.getName()+"</td>");
			 out.print("<td>"+std.getDepartment()+"</td>");
			 out.print("<td>"+std.getCity()+"</td>");
			 out.print("<td>"+std.getPhone()+"</td>");
			 out.print("<td>"+std.getEmail()+"</td>");
			 out.println("</tr>");

		}
		%>
		<%-- <tr>
		<td><%=std.getName() %></td>
		<td><%=std.getDepartment() %></td>
		<td><%=std.getCity() %></td>
		<td><%=std.getPhone() %></td>
		<td><%=std.getEmail() %></td>
		</tr> --%>
		
	</table>
</body>
</html>