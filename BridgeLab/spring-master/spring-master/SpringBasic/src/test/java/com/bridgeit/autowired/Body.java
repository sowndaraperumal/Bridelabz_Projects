package com.bridgeit.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
public static void main(String[] args) {
	/*Human human=new Human();
	human.setHeart(new Heart());
	human.pumping();*/

	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	System.out.println("loaded");
Human human=context.getBean("human",Human.class);
	human.pumping();
	
}  
}
