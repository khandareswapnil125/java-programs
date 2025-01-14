package com.sujeet;

public class Main2 {
	public static void main(String[] args) {
		int sum = 0;
		int multipleOf3 = 3;
		int multipleOf4 = 4;
		for(int i=1;i<10;i++) {
			if(i%2!=0) {
			System.out.print(multipleOf3+" ");
			multipleOf3 +=3;
			}else {
				System.out.print(multipleOf4+" ");
				multipleOf4 += 4;
			}
		}
	}
}
