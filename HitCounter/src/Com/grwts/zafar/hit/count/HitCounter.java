package Com.grwts.zafar.hit.count;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HitCounter extends HttpServlet{
	private int hitCount;
	public void init()
	{
		 hitCount=0;
	}
public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
{
	PrintWriter pw=response.getWriter();
	hitCount++;
	pw.println("<h1> hit counter of this page </h1>");
	pw.println("<h1> hit Count:"+hitCount+"<h1>");
	pw.println();
	pw.println();
}
}
