package com.sujeet;

public class Pattern {

	public static void main(String[] args) {
		int count = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(count%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
				count++;
			}
			System.out.println();
		}

	}

}
