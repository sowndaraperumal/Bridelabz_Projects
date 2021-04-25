package com.datastructure;

public class MyQueue {
	   int cap=0;
	   int front=-1;
	   int rear=-1;
	   int size;
	   char ch1[];
	   int ar[];
	   /**
		   * 
		   * @param capacity size of the queue 
		   */
	   public MyQueue(int capacity) { 
	         this.cap = capacity; 
	           
	         rear = capacity-1 ; 
	         ch1 = new char[cap]; 
	         ar=new int[cap];
	            
	    } 
	   /**
		 * 
		 * @param ch for store in the queue add in front
		 * @return boolean true or false
		 */
	boolean addfront(char ch)
	{
		if(front==cap-1) {
			System.out.println("deqe");
			return true;
	
		}
	ch1[++front]=ch;
	System.out.print(ch1[front]);
	return true;
	//System.out.println("ok");
	
	}
	/**
	 * 
	 * @param n  data for store in the queue
	 * @return boolean true or false
	 */
	boolean enqueue(int n) {
		if(front==cap-1) {
			System.out.println("queue is full");
			return true;
			
		}
		ar[++front]=n;
	//	System.out.println(ar[front]);
		
		
		return true;
	}
	/**
	 * 
	 * @param character for store in the queue add in front
	 * @return boolean true or false
	 */
	boolean adddrear(char ch) {
		if(rear==front) {
			System.out.println("f");
			return true;
		
		}
		ch1[rear--]=ch;
		System.out.print(ch1[rear]+""+rear);
		return true;
		
		
		
	}
	/*
	 * delete in front element in queue
	 */
	public char removefront() {
	  
	  
	  if(front ==-1) {}
		return ch1[front--];	
	}
	/*
	 * delete in last element in queue
	 */
	public char removerear() {

		return ch1[++rear];
		
	}
	
	/*
	 * delete the element in the queue 
	 */
	public int dequeue(){
		if(front ==-1) {}
		return ar[front--];
		
	}
	/*
	 *print the queue element 
	 */
@Override
public String toString() {
 
	for(int i=0;i<=front;i++) {
		System.out.println(ar[i]);
	}
	return "";
}
}