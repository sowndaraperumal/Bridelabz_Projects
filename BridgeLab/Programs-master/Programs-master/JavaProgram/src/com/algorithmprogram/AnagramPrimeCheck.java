 
package com.algorithmprogram;

public class AnagramPrimeCheck {
	/**
	 * \
	 * @param s1 of string
	 * @param s2 of String
	 * @return the from of true or false
 	 */
	
public static boolean anaPri(String s1,String s2) {
	int count1[]=new int[10];  //initialize the array  
	int count2[]=new int[10];  //initialize the array
	
	char ch1[]=s1.toCharArray(); //initialize the array and tochararray for spilt the character by character
	char ch2[]=s2.toCharArray();//initialize the array and tochararray for spilt the character by character
	/*
	 * check the length of string of one and two
	 * if it is not match 
	 * then it is not anagram
	 */
	
	if(s1.length()==s2.length()) {
	/*
	 * this iteration for store the ascii vale of each character in count array
	 */
	
	
	for(int i=0;i<s1.length();i++) {
		/*
		 *  if condition allow only numberic character
		 */

		if(ch1[i]>='0'&&ch1[i]<='9') {
			count1[ch1[i]-48]++;
		}  	
		
	} 	
/*
 * 	this iteration for store the ascii vale of each character in count array
 */
	for(int i=0;i<s2.length();i++) {
		/*
		 *  if condition allow only numberic character
		 */

		if(ch2[i]>='0'&&ch2[i]<='9') {
			count2[ch2[i]-48]++;
		}  	
		
	}
	/*
	 *this iteration for check count1 array and count2 array value same or not 
	 */
	for(int i=0;i<count1.length;i++) {
		/*
		 * condition for both array value same vale or not
		 */
		if(count1[i]!=count2[i]) {
			/*
			 * this both  iteration for restore all the value of array is zero 
			 * it help next iteration
			 */
			for(int l=0;l<count1.length;l++) {
				count1[l]=0;
			}for(int k=0;k<count2.length;k++) {
				count2[k]=0;
			}
			return false;
		}
	}
	/*
	 * this both  iteration for restore all the value of array is zero 
	 * it help next iteration
	 */
	for(int l=0;l<count1.length;l++) {
		count1[l]=0;
	}for(int k=0;k<count2.length;k++) {
		count2[k]=0;
	}
	
	return true;
	}
	
	return false;

}}
