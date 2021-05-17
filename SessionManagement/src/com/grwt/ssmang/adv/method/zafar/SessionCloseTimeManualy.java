package com.grwt.ssmang.adv.method.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionCloseTimeManualy extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		HttpSession session=request.getSession();
		response.setContentType("text/html");
		String uname=(String)	session.getAttribute("user");
		//session.invalidate();

		String pass=(String)session.getAttribute("pass");
		if(uname.equals("Zafar")&&pass.equals("1234"))
		{
		PrintWriter pw=response.getWriter();
		pw.println("<h1> you are logn successfully</h1>");
		response.sendRedirect("TextFile.jsp");
		}
		
	}

}
