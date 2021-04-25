/**
 * 
 * Purpose : binary search and find the elapsed time between search
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  23-10-2018
 *
 ********************************************************************/
package com.algorithmprogram;
/*
 *Here we using Scanner class properties 
 * 
 */
import java.util.Scanner;

import com.utility.Utility;

public class binarySearch {
/*
 * main method for find the elapsed time between searching process
 */
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	
	//initialize  the array of string
	String str[]= {"aaaa","bbbb","cccc","dddd","eeee","ffff","gggg"};
	
	//initialize  the array of integer
	int ar[]= {1,2,3,4,5};
	//initialize the key value to search
	int key;
	for(int i=0;i<ar.length;i++)
	   System.out.println(ar[i]);
	System.out.println("enter the search elemnt ");
	//getting form the user
	key=s.nextInt();
	//initialize the start time in  long form default package in java 
	long st=System.nanoTime();//start time taken in  long form default package in java
	// call the search method over here
	Utility.searchint(ar,0,ar.length, key);
	//initialize the stop time 
	
	long ss=System.nanoTime();//stop time taken in  long form default package in java
	
	//initialize elapsed time in between of start time to stop time
	long ep=ss-st;
	
	System.out.println("lap time is"+ep);
	
	System.out.println();
	String str1;//initialize string and store search word in that string
	for(int i=0;i<str.length;i++)
		   System.out.println(str[i]);
	System.out.println("enter the search string ");
	str1=s.next();//getting form user 
	//initialize the start time in  long form default package in java 
	
	long st2=System.nanoTime();//start time taken in  long form default package in java
	// call the search method over here
	Utility.searchstr(str,str1,0,str.length);
	//initialize the stop time in  long form default package in java 

	long ss2=System.nanoTime();//stop time taken in  long form default package in java
	//initialize elapsed time in between of start time to stop time

	long ep1=ss2-st2;
	System.out.println("lap time is"+ep);
	s.close();
	
}
}
