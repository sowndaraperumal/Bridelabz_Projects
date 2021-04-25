package com.algorithmprogram;

/**
 * 
 * Purpose : conversion of fahrenheit to celisus
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  25-10-2018
 *
 ********************************************************************/
import java.util.Scanner;
/*
 * here using the scanner class properties
 */
public class Degree {
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	double celisus;//initialize the celisus 
	System.out.println("enter the celisus");
	celisus=s.nextDouble();//getting form user
	//call conversion method
	FindFahrenheit.fah(celisus);
	
	double 	fahrenheit;//initialize the fahrenheit
	
	System.out.println("enter the fahrenheit");
	fahrenheit=s.nextDouble();//getting form user
	//call conversion method
	FindCelius.cel(fahrenheit);
	
	s.close();

}
}
