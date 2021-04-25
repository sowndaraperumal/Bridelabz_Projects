/**
 * 
 * Purpose :     
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  4-11-2018
 *
 ********************************************************************/

package com.datastructure;

import java.util.Scanner;

public class PrimeList {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n;
	int count=0;//initialize the count 
	int pp=0;//initialize var 

	int aa=0;//initialize var 

	int a[]=new int[10];
	int c[][]=new int[100][25];
	int p[]=new int[200];//initialize the array
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
		    p[pp]=i; //storing the data in the array
		    pp++;
		    count++;
		   
		}
		if(i%100==0||i%999==0) {
			a[aa]=count;//storing the count in the array
			count=0;
			aa++;
		}
	}
for(int v=0;v<168;v++) {
	
	System.out.println(v+" "+p[v]);
}

int l=0;
int i=0;
int x=0;
int y=0;
int j=0;
int k=0;
/*
 * storing the element in the array
 */
for( i=100-i;i<=1000;i+=100) {
       l=a[x];
       System.out.println("upto prime number in "+i);
	for( j=0;j<l;j++ ) {
		for( k=0;k<2;k++) {
			if(k==1) {
				c[j][k]=p[y];
			//	System.out.println(c[j][k]);
				y++;
			}
			//c[j][k]=p[y];
			//y++;
					}
		System.out.println(i+"  "+j+" "+c[j][1]);
	}x++;
	
}


}
}




















