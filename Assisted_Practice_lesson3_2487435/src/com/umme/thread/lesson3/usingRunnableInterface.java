package com.umme.thread.lesson3;

public class usingRunnableInterface implements Runnable{
		public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
			usingRunnableInterface usingRunnableInterface1=new usingRunnableInterface();  
		Thread t1 =new Thread(usingRunnableInterface1);   // Using the constructor Thread(Runnable r)  
		t1.start();  
		 }  
		}  


