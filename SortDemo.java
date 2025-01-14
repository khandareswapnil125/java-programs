package com.sujeet;

public class SortDemo {

	public static void main(String[] args) {
		
		int[] arr = {1,10,5,2,14,3};
		sortArray(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void sortArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
