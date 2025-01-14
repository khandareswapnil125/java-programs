package com.sujeet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class OddEvenDifference {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(2,6,3,11,28,17,5,12));
		int oddSum = 0;
		int evenSum = 0;
		for (int no : list) {
			if(no%2 == 0)
				evenSum += no;
			else
				oddSum += no;
		}
		System.out.println(list);
		System.out.println("Difference: "+(oddSum-evenSum));
	}
}
