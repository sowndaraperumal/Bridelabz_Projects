/**
 * 
 * Purpose : find the prime number in the range of 0-1000.
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  22-10-2018
 *
 ********************************************************************/
package com.algorithmprogram;
/*
 *Here we using Scanner class properties 
 * 
 */
import java.util.Scanner;

public class FindPrimeNumber {
	/*
	 * main method for number of prime number in the range 0-1000
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Palindrome p=new Palindrome();
		int n=1000;//initialize the range of0-1000
		int count=0;//initialize the count
		int l=0; //initialize l for length
		int ar[]=new int[168];//initialize array 
		for(int i=1;i<n;i++) {
			int h=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					h++;
				}
				
			}
			if(h==2) {
			count++;
		//	System.out.println(i);
			p.pali(i);
			ar[l]=i;
			l++;
		}
			}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0) {
				System.out.println(ar[i]);
			}
		}
	AnagramPrime.Anagramcheck(ar);
		//System.out.println(count);
		s.close();
	}

}
