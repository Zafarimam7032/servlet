package com.grwt.srvcxt.html.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TakeRequestInTheFromHtml extends HttpServlet {
	public void service(HttpServletRequest rqes,HttpServletResponse resp) throws IOException
	{
		String name=rqes.getParameter("name");
		PrintWriter pw=resp.getWriter();
		pw.println("<h1>"+name+"</h1>");
	}

}
