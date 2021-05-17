package com.grwts.servlet.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.grwts.Pojo.zafar.StudentVo;
import com.grwts.dao.zafar.StudentDao;

public class TakedatFromHtmlFrom extends HttpServlet {
	public  void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		StudentVo sobj=new StudentVo();
		sobj.setStudent_Name( request.getParameter("SName"));
		sobj.setCity(request.getParameter("city"));
		sobj.setEmail(request.getParameter("email"));
		sobj.setPhoneNumber(request.getParameter("phone"));
		sobj.setDeparment(request.getParameter("department"));
		StudentDao dobj= new  StudentDao();
		boolean check=dobj.insert(sobj);
		 if(check)
		 {
			 pw.println("<h1>Sucessfully insearted</h1>");
		 }
		 else
		 {
			 pw.println("<h1>UnSucessfully</h1>");
	 
		 }
		RequestDispatcher rst=request.getRequestDispatcher("/Wish.html");
		 rst.include(request, response);
		
		
	}

}
