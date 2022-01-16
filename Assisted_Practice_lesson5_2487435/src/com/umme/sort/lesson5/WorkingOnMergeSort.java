package com.umme.sort.lesson5;

	class WorkingOnMergeSort
	{
	 
	 void merge(int arr[], int l, int first1, int gl)
	 {
	 
	 int num1 = first1 - l + 1;
	 int num2 = gl - first1;
	
	 int L[] = new int [num1];
	 int R[] = new int [num2];
	
	 for (int flag=0; flag<num1; ++flag)
	 L[flag] = arr[l + flag];
	 for (int flag2=0; flag2<num2; ++flag2)
	 R[flag2] = arr[first1 + 1+ flag2];
	 int ival1 = 0, val2 = 0;
	 int k = l;
	 while (ival1 < num1 && val2 < num2)
	 {
	 if (L[ival1] <= R[val2])
	 {
	 arr[k] = L[ival1];
	 ival1++;
	 }
	 else
	 {
	 arr[k] = R[val2];
	 val2++;
	 }
	 k++;
	 }
	 while (ival1 < num1)
	 {
	 arr[k] = L[ival1];
	 ival1++;
	 k++;
	 }
	 
	 while (val2 < num2)
	 {
	 arr[k] = R[val2];
	 val2++;
	 k++;
	 }
	 }
	 void sort(int arr[], int l, int r)
	 {
	 if (l < r)
	 {
	 
	 int m = (l+r)/2;
	 
	 sort(arr, l, m);
	 sort(arr , m+1, r);
	 
	 merge(arr, l, m, r);
	 }
	 }
	 static void printArray(int arr[])
	 {
	 int n = arr.length;
	 for (int i=0; i<n; ++i)
	 System.out.print(arr[i] + " ");
	 System.out.println();
	 }
	 // Driver method
	 public static void main(String args[])
	 {
	 int arr[] = {12, 11, 13, 5, 6, 7};
	 System.out.println("Given Array");
	 printArray(arr);
	 WorkingOnMergeSort workingOnMergeSort = new WorkingOnMergeSort();
	 workingOnMergeSort.sort(arr, 0, arr.length-1);
	 System.out.println("\nSorted array");
	 printArray(arr);
	 }
	}

