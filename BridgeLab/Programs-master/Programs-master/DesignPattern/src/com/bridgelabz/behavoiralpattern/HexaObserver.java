package com.bridgelabz.behavoiralpattern;

public class HexaObserver extends Observer{
public HexaObserver(Subject subject1) {

	this.subject=subject1;
	this.subject.attach(this);
	
}

@Override
public void update() {
    System.out.println( "Hexa String: " + Integer.toHexString( subject.getNumber() ) ); 
}
}
