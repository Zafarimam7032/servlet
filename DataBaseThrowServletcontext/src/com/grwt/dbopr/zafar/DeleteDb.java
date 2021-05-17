package com.grwt.dbopr.zafar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static com.grwt.db.sercon.zafar.ServletContextDbCon.con;

public class DeleteDb extends HttpServlet {
	public void service(HttpServletRequest rqes,HttpServletResponse resp) throws IOException
	{
		PrintWriter ow=resp.getWriter();
		resp.setContentType("text/html");
		
		String sql= "delete from StudentDataZ where sno='1'";
		try
		{
			Statement stm=con.createStatement();
			int  rst=stm.executeUpdate(sql);
//			while(rst.next())
//			{
//				ow.println("<h1>"+rst.getString(2)+"</h1>");
//			}
			ow.println("<h1> data info"+rst+"</h1>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
