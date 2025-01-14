package com.sujeet;

import java.util.HashSet;
import java.util.Set;

public class RepeatedEleHashSet {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 4, 3, 5, 1};
		Set<Integer> set = new HashSet<>();
		
		System.out.println("Repeated Elements: ");
		
		for(int num:arr) {
			if(!set.add(num))
				System.out.println(num);
		}
	}
}
