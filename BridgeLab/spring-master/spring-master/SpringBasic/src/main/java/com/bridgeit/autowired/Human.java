package com.bridgeit.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
Heart heart;
public Human() {
	// TODO Auto-generated constructor stub
}

public Human(Heart heart) {
	this.heart = heart;
}
@Autowired
@Qualifier("octpousheart")
public void setHeart(Heart heart) {
	this.heart = heart;
}

void pumping() {
	if(heart==null) {
		System.out.println("dead");
	}else {
	heart.pump();
	System.out.println("name of the animal is  "+heart.getHumanname());
	}
	
}
}
