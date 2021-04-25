package com.bridgeit.dependencyobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.dependencyinjectionobject.AnotherStudent;
import com.bridgeit.dependencyinjectionobject.Student;

public class Exam {

	public static void main(String[] args) {
	/*Student student=new Student();
	student.cheat();
	*/
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("context loaded..");
		Student student1=context.getBean("student1",Student.class);
		System.out.println("   student1");
		student1.cheat();
		Student student2=context.getBean("student2",Student.class);
		System.out.println("    student2");
		student2.cheat();
		AnotherStudent anotherStudent=context.getBean("anothertudent",AnotherStudent.class);
	System.out.println("     student 3");
		anotherStudent.cheat();
		
		
	}
}
