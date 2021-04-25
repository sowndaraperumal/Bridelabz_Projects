package com.objectoriented;

public class Runner {

public static void main(String[] args) {
	Utility u=new Utility();
	UserDetails ud=new UserDetails();
	System.out.println();
	System.out.println("enter the first name");
	ud.setFirstname(u.inputString());
	//System.out.println();
	System.out.println("enter the last name");
	ud.setLastname(u.inputString());
	System.out.println();
System.out.println("enter mobile number");
	ud.setMobileno(u.inputString());
	System.out.println();
	System.out.println("enter the date");
	ud.setDate(u.inputString());
ud.setDate(u.formatdate(ud.getDate()));
System.out.println(u.convertString(ud,u.getfile()));
}
}
