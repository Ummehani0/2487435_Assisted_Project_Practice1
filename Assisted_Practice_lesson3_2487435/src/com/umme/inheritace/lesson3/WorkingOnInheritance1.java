package com.umme.inheritace.lesson3;

public class WorkingOnInheritance1 extends WorkingOnInheritance{
int j=20;
public void test2()
{
	System.out.println("Fro test 2 of WorkingOnInheritance1");
}
public static void main(String[] args) {
	WorkingOnInheritance ob1 = new WorkingOnInheritance();
	System.out.println(ob1.i);
	ob1.test1();
	System.out.println("________________________________________________");
	WorkingOnInheritance1 ob2 = new WorkingOnInheritance1();
	System.out.println(ob2.i);
	System.out.println(ob2.i);
	ob2.test1();
	ob2.test2();
	System.out.println("________________________________________________");
}
}
