package com.iris.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import proxies.CountryInfoService;
import proxies.CountryInfoServiceSoapType;
import proxies.TCurrency;

/**
 * Servlet implementation class PincodeVerify
 */
@WebServlet("/pincode")
public class PincodeVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String i=request.getParameter("t1");
		
		CountryInfoService service=new CountryInfoService();
		CountryInfoServiceSoapType type=service.getCountryInfoServiceSoap();
		String path=type.countryFlag(i);
		String name=type.countryName(i);
		String c=type.capitalCity(i);
	out.print("<img src='"+path+"'>");
		out.print("Country name"+name);
		out.print("capital city"+c);
		
		
		
		
		
	}

}
