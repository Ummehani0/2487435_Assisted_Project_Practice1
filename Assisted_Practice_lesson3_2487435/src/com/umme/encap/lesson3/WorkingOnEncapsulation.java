package com.umme.encap.lesson3;

public class WorkingOnEncapsulation {
	private int i=10;
	public int read_i()//getter
	{
	return this.i;
	}
public void write_i(int i)//setter
{
	this.i=i;
}}
class WorkingOnEncapsulation2{
	public static void main(String[] args) {
		WorkingOnEncapsulation2 ob1 = new WorkingOnEncapsulation2();
		System.out.println(ob1.read_i());
		ob1.write_i(50);
		System.out.println(ob1.read_i());
	}

	private void write_i(int i) {
		// TODO Auto-generated method stub
		
	}

	private char[] read_i() {
		// TODO Auto-generated method stub
		return null;
	}}