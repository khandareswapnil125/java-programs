package com.sujeet;

//Main class
class Main {
	static void print_rectangle(int n)
	{
		int a, b;
		for (a = 1; a <= n; a++) {
			for (b = 1; b <= n; b++) {
				if (a == 1 || a == n || b == 1 || b == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String args[])
	{
		int n = 4;
		print_rectangle(n);
	}
}
