package com.grwt.login.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.sun.org.apache.xerces.internal.impl.RevalidationHandler;

public class LoginServlet extends HttpServlet {
	//private static final int RevalidationHandler = 0;

	public void service(HttpServletRequest rq,HttpServletResponse resp) throws IOException,ServletException
	{
	
		resp.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	    //resp.setHeader("Cache-Control", "no-store");
	    resp.setHeader("Pragma", "no-cache");
	    resp.setDateHeader("Expires", 0);
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String uname=rq.getParameter("user");
		String  password=rq.getParameter("pass");
		HttpSession http=rq.getSession();
		http.setAttribute("name",uname);
		http.setAttribute("pass",password);
		RequestDispatcher rxt=rq.getRequestDispatcher("vlog");
		rxt.forward(rq, resp);
		//http.invalidate();
		
		
	}

}
