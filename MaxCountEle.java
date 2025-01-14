package com.sujeet;

public class MaxCountEle {

	public static void main(String[] args) {
		int arr[] = {10, 30, 30, 20, 10, 20, 50, 10};
		
		int maxCount = 0;
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count>maxCount) {
				maxCount = count;
				index = i;
			}
		}
		System.out.println("Max Repeated Element: "+arr[index]+" count: "+maxCount);
	}
}