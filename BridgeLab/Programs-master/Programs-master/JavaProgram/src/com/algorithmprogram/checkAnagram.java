package com.algorithmprogram;

public class checkAnagram {
    static public boolean check(String s1,String s2){
    	int count1[]=new int[26];//initialize the count1 array
    	int count2[]=new int[26];//initialize the count2 array
/*
 * checking length of the string 
 * if it is ok just entered into next line
 */
    	//if(s1.length()==s2.length()) {
   	      	  //initialize the char array of ch1 and using tochararray for spilt the character by character 
    		char ch1[]=s1.toCharArray();

    		//initialize the char array of ch2 and using tochararray for spilt the character by character 
    		char ch2[]=s2.toCharArray();
    		/*
    		 * this iterate the character by character and store the exact ascii key on the count1 array
    		 *  until string one length 
    		 */
    		
    		
    		for(int i=0;i<s1.length();i++) {
   
    		if(ch1[i]>='a'&&ch1[i]<='z') {
    			count1[ch1[i]-97]++;//here ch1[i] character is stored in the count1 belong with ascii number of that character
    	//	System.out.println(count1[i]);
    		}  	
    		
    	} 		/*
    		 * this iterate the character by character and store the exact ascii key on the count1 array
    		 *  until string one length 
    		 */
    		for(int i=0;i<s2.length();i++) {
   
    		if(ch2[i]>='a'&&ch2[i]<='z') {
    			count2[ch2[i]-97]++;
    	//		System.out.print(ch2[i]);
    			//System.out.println(count2[i]);
    			//here ch2[i] character is stored in the count2 belong with ascii number of that character
    		}  	
    		
    	}for(int i=0;i<count1.length;i++) {
    		/*
    		 * if it is not equal those word are not anagram
    		 */
    		if(count1[i]!=count2[i]) {
    			return false;
    		}
    	}
    	return true;
    	
    	
    }
}
