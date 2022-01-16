package com.umme.excpn.lesson3;

import java.util.Scanner;

public class WorkingOnException {
	
		public static void main(String[] args) {
			
			Scanner theScan = new Scanner(System.in);
			
			System.out.println("Enter two numbers (🙏 Please dont enter the second number as 0)");
			
			int firstNumber = theScan.nextInt();
			
			int secondNumber = theScan.nextInt();

			new WorkingOnException().divideNumbers(firstNumber, secondNumber);
			

		}
		
		void divideNumbers(int firstNumber, int secondNumber) {
			
			int result ;
			try {
				result = firstNumber / secondNumber;
				System.out.println("Division is : " + result);
			}
			catch(ArithmeticException ae) {
				System.out.println("Sorry, division by zero not defined yet...");
			}
			finally{
			result =90;
				System.out.println("finally always runs... " + result );
			}
			
		}

	}


	