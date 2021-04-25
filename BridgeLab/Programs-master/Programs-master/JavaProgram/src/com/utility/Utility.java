package com.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	public static Scanner scanner=new Scanner(System.in);

//	public static BufferedReader bufferedreader=new BufferedReader(null);
	
	
	/*******************************************************************/
	
	public static  void replaceString(String str,String words) {
	  while(!(str.length()>=3))
			{
			System.out.println("enter the string more or equal to 3");
			 str=scanner.nextLine();
			}
			 if(str.length()>=3)
	{
				 String replacestring=words.replace("aaa", str);
				 System.out.println(replacestring);
			
			}
				else
					System.out.println(" enter invalid charater length");
		 
		/*
		 * else statement help to print invalid range
		 */
		
		

 }

/******************************************/
/**
 * 
 * @param times no of time to flip
 */
public static void coin(int times) {

double head=0;
double tail=0;
while(!(times>0)) {
System.out.println("enter the no of time ");
times=scanner.nextInt();
}/**
 * for loop is used to iteration purpose
 */

for(int i=0;i<times;i++) {
	/**
	 *
	 * if condition for check math val is greater than or not
	 */
	
	if(Math.random()<0.5) //math.random is used for generate 0 to 0.9 value
		head++;
	else {
		tail++;
	}
}
System.out.println(head);
System.out.println(tail);
double perfectagetail;   // initialize the percentage of tail
double perfectagehead;   //initialize the percentage of head
perfectagetail=(tail/times)*100;
perfectagehead=(head/times)*100;
//print the result of percentage
System.out.println("perfectage of tail "+perfectagetail);
System.out.println("perfectage of head "+perfectagehead);


}
//*******************************************************
public static void findLeapYear(int year) {
	while(!(year>999))
	{
	System.out.println("enter the 4 digit year");
		
		year=scanner.nextInt();}
		
		/**
		 *it check yrear greater than 1000
		 */
		
		
		if(year>=1000) {
			/**
			 * check it is leap year or not
			 *  if it is leap year print 
			 *  if not print not a leap year
			 */
		if(year%400==0||year%4==0&&year%100!=0) {
			System.out.println("its is leap year "+year);
		}else {
			System.out.println("its is not leap year "+year);
		}
		}else {
			System.out.println("enter year upto 4 digit");
		}

}
//**********************************************************

public static void powerOfTwo(int num){
	int a=1;
	int c=1;
	/*
	 * check entered if less or equal to 32
	 */
	if(num<=32&&num>0) {
		
		while(num!=0) {
			a=a*2;
			num--;
			System.out.println("power of 2^"+c+" "+a);
			c++;
		}
		
		}
	
	else {
		System.out.println("Only works if 0 <= N < 31 since 2^31 overflows an int");
	}
}
//***********************************************


public static void quadraticLogic(double a,double b,double c)


{
	double sq; //initialize sq value
	double delta; //initialize delta value
	System.out.println(a+"x*x+"+b+"x+"+c);
	delta=(b*b)-4*(a*c);
	System.out.println(delta);
	double root1,root2;
	sq=Math.sqrt(delta);//math.sqrt is used to square root of delta
	root1=(-b+sq)/(2*a);
	root2=(-b-sq)/(2*a);
	System.out.println("root1  "+root1);
	System.out.println("root2"+root2);
	
}















//**********************************************
public static void harmonic(int n)
{
	
	boolean b=false;
	while(b==false) {
	
		if(n>0) 
		{
		double sum=0.0;
	
	for(double i=1;i<=n;i++)
	{
	 //series like sum=(1/i)+(1/i+1)+(1/n)
		sum=sum+(1/i);
	//	System.out.println(sum);
	}
	// print the total sum of the series
	System.out.println(sum);
	b=true;
	break;
		
		}
		System.out.println("enter number greater than zero");
		n=scanner.nextInt();
	}

	}
