package com.bridgelabz.sturcturalpattern;

public class ProxyPattern {
public static void main(String[] args) {
	Image image=new ProxyImage("sowndar.jpg");
	image.display();
	System.out.println("after");

image.display();
}
}
