package com.gw.servlet.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContext extends HttpServlet{
	public void service(HttpServletRequest rq,HttpServletResponse rp) throws IOException,ServletException
	{
		PrintWriter pw=rp.getWriter(); 
		//Date d=new Date();
		//pw.println("zafar imam");
		//pw.println(d);
		javax.servlet.ServletContext cxt=getServletContext();
		String name=cxt.getInitParameter("name");
		pw.println("<h1>"+name+"</h1>");
		String name1=cxt.getInitParameter("name1");
		pw.println("<h1>"+name1+"</h1>");
		String st1=cxt.getServletContextName();//this will return name of the servlet project
		pw.println("<h1>"+st1+"</h1>");
		String st2=cxt.getServerInfo();
		pw.println("<h1>"+st2+"</h1>");
		
		
	}

}
