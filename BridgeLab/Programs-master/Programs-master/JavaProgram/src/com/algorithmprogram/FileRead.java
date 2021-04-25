package com.algorithmprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
public static String[] readFile() {
	
	try {
		BufferedReader bufferedreader= new BufferedReader(new FileReader("/home/bridgeit/Desktop/2d/test.txt"));
		//FileReader f=new FileReader("/home/bridgeit/Desktop/2d/test.txt");
		String string="";//initialize the string as empty
		//String a[]=new String[200];//initialize the array 
		/*
		 * reading all the line in the file
		 */

	
		try {
			while((string=bufferedreader.readLine())!=null) {

			 return string.split(" ");//spilt by space
			
	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}}	
	

