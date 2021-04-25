/**
 * 
 * Purpose : Find out whether its leap year or not  
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
import com.utility.*;
public class Leapyear {
	/*
	 * find whether its leap or not
	 */
public static void main(String[] args) {
	int year; //initialise year
	
	System.out.println("enter the year");
	
	year=Utility.scanner.nextInt();//getting form user
	
	//call the utility method to find the leap year or not
	Utility.findLeapYear(year);
	Utility.scanner.close();
}
} 