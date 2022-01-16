package com.umme.project.phase1.five;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class FixingBug {
public static void main(String[] args) {

System.out.println("\n");
System.out.println("                 WELCOME:)             \n");
//System.out.println("\n");
System.out.println("______________________________________________________________");
typesOfOperations();

}
private static void typesOfOperations() {
	System.out.println("\n");
String[] arr =
{
	
"1] I would like to review expenditure",
"2] I would like to add expenditure",
"3] I would like to delete expenditure",
"4] I would like to sort expenditures",
"5] I would like to search a specific expenditure",
"6] I would like to Close this application"

};
//System.out.println("______________________________________________________________");
int[] array1 = {1,2,3,4,5,6};
int lengthOfTheString = array1.length;
for(int index=0; index<lengthOfTheString;index++){
System.out.println(arr[index]);
}
ArrayList<Integer> arrlist = new ArrayList<Integer>();
ArrayList<Integer> expenses = new ArrayList<Integer>();
expenses.add(4563);
expenses.add(85);
expenses.add(500);
expenses.add(3598);
expenses.add(785);
expenses.addAll(arrlist);
System.out.println("______________________________________________________________");
System.out.println("\n YOU CAN ENTER YOUR CHOICE NOW :) -");
System.out.println("______________________________________________________________");
Scanner scanner1 = new Scanner(System.in);
int yourOption = scanner1.nextInt();
for(int index1=1;index1<=lengthOfTheString;index1++){
if(yourOption==index1){
switch (yourOption){
case 1:
System.out.println("Your privious expenses are - \n");
System.out.println("______________________________________________________________");
System.out.println(expenses+"\n");
typesOfOperations();
break;
case 2:
System.out.println("Please enter the cost that should be added \n");
System.out.println("______________________________________________________________");
int yourValue = scanner1.nextInt();
expenses.add(yourValue);
System.out.println("Your cost is updated here -\n");
System.out.println("______________________________________________________________");
expenses.addAll(arrlist);
System.out.println(expenses+"\n");
typesOfOperations();

break;
case 3:
System.out.println("Now you are going to delete all your expenses! \nPlease select previous option in order to delete...\n");
System.out.println("______________________________________________________________");
int choiceContinue = scanner1.nextInt();
if(choiceContinue==yourOption){
expenses.clear();
System.out.println(expenses+"\n");
System.out.println("Your expenses are now vanished!\n");
System.out.println("______________________________________________________________");
} else {
System.out.println("Oops... Please try again:(");
System.out.println("______________________________________________________________");
}
typesOfOperations();
break;
case 4:
ExpensesS(expenses);
typesOfOperations();
break;
case 5:
searchExpenses(expenses);
typesOfOperations();
break;
case 6:
closeApp();
break;
default:
System.out.println("It's an invalid choice:(, please enter valid one");
break;
}
}
}

}
private static void closeApp() {
System.out.println("Closing the application... \nThank you:)");
System.out.println("______________________________________________________________");
}
private static void searchExpenses(ArrayList<Integer> arrayList) {
int leng = arrayList.size();
System.out.println("Enter the expense you need to search:\t");
System.out.println("______________________________________________________________");
//
Scanner scanner1 = new Scanner(System.in);
int input = scanner1.nextInt();
//Linear Search
for(int i=0;i<leng;i++) {
if(arrayList.get(i)==input) {
System.out.println("Found the expense " + input + " at " + i + " position");
}
}
}
private static void ExpensesS(ArrayList<Integer> arrayList) {
int arrlength = arrayList.size();

Collections.sort(arrayList);
System.out.println("______________________________________________________________");
System.out.println("\nYour expenses which are sorted are: \n\n");
for(Integer integer1: arrayList) {

System.out.print(integer1 + " ");

}
}
}

