package com.grwt.sessionMang.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionManagement extends HttpServlet {
	public void service(HttpServletRequest rq,HttpServletResponse resp) throws IOException
	{
		PrintWriter pw=resp.getWriter();
		String uname=rq.getParameter("uname");
		String password=rq.getParameter("pass");
		pw.println("<h1>welcome "+uname+" lets validate  <h1>");
		pw.println(password);
		HttpSession sess=rq.getSession();
		sess.setAttribute("uname", uname);
		sess.setAttribute("password", password);
		pw.println("<a href='ValidateUser'>  tap here to validate </a>");
	}

}
