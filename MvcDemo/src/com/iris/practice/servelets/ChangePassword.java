package com.iris.practice.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.practice.classes.ConnectionProvider;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/changepassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("id");
		String s2=request.getParameter("pass");
		String s3=request.getParameter("pass1");
		try(Connection conn= ConnectionProvider.getDbConnection() )
		{
			PreparedStatement ps=conn.prepareStatement("Update Employee set password=? where employeeid=? and password=? ");
			ps.setString(1,s3);
			ps.setString(2,s1);
			ps.setString(3,s2);
			
			
		
			
			int i=ps.executeUpdate();
			if(i!=0){
				
				
				
				out.print("Record Updated");
				
				
			}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
	}

}
