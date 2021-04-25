/**
 * 
 * Purpose :find the day of the date     
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  28-10-2018
 *
 ********************************************************************/

package com.datastructure;
/*
 * here using scanner class properties
 */
import java.util.Scanner;

public class CalendarQueuemain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String day;
		System.out.println("enter the year");
		int year=s.nextInt();
		System.out.println("enter the month");
		String month=s.next();
//call find day method		
		CalQday.findday(year,month);
}
}