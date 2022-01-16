package com.umme.sort.lesson5;

	public class WorkingOnBubbleSort {
		 public static void main(String[] args){
		 int[] arr= {123,456,789,910,110};
		 BubbleSort(arr);
		 for(int i=0;i<arr.length;i++){
		 System.out.println(arr[i]);
		 }
		 }
		 public static void BubbleSort(int[] arr){
		 int len = arr.length;
		 int temp = 0;
		 for(int index123=0;index123<len;index123++){
		 for (int index456j=1;index456j<(len);index456j++){
		 if(arr[index456j-1]>arr[index456j]){
		 temp = arr[index456j-1];
		 arr[index456j-1]= arr[index456j];
		 arr[index456j]= temp;
		 }
		 }
		 }
		 }
		}

