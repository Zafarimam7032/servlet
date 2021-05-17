package com.grwt.ssmang.adv.method.zafar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NormalMethod  extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		//response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");

		String uname=request.getParameter("username");
		String pass=request.getParameter("pass");
		HttpSession sess=request.getSession();
		sess.setAttribute("user", uname);
		sess.setAttribute("pass", pass);
//		RequestDispatcher rqst=request.getRequestDispatcher("/logout");
//		rqst.forward(request, response);
		RequestDispatcher rqst=request.getRequestDispatcher("/normal");
		rqst.forward(request, response);
	}

}
