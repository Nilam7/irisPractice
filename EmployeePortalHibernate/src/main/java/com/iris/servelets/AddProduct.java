package com.iris.servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.Dao.ProductDao;
import com.iris.Dao.ProductDaoImpl;
import com.iris.models.Product;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/add")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String i=request.getParameter("id");
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		String des=request.getParameter("des");
		try
		{
		Product p=new Product();
		ProductDao dobj=new ProductDaoImpl();
		p.setPid(Integer.parseInt(i));
		p.setPname(name);
		p.setPrice(price);
		p.setPdescrition(des);
		boolean p1=dobj.addProduct(p);
		if(p1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("addproduct.jsp");
			rd.forward(request, response);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
		
		
		
	}

}
