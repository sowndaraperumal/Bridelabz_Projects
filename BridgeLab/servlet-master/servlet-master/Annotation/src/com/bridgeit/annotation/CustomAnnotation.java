package com.bridgeit.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Scanner;

public class CustomAnnotation {
	
public static void main(String[] args) throws NoSuchMethodException, SecurityException {
	/*InputValues<Integer> values=new InputValues<>();
	Scanner scanner=new Scanner(System.in);
	Integer a=scanner.nextInt();
	Integer b=scanner.nextInt();

//	System.out.println(b.getClass().getName());
	
	System.out.println(values.sum(a, b));
*/
	/*Method method=new CustomAnnotation().getClass().getMethod("show");
	OwnAnnotation annotation=method.getAnnotation(OwnAnnotation.class);
	System.out.println(annotation.name());
*/

	
	Demo demo=new Demo();
	Class d=demo.getClass();
	
	
	Annotation annotation=d.getAnnotation(OwnAnnotation.class);
	
	OwnAnnotation annotation2=(OwnAnnotation) annotation;
	System.out.println(annotation2.name());
	
	
	
	

}
}
