package com.grwt.log.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout  extends HttpServlet{
	public void service(HttpServletRequest rq,HttpServletResponse resp) throws IOException,ServletException
	{
		resp.setHeader("Cache-Control","no-cache,no-store,must-revalidate");

		HttpSession sess=rq.getSession();
		resp.setContentType("text/html");
		String name=(String)sess.getAttribute("user");
		String pass=(String)sess.getAttribute("password");
		PrintWriter pw=resp.getWriter();
		//pw.println("<h1> wait let me validate</h1>");
		if(name.equalsIgnoreCase("Zafarimam") && pass.equals("123456"))
		{
			pw.println("<h1> you have successfullyLogin mr:"+name+"</h1>");
			pw.println("<a href='Login.jsp'><button> Logout</button></a>");
			
		}
	}

}
