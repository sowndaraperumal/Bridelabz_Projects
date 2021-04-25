/**
 * 
 * Purpose : Find out whether its leap year or not  
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  20 -10-2018
 *
 ********************************************0************************/
package com.functionalprogram;
/*\
 * Here using Scanner properties
 */

import com.utility.Utility;

public class Permutation {
public static void main(String[] args) {
	System.out.println("enter the string");
	String word=Utility.scanner.next(); //permutation string
	//call permutation method

	Utility.permutationOfString(word.toCharArray(),0);//spilt the character by character by using tochararray method
Utility.scanner.close();
}
}
