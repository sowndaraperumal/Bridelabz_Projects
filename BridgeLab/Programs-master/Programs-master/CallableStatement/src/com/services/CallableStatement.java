package com.services;

import java.util.Scanner;

import com.controller.ServiceImple;
import com.model.Student;
import com.repository.CallableImplementation;
import com.repository.CallableInterface;


public class CallableStatement {

	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
int choice;
	
	do {
		System.out.println("1.insert student\n2.delete\n3.update\n4.read\n.5.quit");
		System.out.println("enter the choice");
		choice=scanner.nextInt();
		CallableInterface baseRespository=new CallableImplementation();

		switch(choice) {
		case 1:
			Student student=new Student();
			System.out.println("enter the name");
			student.setName(scanner.next());
			System.out.println("enter the grade");
			student.setGrade(scanner.next());
			CallableServiceInterface inter=new ServiceImple();
			inter.insertStudent(student);
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
