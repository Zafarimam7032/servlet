package com.grwts.cal.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class Calculator extends HttpServlet {
	
	//private static final long serialVersionUID = 1L;
	int result;
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
	
	PrintWriter pw=resp.getWriter();
		
	
	Integer first=Integer.parseInt(req.getParameter("firstn").trim());
	Integer secn=Integer.parseInt(req.getParameter("secn").trim());
	String oprerator=req.getParameter("opr").trim();
	char opr=oprerator.charAt(0);
	//result=first+secn;
	
	

	if(opr=='+')
	{
		
		result=first+secn;
		pw.println("<h1>"+"Addition:"+result+"<h1>");
	}
	if(opr=='-')
	{
		result=first-secn;
		pw.println("<h1>"+"Subtraction:"+result+"<h1>");
		
	}
	if(opr=='*')
	{
		result=first*secn;
		pw.println("<h1>"+"Multipication:"+result+"<h1>");
		
	}
	if(opr=='/')
	{
		result=first/secn;
		pw.println("<h1>"+"Divide:"+result+"<h1>");
		
	}

	
	pw.close();
	
}
}



