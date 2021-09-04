

import java.io.*;
import java.sql.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class FormDemoServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter out=res.getWriter();
		String username=req.getParameter("uname");
		String usercontact=req.getParameter("ucontact");
		out.println("<h1>User Name:"+username+"<br>");
		out.println("User Contact:"+usercontact+"<br>");
		String[] s=req.getParameterValues("course");
		out.println("your selected courses: <br/>");
		for(String s1:s)
		{
			out.println(s1+"<br>");
		}
		out.println("</h1>");
		out.println("<h1> Request Headers Information</h1></hr>");
		out.println("<table border=2><tr><th>HeaderName</th><th>Header values</th><tr>");
		Enumeration e=req.getHeaderNames();
		while(e.hasMoreElements())
		{
			String hname=(String)e.nextElement();
			String hvalue=req.getHeader(hname);
			out.println("<tr><td>"+hname+"</td><td>"+hvalue+"</td></tr>");
		}
		out.println("</table></body></html>");
	}
}






















