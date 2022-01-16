package com.umme.project.phase1.five;

import java.util.Scanner;

public class LongestIncreasingSubsequence {
	
	public int[] lis(int[] re)
	{
	int num = re.length - 1;
	int[] varr1 = new int[num + 1];
	int[] varr2 = new int[num + 1];
	int ye = 0;

	for (int index = 1; index < num + 1; index++)
	{
	int j = 0;


	for (int sor = ye ; sor >= 1; sor--)
	{
	if (re[varr1[sor]] < re[index])
	{
	j = sor;
	break;
	}
	}
	varr2[index] = varr1[j];
	if (j == ye || re[index] < re[varr1[j + 1]])
	{
	varr1[j + 1] = index;
	ye = Math.max(ye,j + 1);
	}
	}

	int[] success14 = new int[ye];
	int pos = varr1[ye];
	for (int i = ye - 1; i >= 0; i--)
	{
	success14[i] = re[pos];
	pos = varr2[pos];
	}
	return success14;
	}

	public static void main(String[] args)
	{
	Scanner scanner1 = new Scanner(System.in);


	System.out.println("Please Enter number of elements");
	System.out.println("________________________________________________________");
	int n = scanner1.nextInt();
	
	int[] arr = new int[n + 1];
	System.out.println("\nEnter "+ n +" elements");
	System.out.println("________________________________________________________");
	for (int i = 1; i <= n; i++)
	arr[i] = scanner1.nextInt();

	LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
	int[] result = longestIncreasingSubsequence.lis(arr);



	System.out.print("\nLongest Increasing Subsequence is : ");
	
	for (int i = 0; i < result.length; i++)
	System.out.print(result[i] +" ");
	System.out.println();
	}
	}

