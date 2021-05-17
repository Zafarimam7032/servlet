package com.grwt.prstm.insrt.zafar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static com.grwt.db.sercon.zafar.ServletContextDbCon.con;

public class PreapareStmDb extends HttpServlet {
	private PreparedStatement pstm;
 public void service(HttpServletRequest rqes,HttpServletResponse resp) throws IOException
 {
	 PrintWriter pw=resp.getWriter();
	 int sno=Integer.parseInt(rqes.getParameter("sno"));
	 String name=rqes.getParameter("name");
	 String city=rqes.getParameter("city");
	 String email=rqes.getParameter("email");
	 long number=Long.parseLong(rqes.getParameter("number"));
	 try {
		pstm=con.prepareStatement("insert into StudentDataZ values(?,?,?,?,?)");
		pstm.setInt(1, sno);
		pstm.setString(2, name);
		pstm.setString(3, city);
		pstm.setString(4, email);
		pstm.setLong(5, number);
		int a=pstm.executeUpdate();
		if(a!=0)
		{
			pw.println("<h1> sucussfully inserted data</h1>");
		}
		else
		{
			pw.println("<h1> unsucussfully please  try again and first check your code </h1>");

		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 public  void destroy()
 {
	 try {
		con.close();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 try {
		pstm.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
