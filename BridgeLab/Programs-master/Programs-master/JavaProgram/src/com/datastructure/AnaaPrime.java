package com.datastructure;

public class AnaaPrime {
	/**
	 * 
	 * @param s1 passing String 
	 * @param s2 passing String 
	 * @return boolean type true or false
	 */
	public static boolean anaPri(String s1,String s2) {
		int count1[]=new int[10];//initialize the integer array
		int count2[]=new int[10];//initialize the integer array
		
		char ch1[]=s1.toCharArray();////initialize char array and store the string of character by character
		char ch2[]=s2.toCharArray();
		/*
		 * check length of the two string 
		 */
		if(s1.length()==s2.length()) {
		
		
		/*
		 * next two for loop used to storing the each and character in the array
		 * and check count1 and count2 array is same or not 
		 */
		for(int i=0;i<s1.length();i++) {

			if(ch1[i]>='0'&&ch1[i]<='9') {
				count1[ch1[i]-48]++;
			}  	
			
		} 	for(int i=0;i<s2.length();i++) {

			if(ch2[i]>='0'&&ch2[i]<='9') {
				count2[ch2[i]-48]++;
			}  	
			
		}for(int i=0;i<count1.length;i++) {
			if(count1[i]!=count2[i]) {
				for(int l=0;l<count1.length;l++) {
					count1[l]=0;
				}for(int k=0;k<count2.length;k++) {
					count2[k]=0;
				}
				return false;
			}
		}
		for(int l=0;l<count1.length;l++) {
			count1[l]=0;
		}for(int k=0;k<count2.length;k++) {
			count2[k]=0;
		}
		//System.out.println("its");
		return true;
		}
		
		return false;

	}
}
