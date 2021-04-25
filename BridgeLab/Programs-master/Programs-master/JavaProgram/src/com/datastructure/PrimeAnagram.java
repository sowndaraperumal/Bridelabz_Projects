/**
 * 
 * Purpose : Find the Prime number between 0 to 1000 and anagram    
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  2-11-2018
 *
 ********************************************************************/


package com.datastructure;

public class PrimeAnagram {
public static void main(String[] args) {
	
	int primeArray[]=new int[200];//initialize the array
	int n;
	int count=0;//initialize the count 
	int count2=0;//initialize var 
	/*
	 * iterate the loop for 1000 time
	 * find the prime 0 to 1000
	 */
	for(int i=2;i<1000;i++) {
		int flag=1;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				flag++;
				break;
			}
			
		}if(flag==1) {
			
			System.out.println(i);
		    
			primeArray[count2]=i;//storing the data in the array
		    count2++;
		    count++;
		}
}
	n=count;
//for(int i=0;i<p.length;i++) {
//if(p[i]!=0)
    //System.out.println(p[i]);
//}
int k=0;
int count1=0;
boolean b=false;
int number[]=new int[200];
MyStack stack=new MyStack();
/*
 * find the anagram and store in the stack 
 */
for(int i=0;i<primeArray.length-2;i++) {
	for(int j=i+1;j<primeArray.length;j++) {
	if(primeArray[i]!=0&&primeArray[j]!=0)
		b=AnagramQueue.check(primeArray[i],primeArray[j]);
	if(b==true) {
		System.out.println(primeArray[i]+"  "+primeArray[j]);
		number[k]=primeArray[i];
		stack.push(primeArray[i]);
	//	System.out.println(aa[k]);
		k++; 
		number[k]=primeArray[j];
		k++;
		stack.push(primeArray[j]);
		count1++;
//		if(p[i]==aa[k-2]) {
//			System.out.println(p[i]+" "+aa[k-2]);
//		}
	//	System.out.println(aa[k]);
	//	System.out.println(aa[k-1]+" "+aa[k-2]);
			}
	}


}
//for(int i=0;i<count1*2;i++)
//{int a=m.popint();
//if(p[i]!=0)
	//System.out.println(a);
//}
//for(int t=0;t<aa.length;t++) {
	//if(aa[t]!=0) {
	//	System.out.println(aa[t]);
	//}
//}
System.out.println("this is for stack");
System.out.println(" ************************");

stack.reverse();
       System.out.println(count1); 
System.out.println("this for queue");
System.out.println(" ************************");
MyQueue queue=new MyQueue(count1*2);
/*
 * find the anagram and store in the queue
 */
for(int i=0;i<primeArray.length-2;i++) {
	for(int j=i+1;j<primeArray.length;j++) {
	if(primeArray[i]!=0&&primeArray[j]!=0)
		b=AnagramQueue.check(primeArray[i],primeArray[j]);
	if(b==true) {
		//System.out.println(p[i]+"  "+p[j]);
		//aa[k]=p[i];
		queue.enqueue(primeArray[i]);
	//	System.out.println(aa[k]);
		//k++; 
		//aa[k]=p[j];
		//k++;
		queue.enqueue(primeArray[j]);
		
//		if(p[i]==aa[k-2]) {
//			System.out.println(p[i]+" "+aa[k-2]);
//		}
	//	System.out.println(aa[k]);
	//	System.out.println(aa[k-1]+" "+aa[k-2]);
			}
	}


}
//for(int i=0;i<(count1*2)-1;i++);
//{
//int a=mq.dequeue();
//System.out.println(a);
//}
System.out.println(queue);


}
}
