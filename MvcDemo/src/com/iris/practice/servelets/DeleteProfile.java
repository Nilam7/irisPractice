package com.iris.practice.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.practice.classes.ConnectionProvider;

/**
 * Servlet implementation class DeleteProfile
 */
@WebServlet("/delete")
public class DeleteProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("id");
		try(Connection conn= ConnectionProvider.getDbConnection() )
		{
			PreparedStatement ps=conn.prepareStatement("delete from Employee where Employeeid=? ");
			ps.setString(1,s1);
		
			
			int i=ps.executeUpdate();
			if(i!=0){
				
				
				
				out.print("Record Deleted");
				
				
			}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
	}

}
