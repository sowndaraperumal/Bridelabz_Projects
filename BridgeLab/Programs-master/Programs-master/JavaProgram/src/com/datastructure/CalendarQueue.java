package com.datastructure;

public class CalendarQueue {
	   int cap=0;
	   int front=-1;
	   int rear=-1;
	   int size;
	   char ch1[];
	  static  int ar[];
	  /**
	   * 
	   * @param capacity size of the queue 
	   */
	    public CalendarQueue(int capacity) { 
	         this.cap = capacity; 
	           
	         rear = capacity-1 ; 
	      //   ch1 = new char[cap]; 
	         ar=new int[cap];
	            
	    } static int l=ar.length;
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
		System.out.println(ar[front]);
		
		
		return true;
	}
	/*
	 *print the queue element 
	 */
	@Override
	public String toString() {
	 
		for(int i=0;i<front;i++) {
			System.out.println(ar[i]);
		}
		return "";
	}


}

