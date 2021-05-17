package com.grwts.dbcon.zafar;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
	final static String dbNaame = "greattug_gw_pratice_CD";
	final static String userName = "greattug_pratice";
	final static String password = "Test1234##";
	final static int port = 3306;
	final static String ip = "103.50.160.116";
	final String jdbc_driver = "com.mysql.cj.jdbc.Driver";
	final String url = "jdbc:mysql://" + ip + ":" + port + "/" + dbNaame;

	public Connection dbConnection() {
		Connection con = null;

		try {
			Class.forName(jdbc_driver);
			con = DriverManager.getConnection(url, userName, password);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	public boolean closeDabConnection(Connection con) {
		boolean check = false;
		if (con != null) {
			try {
				con.close();
				check = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			check = false;
		}
		return check;
	}

	public static void main(String[] args) {
		DataBaseConnection obj = new DataBaseConnection();
		Connection con = obj.dbConnection();
		if (con != null) {
			System.out.println("connecrion is good");
		} else {
			System.out.println("connection is null");
		}
		boolean validate=obj.closeDabConnection(con);
		if(validate) {
			System.out.println("Succussfully Closed");
		}
		else {
			System.out.println("connection is null that you have passed as argument");
		}
	}

}
