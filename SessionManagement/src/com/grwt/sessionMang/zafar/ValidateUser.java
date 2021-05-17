package com.grwt.sessionMang.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidateUser extends HttpServlet {
	
	public void service(HttpServletRequest rq,HttpServletResponse resp) throws IOException,ServletException
	{ 
		HttpSession sess=rq.getSession();
		String name=(String) sess.getAttribute("uname");
		String password=(String) sess.getAttribute("password");
		String id=sess.getId();
		PrintWriter pw=resp.getWriter();
		pw.println("<h1> Welcome to you <h1>");
		pw.println("<h1>User Name :"+name+"</h1>");
		pw.println("<h1>User Password :"+password+"</h1>");
		pw.println("<h1>Session ID :"+id+"</h1>");
	}
	
}
