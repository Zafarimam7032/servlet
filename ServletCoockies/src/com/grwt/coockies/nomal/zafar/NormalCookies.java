package com.grwt.coockies.nomal.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NormalCookies extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		 String name=request.getParameter("uname");
		 String pass=request.getParameter("pass");
		 PrintWriter pw=response.getWriter();
		 HttpSession ses=request.getSession();
		 ses.setAttribute("pass",pass);
		 ses.setAttribute("uname", name);
		 pw.println("<h1>WELCOME MR "+name+" Lets validate  </h1>");
		 pw.println(pass);
		 Cookie cok=new Cookie("name", name);
		 response.addCookie(cok);
		  
		 pw.println("<a href='url' >click here to validate </a>");
	}
}
