package com.umme.queue1.lesson4;

public class WorkingOnStack {

		 static final int MAX = 1000; 
		 int top; 
		 int a[] = new int[MAX]; 
		 boolean isEmpty() 
		 { 
		 return (top < 0); 
		 } 
		 WorkingOnStack() 
		 { 
		 top = -1; 
		 } 
		 boolean push(int x) 
		 { 
		 if (top >= (MAX-1)) 
		 { 
		 System.out.println("Stack Overflow"); 
		 return false; 
		 } 
		 else
		 { 
		 a[++top] = x; 
		 System.out.println(x + " pushed into stack"); 
		 return true; 
		 } 
		 } 
		int pop() 
		 { 
		 if (top < 0) 
		 { 
		 System.out.println("Stack Underflow"); 
		 return 0; 
		 } 
		 else
		 { 
		 int x = a[top--]; 
		 return x; 
		 } 
		 } 
		 
		 public static void main(String args[])
		   {
		 WorkingOnStack s = new WorkingOnStack(); 
		 s.push(56); 
		 s.push(96); 
		 s.push(25); 
		 System.out.println(s.pop() + " Popped from stack"); 
		 System.out.println("________________________________________________");
	  }
	} 
