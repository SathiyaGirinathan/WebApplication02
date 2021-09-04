

import java.io.*;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<h1>This is Second Servlet</h1>");
		Enumeration e = request.getAttributeNames();
		while(e.hasMoreElements())
		{
			String name=(String)e.nextElement();
			Object value=request.getAttribute(name);
			out.println(name+"...."+value+"<br>");
		}
	}


}
