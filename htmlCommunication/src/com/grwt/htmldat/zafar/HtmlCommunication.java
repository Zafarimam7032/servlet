package com.grwt.htmldat.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/HtmlCommunication")
public class HtmlCommunication extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter pw=response.getWriter();
//		response.setContentType("text/html");
//		String name=request.getParameter("name");
//		String email=request.getParameter("email");
//		String subject=request.getParameter("subject");
//		String message=request.getParameter("message");
//		pw.println("<h1>"+name+"</h1>");
//		pw.println("<h1>"+email+"</h1>");
//		pw.println("<h1>"+subject+"</h1>");
//		pw.println("<h1>"+message+"</h1>"); 
//		
//	}
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter pw=resp.getWriter();
	resp.setContentType("text/html");
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String subject=req.getParameter("subject");
	String message=req.getParameter("message");
	pw.println("<h1>"+name+"</h1>");
	pw.println("<h1>"+email+"</h1>");
	pw.println("<h1>"+subject+"</h1>");
		pw.println("<h1>"+message+"</h1>"); 
		
	}
	protected void doPut(HttpServletRequest req,  HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String subject=req.getParameter("subject");
		String message=req.getParameter("message");
		pw.println("<h1>"+name+"</h1>");
		pw.println("<h1>"+email+"</h1>");
		pw.println("<h1>"+subject+"</h1>");
		pw.println("<h1>"+message+"</h1>"); 
		
	}
	

	
	
}
