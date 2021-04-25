/**
 * 
 * Purpose : Program to find Harmonic series
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
/*
 * Here using scanner class properties
 */
import java.util.Scanner;
import com.utility.*;

public class Harmonic {

	public static void main(String[] args) {
		/**
		 * main function calculate harmonic series 
		 */
		int n;//initialize the n value
		System.out.println("enter the n time");
		n=Utility.scanner.nextInt();//getting form user
		Utility.harmonic(n);
		
		Utility.scanner.close();
	}

}
