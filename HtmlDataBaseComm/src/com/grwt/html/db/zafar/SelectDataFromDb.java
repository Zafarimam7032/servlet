package com.grwt.html.db.zafar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectDataFromDb
 */
@WebServlet("/SelectDataFromDb")
public class SelectDataFromDb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;

	public void init(ServletConfig config) throws ServletException {
		final String Db_name = "greattug_gw_pratice_CD";
		final String User_name = "greattug_pratice";
		final String password = "Test1234##";
		final String port = "3306";
		final String Ip = "103.50.160.116";
		final String url = "jdbc:mysql://" + Ip + ":" + port + "/" + Db_name;
		final String jd_dir = "com.mysql.cj.jdbc.Driver";
		try {
		Class.forName(jd_dir);
		con=DriverManager.getConnection(url, User_name, password);
		
		
		}
		catch(Exception e)
		{
			
		}

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		final String sql= "select *from studentData";
		try {
			Statement stm=con.createStatement();
			ResultSet rst=stm.executeQuery(sql);
			while(rst.next()==true) {
				pw.println(rst.getInt(1));
				pw.println(rst.getString(2));
				pw.println(rst.getString(3));
				pw.println(rst.getString(4));
				pw.println(rst.getString(5));
				pw.println(rst.getString(6));
				
			}
				
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	public void destroy() {

	}

}
