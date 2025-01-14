package com.sujeet;
import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		int sum = 0 ;
		while(n!=0) {
			int r = n%10;
			sum += r; 
			n = n/10;
		}
		System.out.println(sum);
	}
}
