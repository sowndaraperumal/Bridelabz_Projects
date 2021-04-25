/*
 * 
 * Purpose :Print function to print 2 Dimensional Array. In Java use PrintWriter  with 
 * OutputStreamWriter  to print the output to the screen.
 * @author sowndara perumal
 * @version 1.2
 * @Since  22-10-2018
 *
 ********************************************************************/
 

package com.functionalprogram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/*
 *Here we using Scanner class properties 
 * 
 */

public class TwoD {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int m,n;
	System.out.println("enter the row and column");
	m=s.nextInt();
	n=s.nextInt();
	int a[][]=new int[m][n];
	
	/*for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
	      System.out.print(a[i][j]);
		}System.out.println();
	}*/
	try {

		BufferedWriter bw=new BufferedWriter( new FileWriter("/home/bridgeit/Desktop/2d/2d.txt"));
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("enter the number");
				bw.write((a[i][j]=s.nextInt())+",");
				
			}bw.newLine();
		}
		bw.close();
		System.out.println("success");
		
	
	}catch (Exception e) {
		System.out.println("error");
	}
	
	
	
	
}
}
