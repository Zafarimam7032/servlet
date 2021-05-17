package com.grwts.zafar.urlRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw=response.getWriter();
//	String name=null;
//	Cookie [] cookies=request.getCookies();
//	for(Cookie ck:cookies)
//	{
//		if(ck.getName().equalsIgnoreCase("uname"))
//		{
//			name=ck.getValue();
//		}
//	}

	response.setContentType("text/html");
	//String name=request.getParameter("user");
	String name=(String) request.getParameter("name");
	pw.println("<h1> welcome to second servlet</h1>");
	pw.println("<h1>user name: "+name+"<h1>");
	}

}
