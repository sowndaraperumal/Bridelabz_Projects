package com.algorithmprogram;

public class Palindrome {
	/**
	 * 
	 * @param number 
	 */
	void pali(int number) {
		/*
		 * if in case number is in the range of 1 t0 9 
		 * that is always palindrome 
		 */
	if(number>=1 && number<=9) {
		System.out.println(number+"number is palindrome");
	}
	else {
		int value=0; //initialize the val
		int temp=number; //initialize the t and assign to num 
		
		/*
		 * this loop for t check t value is zero or not
		 * once it reach t is zero loop will be terminates
		 */
		while(temp!=0) {
		int remainder=temp%10;//initialize remainder of t store in rem
		
		if(temp/10==0) {
			value=value+remainder;
		}
		else {
			value=value+remainder;
		value=value*10;
		
		}temp=temp/10;
	}
		/*
		 * if val is equal to num
		 * is it palindrome
		 */
		if(value==number) {
			System.out.println("its palindrome"+value);
		}
	}
	}
}
