package com.practice.whysess.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String user=request.getParameter("uname");
		String password=request.getParameter("pass");
		pw.println("<h1> welcome mr:"+user+"</h1>");
		pw.println("<a href='sec'><button> click here</button></a>");		
	}

}
