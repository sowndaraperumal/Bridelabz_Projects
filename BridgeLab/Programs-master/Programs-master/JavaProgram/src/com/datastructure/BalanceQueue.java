package com.datastructure;

public class BalanceQueue {
	
	Object obj[];
	int top=-1,cap=0;
	public BalanceQueue(int scap) {
		this.cap=scap;
		obj=new Object[cap];
	}
	/**
	 * 
	 * @param data data for store in the stack
	 * @return boolean true or false
	 */
	boolean push(Object data)
	{
		
		if(top==cap-1)
		{
			System.out.println("stack overflow");
			return false;
		}
		obj[++top]=data;
		return true;
	}
/**
 * delete the data in the stack
 * @return boolean true or false
 */
	Object pop()
	{
		if(top==-1)
		{
			System.out.println("stack underflow");
			return false;
		}
		return obj[top--]; 
		
	}
/**
 * peek function use to see top element in the stack
 * @return boolean true or false
 */
	Object peek()
	{
		if(top==-1)
		{
			return 'a';
		}
		else
			return obj[top];
			
	}
	/**
	 * is empty function check the size of the stack
	 * @return boolean true or false
	 */
	boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		return false;
	}
	/*
	 *print the stack element 
	 */
	@Override
		public String toString() {
		for(int i=0;i<=top;i++)
		{
			System.out.println(obj[i]+" ");
		}
		return "";
		}
	}

