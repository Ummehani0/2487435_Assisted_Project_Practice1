package com.umme.costructor;
class learnerInformation
{
	String learnerName;
	int identity;
	
	void display() 
	{
	System.out.println(identity+" "+learnerName);
    }
}
public class WorkingOnCunstructor 
{
	public static void main(String[] args) 
	{
	learnerInformation Learner1=new learnerInformation();
	learnerInformation Learner2=new learnerInformation();
	learnerInformation Learner3=new learnerInformation();
	Learner1.display();
	Learner2.display();
	Learner3.display();
	}
	
}
