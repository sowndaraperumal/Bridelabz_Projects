/**
 * 
 * Purpose :  Find out the percentage of coin flip
 * both head and tail
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
/*
 * here using Scanner class properties for reading input 
 * and random class is used to generate the random values  
 */
import java.util.Random;
import java.util.Scanner;

import com.utility.Utility;

public class FlipCoin {
	
public static void main(String[] args) {
	/**
	 * In the main function is used to percentage of the coin flip 
	 * both head and tail
	 * 
	 */
	/**
	 * times variable for number of time to flip
	 *head variable to initialize the head side value
	 *tail variable to initialize the tail side value
	 *
	 */
	int times;
	System.out.println("enter the no of time ");
	times=Utility.scanner.nextInt();
	Utility.coin(times);
	
/*	double head=0;
	double tail=0;
while(!(times>0)) {
	System.out.println("enter the no of time ");
	times=s.nextInt();
}/**
	 * for loop is used to iteration purpose
	 
	
	for(int i=0;i<times;i++) {
		/**
		 *
		 * if condition for check math val is greater than or not
		 
		
		if(Math.random()<0.5) //math.random is used for generate 0 to 0.9 value
			head++;
		else {
			tail++;
		}
	}
	System.out.println(head);
	System.out.println(tail);
	double pt;   // initialize the percentage of tail
	double ph;   //initialize the percentage of head
	pt=(tail/times)*100;
	ph=(head/times)*100;
	//print the result of percentage
	System.out.println("perfectage of tail "+pt);
	System.out.println("perfectage of head "+ph);
	*/
	
	Utility.scanner.close();
}
}
