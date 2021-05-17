package com.grwt.std.data.zafar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentDataInseart  extends HttpServlet{
	public static ArrayList<StudentVo> arrobj=new ArrayList<>();
	StudentVo stud[]=new StudentVo[100];
	int i=0;
	
	public void service(HttpServletRequest rq,HttpServletResponse resp) throws IOException,ServletException {
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		stud[i]=new StudentVo();
		stud[i].setName((rq.getParameter("SName")));
		stud[i].setCity(rq.getParameter("city"));
		stud[i].setEmail(rq.getParameter("email")); 
		stud[i].setPhone(rq.getParameter("phone"));
		stud[i].setDepartment(rq.getParameter("department"));
		//pw.println(i);
		arrobj.add(stud[i]);
	//	pw.print(arrobj.size());
		i++;
	//	pw.println(i);
		//stud=new StudentVo();
		//i=0;
		//pw.println(arrobj);
		pw.println("<h1  style='color:green' > you have Successfully Insearted</h1>");
		pw.println("<h1 style='color:green' >if you want inseart one more request????</h1>");
		RequestDispatcher cxt=rq.getRequestDispatcher("/validate.html");
		cxt.include(rq, resp); 
		
	}

}
