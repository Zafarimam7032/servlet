package com.grwt.html.db.zafar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataBaseConnector extends HttpServlet {
	private Connection con=null;
	public void init()
	{
		String db_name="greattug_gw_pratice_CD";
		String User_name="greattug_pratice";
		String password="Test1234##";
		String port="3306";
		String ip="103.50.160.116";
		String url= "jdbc:mysql://" + ip + ":" + port + "/" + db_name;
		String jdbc_driver="com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(jdbc_driver);
			con=DriverManager.getConnection(url, User_name, password);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void service(HttpServletRequest rq,HttpServletResponse resp) throws IOException
	{
		PrintWriter pw=resp.getWriter();
		if(con!=null)
		{
			pw.println("Connection is established");
		}
		else 
		{
			pw.println("problem occur in Connection");
		}
	}

}
