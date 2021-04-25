/**
 * 
 * Purpose : Program for Gambler 
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
import java.util.Scanner;
import com.utility.*;
/*
 * Here using Scanner class properties 
 */
public class Gambler {
	/**
	 * In this Gambler program
	 * return 
	 * @Percentage of win
	 * @Percentage of loss
	 * 
	 */
public static void main(String[] args) {

	double ntime;     //initialize the number time can play one day
	
	
	System.out.println("enter the no of time to play one day");
	ntime=Utility.scanner.nextInt(); //getting form user
	Utility.Gambler(ntime);
	
Utility.scanner.close();
}
}
