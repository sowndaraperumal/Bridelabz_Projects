package com.algorithmprogram;

import java.util.Scanner;

public class Merge {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
/*	int a[]= {3,2,1};
	int n;
	System.out.println("enter the size of the array");
	n=s.nextInt();
	int aa[]=new int[n];
	System.out.println("enter the number in thye array");
	for(int i=0;i<n;i++)
	{
		aa[i]=s.nextInt();
	}System.out.println();
	System.out.println("sorted array is");
	MergeSort.sort(aa,0,aa.length-1);
//	System.out.println("dddd");
	for(int i=0;i<aa.length;i++) {
		System.out.println(aa[i]);
	}*/int n;
	System.out.println("enter the size of the array");
	n=s.nextInt();
	String word[]=new String[n];
	for(int i=0;i<n;i++)
	{
		word[i]=s.next();
	}
	//String k=s.next();
	MergeSort.sortstring(word,0,word.length-1);
	for(int i=0;i<word.length;i++) {
		System.out.println(word[i]);
	}
}
}
