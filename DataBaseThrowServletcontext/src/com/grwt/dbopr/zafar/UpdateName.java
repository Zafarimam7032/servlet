package com.grwt.dbopr.zafar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static com.grwt.db.sercon.zafar.ServletContextDbCon.con;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateName extends HttpServlet {
	private Statement stm;
	public void service(HttpServletRequest rq, HttpServletResponse resp) throws IOException {
		PrintWriter pw=resp.getWriter();
		String name=rq.getParameter("name");
		Integer sno=Integer.parseInt(rq.getParameter("sno").trim());
		
		pw.println(sno);
		pw.println(name);
		String sql="Update StudentDataZ Set Name= \" "+name+" \"  where sno="+sno;
		pw.println(sql);
		try {
		stm=con.createStatement();
		int z=stm.executeUpdate(sql);
		if(z!=0)
		{
			
			pw.println("<h1> Sucuusfully Changed</h1>");
		}
	}
		catch(Exception e)
		{
			
		}
		
		
	}
	@Override
	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
