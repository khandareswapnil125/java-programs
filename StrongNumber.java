package com.sujeet;
import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		
		int n = no;
		int sum = 0;
		
		while(n>0) {
			int r = n%10;
			sum += factorial(r);
			n /= 10;
		}
		if(sum == no)
			System.out.println("Strong Number");
		else
			System.out.println("Not");
	}
	
	public static int factorial(int r) {
		int fact = 1;
		for(int i=1;i<=r;i++) {
			fact = fact*i;
		}
		return fact;
	}
}
