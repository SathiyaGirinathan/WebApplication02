
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		out.println("<h1>Hi This is first Servlet </h1>");
		RequestDispatcher rd=req.getRequestDispatcher("/SecondServlet");
		rd.include(req, res);
		out.println("<h1>Hi This is first Servlet Again</h1>");
	}
}