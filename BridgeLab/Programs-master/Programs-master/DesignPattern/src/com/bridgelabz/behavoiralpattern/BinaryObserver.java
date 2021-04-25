package com.bridgelabz.behavoiralpattern;

public class BinaryObserver extends Observer {
public BinaryObserver(Subject subject1) {
	this.subject=subject1;
	this.subject.attach(this);


}

@Override
public void update() {

    System.out.println( "Binary String: " + Integer.toBinaryString( subject.getNumber())); 
}
}
