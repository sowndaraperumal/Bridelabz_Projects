package com.bridgelabz.behavoiralpattern;

import java.util.List;
import java.util.ArrayList;

public class Subject {
private int number;
private List<Observer> observer=new ArrayList<>();
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
	notifyObserver();
}
public void attach(Observer observer1)
{
	observer.add(observer1); 	 
}
 public void notifyObserver() {
	for (Observer observer2 : observer) {
		observer2.update();
	}
}
}
