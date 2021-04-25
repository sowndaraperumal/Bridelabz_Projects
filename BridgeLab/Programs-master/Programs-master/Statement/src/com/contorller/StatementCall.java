package com.contorller;

import java.sql.Statement;
import java.util.Scanner;

import com.model.Student;
import com.mysql.jdbc.ResultSet;
import com.repository.StatementInterface;
import com.repository.StatementImplement;
import com.services.ServiceImpl;
import com.services.ServiseInter;

public class StatementCall {
	
	
	static Scanner scanner=new Scanner(System.in);
public static void main(String[] args) {
	/*Student student=new Student();
	System.out.println("enter the name");
	student.setName(scanner.next());
	System.out.println("enter the grade");
	student.setGrade(scanner.next());*/
	int choice;
	
	do {
		System.out.println("1.insert student\n2.delete\n3.update\n4.read\n.5.quit");
		System.out.println("enter the choice");
		choice=scanner.nextInt();
		StatementImplement baseRespository=new StatementInterface();

		switch(choice) {
		case 1:
			Student student=new Student();
			System.out.println("enter the name");
			student.setName(scanner.next());
			System.out.println("enter the grade");
			student.setGrade(scanner.next());
			ServiseInter inter=new ServiceImpl();
			inter.serviceInterface(student);
			break;
		case 2:
			baseRespository.deleteStudent();
			break;
		case 3:
			baseRespository.updateStudent();
		    break;
		case 4:
			baseRespository.readStudent();
			break;
		}
		
	}while(choice<5);
	
}
}
