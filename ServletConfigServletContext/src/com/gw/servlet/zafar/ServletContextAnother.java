package com.gw.servlet.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextAnother extends HttpServlet {
	public void service(HttpServletRequest rq,HttpServletResponse resp) throws IOException,ServletException
	{
		PrintWriter pw=resp.getWriter();
		javax.servlet.ServletContext sc=getServletContext();//this my another servlet program here i,m also accessing value
		String name=sc.getInitParameter("name");
		pw.println("<h1>"+name+"</h1>");
		String name1=sc.getInitParameter("name1");
		pw.println("<h1>"+name1+"</h1>");
		
	}

}
