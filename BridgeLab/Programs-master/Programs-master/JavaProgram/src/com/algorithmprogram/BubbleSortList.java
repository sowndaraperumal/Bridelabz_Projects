/**
 * 
 * Purpose : Read the list and sort the list according to bubble sort method and print the list
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  23-10-2018
 *
 ********************************************************************/
package com.algorithmprogram;

import java.util.ArrayList;
/*
 *Here we using Scanner class properties 
 * and create Arraylist for store the element in that list
 */
import java.util.Scanner;

import com.utility.Utility;

public class BubbleSortList {
	/*
	 * this main method for sort the element in the list
	 */

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> word=new ArrayList<String>();
		//Bubble b=new Bubble();

		int size; //initialize the size of the list
		System.out.println("enter the size");
		size=s.nextInt();//getting the input from the user
		String str="";//initialize the string
		/*
		 * iteration for add the element in the list
		 */
		System.out.println("enter the number to be sort");
		for(int i=0;i<size;i++) {
			str=s.next();
			word.add(str);//add element in list
		}
		String a[]=new String[size];//initialize the array of string 
		/*
		 * get the element integer the list that element are store into the array
		 */
		for(int i=0;i<a.length;i++)
		{
			a[i]=word.get(i);//copying
		}
		/*
		 * iteration for display
		 */
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}System.out.println();
		System.out.println("your sorted  list is ");
	 //call the method for sorting
		Utility.bubbleSortString(a);
		/*
		 * iteration for display
		 */
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		s.close();
		
}}
