package com.sujeet;

public class Fibonacci {
	public static void main(String[] args) {
		
		int first = 0;
		int second = 1;
		int next = 0;
		int count = 10;
		
		System.out.print("Fibonacci Series: "+first+" "+second);
		for(int i=2;i<count;i++) {
			next = first + second;
			System.out.print(" "+next);
			first = second;
			second = next;
		}
	}
}
