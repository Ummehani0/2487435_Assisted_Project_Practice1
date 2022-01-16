package com.umme.thread.lesson3;

public class WorkingOnThreads extends Thread {

		public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
			WorkingOnThreads workingOnThreads=new WorkingOnThreads();  
					workingOnThreads.start();  
		 }  }
