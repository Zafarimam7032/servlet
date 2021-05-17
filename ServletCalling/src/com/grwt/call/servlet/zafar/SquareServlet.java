package com.grwt.call.servlet.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.standard.PrinterName;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void service(HttpServletRequest rq,HttpServletResponse resp) throws IOException
	{
		resp.setContentType("text/html");
		PrintWriter pw =resp.getWriter();
		pw.println("<h1>"+"zafar imam"+"</h1");
		int num=(int ) rq.getAttribute("num");
		int c=num*num*num;
		pw.println("<h1>"+" Result:"+c+"</h1>");
		
	}

}
