package com.algorithmprogram;

import java.util.Scanner;

public class Machine {
	static int note[]= {20,20,20,20,20,20,20,20,20};
/**
 * 
 * @return amount of the item 
 */
	public static int shop() {
	
	Scanner s=new Scanner(System.in);
	int amount=0;//initialize the amount 
	int item;//initialize the item
	
	String choice;
	System.out.println("welcome of vending machine");
	System.out.println("1.sincker-200\n2.lay-100\n3.cake-300");
	item=s.nextInt();//getting form user
	/*
	 * choose your  choice
	 */
	
	switch(item) {
	case 1: amount=200;
	break;
	case 2:amount=100;
	break;
	case 3: amount=300;
	}
	return amount;

	}
	/**
	 * 
	 * @param totalamount 
	 * @param mycash
	 */
public static void  change(int totalamount,int mycash) {
	int count=0;int i=1;
	int balanceamount=mycash-totalamount;
	/*
	 * insert proper amount
	 */
	if(mycash<totalamount) {
		System.out.println("insufficient");
		
	}
	/*
	 * iterate for no of 1000 to change
	 */
	
	while(balanceamount >=1000&& note[0]!=0) {
		balanceamount=balanceamount-1000;
		count++;
		i++;
		note[0]--;
	}if(count!=0) {
	     	i=count*1000;
		System.out.println(count+"*"+1000+"="+i);
		i=0;
		count=0;
	
	}
	/*
	 * iterate for no of 500 to change
	 */
	
	while(balanceamount >=500&& note[1]!=0) {
		balanceamount=balanceamount-500;
		count++;
		i++;note[1]--;
	}if(count!=0) {
	     	i=count*500;
		System.out.println(count+"*"+500+"="+i);
		i=0;count=0;
	}
	/*
	 * iterate for no of 100 to change
	 */
	
	while(balanceamount >=100&& note[2]!=0) {
		balanceamount=balanceamount-100;
		count++;
		i++;note[2]--;
	}if(count!=0) {
	     	i=count*100;
		System.out.println(count+"*"+100+"="+i);
		i=0;count=0;
	}
	/*
	 * iterate for no of 50 to change
	 */
	
	while(balanceamount >=50&& note[3]!=0) {
		balanceamount=balanceamount-50;
		count++;note[3]--;
		i++;
	}if(count!=0) {
	     	i=count*50;
		System.out.println(count+"*"+50+"="+i);
		i=0;count=0;
	}
	/*
	 * iterate for no of 20 to change
	 */
	
	while(balanceamount >=20&& note[4]!=0) {
		balanceamount=balanceamount-20;
		count++;
		i++;note[4]--;
	}if(count!=0) {
	     	i=count*20;
		System.out.println(count+"*"+20+"="+i);
		i=0;count=0;
	}
	/*
	 * iterate for no of 10 to change
	 */
	
	while(balanceamount >=10&& note[5]!=0) {
		balanceamount=balanceamount-10;
		count++;
		i++;note[5]--;
	}if(count!=0) {
	     	i=count*10;
		System.out.println(count+"*"+10+"="+i);
		i=0;count=0;
	}
	/*
	 * iterate for no of 5 to change
	 */
	
	while(balanceamount >=5&& note[6]!=0) {
		balanceamount=balanceamount-5;
		count++;
		i++;note[6]--;
	}if(count!=0) {
	     	i=count*5;
		System.out.println(count+"*"+5+"="+i);
		i=0;count=0;
	}
	/*
	 * iterate for no of 2 to change
	 */
	
	while(balanceamount >=2&& note[7]!=0) {
		balanceamount=balanceamount-2;
		count++;
		i++;note[7]--;
	}if(count!=0) {
	     	i=count*2;
		System.out.println(count+"*"+2+"="+i);
		i=0;count=0;
	}
	/*
	 * iterate for no of 1 to change
	 */
	
	while(balanceamount ==1&& note[8]!=0) {
		balanceamount=balanceamount-1;
		count++;
		i++;note[8]--;
	}if(count!=0) {
	     	i=count*1;
		System.out.println(count+"*"+1+"="+i);
		i=0;count=0;
	}
System.out.println("ejoy your snacks");

}
}
