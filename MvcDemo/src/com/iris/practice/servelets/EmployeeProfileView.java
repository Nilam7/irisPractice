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
 * Servlet implementation class EmployeeProfileView
 */
@WebServlet("/viewprofile")
public class EmployeeProfileView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
	
		try(Connection conn= ConnectionProvider.getDbConnection() )
		{
			PreparedStatement ps=conn.prepareStatement("select * from Employee");
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				
				
				String fname=rs.getString(3);
				String gender=rs.getString(5);
				String q=rs.getString(6);
				String role=rs.getString(7);
				out.print(fname);
				out.print(gender);
				out.print(q);
				out.print(role);
				
			}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}

	


	}

