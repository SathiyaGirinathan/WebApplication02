

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExcelServlet
 */
@WebServlet("/ExcelServlet")
public class ExcelServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("application/vnd.ms-excel");
		out.println("<h1><table border=1>");
		out.println("<tr><th>NAME</th><th>RANK</th></tr>");
		out.println("<tr><td>RAMA</td><td>1</td></tr>");
		out.println("<tr><td>SATHYA</td><td>2</td></tr>");
		out.println("<tr><td>GIRI</td><td>3</td></tr>");
		out.println("<tr><td>HARI</td><td>3</td></tr></h1>");
	}

}
