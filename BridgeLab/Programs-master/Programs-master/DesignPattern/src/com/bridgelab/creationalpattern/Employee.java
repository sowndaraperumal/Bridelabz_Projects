package com.bridgelab.creationalpattern;

import java.awt.List;
import java.util.ArrayList;

public class Employee implements Cloneable{

	private ArrayList<String> emplist;
	
	public Employee() {
		emplist=new ArrayList<String>(); 
	}
	
public Employee(ArrayList<String > list) {
	this.emplist=list;
}

public void loadData() {
	emplist.add("A");
	emplist.add("b");
	emplist.add("C");
	emplist.add("D");
	
}
	public ArrayList<String> getList(){
		return emplist;
	}
	
	

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub

	ArrayList<String>temp=new ArrayList<>();
	for (String string : this.emplist) {
		temp.add(string);
	}
	return new Employee(temp);
	
	
	
	//return super.clone();
}
}
