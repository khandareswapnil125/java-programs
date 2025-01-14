package com.sujeet;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int no = new Scanner(System.in).nextInt();
		
		int n = no;
		int sum = 0;
		int noOfDigits = String.valueOf(no).length();
		
		while(n>0) {
			int r = n%10;
			sum += Math.pow(r, noOfDigits);
			n /= 10;
		}
		if(sum==no)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not");
	}
}
