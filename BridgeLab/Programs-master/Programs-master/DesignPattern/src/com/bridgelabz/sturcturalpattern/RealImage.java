package com.bridgelabz.sturcturalpattern;

public class RealImage implements Image{
private String filename;
public RealImage(String fileName) {
this.filename=fileName;
disk(filename);
}
@Override
public void display() {

System.out.println("image is"+filename);

}
private void disk(String fileName) {
	System.out.println("image is loaded in yhe file"+fileName);
	
}

}
