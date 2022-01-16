package com.umme.diamond.lesson3;

public class WorkingOnDiamondProblem1 implements First, Second{

	public void show() 
	 { 
	 First.super.show(); 
	 Second.super.show(); 
	 } 
	 public void main(String args[]) 
	 { 
		 WorkingOnDiamondProblem1 workingOnDiamondProblem = new WorkingOnDiamondProblem1(); 
		 workingOnDiamondProblem.show(); 
	 } 
	}