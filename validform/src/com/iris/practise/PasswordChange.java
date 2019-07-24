package com.iris.practise;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PasswordChange
 */
@WebServlet("/password")
public class PasswordChange extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String email =(String)session.getAttribute("userEmail");
		String password=request.getParameter("currentpassword");
		String changepassword=request.getParameter("changedpassword");
		try
		{
			Connection conn=(Connection)getServletContext().getAttribute("connObj");
			PreparedStatement ps=conn.prepareStatement("Update  user_table set pass=? where email=? and pass=?");
			
			ps.setString(1,changepassword);
			ps.setString(2,email);
			ps.setString(3,password);
			int count=ps.executeUpdate();
			if(count!=0)
			{
				
				out.println("Your password have been updated");
				
			}
			else	
			out.println("No account of given credentials were found");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
			
	}

}
