/**
 * 
 * Purpose : find the Newton Square
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  28-10-2018
 *
 ********************************************************************/

package com.algorithmprogram;

import java.util.Scanner;

public class NewtonSquare {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	double t=s.nextDouble();
	double epsilon=1e-15;
	while(t<0)
	{
		System.out.println("enter the valid  number ");
	   t=s.nextDouble();
}
	double c=t;
	while(Math.abs(c-t/c)>epsilon*c) {
		c=((t/c)+c)/2.0;
	}
System.out.println(c);
}
}
