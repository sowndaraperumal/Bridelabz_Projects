package com.datastructure;

import java.util.Scanner;

public class BalanceParathesis {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String exp;
	System.out.println("enter the expression");
	exp=s.nextLine();
	MyStack my=new MyStack();
//	int flag=0;
	BalanceQueue bb=new BalanceQueue(10);
	int flag=0;
	char ch[]=exp.toCharArray();
	for(int i=0;i<exp.length();i++) {
		if(ch[i]=='(' || ch[i] == '{' || ch[i]=='[') {
			//my.push(ch[i]);
			bb.push(ch[i]);
		}
	/*	else if(((char)bb.peek())!=null) {
			
		}*/
		else  if(((char)bb.peek()=='('&&ch[i]==')')||
    		 ((char)bb.peek()=='{'&&ch[i]=='}')
    		 ||((char)bb.peek()=='['&&ch[i]==']'))		{
    //	 System.out.println("so");
    	 //my.pop();
			bb.pop();
  //    System.out.println(my.pop()); 	 
     }
		else if((char)bb.peek()=='a') {
		
			flag++;
			bb.pop();
			break;
		}

		}
	boolean b=bb.isEmpty();
	if(b==true&& flag==0) {
		System.out.println("it is balanced");
	}else
	{
		System.out.println("expresion is not balanced");
	}
}}
