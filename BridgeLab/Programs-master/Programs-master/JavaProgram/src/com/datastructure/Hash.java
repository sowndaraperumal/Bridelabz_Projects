package com.datastructure;

import com.datastructure.OwnOrderList1.node;

public class Hash 
{
class node{
	
	node next,link;
	int rem;
	Object data;
	public node(Object data) {
		this.data=data;
	}
}  node head;
boolean add(Object data) {
	node n=new node(data);
	if(head==null) {
		head=n;
		head.rem=(int)data%11;
		return true;
	}
	
	node t=head;
	node prev=head;
	node temp=head;
	while(t!=null)
	{
		prev=t;
	if(t.rem>(int)n.data%11) 
	{
	   n.next=t;
	   if(prev==head) 
	   {
	   head=n;
	   n.rem=(int )data%11;
	   return true;
	   }
	   else 
	   {
		   temp.next=n;
		   n.rem=(int)data%11;
	    return true;}
	}
	 else if(t.rem==(int)n.data%11) {
		 while(t.link!=null) {
			 t=t.link;
		 }
		 t.link=n;
		   n.rem=(int)data%11;
		   
		   
	   }
	temp=t;
	t=t.next;
	}
	prev.next=n;
	n.rem=(int )data%11;
	return true;
	
	}
@Override
	public String toString() {
	String st="";
	node t=head;
	while(t!=null) {
		System.out.println("("+t.data+","+(int)t.data%11+")");
		
		while(t.link!=null)
		{
			System.out.println("("+t.link.data+","+(int)t.data%11+")");
			t=t.link;
		}
		t=t.next;
	}
	
		return super.toString();
	}
}
