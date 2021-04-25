/**
 * 
 * Purpose :   find the prime number in between range 
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  22-10-2018
 *
 ********************************************************************/

package com.algorithmprogram;
/*
 *Here we using Scanner class properties 
 * 
 */
import java.util.Scanner;

import com.utility.Utility;

public class Prime {
	/*
	 * 
	 *find the prime number in between range 
	 */
public static void main(String[] args) {
int number=1000;// initialize the n value
	PrimeNumber prime=new PrimeNumber();
	prime.range(number);
	Utility.scanner.close();
}
}
