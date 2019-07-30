package com.iris.practice.servelets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.practice.classes.Employee;
import com.iris.practice.classes.EmployeeDaos1;
import com.iris.practice.interfaces.Employeedaos;

/**
 * Servlet implementation class ViewAllEmployee
 */
@WebServlet("/viewall")
public class ViewAllEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employeedaos dobj=new EmployeeDaos1();
		List<Employee> empsList=dobj.getAllEmployee();
		
		request.setAttribute("eList", empsList);
		RequestDispatcher rd=request.getRequestDispatcher("ViewAllEmployees.jsp");
		rd.forward(request, response);
	}

}
