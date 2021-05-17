package com.grwt.log.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login  extends HttpServlet{
	public  void service(HttpServletRequest rq,HttpServletResponse resp) throws ServletException, IOException
	{
		String name=rq.getParameter("user");
		String password=rq.getParameter("pass");
		HttpSession sess=rq.getSession();
		sess.setAttribute("user", name);
		sess.setAttribute("password", password);
		
		RequestDispatcher rqs=rq.getRequestDispatcher("/logout");
		rqs.forward(rq, resp);
		
		
		
	}

}
