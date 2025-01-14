package com.sujeet;
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		int no = new Scanner(System.in).nextInt();
		
		int n = no;
		int sum = 0;
		while(n!=0) {
			int r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		if(no==sum)
			System.out.println("No is Palindrome");
		else
			System.out.println("Not");	
	}
}