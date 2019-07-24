package com.iris.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class RegisterValidate
 */
@WebServlet("/RegisterValidate")
public class RegisterValidate extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("fname");
		String s2=request.getParameter("lname");
		String s3=request.getParameter("email");
		String s4=request.getParameter("password");
		
		try(Connection conn=ConnectionProvider.getDbConnect();
				PreparedStatement ps=conn.prepareStatement("insert into user_table values(?,?,?,?)");
				){
			ps.setString(1,s1);
			ps.setString(2,s2);
			ps.setString(3,s3);
			ps.setString(4,s4);
			
			int i=ps.executeUpdate();
			if(i!=0)
			{
				out.println("inserted value");
				
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("register.html");
				rd.include(request,response);
			}
			
		}
		catch(Exception e)
		{
			out.print(e);
		}
		
	}

}
