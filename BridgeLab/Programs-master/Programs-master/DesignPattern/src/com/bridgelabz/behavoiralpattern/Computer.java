package com.bridgelabz.behavoiralpattern;

public class Computer implements ComputerPart {
	ComputerPart[] parts;
	public Computer(){
		parts=new ComputerPart[] {new Monitor(),new Mouse()};
	}
	@Override
	public void accept(ComputerPartVisitor computer) {
		// TODO Auto-generated method stub
		
		   for (int i = 0; i < parts.length; i++) {
		         parts[i].accept(computer);
		      }
		      computer.visit(this);
		   }
	



}
