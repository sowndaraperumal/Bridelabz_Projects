package com.bridgelabz.behavoiralpattern;

public interface ComputerPartVisitor {
public void visit(Computer computer);
public void visit(Mouse mouse);
public void visit (Monitor monitor);
}
