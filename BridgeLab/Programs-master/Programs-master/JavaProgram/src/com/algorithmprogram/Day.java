package com.algorithmprogram;

public class Day {
	/**
	 * 
	 * @param year
	 * @param month
	 * @param date
	 */
static void findday(int year,String month,int date) {
	int y=year%100;
	int monthcode=0;
	int yearcode=((y/4)+y)%7;
	//yc is a year code 
	int oddday=0;
	/*
	 *to find the month code by using switch case 
	 */
	switch(month){
		case "jan":monthcode=0;
		           break;
		case "feb":monthcode=3;
		           break;
		case "mar":monthcode=3;
                   break;
		case "apr":monthcode=6;
                   break;
		case "may":monthcode=1;
                   break;
		case "jun":monthcode=4;
                   break;
  		case "jul":monthcode=6	;
                   break;
		case "aug":monthcode=2;
                    break;
		case "oct":monthcode=0;
                   break;
		case "sep":monthcode=5;
                    break;
		case "nov":monthcode=3;
                   break;
		case "dec":monthcode=5;
                   break;
		
        
	}
	int centurycode=0;
	/*
	 * century code by using if conditon
	 */
	if(year>=1700&&year<1799) {
		centurycode=4;
	
		
	}else if(year>=1800&&year<1899){
		centurycode=2;
		
	}else if(year>=1900&&year<1999) {
		centurycode=0;
	}else if(year>=2000&&year<2099) {
		centurycode=6;
	}else if(year>=2100&&year<2199) {
		centurycode=4;
	}else if(year>=2200&&year<2299) {
		centurycode=2;
	}else if(year>=2300&&year<2399) {
		centurycode=0;
	}
	
	oddday=(monthcode+date+yearcode+centurycode)%7;
	/*
	 * find the day code 
	 */
		switch (oddday) {
		case 0:System.out.println("sunday");break;
		case 1:System.out.println("monday");break;
		case 2:System.out.println("tuesday");break;
		case 3:System.out.println("wednesday");break;
		case 4:System.out.println("thusday");break;
		case 5:System.out.println("friday");break;
		case 6:System.out.println("saturday");break;
		}
	}
}
