

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ElServer
 */
@WebServlet("/serv")
public class ElServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			HttpSession session=request.getSession();
			session.setAttribute("name","Sagar");
			HttpSession session1=request.getSession();
			session1.setAttribute("designation","Get");
			
			ServletContext context=getServletContext();
			context.setAttribute("employeername","iris software");
			
			Cookie cookie=new Cookie("biscuit", "Parle-G");
				response.addCookie(cookie);
				
				RequestDispatcher rd=request.getRequestDispatcher("Myform.jsp");
				rd.forward(request, response);
				
				
				
			
			
			
			
			
	}

}
