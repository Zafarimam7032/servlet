package com.grwt.Student.db.zafar;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StudentDbConnection extends HttpServlet {
	private Connection con;
	private Statement stm;
	private ResultSet rst;
	public void init() {
		final String Db_name = "greattug_gw_pratice_CD";
		final String userName = "greattug_pratice";
		final String password = "Test1234##";
		final String port = "3306";
		final String ip = "103.50.160.116";
		final String url = "jdbc:mysql://" + ip + ":" + port + "/" + Db_name;
		final String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(jdbc_driver);
			con = DriverManager.getConnection(url, userName, password);
	 } catch (SQLException e1) {
			e1.printStackTrace();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		String sql="select  *from customer";
		try {
			stm=con.createStatement();
			rst=stm.executeQuery(sql);
			//HttpSession sess=req.getSession();
			req.setAttribute("resultSet", rst);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rqs=req.getRequestDispatcher("/DisplayData.jsp");
		rqs.forward(req, resp);
		
	}
}
