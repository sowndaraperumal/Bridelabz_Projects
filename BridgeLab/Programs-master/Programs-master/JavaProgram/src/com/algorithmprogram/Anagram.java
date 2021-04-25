/**
 * 
 * Purpose : The   Two   Strings   are   Anagram   or   not...
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
import com.utility.*;

public class Anagram {
	/*
	 * Detecting two string are anagram
	 */
public static void main(String[] args) {
	//checkAnagram c=new checkAnagram();
	String string1; //initialize the first string 
	String string2; //initialize the second string
	System.out.println("enter first word");
	string1=Utility.scanner.next(); //getting input form user
	System.out.println("enter second word");
	string2=Utility.scanner.next();//getting the second form user
	
	
	boolean b=Utility.checkAnagram(string1, string2);
/*
 * if boolean b is true it is anagram
 */
	if(b==true) {
	System.out.println("its is anagram");
	
}else {
	System.out.println("its not an anagram");
}
	Utility.scanner.close();
}
}
