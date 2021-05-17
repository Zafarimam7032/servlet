/**
 * 
 */
package com.grwt.dbopr.zafar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import  static com.grwt.db.sercon.zafar.ServletContextDbCon.*;

/**
 * @author zafar
 *
 */
public class SelectDbOpr extends HttpServlet {
	private Statement stm;
	//private ResultSet rtr;
	
	public void service(HttpServletRequest rqs,HttpServletResponse re) throws IOException,ServletException
	{
		re.setContentType("text/html");
		final String sql="select * from  StudentDataZ";
		PrintWriter pw=re.getWriter();
		try {
			stm=con.createStatement();
		 ResultSet 	rtr=stm.executeQuery(sql);
			pw.println("<table border='1'>");
			pw.println("<thead>");
			pw.println("<td> Sno </td> ");
			pw.println("<td> Student Name </td> ");
			pw.println("<td> City </td> ");
			pw.println("<td> Email </td> ");
			pw.println("<td> Mobile Number </td> ");
			pw.println("</thead>");
			while(rtr.next())
			{
				pw.println("<tr>");
				pw.println("<td>"+rtr.getInt(1)+"</td>");
				pw.println("<td>"+rtr.getString(2)+"</td>");
				pw.println("<td>"+rtr.getString(3)+"</td>");
				pw.println("<td>"+rtr.getString(4)+"</td>");
				pw.println("<td>"+rtr.getLong(5)+"</td>");
				pw.println("</ tr>");
			}
			pw.println("</table>");
				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
