package com.bridgeit.autowired;

public class Heart {
	 String humanname;
	

public String getHumanname() {
		return humanname;
	}


	public void setHumanname(String humanname) {
		this.humanname = humanname;
	}


void pump() {
	System.out.println("heart is pumping " +humanname);
}
}
