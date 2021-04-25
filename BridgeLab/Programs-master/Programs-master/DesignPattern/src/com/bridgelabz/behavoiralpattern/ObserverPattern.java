package com.bridgelabz.behavoiralpattern;

public class ObserverPattern {
public static void main(String[] args) {
	Subject subject=new Subject();
	new BinaryObserver(subject);
	new HexaObserver(subject);
    System.out.println("15");
    subject.setNumber(15);

}
}
