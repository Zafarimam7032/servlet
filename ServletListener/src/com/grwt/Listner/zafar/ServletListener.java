package com.grwt.Listner.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletListener extends HttpServlet {
	PrintWriter pw;
	public void init()
	{
		//pw.println("<h1> init method</h1>");
	}
	public void service(HttpServletRequest rq,HttpServletResponse resp) throws IOException
	{
		pw=resp.getWriter();
		pw.println("<h1> service method</h1>");
		
	}
	public void destroy()
	{
		//pw.println("<h1> destroy method</h1>");
		
	}
}
