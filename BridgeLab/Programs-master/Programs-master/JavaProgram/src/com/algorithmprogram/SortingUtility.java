package com.algorithmprogram;

import java.util.Scanner;
import com.utility.*;
public class SortingUtility {

	public static void main(String[] args) {
		double aaint[]=new double[3];
		double aastr[]=new double[3];
		int ai=0;
		int as=0;
		Scanner s=new Scanner(System.in);
	//initialize  the array of integer
    int arbu[]= {5,9,4,7,3,8,1,6};
  //initialize the start time in  long form default package in java 
   double stbu=System.nanoTime();//start time taken in  long form default package in java

	//Bubble bb=new Bubble();
	// call the sort method over here

           Utility.bubbleSortInteger(arbu);
	//initialize the stop time 
	
	/*
	 * this iteration for display the sorted array
	 */
           System.out.println("after soerting ");
	for(int i=0;i<arbu.length;i++) {
		System.out.print(arbu[i]);
	}


	double ssbu=System.nanoTime();//stop time taken in  long form default package in java
	//initialize elapsed time in between of start time to stop time

	double ep=ssbu-stbu;
	aaint[ai]=ep/1000000;
	ai++;
	
  System.out.println(ssbu+"   "+stbu+"lap time is"+ep/1000000);
  System.out.println(); 
  
  //initialize the start time in  long form default package in java 

 	double stb=System.nanoTime();//start time taken in  long form default package in java

	//initialize  the array of string

	String stbuu[]= {"bbbb","ffff","aaaa","qqqq","ssss","gggg","llll","wwww"};
	
	// call the sort method over here

	Utility.bubbleSortString(stbuu);
	/*
	 * this iteration for display the sorted array
	 */
    System.out.println("after soerting ");

	for(int i=0;i<stbuu.length;i++) {
		System.out.print(stbuu[i]+" ");
	}
	double ssb=System.nanoTime();//stop time taken in  long form default package in java
	//initialize elapsed time in between of start time to stop time
	double ep1=ssb-stb;
	aastr[as]=ep1/1000000;
	as++;
	System.out.println("lap time is"+ep/1000000);
System.out.println();
	
	
	//initialize  the array of integer

	int arrin[]= {5,9,4,7,3,8,1,6};
	//initialize  the array of string

	String stin[]= {"bbbb","ffff","aaaa","qqqq","ssss","gggg","llll","wwww"};
	//Sortt ss=new Sortt();
	//initialize the start time in  long form default package in java 

	double starttime=System.nanoTime();//start time taken in  long form default package in java
	// call the sort method over here

	Utility.sortInt(arrin);
	
	/*
	 * display the method
	 */
	int n = arrin.length; 
    System.out.println("after soerting ");

	for (int i=0; i<n; ++i) 
	           System.out.print(arrin[i] + " ");
	
	//initialize the stop time 
	double stoptime=System.nanoTime();//stop time taken in  long form default package in java
	//initialize elapsed time in between of start time to stop time

	double epin=stoptime-starttime;
	aaint[ai]=epin/1000000;
	ai++;
	System.out.println(stoptime+"   "+starttime+"lap time is"+epin/1000000);
	System.out.println(); 
	
	//initialize the start time in  long form default package in java 

	double sti=System.nanoTime();//start time taken in  long form default package in java

	// call the sort method over here

	Utility.sortString(stin);
	int a = arrin.length; 
	/*
	 * display the method
	 */
    System.out.println("after sorting ");

	for (int i=0; i<a; ++i) 
	           System.out.print(stin[i] + " ");
	System.out.println();
	//initialize the stop time in  long form default package in java 

	double ssin=System.nanoTime();//stop time taken in  long form default package in java
	//initialize elapsed time in between of start time to stop time

	double epi=ssin-sti;

	aastr[as]=epi/1000000;
	as++;
	
	System.out.println("lap time is"+epi/1000000);
System.out.println("binary search");

	//inSearch ii=new inSearch();
	
	//initialize  the array of string
	String str[]= {"aaaa","bbbb","cccc","dddd","eeee","ffff","gggg"};
	//initialize  the array of integer
	int ar[]= {1,2,3,4,5};
	//initialize the key value to search
	int key;
	for(int i=0;i<ar.length;i++)
	   System.out.print(ar[i]+" ");
	System.out.println("enter the search elemnt ");
	//getting form the user
	key=s.nextInt();
	//initialize the start time in  long form default package in java 
	double st=System.nanoTime();//start time taken in  long form default package in java
	// call the search method over here
	Utility.searchint(ar,0,ar.length, key);
	//initialize the stop time 
	
	double sss=System.nanoTime();//stop time taken in  long form default package in java
	
	//initialize elapsed time in between of start time to stop time
	double elap=sss-st;
	
	System.out.println("lap time is"+elap/1000000);
	aaint[ai]=elap/1000000;
	
	System.out.println();
	String str1;//initialize string and store search word in that string
	for(int i=0;i<str.length;i++)
		   System.out.println(str[i]);
	System.out.println("enter the search string ");
	str1=s.next();//getting form user 
	//initialize the start time in  long form default package in java 
	
	double st2=System.nanoTime();//start time taken in  long form default package in java
	// call the search method over here
	Utility.searchstr(str,str1,0,str.length);
	//initialize the stop time in  long form default package in java 

	double ss2=System.nanoTime();//stop time taken in  long form default package in java
	//initialize elapsed time in between of start time to stop time

	double epbb=ss2-st2;
	aastr[as]=epbb/1000000;
	System.out.println("lap time is"+elap/1000000);
	System.out.println();
	
	System.out.println("this is for integer");
	for(int i=0;i<aaint.length;i++) {
		System.out.print(aaint[i]+" ");
	}
	Utility.sortTime(aaint);
	System.out.println();
	System.out.println("after arranging ");
	for(int i=aaint.length-1;i>=0;i--) {
		System.out.print(aaint[i]+" ");
	}
	System.out.println();
	System.out.println("this is for string");
	for(int i=0;i<aastr.length;i++) {
		System.out.print(aastr[i]+" ");
	}
	Utility.sortTime(aastr);
//	System.out.pintln();
	System.out.println("after arranging ");

	for(int i=aastr.length-1;i>=0;i--) {
		System.out.print(aastr[i]+" ");
	}
	
}
}