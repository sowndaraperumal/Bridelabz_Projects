package com.bridgelabz.sturcturalpattern;

import java.util.Scanner;

public class AdapterPattern {
	static 	PerfectInterface interface1,interface2;
	static Scanner scanner=new  Scanner(System.in);

public static void main(String[] args) {
	System.out.println("enter the 10 th mark");
	interface1=new MarkClassImple();
	testClassT();
	
	System.out.println("enter the 12 th mark");
	interface1=new MarkClassImple();

	testClassTw();
	System.out.println("enter the degree score");
	interface1=new MarkClassImple();

	testClassD();
	System.out.println("enter the 10 th mark");
	interface2=new MarkObjectImple();
	testObjectT();
	
	System.out.println("enter the 12 th mark");
	interface2=new MarkObjectImple();
	testObjectTw();
	System.out.println("enter the degree score");
	interface2=new MarkObjectImple();
	testObjectD();
}
static public void testClassT() {
	
	
	Student s10=interface1.tenMark();
	
	System.out.println("10 perfet is"+s10.getMarks());

	
}

static public void testClassTw() {


	Student s12=interface1.tweleveMark();
	System.out.println(("12th perfect"+s12.getMarks()));
}


static public void testClassD() {


	
	Student sd=interface1.degreeMark();
	
	
	
	System.out.println("degree perfect"+sd.getMarks());


}



static public void testObjectT() {

	
	Student s10=interface2.tenMark();
	System.out.println("10th perfectage is "+s10.getMarks());

}

static public void testObjectTw() {

	Student s12=interface2.tweleveMark();
	System.out.println(("12th perfect"+s12.getMarks()));
}


static public void testObjectD() {


	Student sd=interface2.degreeMark();
	
	
	
	System.out.println("degree perfect"+sd.getMarks());


}
}
