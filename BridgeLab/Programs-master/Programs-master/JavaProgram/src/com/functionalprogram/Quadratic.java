/**
 * 
 * Purpose : find prime factor given quadratic equation
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
/*
 * Here using Scanner class properties
 */
import java.util.Scanner;

import com.utility.Utility;

public class Quadratic {
public static void main(String[] args) {
	double a; //initialize a value
	double b; //initialize b value
	double c; //initialize c value
	
	System.out.println("enter a,b and c values");
	a=Utility.scanner.nextDouble();//getting input form user
	b=Utility.scanner.nextDouble();//getting input form user
	c=Utility.scanner.nextDouble();//getting input form user
	Utility.quadraticLogic(a, b, c);
Utility.scanner.close();
}
}