//***********************************************
public static void factor(int num){
	/*
	 * iterate the i value for 
	 * find the factor number
	 */
	for(int i=2;i*i<=num;i++) {
		/*
		 * here number if remainder is zero 
		 * then its is factor number
		 */
		while(num%i==0) {
			System.out.println(i);  //print factor
			num=num/i;
		}
	
	}
	/*
	 * if the number greater than 1 and 
	 * above condition i*i<=num is not satisfied   
	 *that number will be print
	 *
	 */
	if(num>1) {
		System.out.println(num);
	}
} 
//*************************************************
public static void Gambler(double ntime ){
	double goal;  //initialize the goal amount
	double bet=0;     //count number of bet
	double money;     //initialize the how much money you
	double win=0;     //win for count the no. of win
	double lose=0;    //loss for count the no. of loss
	
	
	
double cash;//temp variable for money
	
	System.out.println("enter the goal amount");
	goal=scanner.nextDouble();
	System.out.println("enter the stake to bet");
     money=scanner.nextInt(); //getting form user
     /*
      * iterate no.of time
      */
     
	for(int i=0;i<ntime;i++) {
		cash=money;//assign the money to cash
		/*
		 * check whether its cash reach's  zero to  goal amount 
		 */
		while(cash>0&&cash<goal) {
			bet++;      //increment bet 
			/*
			 * check random value greater than 0.5 for win or loss
			 * if you win 
			 * cash is increase
			 * else 
			 * cash is less
			 */
			if(Math.random()>0.5) 
			{ 
				cash++;
			}
			else {
				cash--;
			}
		}
		/*
		 * check you reach's goal or not
		 * if you reach goal 
		 * win is increment
		 * or 
		 * loss is increment
		 */
		if(cash==goal) {
			win++;
		}
		else
			lose++;
	}
	
	//calculate the percentage of the win
	double perfectagewin=(win/ntime)*100;
	//print the value of percentage of win 
	System.out.println("perfectage of win"+perfectagewin);
	//calculate the percentage of loss
	double perfectageloss=(lose/ntime)*100;
	//print the value of the percentage of loss
	System.out.println("perfectage of lose"+perfectageloss);
	
}
//*********************************************



public static void CouponNumber(int size ) {
	ArrayList<Integer> arraylist1l=new ArrayList<Integer>();
Random r=new Random();
int ran;
int count =0;
int lengthofarray=size;
ArrayList<Integer> arraylist2=new ArrayList<Integer>();
//System.out.println(a);
while(lengthofarray!=0) {
	for(int i=0;i<size;i++) {
		ran=r.nextInt(size)+1;
		arraylist2.add(ran);
		//System.out.println(ran);
		if(!(arraylist1l.contains(ran))) {
			arraylist1l.add(ran);
			lengthofarray--;
			count++;
		}
		count++;
	}
	
}
	//	for (Integer integer : al) {
		//	System.out.println(integer);
		//}
System.out.println("randomly generated number given below");
		System.out.println(arraylist2);
		System.out.println("distinctly generated random numbers only");
		System.out.println(arraylist1l);
	System.out.println("total nomber of attempt "+count);	
	/*	String st="";   //initialize the string is null
	Random r=new Random();
	int ran;        //initialize the ran to store the random value
	int q=0; // iterate the array  
	
	int a[]=new int[size]; //initialize the array length
	
	/*while for no of coupon to generate
	 * 
	 
	while(size!=0) {
		/*for loop  generate of length of array
		 * 
		 
			
	for(int i=0;i<lenofarr;i++) {
		
		ran=r.nextInt(9);   //this is used to generate the number(0-9)
		st=st+ran;
	}
			size--;

//	System.out.println(st);
	int temp=Integer.parseInt(st);   //convert the string to int 
	int len=Integer.toString(temp).length();//find the length of the string
    /*
     * while loop for check length of the coupon is correct or not
     * if it is wrong 
     * this loop help to increase size of the array
     * by multiply *10
     
	
	while(len!=lenofarr) {
	temp=temp*10;
	len++;
}
	
	//System.out.println(temp+"   "+len);
	
		a[q]=temp; //asign the value into array
		q++;       //increment q value 
	
	st="";         //again string will be null
	
			}
	/*
	 * for loop print the stored value
	 
	for(int i=0;i<a.length;i++) 
		System.out.println(a[i]);
			
	int flag=0;   //
	/*
	 * check any distinct value in the array
	 
	for(int i=0;i<a.length-2;i++)
	   {
		for(int j=i+1;j<a.length;j++) 
		{
					if(a[i]==a[j])  
					{
						flag++;   //if j=flag is increased then repeated value occurred
					  System.out.println(a[i]+"index"+i+"is same of"+i+"index"+a[j]);
						break;
					}
		}
	 }
	/*
	 * check any repeated element in array
	 
			if(flag==0) {
				System.out.println("coupon is distinct to each other");
			}else
			{
				System.out.println("it not distinct ");
			}
*/
}
//**************************************************
public static void TwoDarray(int row,int column) {
	int a[][]=new int[row][column]; //initialize the array size

	try {

		BufferedWriter bw=new BufferedWriter( new FileWriter("/home/bridgeit/Desktop/2d/2d.txt"));
	System.out.println("enter the element to added in the file");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				bw.write((a[i][j]=scanner.nextInt())+",");//allocate the value on file
				
			}bw.newLine(); // for next line in the file
		}
		bw.close();//file the file
		System.out.println("success");
		
	
	}catch (Exception e) {
		System.out.println("error");
	}
	
}

