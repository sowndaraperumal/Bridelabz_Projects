package com.bridgelab.creationalpattern;

import java.util.Scanner;

public class FactoryDesign {
	static Scanner scanner=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("what you want");
	String name=scanner.next();
	ObjectFactory factory=new ObjectFactory();
	if(name.equals("badminton"))
	{System.out.println("bad");
	AbstractClassShop abstractClassShop=	factory.getObject(name);
	abstractClassShop.list();
	}
	else {
		System.out.println("ball");
		factory.getObject(name);
		AbstractClassShop abstractClassShop=	factory.getObject(name);
		abstractClassShop.list();
	}




}
}
