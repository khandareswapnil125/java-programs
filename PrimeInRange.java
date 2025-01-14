package com.sujeet;

public class PrimeInRange {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
	
	public static boolean isPrime(int no) {
		if(no<=1)
			return false;
		
		for(int i=2;i<=no/2;i++) {
			if(no%i==0) 
				return false;
		}
		return true;
	}
}
