package com.grwt.Listner.context.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContext extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		 javax.servlet.ServletContext cxt=req.getServletContext();
		 String name=(String)cxt.getInitParameter("name");
		 pw.println("<h1>"+name+"<h1>");
		 
		 
	}

}
