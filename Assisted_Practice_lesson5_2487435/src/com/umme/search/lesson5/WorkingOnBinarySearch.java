package com.umme.search.lesson5;

public class WorkingOnBinarySearch {

		 public static void main(String[] args){
		 int[] arr = {3,6,9,12,15};
		 int spec = 12;
		 int arrlength = arr.length;
		 BinarySearch(arr,0,spec,arrlength);
		 }
		public static void BinarySearch(int[] arr, int start, int key, int length){
		 int halfWay = (start+length)/2;
		 while(start<=length){
		 if(arr[halfWay]<key){
		 start = halfWay + 1;
		 } else if(arr[halfWay]==key){
		 System.out.println("Found AT :"+halfWay+ "  position:)");
		 break;
		 }else {
		 length=halfWay-1;
		 }
		 halfWay = (start+length)/2;
		 }
		 if(start>length){
		 System.out.println("OOPS... Not Found");
		 }
		}
		}


