package com.bridgeit.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
	response.setContentType("text/html");
	PrintWriter printWriter=response.getWriter();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
	
		PreparedStatement ps=connection.prepareStatement("select * from servlet");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()!=false) {
		printWriter.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+"\n");
	
		}
	}catch (Exception e) {
		// TODO: handle exception
	}		
}
}