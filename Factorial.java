package com.sujeet;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int no = new Scanner(System.in).nextInt();
		int fact = 1;
		for(int i=1;i<=no;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
