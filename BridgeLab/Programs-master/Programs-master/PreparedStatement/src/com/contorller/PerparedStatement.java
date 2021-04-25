package com.contorller;

import java.util.Scanner;

import com.model.Student;
import com.respository.PerparedStatementInterface;
import com.respository.PerparedImplementation;
import com.services.ServiceImple;
import com.services.ServiceInter;


public class PerparedStatement {
	static Scanner scanner=new Scanner(System.in);
public static void main(String[] args) {

	int choice;
	
	do {
		System.out.println("1.insert student\n2.delete\n3.update\n4.read\n.5.quit");
		System.out.println("enter the choice");
		choice=scanner.nextInt();
		PerparedStatementInterface respository =new PerparedImplementation();

		switch(choice) {
		case 1:
			Student student=new Student();
			System.out.println("enter the name");
			student.setName(scanner.next());
			System.out.println("enter the grade");
			student.setGrade(scanner.next());
			ServiceInter inter=new ServiceImple();
			inter.serviceInterface(student);
			break;
		case 2:
			respository.deleteStudent();
			break;
		case 3:
			respository.updateStudent();
		    break;
		case 4:
			respository.readStudent();
			break;
		}
		
	}while(choice<5);
	

}
}
