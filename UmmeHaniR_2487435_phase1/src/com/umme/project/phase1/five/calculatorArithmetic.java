package com.umme.project.phase1.five;
import java.util.Scanner;
public class calculatorArithmetic {
public static void main(String[] args) {
int resultOfOperation;
			
System.out.println("           <__Arithmetic Calculator___>");
Scanner scanner1 = new Scanner(System.in);
			
System.out.println("_____________________________________________________________________");
System.out.println("Please Enter first number -");

int firstNumber = scanner1.nextInt();
System.out.println("_____________________________________________________________________");
System.out.println("Please Enter second number -");

int secondNumber = scanner1.nextInt();
System.out.println("_____________________________________________________________________");
System.out.println("Please perform any arithmetic action -");

char choice = scanner1.next().charAt(0);
System.out.println("_____________________________________________________________________");
switch(choice)
{
case '+'://Addition Operation
{
  resultOfOperation = firstNumber+secondNumber;
System.out.println("Addition of "+ firstNumber +" and "+secondNumber+" is "+resultOfOperation);
System.out.println("_____________________________________________________________________");
break;
}
case '-'://Subtraction Operation
{
	resultOfOperation = firstNumber - secondNumber;
System.out.println("Substraction of "+firstNumber+" and "+secondNumber+" is "+resultOfOperation);
System.out.println("_____________________________________________________________________");
	break;
}
case '*'://Multiplication Operation
	{
		resultOfOperation = firstNumber * secondNumber;
		System.out.println("Multiplication of "+firstNumber+" and "+secondNumber+" is "+resultOfOperation);
		System.out.println("______________________________________________________________");
				break;
				
			}
case '/'://Division Operation with exception \\using try catch method
{
	try {
		resultOfOperation = firstNumber/secondNumber;
System.out.println("Divition of "+firstNumber+" and "+secondNumber+" is "+resultOfOperation);
System.out.println("_____________________________________________________________________");
break;
}
catch(ArithmeticException ae){
System.out.println("sorry:(, Division by 0 is not defined........");
}
}
default:
{
	
System.out.println("It is an invalid input :(, please enter valid input....");
System.out.println("______________________________________________________________________");
}
}
}}
