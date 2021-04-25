package com.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LinkHash {
public static void main(String[] args) throws Exception {
	Scanner s=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new FileReader("/home/bridgeit/Desktop/2d/hash.txt"));
	 Hash h=new Hash();
	
	 int arr[];String st1;
	    while((st1=br.readLine())!=null) {
	    	String w1[]=st1.split(",");
	    	arr=new int[w1.length];
	    	
	    	for(int i=0;i<w1.length;i++) {
	    		arr[i]=Integer.parseInt(w1[i]);
	    		h.add(arr[i]);
	    	}
}
	    System.out.println(h);
}
}
