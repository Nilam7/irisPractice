package com.iris.practise;

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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Profilecheck
 */
@WebServlet("/profile")
public class Profilecheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String email =(String)session.getAttribute("userEmail");
		try
		{
			Connection conn=(Connection)getServletContext().getAttribute("connObj");
			PreparedStatement ps=conn.prepareStatement("select * from user_table where email=?");
			
			ps.setString(1,email);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			String s3=rs.getString(3);
			String s4=rs.getString(4);
			
			out.println(email);
			//out.println(s2);
			out.println(s3);
			out.println(s4);
			}
			
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	}


