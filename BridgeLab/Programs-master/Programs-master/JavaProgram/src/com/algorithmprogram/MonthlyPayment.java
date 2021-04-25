package com.algorithmprogram;

import java.util.Scanner;

public class MonthlyPayment {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	double p;int  y;
	double r;
	int   n;
	double rate;
	System.out.println("enter the principle amount");
	p=s.nextDouble();
	System.out.println("enter the year");
	y=s.nextInt();
	System.out.println("enter the loan amount  percentage ");
	rate=s.nextDouble();
	n=12*y;
	r=rate/(12*100);
	double pay;
	double pow;
	pow=Math.pow((1+r), -n);
	pay=(p*r)/(1-pow);
	System.out.println(pay);
}
}
