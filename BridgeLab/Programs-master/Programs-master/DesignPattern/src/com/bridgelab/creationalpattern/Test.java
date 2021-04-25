package com.bridgelab.creationalpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.omg.PortableInterceptor.ObjectIdHelper;

@SuppressWarnings({ "serial", "unused" })
public class Test implements Serializable{
	static void useSingleton() {
		Singleton singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());
	}
public static void main(String[] args)  {
	
	
	
	
	
	
	
	Singleton s1=Singleton.getInstance();
	Singleton s2=Singleton.getInstance();
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	ExecutorService executorService=Executors.newFixedThreadPool(2);
	executorService.submit(Test::useSingleton);
	executorService.submit(Test::useSingleton);
	executorService.shutdown();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
