package com.datastructure;

public class MyQueuee {



	static int rear=-1,front=-1,cap=0;
	static int sum[]= {0,0,0};
	int balance=0;
	static String obj[];
	  /**
	   * 
	   * @param capacity size of the queue 
	   */
	public MyQueuee(int scap) {
		this.cap=scap;
		obj=new String[cap];
	}
	
	/**
	 * 
	 * @param amount
	 * @param person
	 * @param name
	 * @return
	 */
	  int depositMoney(int amount,int person,String name)
	 {
		 int amt=0;
		 amt=amt+amount+sum[person-1];
		 sum[person-1]=amt;
		 queue(name);
		 return sum[person-1];
	 }
	  /**
		 * 
		 * @param name   data for store in the queue
		 * @return boolean true or false
		 */
	  Object queue(String name) {
		if(rear==cap)
		{
			System.out.println("queue is full");
			return true;
		}
		if(rear==-1)
		{
			System.out.println(name);
			obj[++rear]=name;
			System.out.println("first name successfully added");
		}boolean bs=isCheck(name);
		 if(bs)
		 {
		obj[++rear]=name;
		System.out.println("succesfully added");
		 }return true;
	}
	  boolean isCheck(String name) {
		for(int i=0;i<rear;i++)
		{
			if(obj[i]==name)
				return false;
		}
		return true;
	}
	  
	  int isEmpty()
	  {
		  if(rear==-1)
			  return 0;
		  return rear+1;
	  }
	  /**
	   * 
	   * @param withdraw
	   * @param wperson
	   * @param string
	   * @return
	   */
	public int withdraw(int withdraw, int wperson, String string) {
		
		    if(withdraw<=sum[wperson])
		    {
			balance=sum[wperson]-withdraw;
			
			return balance;
		    }
		    return 0;
	}
	}

