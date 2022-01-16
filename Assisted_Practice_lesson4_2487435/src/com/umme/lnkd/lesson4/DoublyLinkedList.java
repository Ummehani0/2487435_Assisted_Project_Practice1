package com.umme.lnkd.lesson4;

public class DoublyLinkedList {
	
	 Node high; 
	class Node 
	{ 
		 int info; 
		 Node past; 
		 Node arriving; 
		Node(int var1) 
		{ 
		info = var1; 
		} 
		 }
		public void push(int new_data) 
		 { 
		Node new_Node = new Node(new_data); 
		new_Node.arriving = high; 
		 new_Node.past = null; 
		if (high != null) 
		 high.past = new_Node; 
		high = new_Node; 
		 } 
		public void move1(Node prev_Node, int new_data) 
		 { 
		if (prev_Node == null) 
		{ 
		 System.out.println("The given previous node cannot be NULL "); 
		 return; 
		 } 
		Node new_node = new Node(new_data); 
		new_node.arriving = prev_Node.arriving; 
		prev_Node.arriving = new_node; 
		new_node.past = prev_Node; 
		if (new_node.arriving != null) 
		 new_node.arriving.past = new_node; 
		 } 
		 void append(int new_data) 
		 { 
		Node new_node = new Node(new_data); 
		 Node last = high; 
		new_node.arriving = null;
		if (high == null) 
		{ 
		 new_node.past = null; 
		 high = new_node; 
		 return; 
		 } 
		while (last.arriving != null) 
		 last = last.arriving; 
		last.arriving = new_node; 
		new_node.past = last; 
		 } 
		public void printlist(Node node) 
		 { 
		 Node last = null; 
		 System.out.println("In forward Direction"); 
		 while (node != null) 
		{ 
		 System.out.print(node.info + " "); 
		 last = node; 
		 node = node.arriving; 
		 } 
		 System.out.println(); 
		 System.out.println("In reverse direction"); 
		 while (last != null) 
		{ 
		 System.out.print(last.info + " "); 
		 last = last.past; 
		 } 
		 }
		public static void main(String[] args) 
		 {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.append(6); 
		dll.push(7);
		dll.push(1); 
		dll.append(4); 
		dll.move1(dll.high.arriving, 8); 
		System.out.println("Created DLL is: "); 
		dll.printlist(dll.high); 
	 } 
	} 

