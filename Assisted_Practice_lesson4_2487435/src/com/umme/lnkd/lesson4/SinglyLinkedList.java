package com.umme.lnkd.lesson4;

public class SinglyLinkedList {
	 
		Node head; // head of list 
		 static class Node 
		{ 
		 int info; 
		 Node arriv; 
		 Node(int d) 
		 { 
		 info = d; 
		 arriv = null; 
		 } 
		 } 
		// Method to insert a new node 
		 public static SinglyLinkedList insert(SinglyLinkedList list, int data) 
		 { 
		 // Create a new node with given data 
		 Node new_node = new Node(data); 
		 new_node.arriv = null; 
		 // If the Linked List is empty, then make the new node as head 
		 if (list.head == null) 
		{ 
		 list.head = new_node; 
		 } 
		 else 
		{ 
		 // Else traverse till the last node and insert the new_node there 
		 Node last = list.head; 
		 while (last.arriv != null) 
		{ 
		 last = last.arriv; 
		 } 
		 // Insert the new_node at last node 
		 last.arriv = new_node; 
		 } 
		 return list; 
		 } 
		 public static void printList(SinglyLinkedList list) 
		 {
		 Node currNode = list.head; 
		 System.out.print("LinkedList: "); 
		 // Traverse through the LinkedList 
		 while (currNode != null) 
		{ 
		 // Print the data at current node 
		 System.out.print(currNode.info + " "); 
		 // Go to next node 
		 currNode = currNode.arriv; 
		 } 
		 System.out.println(); 
		 } 
		 // Method to delete a node in the LinkedList by KEY 
		 public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key) 
		 { 
		 // Store head node 
		 Node currNode = list.head, prev = null; 
		 if (currNode != null && currNode.info == key) 
		{ 
		 list.head = currNode.arriv; // Changed head 
		 System.out.println(key + " found and deleted"); 
		 return list; 
		 } 
		 while (currNode != null && currNode.info != key) 
		{ 
		 prev = currNode; 
		 currNode = currNode.arriv; 
		 } 
		 if (currNode != null) 
		{ 
		 prev.arriv = currNode.arriv; 
		 System.out.println(key + " found and deleted"); 
		 } 
		 if (currNode == null) 
		{ 
		 System.out.println(key + " not found"); 
		 } 
		 return list; 
		 } 
		 // method to create a Singly linked list with n nodes 
		 public static void main(String[] args) 
		 { 
		 /* Start with the empty list. */
		 SinglyLinkedList list = new SinglyLinkedList(); 
		 // Insert the values 
		 list = insert(list, 1); 
		 list = insert(list, 2); 
		 list = insert(list, 3); 
		 list = insert(list, 4); 
		 list = insert(list, 5); 
		 list = insert(list, 6); 
		 list = insert(list, 7); 
		 list = insert(list, 8); 
		 // Print the LinkedList 
		 printList(list); 
		 // Delete node with value 1 
		 deleteByKey(list, 1); 
		 // Print the LinkedList 
		 printList(list); 
		 // Delete node with value 4 
		 deleteByKey(list, 4); 
		 // Print the LinkedList 
		 printList(list); 
		 // Delete node with value 10 
		 deleteByKey(list, 10); 
		 // Print the LinkedList 
		 printList(list); 
	 } 
	} 

