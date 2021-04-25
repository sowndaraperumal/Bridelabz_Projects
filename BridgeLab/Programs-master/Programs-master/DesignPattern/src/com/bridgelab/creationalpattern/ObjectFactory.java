package com.bridgelab.creationalpattern;

public class ObjectFactory {

	public AbstractClassShop getObject(String object) {
		if(object.equalsIgnoreCase("badminton")) {
			System.out.println("cork");
			return new Badminton();
			
		}else if(object.equalsIgnoreCase("cricket")){
			return new Cricket();
		}
		return null;
	}
	
	
	
	
	
}
