package com.grwt.servlt.filter.zafar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebFilter("/filter")
public class FilterDb implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse response=(HttpServletResponse) res;
		PrintWriter pw = response.getWriter();
		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String phone = req.getParameter("phone");
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		if (fname.length() <=3) {
			pw.println("<a href='insert.html'><h1 > your  first Name is too small</h1></a>");
		}
		else if (lname.length()<=3) {
			pw.println("<a href='insert.html'><h1 > your last Name is too small</h1></a>");
		}
		else if (phone.length()<=9) {
			pw.println("<a href='insert.html'><h1> your Mobile Number is too small</h1></a>");
			}
		else if (email.length()<=8) {
			pw.println("<a href='insert.html'><h1> your email is too small</h1></a>");

		}
		else if (address.length()<=10) {
			pw.println("<a href='insert.html'><h1> your address is too small</h1></a>");

		}
		
		else {
			chain.doFilter(req, response);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
