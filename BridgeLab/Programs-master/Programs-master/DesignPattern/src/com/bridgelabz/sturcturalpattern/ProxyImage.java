package com.bridgelabz.sturcturalpattern;

public class ProxyImage implements Image{
private RealImage realImage;

private String filename;
public ProxyImage(String fileName) {
	this.filename=fileName;
	// TODO Auto-generated constructor stub
}
	@Override
	public void display() {
if(realImage==null)
{	//System.out.println("image is"+filename);
        realImage=new RealImage(filename);
}realImage.display();
	}
}
