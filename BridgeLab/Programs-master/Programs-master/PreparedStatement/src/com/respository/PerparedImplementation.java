package com.respository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

import com.model.Student;

public  class PerparedImplementation implements PerparedStatementInterface{
	
	static ResultSet resultSet;
	static Connection con;
	static Scanner scanner=new Scanner(System.in);
	static PreparedStatement  statement;
	
	
	
	
	@Override
	public void createStudent(Student student) {

		//System.out.println(student.getGrade()+" "+student.getName());
		try {
			
			String name=student.getName();
			String grade=student.getGrade();
			System.out.println(student.getGrade()+" "+student.getName());
			
			
			Class.forName("com.mysql.jdbc.Driver")	;

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		//	System.out.println(con);
		statement=con.prepareStatement("insert into cse1(name,grade) values(?,?)");
//	System.out.println(statement);
		statement.setString(1,name);
	//	System.out.println(statement);
		statement.setString(2, grade);
	//	System.out.println(statement);
	//	System.out.println("hi"+statement);
		statement.executeUpdate();
		
		 resultSet=statement.executeQuery("select * from cse1");
         
			while(resultSet.next()) {
				System.out.println("hi"+resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		try {

		Class.forName("com.mysql.jdbc.Driver")	;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
	    System.out.println("enter the id");
	    int id=scanner.nextInt();
		statement=con.prepareStatement("delete from cse1 where id=?");
			statement.setInt(1, id);
			statement.executeUpdate();
			
			 resultSet=statement.executeQuery("select * from cse1");
	         
				while(resultSet.next()) {
					System.out.println("hi"+resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
				}
 		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void updateStudent() {
try {
		Class.forName("com.mysql.jdbc.Driver")	;
		
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");

		System.out.println("enter the id to update the specifed student");
		int id=scanner.nextInt();
		System.out.println("enter the name to update");
		String name=scanner.next();
		System.out.println("enter the gade to update");
		String grade=scanner.next();
		 statement=con.prepareStatement("update cse set name=?,grade=? where id=?");
statement.setString(1, name);
statement.setString(2, grade);
statement.setInt(3, id);
		statement.executeUpdate();
		  resultSet=statement.executeQuery("select * from cse1");
	         
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
			
			
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void readStudent() {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.jdbc.Driver")	;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
	
		 statement=con.prepareStatement("select * from cse1");

		
		 resultSet=statement.executeQuery();
         
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
			
			
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
