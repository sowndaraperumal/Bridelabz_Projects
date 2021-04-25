package com.repository;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.model.Student;


public class StatementInterface implements StatementImplement{

	
	static ResultSet resultSet;
	static Connection con;
	static Scanner scanner=new Scanner(System.in);
	static Statement statement;
	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student.getGrade()+" "+student.getName());
	try {
		Class.forName("com.mysql.jdbc.Driver")	;
		
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		 statement=con.createStatement();
         statement.executeUpdate("insert into cse(name,grade) values('"+student.getName()+"','"+student.getGrade()+"')");
         resultSet=statement.executeQuery("select * from cse");
         
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
	public void deleteStudent() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver")	;

			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");

			 statement=con.createStatement();

			  resultSet=statement.executeQuery("select * from cse");
		         
				while(resultSet.next()) {
					System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
				}
				
System.out.println("enter the id which  element wants to delete");
int id=scanner.nextInt();
				System.out.println("delete from cse where id="+id);
			statement.executeUpdate("delete from cse where id="+id);
			
			  resultSet=statement.executeQuery("select * from cse");
		         
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
	public void updateStudent() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver")	;
			
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			 statement=con.createStatement();

			System.out.println("enter the id to update the specifed student");
			int id=scanner.nextInt();
			System.out.println("enter the name to update");
			String name=scanner.next();
			System.out.println("enter the gade to update");
			String grade=scanner.next();
			statement.executeUpdate("update cse set name='"+name+"',grade='"+grade+"' where id="+id);

			  resultSet=statement.executeQuery("select * from cse");
		         
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
			 statement=con.createStatement();

			
			
			 resultSet=statement.executeQuery("select * from cse");
	         
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
