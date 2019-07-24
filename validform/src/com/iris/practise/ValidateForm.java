package com.iris.practise;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ValidateForm
 */
@WebServlet("/ValidateForm")
public class ValidateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		try
		{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			ServletContext context=getServletContext();
			context.setAttribute("connObj", conn);
			PreparedStatement ps=conn.prepareStatement("select * from user_table where email=? and pass=?");
					ps.setString(1,email);
					ps.setString(2,password);
					ResultSet rs=ps.executeQuery();
				
					if(rs.next())
					{
						String name=rs.getString(3)+" "+rs.getString(4);
						request.setAttribute("username", name);

						HttpSession session=request.getSession();
						session.setAttribute("userEmail",email);
						
						RequestDispatcher rd=request.getRequestDispatcher("success");
						rd.forward(request,response);
					}
					else
					{
						out.println("wrong credentials");
						RequestDispatcher rd=request.getRequestDispatcher("login.html");
						rd.include(request,response);
					}
					
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
