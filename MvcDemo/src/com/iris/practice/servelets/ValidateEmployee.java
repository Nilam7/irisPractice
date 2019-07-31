package com.iris.practice.servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.practice.classes.Employee;
import com.iris.practice.classes.EmployeeDaos1;

/**
 * Servlet implementation class ValidateEmployee
 */
@WebServlet("/Validate")
public class ValidateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid=(request.getParameter("eid"));
		String pass=request.getParameter("pass");
		
		EmployeeDaos1 dobj1=new EmployeeDaos1();
		Employee r=dobj1.Validate(empid,pass);
		
		
		
		if(r!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("userObj",r);
			
			if(r.getRole().equals("Admin")){
				//session.setAttribute("userObj",r.getFirst_name());
				RequestDispatcher rd=request.getRequestDispatcher("Adminsucess.jsp");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("EmployeeSuccess.jsp");
				rd.forward(request, response);
			}
					
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
			rd.forward(request,response);
		}
		
	}

}
