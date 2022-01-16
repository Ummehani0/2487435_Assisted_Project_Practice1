package com.umme.methods.lesson2;

public class WorkingOnMethodOverloading {

		public static void add(int firstValue,int secondValue)
		 {
			System.out.println(firstValue+secondValue);
		 }
		public void add(int firstValue,float secondValue)
		{
			System.out.println(firstValue+secondValue);
		}
		public void add(int firstValue,float secondValue, float thirdValue)
		{
			System.out.println(firstValue+secondValue+ thirdValue);
		}
		public static void main(String[] args)
		{
			add(10,20);
		}
}