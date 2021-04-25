package com.bridgelabz.behavoiralpattern;

public class ComputerPartDispaly implements ComputerPartVisitor
{

	@Override
	public void visit(Computer computer) {
		// TODO Auto-generated method stub
	      System.out.println("Displaying Computer.");
	}

	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
	      System.out.println("Displaying mouse.");
	}

	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
	      System.out.println("Displaying monitor.");
	}

}
