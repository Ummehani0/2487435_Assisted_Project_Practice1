package com.umme.innerclass.lesson2;

public class WokingOnInnerClass1 {
	private String message="Hello World!!!!"; 
	class Inner{ 
		 void basic(){System.out.println(message+", How Are You Doing All...");} 
		}
	public static void main(String[] args) {
		WokingOnInnerClass1 obj=new WokingOnInnerClass1();
		WokingOnInnerClass1.Inner in=obj.new Inner(); 
	    in.basic(); 
	}
}

