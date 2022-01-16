package com.umme.methods.lesson2;

public class callByValue {

	int val=25;
	int operation(int val) {
	val =val*10/100;
	return(val);
	}
	public static void main(String args[]) {
		callByValue d = new callByValue();
		System.out.println("Before operation value is : "+d.val);
		d.operation(100);
		System.out.println("After operation value is "+d.val);
		}

	}
	

