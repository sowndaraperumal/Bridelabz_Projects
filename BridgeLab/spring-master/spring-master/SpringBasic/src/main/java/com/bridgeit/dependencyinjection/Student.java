package com.bridgeit.dependencyinjection;

public class Student {
 
	public String studentName;
 
	
	/*
	 public Student(String studentName) {
		this.studentName = studentName;
	}*/

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public void displayInfo() {
		System.out.println("student name  "+ studentName);
	}
/*
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}*/
}
