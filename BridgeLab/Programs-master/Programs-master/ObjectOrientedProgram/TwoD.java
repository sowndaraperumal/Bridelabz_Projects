/**
 * 
 * Purpose :Print function to print 2 Dimensional Array. In Java use PrintWriter  with 
 * OutputStreamWriter  to print the output to the screen.
 * @author sowndara perumal
 * @version 1.2
 * @Since  22-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
/*
 *Here we using Scanner class properties 
 * also Buffered writer for write on file
 * File writer for write a exact file 
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class TwoD {
	/*
	 * Print function to print 2 Dimensional Array. In Java use PrintWriter  with 
     * OutputStreamWriter  to print the output to the screen.
	 */
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	 
	
	int row; //initialize the row
	  
	int column;//initialize the column
	System.out.println("enter thr row and column");
	row=s.nextInt(); //getting input form user
	column=s.nextInt();//getting input form user
	Utility.TwoDarray(row, column);
	
	
	s.close();
}
}