public static void findTripletZero(int size) {
	   int count=0;  //initialize the count 
	   int arrayofint[]=new int[size];//initialize the array
	  
	   for(int i=0;i<size;i++) {
				arrayofint[i]=scanner.nextInt();
			}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				for(int k=j+1;k<size;k++) {
					if(arrayofint[i]+arrayofint[j]+arrayofint[k]==0) {
						System.out.println(arrayofint[i]+" "+arrayofint[j]+" "+arrayofint[k]);
						count++;
					}
				}
			}
		}
		System.out.println(count);
}
public static void distance(int x,int y) {
double result;   
	
	int c=(x*x+y*y);  
	result=Math.sqrt(c);  //square root of z by using math.sqrt function
	
   //print the result in z
	System.out.println(result);
	
}


/**
 * 
 * @param array of character
 * @param n is length of the array element
 */
public static void permutationOfString(char ch[],int n) {
	
	/**
	 * no.of possible permutation 
	 */
	if(ch.length-1==n) {
		System.out.println(String.valueOf(ch));
	}
	/**
	 * iterate the string 
	 * 
	 */
	for(int i=n;i<ch.length;i++)
		{
		swap(ch,n,i); //here first looks first letter will be swap between remaining letter
		permutationOfString(ch,n+1);//here character position will be position
		   swap(ch,n,i);//here swap remaining letter
		}
	
	
	}
	/**
	 * 
	 * @param ch array element
	 * @param i 
	 * @param j
	 * swap two letter
	 */
	static void swap(char ch[],int i,int j) {
		char temp;
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}
//***************************************************************************
	
	/**
	 * here find the current time by using default package
	 * @starttime
	 */
	public static double start() {
		/**
		 *starttime is used to store the exact time in double 
		 */
	 double starttime=System.currentTimeMillis();
	 return starttime;
	}
	/**
	 * here stop the time 
	 * @stoptime
	 */
public 	static double stop() {
		/**
		 *  when you want to stop that time
		 * that time is stored in stoptime
		 */
		double stoptime=System.currentTimeMillis();
		return stoptime;
	
	
	
	}
	
	//*************************************************************************
	public static void windChill(double temperature,double velocity ) {
		double windchillness;
		//temperature is greater than 50 and less than 120 
		//velocity greater than 3
		
		if(temperature<50 &&velocity<120&&velocity>3) {
			windchillness=35.74+(0.6215*temperature)+(0.4275*temperature-35.75)*Math.pow(velocity, 0.16);
			System.out.println("chillness of wind is"+windchillness);
		}else {
			System.out.println("enter valid time");
		}
	}
//*************************************************************
	
	
/**
 * 
 * @param string1
 * @param string2
 * @return true or false
 */

/************************************************************************/


public static boolean checkAnagram(String string1,String string2 ) {
   	int count1[]=new int[26];//initialize the count1 array
	int count2[]=new int[26];//initialize the count2 array
/*
* checking length of the string 
* if it is ok just entered into next line
*/
	//if(s1.length()==s2.length()) {
	      	  //initialize the char array of ch1 and using tochararray for spilt the character by character 
		char ch1[]=string1.toCharArray();

		//initialize the char array of ch2 and using tochararray for spilt the character by character 
		char ch2[]=string2.toCharArray();
		/*
		 * this iterate the character by character and store the exact ascii key on the count1 array
		 *  until string one length 
		 */
		
		
		for(int i=0;i<string1.length();i++) {

		if(ch1[i]>='a'&&ch1[i]<='z') {
			count1[ch1[i]-97]++;//here ch1[i] character is stored in the count1 belong with ascii number of that character
	//	System.out.println(count1[i]);
		}  	
		
	} 		/*
		 * this iterate the character by character and store the exact ascii key on the count1 array
		 *  until string one length 
		 */
		for(int i=0;i<string2.length();i++) {

		if(ch2[i]>='a'&&ch2[i]<='z') {
			count2[ch2[i]-97]++;
	//		System.out.print(ch2[i]);
			//System.out.println(count2[i]);
			//here ch2[i] character is stored in the count2 belong with ascii number of that character
		}  	
		
	}for(int i=0;i<count1.length;i++) {
		/*
		 * if it is not equal those word are not anagram
		 */
		if(count1[i]!=count2[i]) {
			return false;
		}
	}
	return true;
	
	
}
/**********************************************************************/


