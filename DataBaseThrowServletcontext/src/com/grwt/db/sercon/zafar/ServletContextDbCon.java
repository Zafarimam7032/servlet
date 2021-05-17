package com.grwt.db.sercon.zafar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextDbCon extends HttpServlet  {
	  public static  Connection con;
	 private Statement stm;
	public void init() 
	{
		
		ServletContext cxt=getServletContext();
		String dbname=cxt.getInitParameter("dbname");
		String userName=cxt.getInitParameter("userName");
		String password=cxt.getInitParameter("password");
		String port=cxt.getInitParameter("port");
		String ip=cxt.getInitParameter("ip");
		String url="jdbc:mysql://"+ip+":"+port+"/"+dbname;
		String jdbc_driver="com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(jdbc_driver);
			con=DriverManager.getConnection(url, userName, password);
			
			
		} catch (Exception e) {
			
		}
		
	}
 protected void service(HttpServletRequest rqes,HttpServletResponse resp) throws IOException,ServletException
 { 
	 resp.setContentType("text/html");
	 PrintWriter pw=resp.getWriter();
	 String sql=" select * from customer";
	 try {
	 stm=con.createStatement();
		ResultSet rst=stm.executeQuery(sql);
		pw.println("<table border='1'>");
		pw.println("<thead>");
		pw.println("<td> SNo</td>");
		pw.println("<td>Customer  Name</td>");
		pw.println("<td> Email</td>");
	
		pw.println("<td> Phone Number</td>");
		pw.println("</thead>");
		while(rst.next()==true)
		{
			pw.println("<tr>");
			pw.println("<td>"+rst.getInt(1)+"</td>");
			pw.println("<td>"+rst.getString(2)+"</td>");
			pw.println("<td>"+rst.getString(3)+"</td>");
			pw.println("<td>"+rst.getLong(4)+"</td>");
			pw.println("<tr>");
		}
		pw.println("</table>");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 @Override
public void destroy() {
	try {
		con.close();
		stm.close();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

}
