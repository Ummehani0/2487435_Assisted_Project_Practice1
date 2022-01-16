package com.umme.arryro.lesson4;

public class RangeQueries {
	 static int first = 16;
	 static int second = 100000; 
	 static long table[][] = new long[second][first + 1]; 
	 static void buildSparseTable(int arr[], int n) 
	 { 
	 for (int index1 = 0; index1 < n; index1++) 
	 table[index1][0] = arr[index1]; 
	 for (int ind2 = 1; ind2 <= first; ind2++) 
	 for (int i = 0; i <= n - (1 << ind2); i++) 
	 table[i][ind2] = table[i][ind2 - 1] + table[i + (1 << (ind2 - 1))][ind2 - 1]; 
	 } 
	 static long query(int L, int R) 
	 {
	 long res1 = 0; 
	 for (int j = first; j >= 0; j--) 
	 { 
	 if (L + (1 << j) - 1 <= R) 
	 { 
	 res1 = res1 + table[L][j];
	 L += 1 << j; 
	 } 
	 } 
	 return res1; 
	 }
	 public static void main(String args[]) 
	 { 
	 int arr[] = { 3, 7, 2, 5, 8, 9 }; 
	 int n = arr.length; 
	 buildSparseTable(arr, n); 
	 System.out.println(query(0, 5)); 
	 System.out.println(query(3, 5)); 
	 System.out.println(query(2, 4)); 
  } 
}
