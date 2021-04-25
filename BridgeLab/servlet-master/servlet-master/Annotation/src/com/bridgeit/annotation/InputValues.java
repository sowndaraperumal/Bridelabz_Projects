	package com.bridgeit.annotation;

	
	
	public class InputValues<T>
	{

	public <T extends Number> int sum(T a,T b) {
	System.out.println(a+" "+ b);
	
	//System.out.println(a.getClass().getName()+ " "+b.getClass().getName());
return a.intValue()+b.intValue();
	}

}
