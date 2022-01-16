package com.umme.lnkd.lesson4;

public class CircularLinkedList {

		 static class Node 
		 { 
		 int provide; 
		 Node provide1; 
		 Node(int var1) 
		 { 
		 provide = var1; 
		 provide1 = null; 
		 } 
		}
		Node high; 
		CircularLinkedList() 
		{ 
		high = null; 
		} 
		 void sortedInsert(Node new_node) 
		 { 
		 Node now1 = high; 
		if (now1 == null) 
		 { 
		 new_node.provide1 = new_node; 
		 high = new_node; 
		 } 
		else if (now1.provide >= new_node.provide) 
		 { 
		while (now1.provide1 != high) 
		 now1 = now1.provide1; 
		 now1.provide1 = new_node; 
		 new_node.provide1 = high; 
		 high = new_node; 
		 } 
		 else
		 {
		while (now1.provide1 != high && now1.provide1.provide < 
		new_node.provide) 
		 now1 = now1.provide1; 
		 new_node.provide1 = now1.provide1; 
		 now1.provide1 = new_node; 
		 } 
		}
		void printList() 
		 { 
		 if (high != null) 
		 { 
		 Node temp = high; 
		 do
		 { 
		 System.out.print(temp.provide + " "); 
		 temp = temp.provide1; 
		 } while (temp != high); 
		 } 
		 }
		public static void main(String[] args) 
		 { 
		 CircularLinkedList list = new CircularLinkedList(); 
		 int arr[] = new int[] {12, 56, 2, 11, 1, 90}; 
		 Node temp = null; 
		 for (int i = 0; i < 6; i++) 
		 { 
		 temp = new Node(arr[i]); 
		 list.sortedInsert(temp); 
		 } 
		list.printList(); 
	  }
	}

