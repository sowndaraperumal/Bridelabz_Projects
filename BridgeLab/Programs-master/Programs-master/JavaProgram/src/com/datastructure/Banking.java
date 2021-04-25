
package com.datastructure;

import java.util.Scanner;

public class Banking {
	
		public static void main(String[] args) {
	     String name[]= {"sowndar","ram","narasi"};//initialize the String array
	     Scanner s=new Scanner(System.in);
	     int locker=200000;//initialize the integer
   	     MyQueuee queue=new MyQueuee(5);
	     int ch;
	     String accname;
	     System.out.println("enter the name");
	     for(int i=0;i<3;i++){
	    	 name[i]=s.nextLine();
	    	// q.enqueue(name[i]);
	     }
	    do
		{
			
			System.out.println("enter ur choice");
			System.out.println("1.deposit \n2.withdraw \n3.No of people \n 4.exit");
			ch=s.nextInt();
		
			switch(ch)
			{
			case 1:System.out.println("enter the amount to deposit");
			        int depositAmount=s.nextInt();
			        System.out.println("choose person name");
			    //   System.out.println("1.sowndar \n 2.ram \n 3.narasi");
			        for(int i=0;i<name.length;i++) {
			        	System.out.println((i+1)+"."+name[i]);
			        }
			        int person=s.nextInt();
			        int depamount=queue.depositMoney(depositAmount,person,name[person-1]);
			        System.out.println(depamount);
			        locker=locker+depamount;
			        System.out.println(locker);
			        break;
			case 2:System.out.println("enter the amount to withdraw");
			        int withdraw=s.nextInt();
			        if(locker<withdraw) {
			        	System.out.println("bank have a insufficent ");
			        }
			        System.out.println("choose person name to withdraw");
			    //    System.out.println("1.sowndar\n 2.ram \n 3.narasi");
			      
			        
			        
			        
			        int wperson=s.nextInt();
			        int balance=queue.withdraw(withdraw,wperson-1,name[wperson-1]);
			        if(balance==0)
			        	System.out.println(name[wperson-1]+" ur account is empty");
			        else
			        	System.out.println("balnce money bank have"+balance);
			        break;
			case 3:System.out.println("no of people in queue is "+queue.isEmpty());       
			}
		}while(ch<4);
	}
	}

