package com.datastructure;

public class MyyQueue {
static int front=-1,rear=-1,cap=0;
String namee[];
int bal=20000;
/**
 * 
 * @param capp size of the queue 
 */
public MyyQueue(int capp) {
	this.cap=capp;
	
	namee=new String [cap];
}
/**
 * 
 * @param name  data for store in the queue
 * @return boolean true or false
 */
boolean enqueue(String name) {
	namee[++front]=name;
	return true;
}
/**
 * 
 * @param amount
 * @param op
 * @return boolean true or false
 */
boolean bankacc(int amount,int op) {
    if(op==1)
	{bal=bal+amount;
	System.out.println("take your cash"+bal);
	return true;
	}
    else if(op==2) {
    	if(amount>bal) {
    		System.out.println("bank have this much amount"+bal);
    	return false;
    	}
    	if(amount<bal) {
    		
    		bal=bal-amount;
    		System.out.println(bal);
    		return true;
    	}else {
    		System.out.println("bank have insufficent amount");
    		return false;
    	}
    	
    	}
return true;}

/*
 * delete the element in the queue 
 */
String dequeue()
{
	return namee[++rear];
	
}
int issize() {
	if(front==-1) {
		return 0;
	}
	if(front>=0) {
		//System.out.println("dd");
		return (front-rear); 
	}
	return 0;
}
}
