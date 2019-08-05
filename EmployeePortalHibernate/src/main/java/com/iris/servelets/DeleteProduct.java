package com.iris.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.Dao.ProductDao;
import com.iris.Dao.ProductDaoImpl;
import com.iris.models.Product;

/**
 * Servlet implementation class DeleteProduct
 */
public class DeleteProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String i=request.getParameter("id");
		try
		{
			Product p=new Product();
			ProductDao jobj=new ProductDaoImpl();
			p.setPid(Integer.parseInt(i));
			jobj.deleteProduct(p);
			out.print("Record Deleted");
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
