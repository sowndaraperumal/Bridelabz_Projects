/**
 * 
 * Purpose : Calendar Program    
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  27-10-2018
 *
 ********************************************************************/

package com.datastructure;
/*
 * here using scanner class properties
 */
import java.util.Scanner;



public class Calendar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String day;
		System.out.println("enter the year");
		int year=s.nextInt();
		System.out.println("enter the month");
		String month=s.next();
	//call the find day method	
		Day.findday(year,month);
	}

}
