package com.datastructure;



public class OwnOrderList1 {
	
		class node{
			node next;
			Object data;
			public node(Object data) {
		      this.data=data;
			}

		}node head;
			boolean add(Object data) {
				node n=new node(data);
				if(head==null) {
					head=n;
					return true;
				}
				
				node t=head;
				node prev=head;
				node temp=head;
				while(t!=null)
				{
					prev=t;
				if((int)data<(int)t.data) 
				{
				   n.next=t;
				   if(prev==head) 
				   {
				   head=n;
				   return true;
				   }else
				   {
					   temp.next=n;
				    return true;}
				}
				temp=t;
				t=t.next;
				}
				prev.next=n;
				return true;
				
				}
			boolean search(Object data) {
				node t=head;
				int flag=0;
				if(head==null) {
					System.out.println("list empty");
				return true;
				}
				while(t!=null) {
					if(t.data.equals(data)) {
						remove(data);
						return true;
					}t=t.next;
					
				}
				add(data);
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
			boolean  remove(Object data) {
				node t=head;
				if(head==null) {
					System.out.println("no element to delete");
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
				String st="";
				node t=head;
				int count=0;
				while(t!=null) {
					System.out.println(t.data+" ");
					count++;
					t=t.next;
				}System.out.println(count);

				return "";
			}
		}
