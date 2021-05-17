package com.grwt.Listner.session.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionListner extends HttpServlet {
	 public void service(HttpServletRequest rq,HttpServletResponse resp)  throws IOException,ServletException
	 {
		 resp.setContentType("text/html");
		 PrintWriter pw=resp.getWriter();
		 String name=rq.getParameter("name");
		 String password=rq.getParameter("password");
		 HttpSession sess=rq.getSession();
		 sess.setAttribute("name", name);
		 sess.setAttribute("password", password);
		 pw.println("<h1> welcome to mr"+name+"</h1>");
		 pw.println("<a href='next'> click here for validate</a>");
		 
	 }

}
