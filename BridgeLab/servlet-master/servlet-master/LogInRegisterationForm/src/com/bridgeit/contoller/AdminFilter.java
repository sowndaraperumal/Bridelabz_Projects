package com.bridgeit.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class AdminFilter  implements Filter {
private FilterConfig config=null	; 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String key=config.getInitParameter("key");
	//	PrintWriter printWriter=response.getWriter();
	
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		//System.out.println(password);
		int flag=0;
		try {
	        Class.forName("com.mysql.jdbc.Driver");
	       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			
	        PreparedStatement ps = con
	                .prepareStatement("select * from servlet");
	        //System.out.println(ps);
	        ResultSet resultSet=ps.executeQuery();
	        //System.out.println("ss");
	        
	        while(resultSet.next()) {
	        	
	        	String decryptPassword=ASEAlgorithm.decrypt(resultSet.getString(5), key);
	    		//System.out.println(decryptPassword);
	    	
	        	if(resultSet.getString(4).equals(email)&&decryptPassword.equals(password)&&resultSet.getString(6).equals("admin")) 
	        	{
	        		
	        		
	        		//printWriter.println("wellcome admin"+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(6));
	        	RequestDispatcher dispatcher =request.getRequestDispatcher("/admin.jsp");
	        	dispatcher.forward(request, response);
	        	flag++;
	        	
	        	}
	        else if(resultSet.getString(4).equals(email)&&decryptPassword.equals(password)&&resultSet.getString(6).equals("user"))
	        {
	        	//	System.out.println("sss");
	        		chain.doFilter(request, response);
	        flag++;	
	        }
	       
	       
	        }

	        if(flag==0) {
	        	printWriter.print("Incorrect user id and password");
	    		RequestDispatcher dispatcher=request.getRequestDispatcher("/index.html");
	    		dispatcher.include(request, response);
	    		
	        }
	        
	        
	        
	        
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void init(FilterConfig config)  {

		this.config=config;
	}

}