/**
 * 
 * Purpose : Generate N distinct Coupon number. Check whether its not repeated 
 * 
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  22-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
import com.utility.*;
import java.util.ArrayList;
/*
 * here using Random class for generating random number
 */
	import java.util.Random;
import java.util.Scanner;
	
	public class CouponNumber {
	/*
	 * In main function is used to create a N distinct coupon number
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

	
	
		int size;       //initialize the no of the coupon number 
	//	int lenofarr;  //initialize length of the coupon code

	
		System.out.println("enter the number of coupon number want");
		size=s.nextInt();
		
		
	//	System.out.println("enter the coupon lenth");
		//lenofarr=s.nextInt();

		Utility.CouponNumber(size);
		
		s.close();
	}
	}
