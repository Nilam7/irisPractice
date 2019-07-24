package com.iris.practise;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SucessServelet
 */
@WebServlet("/success")
public class SucessServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String str=(String)request.getAttribute("username");
		out.println("<h1>welcome </h1>"+str);
		out.println("<form  action='profile' method='post'><input type='submit' value='view profile'><br></form>");
		out.println("<a href='changepassword.html'>change password</a>");
		
		
		
	}

}
