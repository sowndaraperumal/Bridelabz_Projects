package com.bridgeit.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.springinversionofcontroller.Sim;

public class Mobile {
public static void main(String[] args) {
	/*Airtel airtel=new Airtel();
	airtel.calling();
	airtel.data();*/
	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	System.out.println("context is loading...");
	Sim sim=context.getBean("sim",Sim.class);
	sim.data();
	sim.calling();
	
}
}
