package com.datastructure;

public class OwnUorderedList {

	public class node{
		node next;
		Object data;
		public node(Object data) {
        this.data=data;
		}
	}
	public node head=null;
	boolean add(Object data) {
		node n=new node(data);
		if(head==null)
			{head=n;
			return true;
			}
		
		
			node t=head;
			while(t.next!=null) {
				t=t.next;
			}t.next=n;
return  true;
	}
	public boolean search(Object str) {
		node t=head;
		
		int flag=0;
		if(head==null) {
          System.out.println("node is empty");
		return true;
		}
		while(t!=null) {
			
			
			if(t.data.equals(str)) {
				remove(str);
				return true;
			}t=t.next;
		}
		add(str);
		return true;
	}
	private void remove(Object data, node prev,node t) {
		if(head==null)
		{
			System.out.println("no element in the list");
		}
		else
		{
			prev.next=t.next;
			t.next=null;
		}
	}
	
	public boolean remove(Object data) {
		node t=head;
		if(head==null) {
			System.out.println("no elemt to delete");
		return true;
		}
		node prev=t;
		node temp=prev;
		while(t.next!=null)
		{
			if(t.data.equals(data)) {
				prev=t.next;
				head=prev;
				
				return true;
			}
				if(temp.data.equals(data) && prev!=head)
			{
				remove(data,t,prev);
				return true;
			}
			prev=t.next;
			if(prev.data.equals(data))
			{
				//System.out.println(t.data+" "+prev.data);
				remove(data,t,prev);
				return true;
			}
			t=t.next;
		}
		
		return true;
	}
	@Override
	public String toString() {
		node t=head;
		int count=0;
		String st=" ";
	while(t!=null)
	{
		System.out.println(t.data+" ");
		count++;
		t=t.next;
	}
	System.out.println(count);
		return " ";
	}
	

	
	
	}
