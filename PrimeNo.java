package com.sujeet;

public class PrimeNo {
	public static void main(String[] args) {
		int no = 9;
		boolean isPrime = true;
		
		if(no<=1)
			isPrime = false;
		
		for(int i=2;i<=no/2;i++) {
			if(no%i==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println(no+" is Prime");
		else
			System.out.println(no+" is not Prime");
	}
}
