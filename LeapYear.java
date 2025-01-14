package com.sujeet;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		boolean isLeap = false;
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0)
					isLeap = true;
				else
					isLeap = false;
			}else
				isLeap = true;
		}else
			isLeap = false;
		
		if(isLeap)
			System.out.println("Leap year");
		else
			System.out.println("Not");
	}
}
