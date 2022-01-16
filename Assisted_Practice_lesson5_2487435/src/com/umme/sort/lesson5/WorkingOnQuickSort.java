package com.umme.sort.lesson5;

	class WorkingOnQuickSort
	{
	 
		 int sep(int arr[], int low, int high)
		 {
		 int varr = arr[high];
		 int first = (low-1); // index of smaller element
		 for (int sec=low; sec<high; sec++)
		 {
		 if (arr[sec] <= varr)
		 {
		 first++;
		 // swap arr[i] and arr[j]
		 int temp = arr[first];
		 arr[first] = arr[sec];
		 arr[sec] = temp;
		 }
		 }
		 // swap arr[i+1] and arr[high] (or pivot)
		 int temp = arr[first+1];
		 arr[first+1] = arr[high];
		 arr[high] = temp;
		 return first+1;
		 }
		 void sort(int arr[], int low, int high)
		 {
		 if (low < high)
		 {
		 int yess = sep(arr, low, high);
		 
		 sort(arr, low, yess-1);
		 sort(arr, yess+1, high);
		 }
		 }
		 static void printArray(int arr[])
		 {
		 int n = arr.length;
		 for (int i=0; i<n; ++i)
		 System.out.print(arr[i]+" ");
		 System.out.println();
		 }
		
		 public static void main(String args[])
		 {
		 int arr[] = {10, 7, 8, 9, 1, 5};
		 int n = arr.length;
		 WorkingOnQuickSort ob = new WorkingOnQuickSort();
		 ob.sort(arr, 0, n-1);
		 System.out.println("sorted array");
		 printArray(arr);
	  }
	}


