package com.sujeet;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int no = new Scanner(System.in).nextInt();
		
		int sum = 0;
		for(int i=1;i<no;i++) {
			if(no%i==0) 
				sum += i;
		}
		if(sum == no)
			System.out.println("Perfect Number");
		else
			System.out.println("Not");
	}
}
