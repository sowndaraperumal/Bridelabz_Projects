package com.algorithmprogram;
public class Padding {
	/**
	 * 
	 * @param num
	 */
public static void binary(int num) {
	
		
		int a=num;
		//to concantenate the values
		String n="";
		/*
		 * 
		 * using while loop
		 * iterate upto num!=0
		 * 
		 */
		while(num!=0)
		{
			int dec=num%2;
			n=dec+n;
			num=num/2;
		}
		//to print the binary value for decimal number
		System.out.println("the binary value of "+a+" is ("+n+")2");
		/*
		 * function call
		 * to print the nibble values for given binary 
		 * 
		 */
		for (int i = n.length(); i < 32; i++) {
			n="0"+n;
		}
		System.out.println(n);
}
}