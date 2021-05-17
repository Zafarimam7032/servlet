package com.grwt.call.servlet.redir.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
 public void service(HttpServletRequest rq,HttpServletResponse rp) throws IOException
 {
	 PrintWriter pw=rp.getWriter();
	 int a = Integer.parseInt(rq.getParameter("num1").trim());
		int b = Integer.parseInt(rq.getParameter("num2").trim());
		int c = a + b;
		pw.println("<h1> ADDITION:"+c+"</h1>");
		rp.sendRedirect("imam?c="+c);
		pw.println("this is normal message ");
	 
 }
}
