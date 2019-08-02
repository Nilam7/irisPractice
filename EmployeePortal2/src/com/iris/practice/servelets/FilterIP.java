package com.iris.practice.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.utility.ConnectionProvider;

/**
 * Servlet Filter implementation class FilterIP
 */
@WebFilter("/LoginForm.jsp")
public class FilterIP implements Filter {

  
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		PrintWriter out=res.getWriter();
		LocalDateTime ldt=LocalDateTime.now();
		String hr=ldt.getHour()+":"+ldt.getMinute()+":"+ldt.getSecond();
		String s=request.getRemoteAddr(); 
		
		/*String s1=request.getParameter("s");
		int s2=Integer.parseInt(request.getParameter("hr"));*/
		
		try (Connection conn=ConnectionProvider.getDBConnection();){
			PreparedStatement ps=conn.prepareStatement("insert into IPLOG values(?,?)");
			ps.setString(2,hr);
			ps.setString(1,s);
			
			ps.executeUpdate();
			
			chain.doFilter(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
