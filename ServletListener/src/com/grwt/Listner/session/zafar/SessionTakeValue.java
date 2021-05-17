package com.grwt.Listner.session.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTakeValue extends HttpServlet {
	public void service(HttpServletRequest rq,HttpServletResponse resp) throws IOException,ServletException
	{
		resp.setContentType("text/html");
		HttpSession sess=rq.getSession();
		PrintWriter pw=resp.getWriter();
		String name=(String)sess.getAttribute("name");
		String password=(String)sess.getAttribute("password");
		pw.println("<h1> User Information<h1>");
		pw.println("<h1>UserName:"+name+"<h1>");
		pw.println("<h1>password:"+password+"<h1>");
		sess.invalidate();
		
		
	}

}
