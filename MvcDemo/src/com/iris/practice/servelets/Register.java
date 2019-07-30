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
import com.iris.practice.interfaces.Employeedaos;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String gender=request.getParameter("gender");
		String qualification=request.getParameter("q");
	
	
		
		Employee obj=new Employee();
		obj.setFirst_name(fname);
		obj.setLast_name(lname);
		obj.setGender(gender);
		obj.setQulalification(qualification);
		Employeedaos jobj=new EmployeeDaos1();
		boolean r=jobj.Register(obj);
		if(r){
			HttpSession session=request.getSession();
			session.setAttribute("userObj",r);
			
			if(r){
				request.setAttribute("msg","User Registered Succesfully...");
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				rd.forward(request, response);
			}
			else {
				request.setAttribute("msg","Problem in doing registration . Try again...");
				
				RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
				rd.forward(request, response);
			}

			
		}
		
	}
		
		
		
	
	}

