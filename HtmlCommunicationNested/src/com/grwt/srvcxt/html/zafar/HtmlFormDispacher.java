package com.grwt.srvcxt.html.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HtmlFormDispacher extends  HttpServlet {
	public void service(HttpServletRequest rqs,HttpServletResponse resp) throws IOException,ServletException
	
	{
		String fname =rqs.getParameter("fname");
		String lname=rqs.getParameter("lname");
		PrintWriter pw=resp.getWriter();
		pw.println("<h1> Name:"+fname+" "+lname+"<h1>");
		RequestDispatcher rxt=rqs.getRequestDispatcher("/Second.html");
		rxt.include(rqs, resp);
	
	}

}
