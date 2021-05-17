package com.grwt.coockies.nomal.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TakeValueFromCookies extends HttpServlet {
	public void service(HttpServletRequest rq,HttpServletResponse resp) throws  IOException,ServletException
	{
		
		resp.setContentType("text/html");
		Cookie cook[]=rq.getCookies();
		HttpSession sess=rq.getSession();
		PrintWriter pw=resp.getWriter();
		String uname=(String) sess.getAttribute("uname");
		String pass=(String) sess.getAttribute("pass");
		pw.println(uname);
		pw.println(pass);

		pw.println("<h1> Congratulation you are authorised <h1>");
		for(Cookie ck:cook)
		{
			if(ck.getName().equals("name"))
			{
				pw.println("<h1> email:"+ck.getValue()+"</h1>");
			}
		}
		
		pw.println("<h1> Password:"+pass+"</h1>");
		
	}

}
