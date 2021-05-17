package com.grwt.dbopr.zafar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static com.grwt.db.sercon.zafar.ServletContextDbCon.*;

public class InseartDataInDb extends HttpServlet {
	private Statement stm=null;
	public void service(HttpServletRequest rqes,HttpServletResponse respe) throws IOException
	{
		PrintWriter pw=respe.getWriter();
		Integer sno=Integer.parseInt(rqes.getParameter("sno"));
		String name=rqes.getParameter("name");
		String city=rqes.getParameter("city");
		String email=rqes.getParameter("email");
		String number=rqes.getParameter("number");
		String sql="insert into StudentDataZ values("+sno+" , \""+name+" \", \""+city+"\" , \""+email+"\" , \"" +number +"\")";
		//pw.println(sql);
		try {
			stm=con.createStatement();
			int a=stm.executeUpdate(sql);
			pw.println(a);
		} catch (Exception e) {
			
		}
		
	}

}
