package com.test;

import java.sql.Statement;

import java.sql.*;
import java.sql.DriverManager;

public class test {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
	//	System.out.println(con);
	Statement stmt=con.createStatement();
	
//	stmt.executeUpdate("insert into cse(name,grade) values('sowndar','s')");
stmt.executeUpdate("insert into cse(name,grade) values('sowndar','b')");
	ResultSet rs=stmt.executeQuery("select * from cse");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	}catch (Exception e) {
		// TODO: handle exception
	}
}
}
