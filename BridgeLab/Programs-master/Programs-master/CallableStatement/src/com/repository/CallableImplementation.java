package com.repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.model.Student;

public class CallableImplementation implements CallableInterface{
	static Connection con;
	static  CallableStatement statement;
	static Scanner scanner=new Scanner(System.in);
	static ResultSet resultSet;
	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
	try {
		System.out.println("A");
		Class.forName("com.mysql.jdbc.Driver")	;
		
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		  statement=con.prepareCall("{call callInsert(?,?)}");
		 statement.setString(1, student.getName());
		 statement.setString(2, student.getGrade());
		 statement.execute();
	
		  resultSet=statement.getResultSet();
		 while(resultSet.next()) {
			 System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
		 //System.out.println(statement);
		 }
		 
		 
		
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
         e.printStackTrace();
		}
	}
	@Override
	public void deleteStudent() {
		try {
		 System.out.println("enter the want to delete");
		 
		Class.forName("com.mysql.jdbc.Driver")	;
		
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		 statement=con.prepareCall("{call calldelete(?)}");
		 statement.setInt(1,scanner.nextInt() );
		 System.out.println(statement);
		
		 statement.execute();
		  resultSet=statement.getResultSet();
		 while(resultSet.next()) {
			 System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
		 //System.out.println(statement);
		 }
		 
		 
	}catch (Exception e) {
		// TODO: handle exception
	}
		}

	@Override
	public void updateStudent() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver")	;
			System.out.println("enter the id to update");
			int id=scanner.nextInt();
			System.out.println("enter the new name");
			String name=scanner.next();
			System.out.println("enter the grade");
			String grade=scanner.next();
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			 
			 statement=con.prepareCall("{call callupdate(?,?,?)}");
			 statement.setInt(1,id );
			 statement.setString(2, name);
			 statement.setString(3, grade);
			 statement.execute();
			 
			 System.out.println(statement);
			  resultSet=statement.getResultSet();
			 
			 while(resultSet.next()) {
				 System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			 //System.out.println(statement);
			 }
			
			 
			 
			 
			 
			 
			 
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void readStudent() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver")	;
			
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			 statement=con.prepareCall("{call callPrint()}");
			 statement.execute();
 resultSet=statement.getResultSet();
			 
			 while(resultSet.next()) {
				 System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			 //System.out.println(statement);
			 }
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
