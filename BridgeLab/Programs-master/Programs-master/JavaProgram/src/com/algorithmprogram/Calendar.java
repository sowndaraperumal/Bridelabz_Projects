/**
 * 
 * Purpose : Find the day of the week 
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  24-10-2018
 *
 ********************************************************************/
package com.algorithmprogram;
/*
 *Here we using Scanner class properties 
 * 
 */
import java.util.Scanner;

public class Calendar {
	/*
	 * find the day of the week
	 */
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int year;//initialize the year
	System.out.println("enter the year ");
	year=s.nextInt();//input getting form the user
	
	String month;//initialize the month
	System.out.println("enter the month");
	month=s.next();//input getting form the user
	
	
	
	int date;//initialize the date
	System.out.println("enter the date");
	date=s.nextInt();//input getting form the user
	//call the method to find day of the week
	Day.findday(year,month,date);
	s.close();
}
}
