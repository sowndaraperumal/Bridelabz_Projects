
package com.algorithmprogram;

public class AnagramPrime {
/**
 * 
 * @param number contains integer in the from of array
 */
public static void Anagramcheck(int[] number) {
	/*
	 *this iteration for passing a integer one by one   
	 */
	for(int i=0;i<number.length-1;i++) 
	{ 
		// initialize string and assign on it integer
	    String word1=String.valueOf(number[i]); 
	    
		for(int j=i+1;j<number.length;j++) 
		{
			// initialize string and assign on it integer
			String word2=String.valueOf(number[j]);
			//System.out.println(a[j]);
		boolean b=	AnagramPrimeCheck.anaPri(word1, word2);
		
		if(b==true) 
		{
			System.out.println(word1+"and "+word2+"its is anagram");
			
		}
			
		}
	}
	
		
	
}
}
