package com.bridgeit.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LogIn extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {

		ServletContext context=getServletContext();
		String key=context.getInitParameter("key");
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		//System.out.println(password);
		
		int flag=0;
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			
	        PreparedStatement ps = con
	                .prepareStatement("select * from servlet");
	      //  System.out.println(ps);
	        ResultSet resultSet=ps.executeQuery();
	        //System.out.println(resultSet);
	while(resultSet.next()) {
		//System.out.println("aa");
		String decryptPassword=ASEAlgorithm.decrypt(resultSet.getString(5), key);
	//	System.out.println(decryptPassword);
		if(resultSet.getString(4).equals(email)&&decryptPassword.equals(password)) {
		//	System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getString(5));
			/*RequestDispatcher dispatcher=request.getRequestDispatcher("home");
			dispatcher.forward(request, response);
			*/RequestDispatcher dispatcher =request.getRequestDispatcher("/Home.jsp");
        	dispatcher.forward(request, response);
        	
			flag++;
		}
		
	}if(flag==0) {
		printWriter.print("Incorrect user id and password");
		RequestDispatcher dispatcher=request.getRequestDispatcher("/index.html");
		dispatcher.include(request, response);
		
		
		
	}

	    }catch (Exception e) {
			// TODO: handle exception
		}
		
		
			
	}

}
