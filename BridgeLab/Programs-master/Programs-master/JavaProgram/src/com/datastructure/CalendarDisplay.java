package com.datastructure;

import java.util.Scanner;

public class CalendarDisplay {
	/**
	 * 
	 * @param m index value for calendar start
	 * @param sum number of days in the month
	 */
	public static void dis(int m,int sum) {
		//Scanner s=new Scanner(System.in);
		int cal[][]=new int[6][7];//initialize the 2d array
		
		int n=0;
		int d=1;

	
		System.out.println("su  mo  tu  we  th  fi  sa");
	    /*
	     * this iterate storing 2d array position 
	     */
		for(int k=0;k<sum;k++) {
	    	
	    	cal[n][m]=d;
	    	m++;
	    	if(m==7) {
	    		m=0;
	    		n++;
	    	}
	    	d++;
	    }
		/*
		 * display the array
		 */
		for(int i=0;i<6;i++) {
			for(int j=0;j<7;j++) {	
			if(cal[i][j]==0){
				System.out.print("    ");
			}
			else {
				String temp=cal[i][j]+"";
				if(temp.length()==1)
				  System.out.print(cal[i][j]+"   ");
				else
					System.out.print(cal[i][j]+"  ");
		}
			}System.out.println();
			}
		}
	}


