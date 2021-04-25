package com.bridgelab.creationalpattern;

import java.util.ArrayList;

public class EmployeePrototype {
public static void main(String[] args) throws CloneNotSupportedException {
	Employee employee=new Employee();
	employee.loadData();
ArrayList<String>list=employee.getList();
	Employee employee2=(Employee)employee.clone();
	Employee employee3=(Employee)employee.clone();
ArrayList<String>list1	=employee2.getList();
list1.add("B");
ArrayList<String>list2=employee3.getList();
list2.remove("b");
System.out.println("orginal data in list");
System.out.println(list);
System.out.println("after adding");
System.out.println(list1);
System.out.println("after remove");
System.out.println(list2);
System.out.println("after complete");
System.out.println(list);

}
}
