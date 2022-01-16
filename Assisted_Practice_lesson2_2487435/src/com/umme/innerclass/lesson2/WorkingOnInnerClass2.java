package com.umme.innerclass.lesson2;

public class WorkingOnInnerClass2 {
	private String msg="Hello:), Howdy!! This is an inner class";
	void display(){ 
	class Inner{ 
	void msg(){
	System.out.println(msg);
	} 
 } 
	 Inner l=new Inner(); 
	 l.msg(); 
} 
	public static void main(String[] args) {
		WorkingOnInnerClass2 ob=new WorkingOnInnerClass2 (); 
		ob.display(); 
		}	
	}

