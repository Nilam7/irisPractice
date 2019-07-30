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
import com.iris.practice.classes.Employee;

/**
 * Servlet implementation class ViewProfile
 */
@WebServlet("/view")
public class ViewProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
		
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("id");
	
		try(Connection conn= ConnectionProvider.getDbConnection() )
		{
			PreparedStatement ps=conn.prepareStatement("select * from Employee where EmployeeId=?");
			ps.setString(1,s1);
		
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				
				
				String fname=rs.getString(3);
				String gender=rs.getString(5);
				String q=rs.getString(6);
				String role=rs.getString(7);
				out.print("<h1>Name</h1><br>"+fname);
				out.print("<h1>Gender</h1><br>"+gender);
				out.print("<h1>Qualification</h1><br>"+q);
				out.print("<h1>Role</h1><br>"+role);
				
			}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}

	}


