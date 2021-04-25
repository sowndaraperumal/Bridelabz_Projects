package com.bridgeit.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoMain {
public static void main(String[] args) {
	Emp e=new Emp();
	e.setAddress("salem");
	e.setName("sowndar");
	e.setAge(22);
	System.out.println(e);
	Resource resource= new ClassPathResource("employee.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Emp e1=(Emp)beanFactory.getBean("emp1");
	System.out.println(e1);		
}
}
