package com.functionalprogram;

import java.util.Scanner;
import com.utility.*;
public class ReplaceString {


 
	/*
	 * main function is used to replace string 
	 *mentioned place 
	 * 
	 */
		public static void main(String[] args) {
		/**
		 * str is string variable to store the string value
		 */
		String words="hello aaa , How are  you !!";

		System.out.println(words);

		System.out.println("enter the user name");

      //initialize the new string to replace the old string
		String replaceString=Utility.scanner.nextLine();
		/*
		 * if -condition checks entered string range more than 3
		 */
//		boolean b=false;
        Utility.replaceString(replaceString,words);
	
  /*      while(!(str.length()>=3))
		{
		System.out.println("enter the string more or equal to 3");
		 str=s.nextLine();
		}
		 if(str.length()>=3)
{
			 String replacestring=words.replace("aaa", str);
			 System.out.println(replacestring);
		
		}
			else
				System.out.println(" enter invalid charater length");

		 
		
		 // else statement help to print invalid range
		 
	*/	
		
		
        Utility.scanner.close();
	}
	


}