package com.umme.throw1.lesson3;

public class usingThrow {

	public static void main(String[] args)
	{
	double firstValue=45,secValue=0,rs;
	try
	{
	if(secValue==0) 
	throw(new ArithmeticException("Oops...Division by zero is undefined:("));
	else
	{
	rs = firstValue / secValue;
	
	System.out.print("\n\tThe result is : " + rs);
	System.out.println("______________________________________________");
	}
	}
	
	catch(ArithmeticException Ex)
	{
		System.out.println("______________________________________________");
	System.out.print("\n\tError : " + Ex.getMessage());
	
	}
	}
	}


