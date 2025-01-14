package com.sujeet;
import java.util.Arrays;

public class CountRepeated1 {

	public static void main(String[] args) {
		int arr[] = new int[]{10, 30, 30, 20, 10, 20, 50, 10};
		boolean[] visited = new boolean[arr.length];
		Arrays.fill(visited, false);
		
		for(int i=0;i<arr.length;i++) {
			if(visited[i] == true)
				continue;
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					visited[j] = true;
					count++;
				}
				if(count!=1)
					System.out.println(arr[i]);
			}
		}
	}
}
