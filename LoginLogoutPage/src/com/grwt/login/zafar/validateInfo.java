package com.grwt.login.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class validateInfo  extends HttpServlet{
	public void service(HttpServletRequest rq,HttpServletResponse resp) throws IOException,ServletException
	{
		resp.setHeader("Cache-Control", "no-cache");
	    resp.setHeader("Cache-Control", "no-store");
	    resp.setHeader("Pragma", "no-cache");
	    resp.setDateHeader("Expires", 0);
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String name="zafar329@gmail.com";
		String password="zafar123";
		HttpSession sess=rq.getSession();
		String uname=(String)sess.getAttribute("name");
		String pass=(String)sess.getAttribute("pass");
		
		pw.println(uname);
		pw.println(pass);
		if(name.equalsIgnoreCase(uname))
		{
			
			if(password.equals(pass))
			{
				RequestDispatcher req=rq.getRequestDispatcher("Logout.html");
				req.forward(rq, resp);
				
			}
			else
			{
				pw.println("<h1>please enter Correct Password</h1>");
				RequestDispatcher req=rq.getRequestDispatcher("Login.html");
				req.include(rq, resp);
			}
		}
		else
		{
			pw.println("<h1> please enter  Correct email address</h1>");
			RequestDispatcher req=rq.getRequestDispatcher("Login.html");
			req.include(rq, resp);
		}
		sess.invalidate();
		

		
	}

}
