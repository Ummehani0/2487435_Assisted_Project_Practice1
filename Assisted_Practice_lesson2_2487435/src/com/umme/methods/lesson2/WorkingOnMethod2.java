package com.umme.methods.lesson2;

public class WorkingOnMethod2 {
	public int resultOfSubtractionIs(int firstValue,int secondValue) {
		int resultOfSubtraction=firstValue-secondValue;
		return resultOfSubtraction;
		}
	public static void main(String[] args) {
		WorkingOnMethod2 b=new WorkingOnMethod2();
		int success= b.resultOfSubtractionIs(10,3);
		System.out.println("Multipilcation is :"+success);
		}
}
