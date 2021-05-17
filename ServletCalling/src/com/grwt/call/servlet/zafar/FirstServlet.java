package com.grwt.call.servlet.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	public void service(HttpServletRequest rq, HttpServletResponse resp) throws IOException, ServletException {
		PrintWriter pw = resp.getWriter();
		int a = Integer.parseInt(rq.getParameter("num1").trim());
		int b = Integer.parseInt(rq.getParameter("num2").trim());
		int c = a + b;
		pw.println("<h1> ADDITION:"+c+"</h1>");
		rq.setAttribute("num", c);
		RequestDispatcher rst=rq.getRequestDispatcher("abc");
		rst.include(rq, resp);// this include in current page
		//rst.forward(rq, resp);// this will skip current page 
		
	}
}
