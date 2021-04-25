/**
 * 
 * Purpose : bubble sort and find the elapsed time between search
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
//import java.util.Scanner;
import com.utility.*;

public class BubbleSort {
	/*
	 * main method for find the elapsed time between soring process
	 */
	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//initialize  the array of integer
	    int number[]= {5,9,4,7,3,8,1,6};
	  //initialize the start time in  long form default package in java 
		double starttime=System.nanoTime();//start time taken in  long form default package in java

	//	Bubble bb=new Bubble();
		// call the sort method over here

		Utility.bubbleSortInteger(number);
		//initialize the stop time 
		
		/*
		 * this iteration for display the sorted array
		 */
		System.out.println("sorted intege ");
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}


		double stoptime=System.nanoTime();//stop time taken in  long form default package in java
		//initialize elapsed time in between of start time to stop time

		double elapsetime=stoptime-starttime;
	  System.out.println(stoptime+"   "+starttime+"lap time is"+elapsetime/10000);
	  System.out.println(); 
	  
	  //initialize the start time in  long form default package in java 

		double starttime1=System.nanoTime();//start time taken in  long form default package in java

		//initialize  the array of string

		String string[]= {"bbbb","ffff","aaaa","qqqq","ssss","gggg","llll","wwww"};
		
		// call the sort method over here

		Utility.bubbleSortString(string);
		/*
		 * this iteration for display the sorted array
		 */
		System.out.println("sorted string");
		for(int i=0;i<string.length;i++) {
			System.out.println(string[i]);
		}
		double stoptime1=System.nanoTime();//stop time taken in  long form default package in java
		//initialize elapsed time in between of start time to stop time
		double elapsetime1=stoptime1-starttime1;
		System.out.println("lap time is"+elapsetime/10000);
		
Utility.scanner.close();
	}

}
