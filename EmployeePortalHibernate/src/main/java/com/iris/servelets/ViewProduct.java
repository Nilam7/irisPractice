package com.iris.servelets;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ViewProduct
 */
@WebServlet("/view")
public class ViewProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao dobj=new ProductDaoImpl();
		List<Product> proList=dobj.getAllProduct();
		
		request.setAttribute("eList", proList);
		RequestDispatcher rd=request.getRequestDispatcher("ViewAllProduct.jsp");
		rd.forward(request, response);
	}

}
