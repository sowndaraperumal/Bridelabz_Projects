package com.bridgelabz.behavoiralpattern;

public class VisitorPattern {
public static void main(String[] args) {
	ComputerPart computerPart=new Computer(); 
	computerPart.accept(new ComputerPartDispaly());
	
	
}}