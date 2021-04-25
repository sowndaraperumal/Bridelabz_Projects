package com.bridgeit.JdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
          System.out.println("hello");
    	  
    	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
    	    int status=dao.saveEmployee(new Employee(102,"Amit",22,"cse"));  
    	    System.out.println(status);      }
}
