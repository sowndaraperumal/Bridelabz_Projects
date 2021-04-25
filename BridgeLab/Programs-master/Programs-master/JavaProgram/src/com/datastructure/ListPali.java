/**
 * 
 * Purpose : Find the palindrome in the Sring     
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  29-10-2018
 *
 ********************************************************************/

package com.datastructure;
/*
 * here using scanner class properties
 */
import java.util.Scanner;

public class ListPali {
public static void main(String[] args) {
	String st;//initialize the string
	Scanner s=new Scanner(System.in);
	st=s.nextLine();
	MyQueue my=new  MyQueue(st.length()*2);
	
	char ch[]=st.toCharArray();
	int l=st.length();
	char ch1[]=new char[l];
	char ch2[]=new char[l];
	int flag=0;
	//add int front
	System.out.println("addfront");
	for(int i=0;i<ch.length;i++) {
		my.addfront(ch[i]);
	}System.out.println();
	//add in last
	System.out.println("addrear");
	for(int i=ch.length-1;i>=0;i--)
	{
		//loSystem.out.println(ch[i]);
	    my.adddrear(ch[i]);	
	}
	
System.out.println();
	
/*
 * check the length and check all the character same in two string  
 */


for(int i=0;i<ch.length;i++) {
		ch1[i]=my.removefront();
		System.out.print(ch1[i]);
	}System.out.println();
	for(int i=0;i<ch.length;i++) {
		ch2[i]=my.removerear();
		System.out.print	(ch2[i]);
	}
  System.out.println();
for(int i=0;i<ch1.length;i++) {
	System.out.println(ch1[i]+" "+ch2[i]);
	if(ch1[i]!=ch2[i]) {
		flag++;
		System.out.println(ch1[i]+" "+ch2[i]);
		break;
	}
}
System.out.println(flag);
if(flag==1) {
	System.out.println("not");
}
else
{
	System.out.println("it is");
}

}
}


