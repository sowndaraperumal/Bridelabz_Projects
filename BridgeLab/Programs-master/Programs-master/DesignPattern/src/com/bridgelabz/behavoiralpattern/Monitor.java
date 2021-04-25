package com.bridgelabz.behavoiralpattern;

public class Monitor implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computer) {
		// TODO Auto-generated method stub
		computer.visit(this);
	}

}
