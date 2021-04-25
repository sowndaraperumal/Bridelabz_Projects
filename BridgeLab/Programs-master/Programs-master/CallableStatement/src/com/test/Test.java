package com.test;

import java.awt.Window.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Test {
public static void main(String[] args) {
	try {
		System.out.println("f");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("s");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		System.out.println("a"+con);
		CallableStatement callableStatement=con.prepareCall("{?=call mul(?,?)}");
		System.out.println("s");
		callableStatement.registerOutParameter(1, Types.INTEGER);
		
		callableStatement.setInt(2, 10);
		callableStatement.setInt(3, 2);
		callableStatement.execute();
		System.out.println(callableStatement.getObject(1));

	
	}catch (Exception e) {
		// TODO: handle exception
	}
}
}
