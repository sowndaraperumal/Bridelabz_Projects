package com.datastructure;

public class MyDeque {
	

	
		int cap=0,rear=-1,front=-1;
		Object obj1[];
/**
 * 
 * @param scap size of the queue 
 */
	public MyDeque(int scap) 
		{
			this.cap=scap;
			obj1=new Object[cap];
			front=cap-1;
			
		}
	/**
	 * 
	 * @param data for store in the queue add in front
	 * @return boolean true or false
	 */
	boolean addRear(Object data)
	{
		if(rear==cap-1)
		{
			System.out.println("deque overflow");
			return true;
		}
		
		obj1[++rear]=data;
		return true;
	}
	/**
	 * 
	 * @param data for store in the queue add in last
	 * @return boolean true or false
	 */
	
	boolean addFront(Object data)
	{
		
		if(front==rear)
		{
			System.out.println("dequeue");
			return true;
		}
		
			obj1[front--]=data;
		return true;
	}
	/*@Override
	public String toString() {
		if(rear<=cap-1 && rear>0)
		{
			for(int i=0;i<=rear;i++)
			{
				System.out.print(obj1[i]+" ");
			}
		}
		else
		{
			for(int i=cap-1;i>front;i--)
			{
				System.out.println("hi");
				System.out.println(obj2[i]+" ");
		}
		}
		return "";
	}*/
	/*
	 * delete in last element in queue
	 */

	public Object removeRear() {
		
		if(rear==-1)
		{
			System.out.println("no elemnets");
		return null;
		}
		
		return obj1[rear--];
	}
	/*
	 * delete in front element in queue
	 */
	public Object removeFront() {
		
		if(front==cap)
		{
			System.out.println("no elements");
		return null;
		}
		
		
		return obj1[++front];
	}
	}

