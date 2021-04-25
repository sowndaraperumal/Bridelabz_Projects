package com.datastructure;

public class AnagramQueue {
	/**
	 * 
	 * @param m passing prime 1 
	 * @param n passing prime 2
	 * @return boolean type
	 */
static boolean check(int m,int n) {
	boolean b;
	
	String s1=Integer.toString(m);//convert the int to string
	String s2=Integer.toString(n);//convert the int to string
	//call the anagram function
	b=AnaaPrime.anaPri(s1,s2);
	if(b==true) {
		
		return true;
	}else {
		return false;
	}
}
}
