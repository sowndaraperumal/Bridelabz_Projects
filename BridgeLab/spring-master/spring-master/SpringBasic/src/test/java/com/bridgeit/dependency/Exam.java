package com.bridgeit.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.dependencyinjection.Student;

public class Exam {
public static void main(String[] args) {
/*	Student student=new Student();
	student.studentName="sowndar";
	System.out.println("student name   "+student.studentName);
	student.setStudentName("sowndar");
	student.displayInfo();
*/
	
 
	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");

	//set with setter 
	Student student1=context.getBean("student3",Student.class);
	
   student1.displayInfo();
	
   
	//set with constuctor
  /* Student student2=context.getBean("student2",Student.class);
   student2.displayInfo();*/
   
	




}
}
