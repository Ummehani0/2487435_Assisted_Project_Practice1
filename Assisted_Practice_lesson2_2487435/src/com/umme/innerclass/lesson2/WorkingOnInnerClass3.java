package com.umme.innerclass.lesson2;
abstract class AnonymousInnerClass 
{
	 public abstract void display();
	}
public class WorkingOnInnerClass3 {
	
		public static void main(String[] args)
		{
		AnonymousInnerClass innerClass12 = new AnonymousInnerClass()
		{
		 public void display()
		 {
		 System.out.println("This is an Anonymous Inner Class running.....");
		 }
		 };
		 innerClass12.display();
		 }
		}
