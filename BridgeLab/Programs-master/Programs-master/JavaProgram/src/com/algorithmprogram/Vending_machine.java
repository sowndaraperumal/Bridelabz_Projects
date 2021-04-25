/**
 * 
 * Purpose : Design the vending machine 
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  24-10-2018
 *
 ********************************************************************/
package com.algorithmprogram;
/*
 * here using scanner class properties
 */
import java.util.Scanner;

public class Vending_machine {
public static void main(String[] args) {
	String ch="yes";//initialize the string yes or no
	Scanner s=new Scanner(System.in);
	int totalamount=0;//initialize the amount 
	int total=0;//initialize the total 
	Machine m=new Machine();
	do {
		//call the method to shop
		 totalamount =m.shop();
		//add the amount of item
		 total=total+totalamount;
		 System.out.println("do you want to buy more");
		 //enter choice what you want buy
		 ch=s.nextLine();
		 
		 //System.out.println(total);
	}while(ch.equals("yes"));
	//System.out.println(total);


	System.out.println("total amount of your item"+total);
	System.out.println("insert your cash");
	int ourcash=s.nextInt();
	//call the method for change
	m.change(totalamount,ourcash);
	s.close();
}
}
