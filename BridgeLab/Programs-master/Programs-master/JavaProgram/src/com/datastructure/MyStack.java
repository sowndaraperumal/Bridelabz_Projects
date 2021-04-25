package com.datastructure;

public class MyStack {
	
	int size=-1; 
	int s=-1;
	int cap=10;
	int arr[]=new int[158];
	char st[]=new char[cap];
	/**
	 * push into stack
	 * @param ch
	 */
public void push(char ch)

{  
	
st[++size]=ch;

//System.out.println(ch);
}
/**
 * push into the stack
 * @param n integer
 */
public void push(int n) {
	arr[++s]=n;
	
}
/*
 * pop out the element into stack
 */
public char pop() {
	if(size==-1) {
		System.out.println("overflow");
	}
//	System.out.println("sk");
	return st[size--];
}
/*
 * pop out the element into stack
 */
public int popint() {
	if(s>=0)
     	return arr[s--];
return 0;
}
/*
 * to see the top element in the stack
 */
public char peek() {
	
	if(size<0) {
		
		
		return 'z';
		
	}
	return st[size];
}
/*
 * print the element in the reverse order
 */
public void reverse() {
//	System.out.println("heloo");
	//System.out.println(s);
	for(int i=0;i<=s;i++) {
		//System.out.println("hello");
	System.out.println(arr[i]);
	
	}
}
boolean isempty() {
	if(size==-1) {
		return true;
	}else
	{
		return false;
	}
	
			
}
/*
 * display the element in the satck
 */

public void display() {

	for(int i=0;i<st.length;i++) {
		if(st[i]!=0) {
			//System.out.println(st[i]);
		}
		
	}
}
}
