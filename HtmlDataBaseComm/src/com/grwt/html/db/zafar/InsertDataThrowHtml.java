package com.grwt.html.db.zafar;
import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Driver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet(urlPatterns = "/addServlet",initParams = {@WebInitParam(name="dbUrl",value="jdbc:mysql://103.50.160.116:3306/greattug_gw_pratice_CD"),
@WebInitParam(name="dbUser",value="greattug_pratice"),@WebInitParam(name="dbPassword",value="Test1234##")})

//This is the way when you are not using init Params
//@WebServlet("/addServlet")
public class InsertDataThrowHtml extends HttpServlet {
private static final long serialVersionUID = 1L;
private Connection connection;
       
 
public void init() {
 
try {
Class.forName("com.mysql.cj.jdbc.Driver");
connection = DriverManager.getConnection("jdbc:mysql://103.50.160.116:3306/greattug_gw_pratice_CD","greattug_pratice","Test1234##");

} catch (Exception e) {
e.printStackTrace();
}

}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
 
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw=response.getWriter();
	
	Integer sno=Integer.parseInt(request.getParameter("SNo").trim());
	String name = request.getParameter("Name");
	String city = request.getParameter("City");
	String phoneNumber = request.getParameter("PhoneNumber");
	String email = request.getParameter("email");
	String gender = request.getParameter("gender").trim();
	char gender1=gender.charAt(0);


	try {
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("insert into studentData values('"+sno+"','"+name+"','"+city+"','"+phoneNumber+"','"+email+"','"+gender1 +"')");
			PrintWriter out = response.getWriter();


			if(result>0) 
			{
			out.print("<h1>User Created</h1>");
			}
			else {
				out.print("<h1>Error creating The user </h1>");

			}

	}
	catch (SQLException e)
	{
		e.printStackTrace();
	}
}

public void destroy() {
	try {
		connection.close();
	} 
	catch (SQLException e) {
		e.printStackTrace();
	}
	}
}