package com.umme.throw1.lesson3;

import java.util.Scanner;

public class usingTryCatch {
	public static void main(String[] args) {
		
				
					Scanner scanner1 = new Scanner(System.in);
					System.out.println("please enter two numbers");
					
					double firstValue =scanner1.nextDouble();
					double secondValue =scanner1.nextInt();
				
					double additionResult = new usingTryCatch().add(firstValue,secondValue);
							System.out.println("Addition of numbers is : " + additionResult);
					
					double SubtractionResult = new usingTryCatch().sub(firstValue,secondValue);	
							System.out.println("Subtraction of numbers is : "+ SubtractionResult);

							double MultiplicationResult = new usingTryCatch().mul(firstValue,secondValue);	
						    System.out.println("Multiplication of numbers is : "+ MultiplicationResult);
						    
						    double DivisionResult = new usingTryCatch().div(firstValue,secondValue);	
							System.out.println("Division of numbers is : "+ DivisionResult);
				}
				double add(double firstValue,double secondValue) {
					double additionResult = (firstValue + secondValue);
					return additionResult;
				}
				double sub(double firstValue,double secondValue) {
					int SubtractionResult =  (int) (firstValue - secondValue);
					return SubtractionResult;
				}
				double mul(double firstValue,double secondValue) {
					int MultiplicationResult =  (int) (firstValue*secondValue);
					return MultiplicationResult;
			}
				double div(double firstValue,double secondValue) {
					double DivisionResult =  firstValue/secondValue;
					return DivisionResult;

		}}
