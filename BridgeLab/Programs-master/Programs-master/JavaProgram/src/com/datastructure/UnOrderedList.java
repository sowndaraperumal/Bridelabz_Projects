/**
 * 
 * Purpose :     
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  30-10-2018
 *
 ********************************************************************/


package com.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class UnOrderedList {
	   
	
   public static void main(String[] args) throws Exception {
	   Scanner s=new Scanner(System.in);
   BufferedReader br=new BufferedReader(new FileReader("/home/bridgeit/Desktop/2d/unordered.txt"));
   String st="";
   OwnUorderedList own=new OwnUorderedList();
 //  Scanner s=new Scanner(System.in);
   String str;
   while((st=br.readLine())!=null) {
	  
	   String words[]=st.split(" ");
	   for(int i=0;i<words.length;i++) {
		   own.add(words[i]);
	   }
   }boolean b=false;
   String choice="yes";
   while(b==false) {
   System.out.println(own);
   System.out.println("enter the element to be search");
   
     own.search(s.next());
     System.out.println(own);

     if(choice.equalsIgnoreCase("yes")) {
    	 System.out.println("do you want to continue ");
    	 choice=s.next();
     }else {
    	 break;
     }}   System.out.println(own);

    /*System.out.println(own);
    System.out.println("enter the element to be search");
 
    own.search(s.next());
    System.out.println(own);
   
    System.out.println("enter the element to be search");

    own.search(s.next());   System.out.println(own);*/
    }

}



