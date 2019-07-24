package com.iris.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/LoginValidate")
public class LoginValidate extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("email");
		String s2=request.getParameter("password");
		
		try(Connection conn=ConnectionProvider.getDbConnect();
				PreparedStatement ps=conn.prepareStatement("select * from user_table where Email=? and pass=?");
				){
							ps.setString(1,s1);
							ps.setString(2,s2);
							
			ResultSet rst=ps.executeQuery();
			if(rst.next())
			{
				
				out.println("Welcome");
				RequestDispatcher rd=request.getRequestDispatcher("Login.html");
				rd.forward(request,response);
				
			}
			else	
			{
				out.println("wrong credentials");
				RequestDispatcher rd=request.getRequestDispatcher("Login.html");
				rd.include(request,response);
			}
			
			
		}
		catch(Exception e)
		{
			out.print(e);
		}
		
	}

}
