package com.umme.sort.lesson5;

	public class WorkingOnInsertionSort {
		 public static void main(String[] args){
		 int[] arr = {75,89,396,281,404};
		 InsertionSort(arr);
		 for(int i=0;i<arr.length;i++){
		 System.out.println(arr[i]);
		 }
		 }
		 public static void InsertionSort(int[] arr){
		 int len = arr.length;
		 for(int flag2=1;flag2<len;flag2++){
		 int key = arr[flag2];
		 int first1=flag2-1;
		 while ((first1>-1) && (arr[first1]>key)){
		 arr[first1+1]=arr[first1];
		 first1--;
		 }
		 arr[first1+1]=key;
		 }
		 }
		}

