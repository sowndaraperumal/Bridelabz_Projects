

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	public static Scanner s=new Scanner(System.in);
public static  void replacestring(String str,String words) {
	  while(!(str.length()>=3))
			{
			System.out.println("enter the string more or equal to 3");
			 str=s.nextLine();
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
times=s.nextInt();
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
public static void findleapyear(int year) {
	while(!(year>999))
	{
	System.out.println("enter the 4 digit year");
		
		year=s.nextInt();}
		
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

public static void powerof2(int num){
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
		n=s.nextInt();
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
	goal=s.nextDouble();
	System.out.println("enter the stake to bet");
     money=s.nextInt(); //getting form user
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
				bw.write((a[i][j]=s.nextInt())+",");//allocate the value on file
				
			}bw.newLine(); // for next line in the file
		}
		bw.close();//file the file
		System.out.println("success");
		
	
	}catch (Exception e) {
		System.out.println("error");
	}
	
}

public static void Zero(int size) {
	   int count=0;  //initialize the count 
	   int arrayofint[]=new int[size];//initialize the array
	  
	   for(int i=0;i<size;i++) {
				arrayofint[i]=s.nextInt();
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
	static double start() {
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
	static double stop() {
		/**
		 *  when you want to stop that time
		 * that time is stored in stoptime
		 */
		double stoptime=System.currentTimeMillis();
		return stoptime;
	
	
	
	}
	
	//*************************************************************************
	public static void windchill(double temperature,double velocity ) {
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
	
	
	
}
