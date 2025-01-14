package com.sujeet;
import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		String str = new Scanner(System.in).next();
		boolean isPal = true;
		for(int i=0, j=str.length()-1;i<j;i++,j--) {
			if(str.charAt(i)!=(str.charAt(j))) {
				isPal = false;
				break;
			}
		}
		if(isPal)
			System.out.println("Palindrome");
		else
			System.out.println("Not");
	}
}
