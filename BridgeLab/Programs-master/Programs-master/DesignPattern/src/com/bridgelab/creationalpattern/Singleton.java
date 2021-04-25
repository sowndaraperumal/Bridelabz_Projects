package com.bridgelab.creationalpattern;

import java.io.Serializable;

public class Singleton implements Serializable{
//Reflection
	/*
	private Singleton() {
		System.out.println("creating");
	}private static Singleton soleInstance=null; 
	
	public  static Singleton getInstance() {
		if(soleInstance==null) {
			 soleInstance=new Singleton();
		}
		return soleInstance;
	}
	*/
	private Singleton() {
		System.out.println("creating");
	}private static Singleton soleInstance=null; 
	
	public  static Singleton getInstance() {
		if(soleInstance==null) {
			 soleInstance=new Singleton();
		}
		return soleInstance;}
}
