/**
 * 
 * Purpose : Calculate the distance between two point by Euclidean formulae 
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
/*
 * here using Scanner class properties 
 */
import java.util.Scanner;
import com.utility.*;
public class Distance {
	/**
	 * 
	 * @Distance between teo point
	 */
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x;    //initialize the first point 
	int y;    // initialize the second point
	System.out.println("enter the x and y value");
	x=s.nextInt(); //getting input
	y=s.nextInt(); //getting input
	Utility.distance(x, y);
	s.close();
}
}
