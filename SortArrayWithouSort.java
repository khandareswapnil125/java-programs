package com.sujeet.NQT24;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortArrayWithouSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] sortedArray = sortArray(arr);
		for(int num : sortedArray)
			System.out.print(num+" ");
	}

	private static int[] sortArray(int[] arr) {

		Set<Integer> sortedSet = new TreeSet<>();
		for(int n : arr) 
			sortedSet.add(n);
		
		int[] sortedArray = new int[sortedSet.size()];
		
		int i = 0;
		for(int n : sortedSet)
			sortedArray[i++] = n;
		
		return sortedArray;
		
	}
}