/**
 * 
 * @param decimalnumber
 */
public static void binary(int decimalnumber) {

	
	int tempoary=decimalnumber;
	//to concantenate the values
	String binarynumber="";
	/*
	 * 
	 * using while loop
	 * iterate upto num!=0
	 * 
	 */
	while(decimalnumber!=0)
	{
		int dec=decimalnumber%2;
		binarynumber=dec+binarynumber;
		decimalnumber=decimalnumber/2;
	}
	//to print the binary value for decimal number
	System.out.println("the binary value of "+tempoary+" is ("+binarynumber+")2");
	/*
	 * function call
	 * to print the nibble values for given binary 
	 * 
	 */
	for (int i = binarynumber.length(); i < 8; i++) {
		binarynumber="0"+binarynumber;
	}
	System.out.println(binarynumber);
	nibbles(binarynumber);}
	/**
	 * 
	 * @param brinaynumber binary value in string 
	 */
	static void nibbles(String brinaynumber)
	{
		String nibble="";
		char charOfBrinary[]=brinaynumber.toCharArray();
		// mid value to swap the binary value for nibble calculation 
		int middle=charOfBrinary.length/2;
		for(int i=middle;i<charOfBrinary.length;i++)
		{
			nibble=nibble+charOfBrinary[i];
		}
		for(int i=0;i<middle;i++)
		{
			nibble=nibble+charOfBrinary[i];
		}
		System.out.println("the nibble value is "+nibble);
		char ch[]=nibble.toCharArray();
		// to convert string into integer 

		//to count the digits of number
		int count=nibble.length(),j=0,sum=0,i=nibble.length()-1;
		int number;
		while(count!=0)
		{
			if(ch[i]==0)
				number=(int)ch[i]-47;
			else
				number=(int)ch[i]-48;
			j++;
			int decimal=1;
			/*
			 * if loop for only rem=1 
			 * j used as power 
			 */
			if(number==1)
			{
				for(int k=0;k<j-1;k++)
				{
					decimal=decimal*2;
					
				}
				// sum to calculate the value
				sum=sum+decimal;
				
			}
			i--;
			count--;
		}
		// to print the results
		System.out.println(sum);
	}
	
	//********************************************************
	
	
	 /**
	  * 
	  * @param number
	  * array contain array of integer 
	  */
	 public static	void bubbleSortInteger(int number[]) {
			/*
			 * passing var one by one
			 */
		  for(int i=0;i<number.length-1;i++)
		  {
			for(int j=0;j<number.length-i-1;j++)
			{
				/*
				 * check who is large one 
				 */
				if(number[j]>number[j+1]) 
				{
				  int t=number[j];
				  number[j]=number[j+1];//swap var 
				  number[j+1]=t;
			  }
			}
		  }
		  /*
		   * this iteration for display the sorted array
		   */
		  for(int i=0;i<number.length;i++) {
			  System.out.print(number[i]);
		  }
		  
	  }
	//******************************************************************
	 /**
		 * 
		 * @param string
		 * array contain array of string
		 */
	 public static void bubbleSortString(String string[]) {
		  /*
			 * passing var one by one
			 */

		  for(int i=0;i<string.length-1;i++) {
			  
				for(int j=0;j<string.length-i-1;j++)
				/*
				 * compare to function is using calculate the ascii value of the given string
				 *if it's larger it will swap  
				 */
					if(string[j].compareTo(string[j+1])>0) {
					  String temp=string[j];
					  string[j]=string[j+1];
					  string[j+1]=temp;
				  }
				
			  }
			 
	  }
	
	

	//***********************************************************
	 /**
	  * 
	  * @param number
	  * array contain array of integer 
	  */
static public void sortInt(int number[]){
	

	int l=number.length;//initialize length  
	/*this iteration
	 * passing var one by one
	 */

	for(int i=1	;i<l;i++) {
		int key=number[i];//initialize the element in the key
		int j=i-1;
		while(j>=0&&number[j]>key) {
			number[j+1]=number[j];//swap the var
			j=j-1;
		}
		number[j+1]=key;//again the swap
		
	}}
	
	
	//********************************************************
