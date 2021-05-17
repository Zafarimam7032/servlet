package com.practice.whysess.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet  extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String user=request.getParameter("uname");
		String password=request.getParameter("pass");
		pw.println("<h1> welcome mr:"+user+"</h1>");
	}

}
