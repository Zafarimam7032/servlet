package com.grwt.ssmang.adv.method.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDistroy extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse response) throws IOException {
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		HttpSession sess = req.getSession();
		String user = (String) sess.getAttribute("user");
		String pass = (String) sess.getAttribute("pass");
		if (user.equalsIgnoreCase("zafar") && pass.equals("12345")) {

			pw.println("<h1> you are sussfullylogin mr:" + user + "</h1>");
			pw.println("<a href='index.html'><button>Logout</button></a>");

		} else {
			pw.println("<h1> please check you login details</h1>");
			pw.println("<a href='index.html'><button>LoginAgain</button></a>");
		}
		
	}
}
