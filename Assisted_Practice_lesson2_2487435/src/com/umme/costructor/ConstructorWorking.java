package com.umme.costructor;
class Std
{
	int ClassRepresentativeidentity;
	String ClassRepresentativename;
	Std(int i,String n)
	{
	ClassRepresentativeidentity=i;
	ClassRepresentativename=n;
	}
	void display() 
	{
	System.out.println(ClassRepresentativeidentity+" "+ClassRepresentativename);
	}
	}
public class ConstructorWorking {
	public static void main(String[] args)
	{
	Std std1=new Std(548447,"umme\n");
	Std std2=new Std(548448,"hani\n");
	std1.display();
	std2.display();
	}
	}