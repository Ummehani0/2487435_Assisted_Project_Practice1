package com.practice.project.assisted.practice;

public class TypeCasting {
	public static void main(String[] args) {
	//converting to implicit form
		System.out.println("_____________________________________________________________-");
	System.out.println("Implicit Type Casting");
	System.out.println("_____________________________________________________________-");
	char firstValue='A';
	System.out.println("The value of a: "+firstValue);
	int secondValue=firstValue;
	System.out.println("The Value of b: "+secondValue);
	float thirdValue=firstValue;
	System.out.println("The Value of c: "+thirdValue);
	long fourthValue=firstValue;
	System.out.println("The Value of d: "+fourthValue);
	double out=firstValue;
	System.out.println("The Value of out: "+out);
	System.out.println("_____________________________________________________________-");
	System.out.println("Explicit Type Casting");
	System.out.println("_____________________________________________________________-");
	//converting to explicit form
	double resultOne=88.3;
	int resultTwo=(int)resultOne;
	System.out.println("Value of resultOne: "+resultOne);
	System.out.println("Value of resultTwo: "+resultTwo);
	System.out.println("_____________________________________________________________-");
	}
	}

