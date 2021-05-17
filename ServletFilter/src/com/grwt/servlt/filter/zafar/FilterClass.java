package com.grwt.servlt.filter.zafar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterClass extends HttpServlet {
	private Connection con;
	private Statement stm;
	public void init() 
	{
		ServletContext cxt=getServletContext();
		final String db_name=cxt.getInitParameter("dbname");
		final String user_name=cxt.getInitParameter("userName");
		final String password=cxt.getInitParameter("password");
		final String port=cxt.getInitParameter("port");
		final String ip=cxt.getInitParameter("ip");
		final String url="jdbc:mysql://"+ip+":"+port+"/"+db_name;
		final String jdbc_driver=cxt.getInitParameter("jdbcd");
		try {
			Class.forName(jdbc_driver);
				con=DriverManager.getConnection(url, user_name, password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String fname=req.getParameter("firstName");
		String lname=req.getParameter("lastName");
		String phone=req.getParameter("phone");
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		String sql="insert  into StudentData values(\""+fname+"\",\""+lname+"\",\""+phone+"\",\""+email+"\",\""+address+"\")";
		//pw.println(sql);
		try {
			stm=con.createStatement();
			int a=stm.executeUpdate(sql);
			if (a!=0)
			{
				pw.println("<h1>SucussFully Inserted result for user:"+fname+" " +lname+"</h1>");
			}
			else
			{
				pw.println("<h1>Somthing problem in server <h1>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
