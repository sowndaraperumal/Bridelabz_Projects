package com.interfaceimplementation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class testfile {
	static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
/*String st=s.next();
String path="/home/bridgeit/Desktop/2d/address/"+st;
System.out.println(path);
File file=new File(path);
System.out.println(file);
try {
	if(file.createNewFile()) {
		System.out.println("created");
	}else
	{
		System.out.println("file alredy existed");
	}

} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	System.out.println("sucess");
	
	
*/
	ArrayList<Integer>i=new ArrayList<>();
	boolean b=false;
	while(b==false) {
		i.add(s.nextInt());
		if(b==false) {
		System.out.println();
		}
	}
		
	
	
	
	}
}
