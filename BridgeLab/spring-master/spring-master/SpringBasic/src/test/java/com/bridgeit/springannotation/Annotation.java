package com.bridgeit.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("annotation.xml");
	System.out.println("xml file is loaded");
	College college=context.getBean("collegebean",College.class);
	System.out.println("object is ready"+college);
}
}
