package com.umme.queue1.lesson4;
	import java.util.*;
	public class WorkingOnQueue 
	{
	public static void main(String[] args) 
	{
	 LinkedList <String> locationsQueue = new LinkedList<>();
	 locationsQueue.add("Zanzirabad");
	 locationsQueue.add("Ireland");
	 locationsQueue.add("Mysore");
	 locationsQueue.add("Tanzamiya");
	 locationsQueue.add("Colombo");
	 System.out.println("Queue is : " + locationsQueue);
	 System.out.println("Head of Queue : " + locationsQueue.peek());
	 locationsQueue.remove();
	 System.out.println("After removing Head of Queue : " + locationsQueue);
	 System.out.println("Size of Queue : " + locationsQueue.size());
	 }
	}

