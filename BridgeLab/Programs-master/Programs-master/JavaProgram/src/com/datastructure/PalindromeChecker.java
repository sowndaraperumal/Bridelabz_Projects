package com.datastructure;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) throws Exception
	{
		
	
	System.out.println("enter the word");
Scanner s=new Scanner(System.in);
String word=s.next();
MyDeque queue=new MyDeque(word.length()*2);
char wordarray[]=word.toCharArray();
char word1[]=new char[word.length()];
char word2[]=new char[word.length()];
int flag=0;
for (int i = 0; i < wordarray.length; i++) {
	  	queue.addRear(wordarray[i]);
}

for (int i = wordarray.length-1; i >=0; i--) {
	//System.out.println(ch[i]);
  	queue.addFront(wordarray[i]);
}
//System.out.println(q.rear+" "+q.front);
for(int i=0;i<wordarray.length;i++)
{
	word1[i]=(char)queue.removeRear();
	//System.out.print(chk[i]+" ");
	
}


//System.out.println();

//System.out.println(q.front);
for(int i=0;i<wordarray.length;i++)
{
	word2[i]=(char)queue.removeFront();
	//System.out.print(chk1[i]+" ");
}



//for (int i = 0; i < chk1.length; i++) {
	//System.out.print(chk[i]+" "+i+" "+i+" "+chk1[i]);
	//System.out.println();
//}


for (int i = 0; i < word2.length; i++) {
//	System.out.println(chk[i]+" "+chk1[i]);
	if(word1[i]!=word2[i])
	{
		flag=1;
		System.out.println("not palindrome");
		break;
	}
}
if(flag==0)
{
System.out.println("palindrome");	
}

}
	
}
