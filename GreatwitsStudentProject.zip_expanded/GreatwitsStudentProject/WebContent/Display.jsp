<%@page import="java.util.Iterator"%>
<%@page import="com.grwts.Pojo.zafar.StudentVo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.grwts.dao.zafar.StudentDao"%>
<%@page import="com.grwts.query.excute.zafar.QuerryExcutor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Data</h1>
<table border="1">
<thead>
<tr>
<th>Name</th>
<th>city</th>
<th>Emal</th>
<th></th>
<th>Derpament</th>
</tr>
</thead>
<%

StudentDao dobj=new StudentDao();
ArrayList<StudentVo> arobj=new ArrayList<StudentVo>();
arobj=dobj.display();
Iterator<StudentVo> itr=arobj.iterator();
StudentVo stobj=null;
while(itr.hasNext())
{
	stobj=new StudentVo();
	stobj=itr.next();
	out.println("<tr>");
	out.println("<td>"+stobj.getStudent_Name()+"</td>");
	out.println("<td>"+stobj.getCity()+"</td>");
	out.println("<td>"+stobj.getEmail()+"</td>");
	out.println("<td>"+stobj.getPhoneNumber()+"</td>");
	out.println("<td>"+stobj.getDeparment()+"</td>");
	out.println("</tr>");
}
%>


</table>
</body>
</html>