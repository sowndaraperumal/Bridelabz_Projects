/**
 * 
 * Purpose : print the 2 power table
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
/*
 * Here using Scanner class properties
 */
import java.util.Scanner;
import com.utility.*;
public class Power {
	public static void main(String[] args) {

		int number;//initialize the number
	
		System.out.println("enter the number of time to power");
		number=Utility.scanner.nextInt();//getting input from user
		Utility.powerOfTwo(number);
	/*	int a=1;
		/*
		 * check entered if less or equal to 32
		 
		if(num<=32&&num>0) {
			
			while(num!=0) {
				a=a*2;
				num--;
				System.out.println("power of 2^"+c+" "+a);
				c++;
			}
			System.out.println(a);
			if(a%400==0||a%4==0&&a%100!=0) {
				System.out.println("its is leap year"+a);
			}else {
				System.out.println("its is not leap year"+a);
			}
			}
		
		else {
			System.out.println("Only works if 0 <= N < 31 since 2^31 overflows an int");
		}*/
	Utility.scanner.close();
	}

}
