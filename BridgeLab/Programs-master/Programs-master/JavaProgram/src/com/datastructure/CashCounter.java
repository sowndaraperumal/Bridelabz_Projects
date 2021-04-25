/**
 * 
 * Purpose : Banking system using Queue    
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  27-10-2018
 *
 ********************************************************************/

package com.datastructure;
/*
 * here using scanner class properties
 */

import java.util.Scanner;

public class CashCounter {

	/*
	 * main method using for banking system 
	 */


		public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
   	    
	     int choice;
	     int numberOfPerson;
	     System.out.println("enter the no. of people in queue");
	     numberOfPerson=s.nextInt();
	     String accname[]=new String[numberOfPerson];//initialize the String array
	     MyyQueue q=new MyyQueue(numberOfPerson);
	     int l=accname.length;
	     //System.out.println(l);
	     System.out.println("enter the list of name " +l);
	     for(int i=0;i<l;i++){
	    	 
	    	 accname[i]=s.next();
	    	 q.enqueue(accname[i]);
	     }
	    int d=numberOfPerson;
	    /*
	     * iterating of the customer to do what they want like withdraw and deposit
	     */
		
	    do
		{
			
			System.out.println("enter ur choice");
			System.out.println("1.deposit \n2.withdraw \n3.No of people \n 4.exit");
			choice=s.nextInt();
			/*
			 * switch case used for choose the option
			 *case 1 for withdraw
			 *case 2 for deposit
			 *case 3 for check the queue 
			 *
			 */
			switch(choice)
			{
			case 1:System.out.println("enter the amount to deposit");
			        int depositAmount=s.nextInt();
			        q.bankacc(depositAmount,choice);
			       // System.out.println("balance in bank  "+depamount);
			        d=numberOfPerson--;
			        q.dequeue();
			        break;
			case 2:System.out.println("enter the amount to withdraw");
			        int withdraw=s.nextInt();
			      
			      
			        if(q.bankacc(withdraw, choice)==true) {
			      //System.out.println("remaining balance in bank  "+balance+"\n and your withdrawal money of yours is "+withdraw);
			        d=numberOfPerson--;
			        q.dequeue();}
			        break;
			case 3:System.out.println("no of people in queue is "+q.issize());  
			         break;
			case 4:
				System.exit(0);
			}
		}while(q.issize()>0);
	}

}
