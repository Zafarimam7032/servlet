package com.grwt.std.data.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validation extends HttpServlet{
	public void service(HttpServletRequest rq,HttpServletResponse resp) throws IOException,ServletException
	{
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		RequestDispatcher rxt=rq.getRequestDispatcher("/insert.html");
		rxt.forward(rq, resp);
	}
}
