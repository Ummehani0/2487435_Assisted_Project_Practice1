package com.umme.search.lesson5;

	import java.util.Scanner;
	public class WorkingOnLinearSearch {
	 public static void main(String[] args){
	 int[] arr = {188,520,330,40,550};
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the element to be searched");
	 int findIt = sc.nextInt();
	 int final12 = (int) linearing(arr,findIt);
	 if(final12==-1){
	 System.out.println("Element not in the array");
	 } else {
	 System.out.println("Element found at "+final12+" and the search key is "+arr[final12]);
	 }
	 }
	public static int linearing(int arr[], int x) {
	 int arrlength = arr.length;
	 for (int index123 = 0; index123 < arrlength - 1; index123++) {
	 if (arr[index123] == x) {
	 return index123;
	 }
	 }
	 return -1;
 }
}


