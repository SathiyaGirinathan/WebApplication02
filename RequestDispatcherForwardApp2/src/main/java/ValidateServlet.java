

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		if(name.equals("Sathiya")&&pwd.equals("0787"))
		{
			ServletContext context=getServletContext();
			RequestDispatcher rd=context.getRequestDispatcher("/inbox.jsp");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req, res);
		}
	}


}
