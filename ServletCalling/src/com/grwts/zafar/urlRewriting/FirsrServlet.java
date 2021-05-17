package com.grwts.zafar.urlRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirsrServlet extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw=response.getWriter();
		
		 response.setContentType("text/html");
		 String name=request.getParameter("uname");
		 pw.println("<h1> user name:"+name+"<h1>");
		// request.setAttribute("name", name);
		
		pw.println("<a href='url1?name="+name+"'<h1> click here to go to second servlet<h1></a>");
	}

}
