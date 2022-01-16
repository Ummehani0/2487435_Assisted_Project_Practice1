package com.umme.abstraction.lesson3;

	abstract class WorkingOnAbstraction {
	

			public static void main(String[] args) {
				
				Monkey monkey = new Monkey();
				
				monkey.eat();
				monkey.run();
				monkey.breathe();
				
				Cat cat = new Cat();
				cat.eat();
				cat.run();
				
			}

		}

		abstract class Animals{
			abstract void eat();
			abstract void run();
			
			void breathe() {
				System.out.println("Generic breathe...");
			}
		}

		class Monkey extends Animals{
			@Override
			void eat() {
				System.out.println("Monkey's way of eating...");
				
			}
			
			@Override
			void run() {
				System.out.println("Monkey's distinguished style of running....");
				
			}
		}

		class Cat extends Animals{
			@Override
			void eat() {
				System.out.println("Cat's eat...");
				
			}
			
			@Override
			void run() {
				System.out.println("Cat runs fast...");
				
			}
		}


	   