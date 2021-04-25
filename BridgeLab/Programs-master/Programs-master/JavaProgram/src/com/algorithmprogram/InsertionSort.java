/**
 * 
 * Purpose : find the elapsed time between insertion sort
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
import com.utility.*;
/*
 * main method for find the elapsed time between sorting process
 */
public class InsertionSort {
public static void main(String[] args) {
	//initialize  the array of integer

	int number[]= {5,9,4,7,3,8,1,6};
	//initialize  the array of string

	String string[]= {"bbbb","ffff","aaaa","qqqq","ssss","gggg","llll","wwww"};
	//initialize the start time in  long form default package in java 

	double starttime=System.nanoTime();//start time taken in  long form default package in java
	// call the sort method over here

	Utility.sortInt(number);
	/*
	 * display the method
	 */
	int size = number.length; 
	System.out.println("After sort");
	for (int i=0; i<size; ++i) 
	           System.out.print(number[i] + " ");
	
	//initialize the stop time 
	double stoptime=System.nanoTime();//stop time taken in  long form default package in java
	//initialize elapsed time in between of start time to stop time

	double elapesTime=stoptime-starttime;
	System.out.println(stoptime/1000+"   "+starttime/1000+"lap time is"+elapesTime);
	System.out.println(); 
	
	//initialize the start time in  long form default package in java 

	double starttime1=System.nanoTime();//start time taken in  long form default package in java

	// call the sort method over here

	Utility.sortString(string);
	int length = number.length; 
	/*
	 * display the method
	 */
	System.out.println("after sort");
	for (int i=0; i<length; ++i) 
	           System.out.print(string[i] + " ");
	System.out.println();
	//initialize the stop time in  long form default package in java 

	double stoptime1=System.nanoTime();//stop time taken in  long form default package in java
	//initialize elapsed time in between of start time to stop time

	double elapsetime1 =stoptime1-starttime1;
	System.out.println("lap time is"+elapsetime1);
Utility.scanner.close();
	        }
}