/**
 * 
 * @param string
 * array contain array of string
 */
	static public void sortString(String string[]) {
		

		int l=string.length;//initialize length  
		/*this iteration
		 * passing var one by one
		 */
		

		for(int i=1	;i<l;i++) {
			String key=string[i];//initialize the element in the key
			int j=i-1;
			while(j>=0&&string[j].compareTo(key)>0) {
			  string[j+1]=string[j];//swap the var
				j=j-1;
			}
			string[j+1]=key;//again the swap
			
			
		}
			}
	
	//******************************************************
	static public void sortTime(double a[]){

		int l=a.length;//initialize length  
		/*this iteration
		 * passing var one by one
		 */

		for(int i=1	;i<l;i++) {
			double key=a[i];//initialize the element in the key
			int j=i-1;
			while(j>=0&&a[j]>key) {
				a[j+1]=a[j];//swap the var
				j=j-1;
			}
			a[j+1]=key;//again the swap
			
		}}
	
	
	//***************************************************
	/**
	 * 
	 * @param number array of integer
	 * @param first first element
	 * @param low last element
	 * @param keyelement key to finf
	 */
static public void searchint(int number[],int first,int low,int keyelement){
int flag=0;
/*
 * first element is less than or equal to last element
 * loop will terminate
 */
	while(first<=low) {
		
	int mid=(first+low)/2;//initialize the middle & find the middle element 
/*
 * if mid element is equal to search element 
 *that element is search element
 */
	if(number[mid]==keyelement) {
		System.out.println("element is found   "+keyelement);
		flag=1;
		break;
	}
	/*
	 * search element is greater than middle element 
	 * and search right side
	 */
	
	else if(number[mid]>keyelement) {
		low=mid-1;
		
	}
	/*
	 * search element is lesser than middle element 
	 * and search left side
	 */
	else if(number[mid]<keyelement) {
		first=mid+1;
	}
}	if(flag==0) {
	System.out.println("element is not found");
}

	/*
	 * otherwise your search element not in the array
	 */

}
	//**************************************************************************

/**
 * 
 * @param string array contain string
 * @param key search key
 * @param low first element  in the array
 * @param last last element in the array
 * @return
 */
static public int searchstr(String string[],String key,int low,int last ) {
	/*
	 * first element is less than or equal to last element
	 * loop will terminate
	 */int flag=0;
	while(low<=last) {
		int mid=(low+last)/2;//initialize the middle & find the middle element
		/*
		 * if mid element is equal to search element 
		 * that element is search element
		 */

		if(string[mid].compareTo(key)==0) {
			System.out.println("elemt found  "+key+"  at the index"+mid);
			flag=1;
			break;
		} 
		/*
		 * search element is greater than middle element 
		 * and search right side
		 */
		else if(string[mid].compareTo(key)>0) {
			last=mid-1;
		}
		/*
		 * search element is lesser than middle element 
		 * and search left side
		 */
		else if(string[mid].compareTo(key)<0) {
			low=mid+1;
		}
	
	}
	if(flag==0)
	{
		System.out.println("element is not found");
	}
	return 1;
}

	
	
	
	
/**
 * 
 * @param number power of 2
 * @boolean in the form of true or false
 */
public static boolean checkPowerOfTwo(int number) {
	int a=1;
	for(int i=0;i<=32;i++) {
		a=a*2;
	if(number==a) {
		return false;
	}
	}
	return true;
}

public static void findSearchElement(int number[]) {
	int low = 0;
	int high = number.length;
	int mid = (low + high) / 2;
	int choice;
	// System.out.println("1.lesser than"+a[(low+high)/2]+"\n 2.greater than
	// "+a[(low+high)/2]+"\n3.quess number is"+a[(low+high)/2]);
	int flag = 1;
	// System.out.println("enter the choice");
	// ch=s.nextInt();
	boolean b = false;
	do {
		/*
		 * ask the user this is your guess number or not
		 */
		while (flag != 0) {
			System.out.println("1.lesser than" + number[(low + high) / 2] + "\n 2.greater than " + number[(low + high) / 2]
					+ "\n3. i think ur guess number is" + number[(low + high) / 2]);
			System.out.println("enter the choice");
			choice = Utility.scanner.nextInt();
			if (choice == 1) {
				System.out.println("ss");
				high = ((low + high) / 2);
				System.out.println(number[high]);
			} else if (choice == 2) {
				low = (low + high) / 2;
			}
//	if(a[high]==a[low]) {
			// System.out.println("quess number is"+a[(low+high)/2]);
			// flag--;
			// break;
			// }
			else if (choice == 3) {
				System.out.println(" this is  ur guess number is" + number[(low + high) / 2]);
				flag--;
				break;
			}
		}
		if (flag == 0) {
			// System.out.println("searched element is"+a[(low+high)/2]);
			b = true;
			break;
		}
	} while (b != false);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






























