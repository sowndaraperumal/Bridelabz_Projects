package com.bridgeit.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String name=	request.getParameter("nm");
	String password=request.getParameter("password");
	PrintWriter printWriter=response.getWriter();
	System.out.println("sss");
	printWriter.print("<html><body >"+"<h1>welcome"+"   "+name+ "    "+password+"</h1>"+"</body></html>");
	printWriter.flush();
	printWriter.close();
	}
*/
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		  response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	 
	        String n = request.getParameter("firstname");
	        String p = request.getParameter("lastname");
	        String e = request.getParameter("email");
	        String c = request.getParameter("password");
	 
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
	    		
	            PreparedStatement ps = con
	                    .prepareStatement("insert into  servlet(firstname,lastname,email,password) values(?,?,?,?)");
	 
	            ps.setString(1, n);
	            ps.setString(2, p);
	            ps.setString(3, e);
	            ps.setString(4, c);
	 
	            int i = ps.executeUpdate();
	            if (i > 0)
	                out.print("You are successfully registered...");
	 
	        } catch (Exception e2) {
	            System.out.println(e2);
	        }
	 
	        out.close();
	}
	
}
