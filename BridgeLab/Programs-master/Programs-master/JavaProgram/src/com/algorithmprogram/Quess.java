/**
 * 
 * Purpose : Guess the number   
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  25-10-2018
 *
 ********************************************************************/
package com.algorithmprogram;

import com.utility.*;

public class Quess {
	
	/*
	 * find the guess number 
	 */
public static void main(String[] args) {
	int number;// initialize the number
	boolean b=true;
	System.out.println("enter the to range \n number must be in power of 2");
	int aa=0;
	do{
		number=Utility.scanner.nextInt();
		b=Utility.checkPowerOfTwo(number);
		aa=number;
		if(b==true)
		   System.out.println("plz enter the number power of 2");

	}while(b!=false) ;
	int number1[]=new int[aa];
	if(b==false) {
		/*
		 * assign the element in the array 
		 */
		for(int i=0;i<number1.length;i++) {
	  	number1[i]=i;
	}
//	    System.out.println("enter to num");
	//    int n=s.nextInt();
	    //call the method to find the guessed number
	 //   inSearch.search(a, 0, a.length, n);
	   Utility.findSearchElement(number1);
    }
Utility.scanner.close();
}
}
