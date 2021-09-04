

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		out.println("<h1>This is first servlet</h1>");
		RequestDispatcher rd=req.getRequestDispatcher("/SecondServlet");
		rd.forward(req, res);
		//System.out.println(10/0);
		System.out.println("After forward control comes back");
	}
}