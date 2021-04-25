/**
 * 
 * Purpose : search element in the file   
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  25-10-2018
 *
 ********************************************************************/
package com.algorithmprogram;
/*
 * here using scanner class properties
 * filereader class for reading a file from location
 *Buffered reader for read the content of the line by line
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.utility.Utility;
import com.utility.*;
public class BinarySearchFile {

public static void main(String[] args) throws Exception {
	String stringarray[]=FileRead.readFile();
	System.out.println("sort list is");
sortstring(stringarray);
	}
	//call the sort method
	//Sortt.sortString(a);
	
	
	
	
	
	
	
	

public static void sortstring(String stringarray[]) {

	String tempoary;
	for(int i=0;i<stringarray.length;i++) {
		for(int j=i+1;j<stringarray.length;j++) {
			if(stringarray[i].compareTo(stringarray[j])>0) {
				tempoary=stringarray[i];
				stringarray[i]=stringarray[j];
				stringarray[j]=tempoary;
			}
		}
	
		
		
	}
	for(int i=0;i<stringarray.length;i++) {
		System.out.println(stringarray[i]);
	}
	String searchElement;//initialize the string
	System.out.println("enter the string to search");
	searchElement=Utility.scanner.nextLine();//getting form user
	//call the method to search

		Utility.searchstr(stringarray,searchElement,0,stringarray.length-1);

}


}
