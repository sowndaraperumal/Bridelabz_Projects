package com.bridgeit.aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


public class Operation {
/*public void show() {
	System.out.println("sowndar");
	
	 * 
	 
}*/
	
	
	public void msg(){System.out.println("msg method invoked");}  
    public int m(){System.out.println("m method invoked");return 2;}  
    public int k(){System.out.println("k method invoked");return 3;}  
}
